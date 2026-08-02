package com.objsys.asn1j.runtime;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
public class Asn1BerEncodeBuffer extends Asn1EncodeBuffer {
    private static Asn1RunTime rt = Asn1RunTime.instance();

    public Asn1BerEncodeBuffer() {
        this.mByteIndex = this.mSizeIncrement - 1;
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void binDump(PrintStream printStream, String str) {
        try {
            new Asn1BerDecodeBuffer(getByteArrayInputStream()).parse(new Asn1BerMessageDumpHandler(printStream));
        } catch (Exception unused) {
            System.out.getClass();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void checkSize(int i) {
        int i2 = this.mByteIndex;
        if (i > i2 + 1) {
            int i3 = this.mSizeIncrement;
            int i4 = (((i - 1) / i3) + 1) * i3;
            byte[] bArr = this.mData;
            byte[] bArr2 = new byte[bArr.length + i4];
            int i5 = i4 + i2;
            int length = bArr.length - (i2 + 1);
            System.arraycopy(bArr, i2 + 1, bArr2, i5 + 1, length);
            this.mData = bArr2;
            this.mByteIndex = i5;
        }
        rt.lcheck(1);
    }

    public void copy(String str) {
        int length = str.length();
        checkSize(length);
        this.mByteIndex -= length;
        for (int i = 0; i < length; i++) {
            this.mData[this.mByteIndex + i + 1] = (byte) str.charAt(i);
        }
    }

    public int encodeIdentifier(int i) {
        boolean z = true;
        int i2 = 0;
        do {
            if (this.mByteIndex < 0) {
                checkSize(1);
            }
            byte[] bArr = this.mData;
            int i3 = this.mByteIndex;
            byte b = (byte) (i % 128);
            bArr[i3] = b;
            if (z) {
                z = false;
            } else {
                bArr[i3] = (byte) (b | DerValue.TAG_CONTEXT);
            }
            this.mByteIndex = i3 - 1;
            i /= 128;
            i2++;
        } while (i > 0);
        return i2;
    }

    public int encodeIntValue(long j) {
        long j2;
        int i;
        long j3 = j;
        int i2 = 0;
        while (true) {
            j2 = j3 % 256;
            j3 /= 256;
            if (j3 < 0 && j2 != 0) {
                j3--;
            }
            copy((byte) j2);
            i = i2 + 1;
            if (j3 == 0 || j3 == -1) {
                break;
            }
            i2 = i;
        }
        if (j > 0 && (j2 & 128) == 128) {
            copy((byte) 0);
        } else {
            if (j >= 0 || (j2 & 128) != 0) {
                return i;
            }
            copy((byte) -1);
        }
        return i2 + 2;
    }

    public int encodeLength(int i) {
        boolean z;
        int i2 = 0;
        if (i >= 0) {
            z = i > 127;
            do {
                if (this.mByteIndex < 0) {
                    checkSize(1);
                }
                byte[] bArr = this.mData;
                int i3 = this.mByteIndex;
                this.mByteIndex = i3 - 1;
                bArr[i3] = (byte) (i % 256);
                i2++;
                i /= 256;
            } while (i > 0);
        } else {
            z = i == -9999;
        }
        if (!z) {
            return i2;
        }
        if (this.mByteIndex < 0) {
            checkSize(1);
        }
        byte[] bArr2 = this.mData;
        int i4 = this.mByteIndex;
        this.mByteIndex = i4 - 1;
        bArr2[i4] = (byte) (i2 | 128);
        return i2 + 1;
    }

    public int encodeTag(Asn1Tag asn1Tag) {
        int i;
        byte b = (byte) (asn1Tag.mClass | asn1Tag.mForm);
        int i2 = asn1Tag.mIDCode;
        if (i2 < 31) {
            copy((byte) (i2 | b));
            i = 1;
        } else {
            int encodeIdentifier = encodeIdentifier(i2);
            copy((byte) (b | 31));
            i = encodeIdentifier + 1;
        }
        rt.lcheck(1);
        return i;
    }

    public int encodeTagAndLength(Asn1Tag asn1Tag, int i) {
        return encodeTag(asn1Tag) + encodeLength(i);
    }

    public ByteArrayInputStream getByteArrayInputStream() {
        int i = this.mByteIndex + 1;
        byte[] bArr = this.mData;
        return new ByteArrayInputStream(bArr, i, bArr.length - i);
    }

    @Override // com.objsys.asn1j.runtime.Asn1MessageBuffer
    public InputStream getInputStream() {
        return getByteArrayInputStream();
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public byte[] getMsgCopy() {
        int i = this.mByteIndex + 1;
        byte[] bArr = this.mData;
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public int getMsgLength() {
        return this.mData.length - (this.mByteIndex + 1);
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void reset() {
        this.mByteIndex = this.mData.length - 1;
    }

    public String toString() {
        int i = this.mByteIndex + 1;
        int length = this.mData.length - i;
        StringBuffer stringBuffer = new StringBuffer(length * 2);
        for (int i2 = 0; i2 < length; i2++) {
            Asn1Util.toHexString(this.mData[i2 + i], stringBuffer);
        }
        return stringBuffer.toString();
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void write(OutputStream outputStream) throws IOException {
        int i = this.mByteIndex + 1;
        byte[] bArr = this.mData;
        outputStream.write(bArr, i, bArr.length - i);
    }

    public Asn1BerEncodeBuffer(int i) {
        super(i);
        this.mByteIndex = this.mSizeIncrement - 1;
    }

    public int encodeTagAndLength(short s, short s2, int i, int i2) {
        return encodeTagAndLength(new Asn1Tag(s, s2, i), i2);
    }

    public void binDump() {
        super.binDump(null);
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void copy(byte[] bArr) throws Asn1Exception {
        checkSize(bArr.length);
        int length = this.mByteIndex - bArr.length;
        this.mByteIndex = length;
        System.arraycopy(bArr, 0, this.mData, length + 1, bArr.length);
    }

    public void copy(byte[] bArr, int i, int i2) throws Asn1Exception {
        checkSize(i2);
        int i3 = this.mByteIndex - i2;
        this.mByteIndex = i3;
        System.arraycopy(bArr, i, this.mData, i3 + 1, i2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1EncodeBuffer
    public void copy(byte b) {
        if (this.mByteIndex < 0) {
            checkSize(1);
        }
        byte[] bArr = this.mData;
        int i = this.mByteIndex;
        this.mByteIndex = i - 1;
        bArr[i] = b;
    }
}
