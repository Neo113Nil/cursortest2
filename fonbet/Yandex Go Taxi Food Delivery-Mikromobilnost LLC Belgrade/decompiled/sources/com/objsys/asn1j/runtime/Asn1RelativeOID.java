package com.objsys.asn1j.runtime;

import defpackage.quz;
import java.io.IOException;

/* loaded from: classes11.dex */
public class Asn1RelativeOID extends Asn1ObjectIdentifier {
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 13);
    private static final long serialVersionUID = -6333449510838564262L;

    public Asn1RelativeOID() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1ObjectIdentifier, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        int decodeLength = (int) asn1PerDecodeBuffer.decodeLength();
        if (decodeLength <= 0) {
            quz.r();
            return;
        }
        asn1PerDecodeBuffer.getTraceHandler().newBitField("value", 0);
        this.value = asn1PerDecodeBuffer.decodeRelOIDContents(decodeLength);
        asn1PerDecodeBuffer.getTraceHandler().setBitCount();
        asn1PerDecodeBuffer.setTypeCode((short) 13);
    }

    @Override // com.objsys.asn1j.runtime.Asn1ObjectIdentifier
    public void decodeXER(String str, String str2) throws Asn1Exception {
        String trim = str.trim();
        int length = trim.length();
        if (length == 0) {
            quz.r();
            return;
        }
        int i = -1;
        int i2 = 0;
        while (true) {
            i = trim.indexOf(46, i + 1);
            if (i <= 0) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        if (i3 > 128) {
            quz.r();
            return;
        }
        this.value = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = trim.charAt(i6);
            if (Character.isDigit(charAt)) {
                i5 = (charAt - '0') + (i5 * 10);
            } else if (charAt != '.') {
                quz.r();
                return;
            } else if (i6 + 1 >= length) {
                quz.r();
                return;
            } else {
                this.value[i4] = i5;
                i5 = 0;
                i4++;
            }
        }
        this.value[i4] = i5;
    }

    @Override // com.objsys.asn1j.runtime.Asn1ObjectIdentifier
    public void decodeXML(String str, String str2) throws Asn1Exception {
        decodeXER(str, str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1ObjectIdentifier, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.value.length) {
                break;
            }
            i3 += Asn1RunTime.getIdentBytesCount(r3[i2]);
            i2++;
        }
        if (z) {
            asn1BerOutputStream.encodeTag(TAG);
        }
        asn1BerOutputStream.encodeLength(i3);
        while (true) {
            if (i >= this.value.length) {
                return;
            }
            asn1BerOutputStream.encodeIdentifier(r7[i]);
            i++;
        }
    }

    public Asn1RelativeOID(int[] iArr) {
        super(iArr);
    }

    @Override // com.objsys.asn1j.runtime.Asn1ObjectIdentifier, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, TAG);
        }
        this.value = asn1BerDecodeBuffer.decodeRelOIDContents(i);
        asn1BerDecodeBuffer.setTypeCode((short) 13);
    }

    @Override // com.objsys.asn1j.runtime.Asn1ObjectIdentifier, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        int[] iArr = this.value;
        if (iArr.length >= 1) {
            asn1PerEncodeBuffer.encodeRelOIDLengthAndValue(iArr);
        } else {
            quz.r();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1ObjectIdentifier, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        if (str == null) {
            str = "RELATIVE_OID";
        }
        asn1XerEncoder.encodeStartElement(str);
        asn1XerEncoder.encodeObjectId(this.value);
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1ObjectIdentifier, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        if (str == null) {
            str = "RELATIVE_OID";
        }
        asn1XerEncoder.encodeStartElement(str, str2);
        asn1XerEncoder.encodeObjectId(this.value);
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1ObjectIdentifier, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int[] iArr = this.value;
        if (iArr.length >= 1) {
            int i = 0;
            for (int length = iArr.length - 1; length >= 0; length--) {
                i += asn1BerEncodeBuffer.encodeIdentifier(this.value[length]);
            }
            return z ? asn1BerEncodeBuffer.encodeTagAndLength(TAG, i) + i : i;
        }
        quz.r();
        return 0;
    }

    @Override // com.objsys.asn1j.runtime.Asn1ObjectIdentifier, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        int[] iArr = this.value;
        if (iArr.length >= 1) {
            asn1PerOutputStream.encodeRelOIDLengthAndValue(iArr);
        } else {
            quz.r();
        }
    }
}
