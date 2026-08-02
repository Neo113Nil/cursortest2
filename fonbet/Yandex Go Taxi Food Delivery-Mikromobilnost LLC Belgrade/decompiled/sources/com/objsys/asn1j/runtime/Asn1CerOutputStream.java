package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes11.dex */
public class Asn1CerOutputStream extends Asn1BerOutputStream {
    private static Asn1RunTime rt = Asn1RunTime.instance();

    public Asn1CerOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.objsys.asn1j.runtime.Asn1BerOutputStream
    public void encode(Asn1Type asn1Type, boolean z) throws IOException, Asn1Exception {
        asn1Type.encode(this, z);
    }

    @Override // com.objsys.asn1j.runtime.Asn1BerOutputStream
    public void encodeBMPString(String str, boolean z, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        if (str == null || str.length() <= 500) {
            super.encodeBMPString(str, z, asn1Tag);
        } else {
            if (z) {
                Asn1Tag asn1Tag2 = Asn1BMPString.TAG;
                encodeTagAndIndefLen(asn1Tag2.mClass, (short) 32, asn1Tag2.mIDCode);
            } else {
                this.os.write(128);
            }
            for (int i = 0; i < str.length(); i += 500) {
                int length = str.length() - i;
                if (length > 500) {
                    length = 500;
                }
                encodeTagAndLength(Asn1OctetString.TAG, length * 2);
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2 + i);
                    this.os.write((byte) (charAt / 256));
                    this.os.write((byte) (charAt % 256));
                }
            }
            encodeEOC();
        }
        rt.lcheck(1);
    }

    @Override // com.objsys.asn1j.runtime.Asn1BerOutputStream
    public void encodeBitString(byte[] bArr, int i, boolean z, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        int i2 = (i + 7) / 8;
        if (i2 + 1 <= 1000) {
            super.encodeBitString(bArr, i, z, asn1Tag);
        } else {
            if (z) {
                Asn1Tag asn1Tag2 = Asn1BitString.TAG;
                encodeTagAndIndefLen(asn1Tag2.mClass, (short) 32, asn1Tag2.mIDCode);
            } else {
                this.os.write(128);
            }
            int i3 = i % 8;
            if (i3 != 0) {
                i3 = 8 - i3;
                int i4 = i2 - 1;
                bArr[i4] = (byte) (bArr[i4] & (~((1 << i3) - 1)));
            }
            for (int i5 = 0; i5 < i2; i5 += 1000) {
                int i6 = i2 - i5;
                if (i6 > 1000) {
                    encodeTagAndLength(Asn1BitString.TAG, 1000);
                    i6 = 1000;
                } else {
                    encodeTagAndLength(Asn1BitString.TAG, i6 + 1);
                    this.os.write(i3);
                }
                if (i6 > 0) {
                    this.os.write(bArr, i5, i6);
                }
            }
            encodeEOC();
        }
        rt.lcheck(1);
    }

    @Override // com.objsys.asn1j.runtime.Asn1BerOutputStream
    public void encodeCharString(String str, boolean z, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        if (str == null || str.length() <= 1000) {
            super.encodeCharString(str, z, asn1Tag);
        } else {
            byte[] bytes = str.getBytes();
            if (z) {
                encodeTag(asn1Tag.mClass, (short) 32, asn1Tag.mIDCode);
            }
            encodeOctetString(bytes, false, asn1Tag);
        }
        rt.lcheck(1);
    }

    @Override // com.objsys.asn1j.runtime.Asn1BerOutputStream
    public void encodeOctetString(byte[] bArr, boolean z, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        if (bArr == null || bArr.length <= 1000) {
            super.encodeOctetString(bArr, z, asn1Tag);
        } else {
            if (z) {
                Asn1Tag asn1Tag2 = Asn1OctetString.TAG;
                encodeTagAndIndefLen(asn1Tag2.mClass, (short) 32, asn1Tag2.mIDCode);
            } else {
                this.os.write(128);
            }
            for (int i = 0; i < bArr.length; i += 1000) {
                int length = bArr.length - i;
                if (length > 1000) {
                    length = 1000;
                }
                encodeTagAndLength(Asn1OctetString.TAG, length);
                write(bArr, i, length);
            }
            encodeEOC();
        }
        rt.lcheck(1);
    }

    public void encodeStringTag(int i, short s, short s2, int i2) throws IOException {
        if (i <= 1000) {
            encodeTag(new Asn1Tag(s, s2, i2));
        } else {
            encodeTag(s, (short) 32, i2);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1BerOutputStream
    public void encodeUnivString(int[] iArr, boolean z, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        if (iArr == null || iArr.length <= 250) {
            super.encodeUnivString(iArr, z, asn1Tag);
            return;
        }
        if (z) {
            Asn1Tag asn1Tag2 = Asn1UniversalString.TAG;
            encodeTagAndIndefLen(asn1Tag2.mClass, (short) 32, asn1Tag2.mIDCode);
        } else {
            this.os.write(128);
        }
        for (int i = 0; i < iArr.length; i += 250) {
            int length = iArr.length - i;
            if (length > 250) {
                length = 250;
            }
            encodeTagAndLength(Asn1OctetString.TAG, length * 4);
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArr[i2 + i];
                this.os.write((byte) ((i3 >>> 24) & 255));
                this.os.write((byte) ((i3 >>> 16) & 255));
                this.os.write((byte) ((i3 >>> 8) & 255));
                this.os.write((byte) (i3 & 255));
            }
        }
        encodeEOC();
    }

    public Asn1CerOutputStream(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public void encodeStringTag(int i, Asn1Tag asn1Tag) throws IOException {
        if (i <= 1000) {
            encodeTag(asn1Tag);
        } else {
            encodeTag(asn1Tag.mClass, (short) 32, asn1Tag.mIDCode);
        }
    }
}
