package com.objsys.asn1j.runtime;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes11.dex */
public class Asn1BerOutputStream extends Asn1OutputStream {
    private static final byte[] EOC = {0, 0};
    private static Asn1RunTime rt = Asn1RunTime.instance();

    public Asn1BerOutputStream(OutputStream outputStream, int i) {
        super(i != 0 ? new BufferedOutputStream(outputStream, i) : outputStream);
    }

    public void encode(Asn1Type asn1Type, boolean z) throws IOException, Asn1Exception {
        asn1Type.encode(this, z);
    }

    public void encodeBMPString(String str, boolean z, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        if (z) {
            encodeTag(asn1Tag);
        }
        if (str == null) {
            encodeLength(0);
            return;
        }
        encodeLength(str.length() * 2);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            this.os.write((byte) (charAt / 256));
            this.os.write((byte) (charAt % 256));
        }
    }

    public void encodeBitString(byte[] bArr, int i, boolean z, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        if (z) {
            encodeTag(asn1Tag);
        }
        int i2 = (i + 7) / 8;
        encodeLength(i2 + 1);
        int i3 = i % 8;
        if (i3 != 0) {
            i3 = 8 - i3;
            int i4 = i2 - 1;
            bArr[i4] = (byte) (bArr[i4] & (~((1 << i3) - 1)));
        }
        this.os.write(i3);
        if (i2 > 0) {
            this.os.write(bArr, 0, i2);
        }
        rt.lcheck(1);
    }

    public void encodeCharString(String str, boolean z, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        if (z) {
            encodeTag(asn1Tag);
        }
        if (str == null) {
            encodeLength(0);
        } else {
            encodeLength(str.length());
            this.os.write(str.getBytes());
        }
    }

    public void encodeEOC() throws IOException {
        this.os.write(EOC);
    }

    public void encodeIdentifier(long j) throws IOException {
        int identBytesCount = Asn1RunTime.getIdentBytesCount(j);
        long j2 = 127 << (identBytesCount * 7);
        if (identBytesCount > 0) {
            while (identBytesCount > 0) {
                j2 >>>= 7;
                identBytesCount--;
                long j3 = (j & j2) >>> (identBytesCount * 7);
                if (identBytesCount != 0) {
                    j3 |= 128;
                }
                this.os.write((byte) j3);
            }
        } else {
            this.os.write(0);
        }
        rt.lcheck(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void encodeIntValue(long j, boolean z) throws IOException {
        long j2;
        int i;
        int i2;
        int i3 = 9;
        byte[] bArr = new byte[9];
        long j3 = j;
        int i4 = 0;
        while (true) {
            j2 = j3 % 256;
            j3 /= 256;
            if (j3 < 0 && j2 != 0) {
                j3--;
            }
            i = i3 - 1;
            bArr[i] = (byte) j2;
            i2 = i4 + 1;
            if (j3 == 0 || j3 == -1) {
                break;
            }
            i3 = i;
            i4 = i2;
        }
        if (j <= 0 || (j2 & 128) != 128) {
            if (j < 0 && (j2 & 128) == 0) {
                i = i3 - 2;
                bArr[i] = -1;
            }
            if (z) {
                encodeLength(i2);
            }
            this.os.write(bArr, i, i2);
            rt.lcheck(1);
        }
        i = i3 - 2;
        bArr[i] = 0;
        i2 = i4 + 2;
        if (z) {
        }
        this.os.write(bArr, i, i2);
        rt.lcheck(1);
    }

    public void encodeLength(int i) throws IOException {
        if (i < 0) {
            if (i == -9999) {
                this.os.write(128);
                return;
            }
            return;
        }
        int bytesCount = Asn1Util.getBytesCount(i);
        if (i > 127) {
            this.os.write((byte) (bytesCount | 128));
        }
        for (int i2 = (bytesCount * 8) - 8; i2 >= 0; i2 -= 8) {
            this.os.write((byte) ((i >> i2) & 255));
        }
    }

    public void encodeOctetString(byte[] bArr, boolean z, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        if (z) {
            encodeTag(asn1Tag);
        }
        if (bArr == null) {
            encodeLength(0);
        } else {
            encodeLength(bArr.length);
            this.os.write(bArr);
        }
        rt.lcheck(1);
    }

    public void encodeTag(Asn1Tag asn1Tag) throws IOException {
        byte b = (byte) (asn1Tag.mClass | asn1Tag.mForm);
        int i = asn1Tag.mIDCode;
        OutputStream outputStream = this.os;
        if (i < 31) {
            outputStream.write((byte) (b | i));
        } else {
            outputStream.write((byte) (b | 31));
            encodeIdentifier(asn1Tag.mIDCode);
        }
        rt.lcheck(1);
    }

    public void encodeTagAndIndefLen(short s, short s2, int i) throws IOException {
        encodeTag(new Asn1Tag(s, s2, i));
        this.os.write(128);
    }

    public void encodeTagAndLength(Asn1Tag asn1Tag, int i) throws IOException {
        encodeTag(asn1Tag);
        encodeLength(i);
    }

    public void encodeUnivString(int[] iArr, boolean z, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        if (z) {
            encodeTag(asn1Tag);
        }
        if (iArr == null) {
            encodeLength(0);
            return;
        }
        encodeLength(iArr.length * 4);
        for (int i : iArr) {
            this.os.write((byte) ((i >>> 24) & 255));
            this.os.write((byte) ((i >>> 16) & 255));
            this.os.write((byte) ((i >>> 8) & 255));
            this.os.write((byte) (i & 255));
        }
    }

    public Asn1BerOutputStream(OutputStream outputStream) {
        super(new BufferedOutputStream(outputStream));
    }

    public void encodeTagAndIndefLen(Asn1Tag asn1Tag) throws IOException {
        encodeTag(asn1Tag);
        this.os.write(128);
    }

    public void encodeTag(short s, short s2, int i) throws IOException {
        encodeTag(new Asn1Tag(s, s2, i));
    }
}
