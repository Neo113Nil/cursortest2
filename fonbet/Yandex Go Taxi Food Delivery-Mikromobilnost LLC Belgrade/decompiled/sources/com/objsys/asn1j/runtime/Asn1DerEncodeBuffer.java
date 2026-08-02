package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1DerEncodeBuffer extends Asn1BerEncodeBuffer {
    public Asn1DerEncodeBuffer() {
        this.mByteIndex = this.mSizeIncrement - 1;
    }

    public Asn1DerEncodeBuffer(int i) {
        super(i);
        this.mByteIndex = this.mSizeIncrement - 1;
    }
}
