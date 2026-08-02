package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.util.BitSet;
import java.util.StringTokenizer;

/* loaded from: classes11.dex */
public class Asn1Xml_ABSTRACT_SYNTAX_property extends Asn1BitString {
    public static final int handles_invalid_encoding = 0;
    static final String[] namedbits = {"handles_invalid_encoding"};
    static final int[] nbindex = {0};

    public Asn1Xml_ABSTRACT_SYNTAX_property() {
        this.value = new byte[1];
    }

    @Override // com.objsys.asn1j.runtime.Asn1BitString
    public void decodeXML(String str, String str2) throws Asn1Exception {
        if (!isNamedBitStr(str)) {
            super.decodeXML(str, str2);
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (!nextToken.equals("handles_invalid_encoding")) {
                throw new Asn1Exception("Invalid identifier in named BIT STRING: ".concat(nextToken));
            }
            set(0, true);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XmlEncodeBuffer asn1XmlEncodeBuffer) throws Asn1Exception, IOException {
        if (isOpenType()) {
            encode(asn1XmlEncodeBuffer, "_ABSTRACT_SYNTAX_property", "xmlns=\"http://www.obj-sys.com/RtClass\" xsi:schemaLocation=\"http://www.obj-sys.com/RtClass RtClass.xsd\"");
            return;
        }
        asn1XmlEncodeBuffer.encodeStartDocument();
        encode(asn1XmlEncodeBuffer, "_ABSTRACT_SYNTAX_property", "xmlns=\"http://www.obj-sys.com/RtClass\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.obj-sys.com/RtClass RtClass.xsd\"");
        asn1XmlEncodeBuffer.encodeEndDocument();
    }

    public Asn1Xml_ABSTRACT_SYNTAX_property(int i, byte[] bArr) {
        super(i, bArr);
    }

    public Asn1Xml_ABSTRACT_SYNTAX_property(boolean[] zArr) {
        super(zArr);
    }

    public Asn1Xml_ABSTRACT_SYNTAX_property(String str) throws Asn1ValueParseException {
        super(str);
    }

    public Asn1Xml_ABSTRACT_SYNTAX_property(BitSet bitSet) {
        super(bitSet);
    }

    @Override // com.objsys.asn1j.runtime.Asn1BitString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws Asn1Exception, IOException {
        if (str == null) {
            str = "_ABSTRACT_SYNTAX_property";
        }
        super.encode(asn1XerEncoder, str, str2, namedbits, nbindex);
    }
}
