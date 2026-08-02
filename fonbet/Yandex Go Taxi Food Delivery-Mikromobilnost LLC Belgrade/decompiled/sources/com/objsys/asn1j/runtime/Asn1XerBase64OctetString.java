package com.objsys.asn1j.runtime;

import java.io.IOException;

/* loaded from: classes11.dex */
public class Asn1XerBase64OctetString extends Asn1OctetString {
    public Asn1XerBase64OctetString() {
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString
    public void decodeXER(String str, String str2) throws Asn1Exception {
        this.value = Asn1Util.decodeBase64Array(str.trim().getBytes());
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString
    public void decodeXML(String str, String str2) throws Asn1Exception {
        decodeXER(str, str2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        if (str == null) {
            str = "OCTET_STRING";
        }
        if (this.value.length == 0) {
            asn1XerEncoder.indent();
            asn1XerEncoder.encodeEmptyElement(str);
        } else {
            asn1XerEncoder.encodeStartElement(str);
            asn1XerEncoder.copy(Asn1Util.encodeBase64Array(this.value));
            asn1XerEncoder.encodeEndElement(str);
        }
    }

    public Asn1XerBase64OctetString(byte[] bArr) {
        super(bArr);
    }

    public Asn1XerBase64OctetString(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public Asn1XerBase64OctetString(String str) throws Asn1ValueParseException {
        super(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        if (str == null) {
            str = "OCTET_STRING";
        }
        if (this.value.length == 0) {
            asn1XerEncoder.indent();
            asn1XerEncoder.encodeEmptyElement(str, str2);
        } else {
            asn1XerEncoder.encodeStartElement(str, str2);
            asn1XerEncoder.copy(Asn1Util.encodeBase64Array(this.value));
            asn1XerEncoder.encodeEndElement(str);
        }
    }
}
