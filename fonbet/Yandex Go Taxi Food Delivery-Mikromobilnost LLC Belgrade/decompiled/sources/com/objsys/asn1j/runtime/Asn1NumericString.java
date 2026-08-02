package com.objsys.asn1j.runtime;

import java.io.IOException;

/* loaded from: classes11.dex */
public class Asn1NumericString extends Asn18BitCharString {
    public static final Asn1CharSet CHARSET = new Asn1DiscreteCharSet(" 0123456789");
    public static final Asn1Tag TAG = new Asn1Tag(0, 0, 18);

    public Asn1NumericString() {
        super((short) 18);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, CHARSET, j, j2);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, CHARSET, j, j2);
    }

    public Asn1NumericString(String str) {
        super(str, (short) 18);
    }

    @Override // com.objsys.asn1j.runtime.Asn18BitCharString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, CHARSET);
    }

    @Override // com.objsys.asn1j.runtime.Asn18BitCharString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, CHARSET);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        decode(asn1BerDecodeBuffer, z, i, TAG);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        return encode(asn1BerEncodeBuffer, z, TAG);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        asn1BerOutputStream.encodeCharString(this.value, z, TAG);
    }
}
