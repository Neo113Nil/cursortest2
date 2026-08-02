package com.objsys.asn1j.runtime;

import java.io.IOException;

/* loaded from: classes11.dex */
public class Asn1ObjectDescriptor extends Asn1VarWidthCharString {
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 7);

    public Asn1ObjectDescriptor() {
        super((short) 7);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        decode(asn1BerDecodeBuffer, z, i, TAG);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        asn1BerOutputStream.encodeCharString(this.value, z, TAG);
    }

    public Asn1ObjectDescriptor(String str) {
        super(str, (short) 7);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        return encode(asn1BerEncodeBuffer, z, TAG);
    }
}
