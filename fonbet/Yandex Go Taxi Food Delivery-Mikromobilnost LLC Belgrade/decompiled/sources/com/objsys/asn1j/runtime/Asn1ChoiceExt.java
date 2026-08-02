package com.objsys.asn1j.runtime;

import java.io.IOException;

/* loaded from: classes11.dex */
public class Asn1ChoiceExt extends Asn1OpenType {
    public short choiceIndex;

    @Override // com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        this.choiceIndex = (short) asn1PerDecodeBuffer.decodeSmallNonNegWholeNumber();
        super.decode(asn1PerDecodeBuffer);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OpenType, com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        asn1PerEncodeBuffer.encodeSmallNonNegWholeNumber(this.choiceIndex);
        super.encode(asn1PerEncodeBuffer);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OpenType, com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        return super.encode(asn1BerEncodeBuffer, false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OpenType, com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1BerOutputStream asn1BerOutputStream, boolean z) throws Asn1Exception, IOException {
        super.encode(asn1BerOutputStream, false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OpenType, com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        super.decode(asn1BerDecodeBuffer, false, 0);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OpenType, com.objsys.asn1j.runtime.Asn1OctetString, com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        byte[] bArr = this.value;
        asn1PerOutputStream.encodeOpenType(bArr, 0, bArr.length);
    }
}
