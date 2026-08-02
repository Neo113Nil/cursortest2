package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.util.BitSet;

/* loaded from: classes11.dex */
public class Asn1Xer_ABSTRACT_SYNTAX_property extends Asn1BitString {
    public static final int handles_invalid_encoding = 0;

    public Asn1Xer_ABSTRACT_SYNTAX_property() {
        this.value = new byte[1];
    }

    @Override // com.objsys.asn1j.runtime.Asn1BitString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws Asn1Exception, IOException {
        if (str == null) {
            str = "BIT_STRING";
        }
        super.encode(asn1XerEncoder, str);
    }

    public Asn1Xer_ABSTRACT_SYNTAX_property(int i, byte[] bArr) {
        super(i, bArr);
    }

    public Asn1Xer_ABSTRACT_SYNTAX_property(boolean[] zArr) {
        super(zArr);
    }

    public Asn1Xer_ABSTRACT_SYNTAX_property(String str) throws Asn1ValueParseException {
        super(str);
    }

    public Asn1Xer_ABSTRACT_SYNTAX_property(BitSet bitSet) {
        super(bitSet);
    }
}
