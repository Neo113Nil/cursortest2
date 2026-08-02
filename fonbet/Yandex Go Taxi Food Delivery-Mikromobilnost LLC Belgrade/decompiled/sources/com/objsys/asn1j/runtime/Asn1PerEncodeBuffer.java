package com.objsys.asn1j.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public class Asn1PerEncodeBuffer extends Asn1EncodeBuffer implements Asn1PerMessageBuffer {
    private static final byte[] ZEROBYTE = {0};
    private static Asn1RunTime rt = Asn1RunTime.instance();
    private int mBitOffset;
    protected Asn1PerTraceHandler mTraceHandler;
    private boolean mbAligned;

    public Asn1PerEncodeBuffer(boolean z) {
        this.mTraceHandler = new Asn1PerEncodeTraceHandler(this);
        this.mBitOffset = -1;
        this.mByteIndex = -1;
        this.mbAligned = z;
    }

    private void encodeIdentifier(long j) throws Asn1Exception {
        int identBytesCount = Asn1RunTime.getIdentBytesCount(j);
        long j2 = 127 << (identBytesCount * 7);
        rt.lcheck(2);
        if (identBytesCount <= 0) {
            encodeInt(0L, 8, (String) null);
            return;
        }
        while (identBytesCount > 0) {
            j2 >>>= 7;
            identBytesCount--;
            long j3 = (j & j2) >>> (identBytesCount * 7);
            if (identBytesCount != 0) {
                j3 |= 128;
            }
            encodeInt(j3, 8, (String) null);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void binDump(PrintStream printStream, String str) {
        this.mTraceHandler.print(printStream, str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerMessageBuffer
    public void byteAlign() {
        if (this.mbAligned) {
            this.mBitOffset = -1;
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void checkSize(int i) {
        super.checkSize(i + 1);
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void copy(byte[] bArr) throws Asn1Exception {
        encodeBits(bArr, 0, bArr.length * 8);
    }

    public void encodeBit(boolean z, String str) {
        if (str != null) {
            this.mTraceHandler.newBitField(str, 1);
        }
        if (this.mBitOffset < 0) {
            checkSize(1);
            byte[] bArr = this.mData;
            int i = this.mByteIndex + 1;
            this.mByteIndex = i;
            bArr[i] = 0;
            this.mBitOffset = 7;
        }
        if (z) {
            byte[] bArr2 = this.mData;
            int i2 = this.mByteIndex;
            bArr2[i2] = (byte) (bArr2[i2] | (1 << this.mBitOffset));
        }
        this.mBitOffset--;
    }

    public void encodeBits(byte b, int i) throws Asn1InvalidArgException {
        if (i > 0) {
            if (i > 8) {
                throw new Asn1InvalidArgException("nbits", Integer.toString(i));
            }
            byte b2 = (byte) (b & ((byte) ((-1) << (8 - i))));
            int i2 = this.mBitOffset;
            if (i2 < 0) {
                checkSize(1);
                byte[] bArr = this.mData;
                int i3 = this.mByteIndex + 1;
                this.mByteIndex = i3;
                bArr[i3] = b2;
                this.mBitOffset = 7 - i;
                return;
            }
            int i4 = i2 + 1;
            int i5 = this.mByteIndex;
            byte[] bArr2 = this.mData;
            bArr2[i5] = (byte) (((byte) ((b2 & 255) >> (7 - i2))) | bArr2[i5]);
            int i6 = i2 - i;
            this.mBitOffset = i6;
            if (i6 < -1) {
                checkSize(1);
                byte[] bArr3 = this.mData;
                int i7 = this.mByteIndex + 1;
                this.mByteIndex = i7;
                bArr3[i7] = (byte) (b2 << i4);
                this.mBitOffset += 8;
            }
        }
    }

    public void encodeCharString(String str, int i, int i2, int i3, int i4, Asn1CharSet asn1CharSet) throws Asn1Exception {
        int i5 = 0;
        if (asn1CharSet != null) {
            int numBitsPerChar = asn1CharSet.getNumBitsPerChar(isAligned());
            boolean z = Math.pow(2.0d, (double) numBitsPerChar) - 1.0d < ((double) asn1CharSet.getMaxValue());
            this.mTraceHandler.newBitField("value", i * numBitsPerChar);
            while (i5 < i) {
                char charAt = str.charAt(i2 + i5);
                if (z) {
                    encodeInt(asn1CharSet.getCharIndex(charAt), numBitsPerChar, (String) null);
                } else {
                    encodeInt(charAt, numBitsPerChar, (String) null);
                }
                i5++;
            }
        } else {
            if (!isAligned()) {
                i3 = i4;
            }
            this.mTraceHandler.newBitField("value", i * i3);
            while (i5 < i) {
                encodeInt(str.charAt(i2 + i5), i3, (String) null);
                i5++;
            }
        }
        rt.lcheck(2);
    }

    public void encodeConsWholeNumber(long j, long j2, String str) throws Asn1InvalidArgException {
        int bitCount = Asn1Integer.getBitCount(j2 - 1);
        if (j >= j2 && j2 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            throw new Asn1InvalidArgException("adjustedValue", Long.toString(j));
        }
        rt.lcheck(2);
        if (!this.mbAligned) {
            encodeInt(j, bitCount, str);
            return;
        }
        if (j2 <= 255) {
            encodeInt(j, bitCount, str);
            return;
        }
        if (j2 == 256) {
            byteAlign();
            encodeInt(j, 8, str);
        } else {
            if (j2 <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                byteAlign();
                encodeInt(j, 16, str);
                return;
            }
            encodeInt(j == 0 ? 0 : (Asn1Integer.getBitCount(j) - 1) / 8, Asn1Integer.getBitCount(((bitCount + 7) / 8) - 1), "length");
            byteAlign();
            if (j == 0) {
                encodeInt(0L, 8, "value");
            } else {
                encodeInt(j, false, false);
            }
        }
    }

    public void encodeInt(long j, boolean z, boolean z2, String str) throws Asn1InvalidArgException {
        int bitCount = Asn1Integer.getBitCount(j);
        while (bitCount % 8 != 0) {
            bitCount++;
        }
        rt.lcheck(2);
        if (z2) {
            long j2 = 1 << (bitCount - 1);
            if ((j < 0 && (j & j2) == 0) || (j > 0 && (j2 & j) != 0)) {
                bitCount += 8;
            }
        }
        if (z) {
            encodeLength(bitCount / 8);
            byteAlign();
        }
        encodeInt(j, bitCount, str);
    }

    public long encodeLength(long j) throws Asn1InvalidArgException {
        byteAlign();
        if (j < 128) {
            encodeInt(j, 8, "length");
        } else if (j < PlaybackStateCompat.ACTION_PREPARE) {
            encodeBit(true, "extlen");
            encodeInt(j, 15, "length");
        } else {
            long j2 = j / PlaybackStateCompat.ACTION_PREPARE;
            if (j2 > 4) {
                j2 = 4;
            }
            encodeBit(true, "extlen");
            encodeBit(true, "extlen");
            encodeInt(j2, 6, "len*16k");
            j = j2 * PlaybackStateCompat.ACTION_PREPARE;
        }
        rt.lcheck(2);
        return j;
    }

    public void encodeLengthEOM(long j) {
        if (j < PlaybackStateCompat.ACTION_PREPARE || j % PlaybackStateCompat.ACTION_PREPARE != 0) {
            return;
        }
        try {
            encodeLength(0L);
        } catch (Exception unused) {
        }
    }

    public void encodeOIDLengthAndValue(int[] iArr) throws Asn1Exception {
        int i = 1;
        for (int i2 = 2; i2 < iArr.length; i2++) {
            i += Asn1RunTime.getIdentBytesCount(iArr[i2]);
        }
        encodeLength(i);
        this.mTraceHandler.newBitField("value", i * 8);
        checkSize(i);
        encodeIdentifier((iArr[0] * 40) + iArr[1]);
        for (int i3 = 2; i3 < iArr.length; i3++) {
            encodeIdentifier(iArr[i3]);
        }
    }

    public void encodeOctetString(byte[] bArr, int i, int i2) throws Asn1Exception {
        while (true) {
            int encodeLength = (int) encodeLength(i2);
            if (encodeLength > 0) {
                byteAlign();
                encodeBits(bArr, i, encodeLength * 8);
            }
            i2 -= encodeLength;
            if (i2 <= 0) {
                rt.lcheck(2);
                encodeLengthEOM(i2);
                return;
            }
            i += encodeLength;
        }
    }

    public void encodeOpenType(Asn1PerEncodeBuffer asn1PerEncodeBuffer, String str) throws Asn1Exception {
        if (str != null) {
            this.mTraceHandler.addElemName(str, -1);
        }
        byteAlign();
        encodeOpenType(asn1PerEncodeBuffer.getBuffer(), 0, asn1PerEncodeBuffer.getMsgByteCnt());
        if (str != null) {
            this.mTraceHandler.removeLastElemName();
        }
    }

    public void encodeRelOIDLengthAndValue(int[] iArr) throws Asn1Exception {
        int i = 0;
        for (int i2 : iArr) {
            i += Asn1RunTime.getIdentBytesCount(i2);
        }
        encodeLength(i);
        this.mTraceHandler.newBitField("value", i * 8);
        checkSize(i);
        for (int i3 : iArr) {
            encodeIdentifier(i3);
        }
    }

    public void encodeSmallNonNegWholeNumber(int i) throws Asn1InvalidArgException {
        if (i < 64) {
            encodeInt(i, 7);
        } else {
            encodeBit(true, ">= 64");
            byteAlign();
            encodeInt(i, true, false);
        }
        rt.lcheck(2);
    }

    public byte[] getBuffer() {
        return this.mData;
    }

    public ByteArrayInputStream getByteArrayInputStream() {
        return new ByteArrayInputStream(this.mData, 0, this.mByteIndex + 1);
    }

    public int getByteIndex() {
        return this.mByteIndex;
    }

    @Override // com.objsys.asn1j.runtime.Asn1MessageBuffer
    public InputStream getInputStream() {
        return getByteArrayInputStream();
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerMessageBuffer
    public int getMsgBitCnt() {
        return Asn1PerUtil.getMsgBitCnt(this.mByteIndex, this.mBitOffset);
    }

    public int getMsgByteCnt() {
        return this.mByteIndex + 1;
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public byte[] getMsgCopy() {
        int msgByteCnt = getMsgByteCnt();
        byte[] bArr = new byte[msgByteCnt];
        System.arraycopy(this.mData, 0, bArr, 0, msgByteCnt);
        return bArr;
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public int getMsgLength() {
        return getMsgByteCnt();
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerMessageBuffer
    public Asn1PerTraceHandler getTraceHandler() {
        return this.mTraceHandler;
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void hexDump() {
        Asn1MessageBuffer.hexDump(getByteArrayInputStream());
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerMessageBuffer
    public boolean isAligned() {
        return this.mbAligned;
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void reset() {
        this.mByteIndex = -1;
        this.mBitOffset = -1;
        this.mTraceHandler.reset();
    }

    public void reverseBytes(int i, int i2) {
        for (int i3 = (i2 - 1) + i; i < i3; i3--) {
            byte[] bArr = this.mData;
            byte b = bArr[i3];
            bArr[i3] = bArr[i];
            bArr[i] = b;
            i++;
        }
    }

    public void setAligned(boolean z) {
        this.mbAligned = z;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer((this.mByteIndex + 1) * 2);
        for (int i = 0; i < this.mByteIndex + 1; i++) {
            Asn1Util.toHexString(this.mData[i], stringBuffer);
        }
        return stringBuffer.toString();
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void write(OutputStream outputStream) throws IOException {
        outputStream.write(this.mData, 0, this.mByteIndex + 1);
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void copy(byte b) {
        try {
            encodeBits(b, 8);
        } catch (Asn1InvalidArgException unused) {
        }
    }

    public Asn1PerEncodeBuffer(boolean z, int i) {
        super(i);
        this.mTraceHandler = new Asn1PerEncodeTraceHandler(this);
        this.mBitOffset = -1;
        this.mByteIndex = -1;
        this.mbAligned = z;
    }

    public void encodeOpenType(byte[] bArr, int i, int i2) throws Asn1Exception {
        if (i2 == 0) {
            encodeOctetString(ZEROBYTE, 0, 1);
        } else {
            encodeOctetString(bArr, i, i2);
        }
    }

    public void encodeBit(boolean z) {
        encodeBit(z, "value");
    }

    public void encodeInt(long j, int i) throws Asn1InvalidArgException {
        encodeInt(j, i, "value");
    }

    public void encodeInt(long j, int i, String str) throws Asn1InvalidArgException {
        if (str != null) {
            this.mTraceHandler.newBitField(str, i);
        }
        if (i > 0) {
            long j2 = j << (64 - i);
            while (i > 0) {
                encodeBits((byte) (j2 >>> 56), i > 8 ? 8 : i);
                j2 <<= 8;
                i -= 8;
            }
        }
    }

    public void encodeInt(long j, boolean z, boolean z2) throws Asn1InvalidArgException {
        encodeInt(j, z, z2, "value");
    }

    public void encodeLength(long j, long j2, long j3) throws Asn1Exception {
        if (j < j2 || j > j3) {
            throw new Asn1ConsVioException("length", j);
        }
        if (j3 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            encodeLength(j);
        } else if (j2 != j3) {
            encodeConsWholeNumber(j - j2, 1 + (j3 - j2), "length");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void encodeBits(byte[] bArr, int i, int i2, String str) throws Asn1InvalidArgException {
        this.mTraceHandler.newBitField(str, i2);
        if (i2 <= 0) {
            return;
        }
        int i3 = i2 % 8;
        int i4 = i2 / 8;
        int i5 = 0;
        if (i4 > 0) {
            if (this.mBitOffset < 0) {
                checkSize(i4);
                int i6 = this.mByteIndex + 1;
                this.mByteIndex = i6;
                System.arraycopy(bArr, i, this.mData, i6, i4);
                this.mByteIndex = (i4 - 1) + this.mByteIndex;
                if (i3 == 0) {
                    encodeBits(bArr[i4 + i], i3);
                    return;
                }
                return;
            }
            while (i5 < i4) {
                encodeBits(bArr[i5 + i], 8);
                i5++;
            }
        }
        i4 = i5;
        if (i3 == 0) {
        }
    }

    public void encodeBits(byte[] bArr, int i, int i2) throws Asn1InvalidArgException {
        encodeBits(bArr, i, i2, "value");
    }

    public void encodeConsWholeNumber(long j, long j2) throws Asn1InvalidArgException {
        encodeConsWholeNumber(j, j2, "value");
    }
}
