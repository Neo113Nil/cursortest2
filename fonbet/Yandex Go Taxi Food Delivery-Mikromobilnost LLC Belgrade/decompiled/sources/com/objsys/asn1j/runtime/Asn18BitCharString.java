package com.objsys.asn1j.runtime;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class Asn18BitCharString extends Asn1CharString {
    public static final int BITSPERCHAR_A = 8;
    public static final int BITSPERCHAR_U = 7;

    public Asn18BitCharString(short s) {
        super(s);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, 8, 7, asn1CharSet, j, j2);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, 8, 7, asn1CharSet, j, j2);
        asn1PerOutputStream.writeBuffer(false);
    }

    public Asn18BitCharString(String str, short s) {
        super(str, s);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, 8, 7, asn1CharSet);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer) throws Asn1Exception, IOException {
        decode(asn1PerDecodeBuffer, 8, 7, (Asn1CharSet) null);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, 8, 7, asn1CharSet);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, 8, 7, asn1CharSet, j, j2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerOutputStream asn1PerOutputStream) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, 8, 7, (Asn1CharSet) null);
        asn1PerOutputStream.writeBuffer(false);
    }

    public void encode(Asn1PerOutputStream asn1PerOutputStream, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        encode(asn1PerOutputStream.mBuffer, 8, 7, asn1CharSet);
        asn1PerOutputStream.writeBuffer(false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer) throws Asn1Exception, IOException {
        encode(asn1PerEncodeBuffer, 8, 7, (Asn1CharSet) null);
    }
}
