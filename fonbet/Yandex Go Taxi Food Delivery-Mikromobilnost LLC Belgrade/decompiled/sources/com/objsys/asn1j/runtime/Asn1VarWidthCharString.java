package com.objsys.asn1j.runtime;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class Asn1VarWidthCharString extends Asn1CharString {
    public static final int BITSPERCHAR_A = 8;
    public static final int BITSPERCHAR_U = 8;

    public Asn1VarWidthCharString(short s) {
        super(s);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, 8, 8, null, j, j2);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, 8, 8, null, j, j2);
        asn1PerOutputStream.writeBuffer(false);
    }

    public Asn1VarWidthCharString(String str, short s) {
        super(str, s);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, 8, 8, (Asn1CharSet) null);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, 8, 8, null, j, j2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, 8, 8, null);
        asn1PerOutputStream.writeBuffer(false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, 8, 8, null);
    }
}
