package com.objsys.asn1j.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.quz;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public class Asn1PerDecodeBuffer extends Asn1DecodeBuffer implements Asn1PerMessageBuffer {
    private static Asn1RunTime rt = Asn1RunTime.instance();
    private int mBitOffset;
    private int mCurrOctet;
    protected Asn1PerTraceHandler mTraceHandler;
    private boolean mbAligned;

    public Asn1PerDecodeBuffer(byte[] bArr, boolean z) {
        super(bArr);
        this.mBitOffset = -1;
        this.mTraceHandler = new Asn1PerDecodeTraceHandler(this);
        this.mbAligned = z;
    }

    public static Asn1PerDecodeBuffer setBuffer(Asn1PerDecodeBuffer asn1PerDecodeBuffer, byte[] bArr, boolean z) {
        if (asn1PerDecodeBuffer == null) {
            return new Asn1PerDecodeBuffer(bArr, z);
        }
        asn1PerDecodeBuffer.setInputStream(bArr, 0, bArr.length);
        return asn1PerDecodeBuffer;
    }

    public void binDump(String str) {
        binDump(System.out, str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerMessageBuffer
    public void byteAlign() {
        if (this.mbAligned) {
            this.mBitOffset = -1;
        }
    }

    public boolean decodeBit(String str) throws Asn1EndOfBufferException, IOException {
        if (str != null) {
            this.mTraceHandler.newBitField(str, 1);
        }
        if (this.mBitOffset < 0) {
            this.mCurrOctet = read();
            this.mBitOffset = 7;
        }
        int i = this.mCurrOctet;
        int i2 = this.mBitOffset;
        boolean z = (i & (1 << i2)) != 0;
        this.mBitOffset = i2 - 1;
        return z;
    }

    public int decodeBitsToInt(int i, String str) throws Asn1Exception, IOException {
        if (i < 0 || i > 32) {
            throw new Asn1InvalidArgException("nbits", Integer.toString(i));
        }
        return (int) decodeBitsToLong(i, str);
    }

    public long decodeBitsToLong(int i, String str) throws Asn1Exception, IOException {
        long j;
        if (i < 0 || i > 64) {
            throw new Asn1InvalidArgException("nbits", Integer.toString(i));
        }
        if (str != null) {
            this.mTraceHandler.newBitField(str, i);
        }
        if (i > 0) {
            if (this.mBitOffset < 0) {
                this.mCurrOctet = read();
                this.mBitOffset = 7;
            }
            int i2 = this.mBitOffset;
            int i3 = i2 + 1;
            int i4 = this.mCurrOctet;
            if (i <= i3) {
                j = (i4 & ((byte) ((1 << i3) - 1))) >>> (i3 - i);
                this.mBitOffset = i2 - i;
            } else {
                j = ((1 << (i2 + 1)) - 1) & i4;
                int i5 = i - (i2 + 1);
                this.mBitOffset = -1;
                while (i5 >= 8) {
                    int read = read();
                    this.mCurrOctet = read;
                    j = (j << 8) | read;
                    i5 -= 8;
                }
                if (i5 > 0) {
                    this.mCurrOctet = read();
                    this.mBitOffset = 7 - i5;
                    j = (j << i5) | (r2 >>> (8 - i5));
                }
            }
        } else {
            j = 0;
        }
        rt.lcheck(2);
        return j;
    }

    public void decodeBitsToOctetArray(byte[] bArr, int i, int i2, String str) throws Asn1EndOfBufferException, IOException {
        int i3 = (i2 + 7) / 8;
        this.mTraceHandler.newBitField(str, i2);
        if (i3 > bArr.length - i) {
            throw new Asn1EndOfBufferException(this);
        }
        rt.lcheck(2);
        int i4 = this.mBitOffset;
        if (i4 == -1) {
            read(bArr, i, i3);
            i2 %= 8;
            i = (i + i3) - 1;
            if (i2 != 0) {
                this.mCurrOctet = bArr[i];
                this.mBitOffset = 7 - i2;
            }
        } else {
            int i5 = i4 + 1;
            int i6 = 8 - i5;
            while (i2 >= 8) {
                bArr[i] = (byte) (this.mCurrOctet << i6);
                int read = read();
                this.mCurrOctet = read;
                bArr[i] = (byte) (((byte) (read >> i5)) | bArr[i]);
                i2 -= 8;
                i++;
            }
            if (i2 >= i5) {
                bArr[i] = (byte) (this.mCurrOctet << i6);
                int i7 = i2 - i5;
                if (i7 > 0) {
                    int read2 = read();
                    this.mCurrOctet = read2;
                    bArr[i] = (byte) (((byte) (read2 >> i5)) | bArr[i]);
                    this.mBitOffset = 7 - i7;
                } else {
                    this.mBitOffset = -1;
                }
            } else if (i2 > 0) {
                bArr[i] = (byte) (this.mCurrOctet << i6);
                this.mBitOffset -= i2;
            }
        }
        if (i2 > 0) {
            bArr[i] = (byte) (((-1) << (8 - i2)) & bArr[i]);
        }
    }

    public void decodeCharString(int i, int i2, int i3, Asn1CharSet asn1CharSet, StringBuffer stringBuffer) throws Asn1Exception, IOException {
        int i4 = 0;
        if (asn1CharSet != null) {
            int numBitsPerChar = asn1CharSet.getNumBitsPerChar(isAligned());
            boolean z = Math.pow(2.0d, (double) numBitsPerChar) - 1.0d < ((double) asn1CharSet.getMaxValue());
            this.mTraceHandler.newBitField("value", i * numBitsPerChar);
            while (i4 < i) {
                int decodeBitsToInt = decodeBitsToInt(numBitsPerChar, null);
                if (z) {
                    stringBuffer.append((char) asn1CharSet.getCharAtIndex(decodeBitsToInt));
                } else {
                    stringBuffer.append((char) decodeBitsToInt);
                }
                i4++;
            }
        } else {
            if (!isAligned()) {
                i2 = i3;
            }
            this.mTraceHandler.newBitField("value", i * i2);
            while (i4 < i) {
                stringBuffer.append((char) decodeBitsToInt(i2, null));
                i4++;
            }
        }
        rt.lcheck(2);
    }

    public long decodeConsWholeNumber(long j, String str) throws Asn1Exception, IOException {
        if (j < 0) {
            throw new Asn1InvalidArgException("rangeValue", Long.toString(j));
        }
        int bitCount = Asn1Integer.getBitCount(j - 1);
        rt.lcheck(2);
        if (this.mbAligned && j > 255) {
            if (j == 256) {
                byteAlign();
                return decodeBitsToLong(8, str);
            }
            if (j <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                byteAlign();
                return decodeBitsToLong(16, str);
            }
            int decodeBitsToInt = decodeBitsToInt(Asn1Integer.getBitCount(((bitCount + 7) / 8) - 1), "length");
            byteAlign();
            return decodeBitsToLong((decodeBitsToInt + 1) * 8, "value");
        }
        return decodeBitsToLong(bitCount, str);
    }

    public long decodeExtLength() throws Asn1Exception, IOException {
        return (decodeLength() * 8) + getBitOffset();
    }

    public long decodeInt(int i, boolean z, String str) throws Asn1Exception, IOException {
        this.mTraceHandler.newBitField(str, i * 8);
        return Asn1RunTime.decodeIntValue(this, i, z);
    }

    public long decodeLength() throws Asn1Exception, IOException {
        int decodeBitsToInt;
        byteAlign();
        if (!decodeBit("extlen1")) {
            decodeBitsToInt = decodeBitsToInt(7, "length");
        } else {
            if (decodeBit("extlen2")) {
                decodeBitsToInt = decodeBitsToInt(6, "len/16k") * 16384;
                return decodeBitsToInt;
            }
            decodeBitsToInt = decodeBitsToInt(14, "length");
        }
        rt.lcheck(2);
        return decodeBitsToInt;
    }

    public int decodeSmallNonNegWholeNumber() throws Asn1Exception, IOException {
        if (!decodeBit("extbit")) {
            return decodeBitsToInt(6);
        }
        int decodeLength = (int) decodeLength();
        if (decodeLength > 4) {
            quz.s("small non-negative whole number is too large");
            return 0;
        }
        byteAlign();
        int decodeInt = (int) decodeInt(decodeLength, false);
        if (decodeInt >= 0) {
            rt.lcheck(2);
            return decodeInt;
        }
        quz.s("small non-negative whole number can't be negative");
        return 0;
    }

    public long getBitOffset() {
        return Asn1PerUtil.getMsgBitCnt(this.mByteCount - 1, this.mBitOffset);
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerMessageBuffer
    public int getMsgBitCnt() {
        return Asn1PerUtil.getMsgBitCnt(this.mByteCount - 1, this.mBitOffset);
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerMessageBuffer
    public Asn1PerTraceHandler getTraceHandler() {
        return this.mTraceHandler;
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerMessageBuffer
    public boolean isAligned() {
        return this.mbAligned;
    }

    public void moveBitCursor(long j) throws Asn1EndOfBufferException, IOException {
        for (long bitOffset = getBitOffset(); bitOffset < j; bitOffset++) {
            decodeBit(null);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1DecodeBuffer
    public int readByte() throws Asn1Exception, IOException {
        return decodeBitsToInt(8, null);
    }

    public void setAligned(boolean z) {
        this.mbAligned = z;
    }

    @Override // com.objsys.asn1j.runtime.Asn1DecodeBuffer
    public void setInputStream(byte[] bArr, int i, int i2) {
        super.setInputStream(bArr, i, i2);
        this.mBitOffset = -1;
        this.mCurrOctet = 0;
    }

    public void binDump(PrintStream printStream, String str) {
        this.mTraceHandler.print(printStream, str);
    }

    public long decodeInt(int i, boolean z) throws Asn1Exception, IOException {
        return decodeInt(i, z, "value");
    }

    public Asn1PerDecodeBuffer(InputStream inputStream, boolean z) {
        super(inputStream);
        this.mBitOffset = -1;
        this.mTraceHandler = new Asn1PerDecodeTraceHandler(this);
        this.mbAligned = z;
    }

    public int decodeBitsToInt(int i) throws Asn1Exception, IOException {
        return decodeBitsToInt(i, "value");
    }

    public boolean decodeBit() throws Asn1EndOfBufferException, IOException {
        return decodeBit("value");
    }

    public long decodeLength(long j, long j2) throws Asn1Exception, IOException {
        if (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            return j != j2 ? decodeConsWholeNumber((j2 - j) + 1, "length") + j : j;
        }
        return decodeLength();
    }

    public long decodeConsWholeNumber(long j) throws Asn1Exception, IOException {
        return decodeConsWholeNumber(j, "value");
    }

    public long decodeBitsToLong(int i) throws Asn1Exception, IOException {
        return decodeBitsToLong(i, "value");
    }

    public void decodeBitsToOctetArray(byte[] bArr, int i, int i2) throws Asn1EndOfBufferException, IOException {
        decodeBitsToOctetArray(bArr, i, i2, "value");
    }
}
