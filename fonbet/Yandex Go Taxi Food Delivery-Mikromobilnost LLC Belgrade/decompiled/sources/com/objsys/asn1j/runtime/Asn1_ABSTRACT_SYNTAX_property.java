package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.util.BitSet;

/* loaded from: classes11.dex */
public class Asn1_ABSTRACT_SYNTAX_property extends Asn1BitString {
    public static final int handles_invalid_encoding = 0;

    public Asn1_ABSTRACT_SYNTAX_property() {
        this.value = new byte[1];
    }

    @Override // com.objsys.asn1j.runtime.Asn1BitString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, z, i);
        asn1BerDecodeBuffer.invokeCharacters(toString());
    }

    public Asn1_ABSTRACT_SYNTAX_property(int i, byte[] bArr) {
        super(i, bArr);
    }

    public Asn1_ABSTRACT_SYNTAX_property(boolean[] zArr) {
        super(zArr);
    }

    public Asn1_ABSTRACT_SYNTAX_property(String str) throws Asn1ValueParseException {
        super(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1BitString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        super.decode(asn1PerDecodeBuffer);
        asn1PerDecodeBuffer.invokeCharacters(toString());
    }

    public Asn1_ABSTRACT_SYNTAX_property(BitSet bitSet) {
        super(bitSet);
    }
}
