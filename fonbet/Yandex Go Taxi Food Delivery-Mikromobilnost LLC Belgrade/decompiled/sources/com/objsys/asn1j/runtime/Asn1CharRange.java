package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1CharRange extends Asn1CharSet {
    protected int mLower;
    protected int mUpper;

    public Asn1CharRange(int i, int i2) {
        super((i2 - i) + 1);
        this.mLower = i;
        this.mUpper = i2;
    }

    @Override // com.objsys.asn1j.runtime.Asn1CharSet
    public int getCharAtIndex(int i) throws Asn1ConsVioException {
        int i2 = i + this.mLower;
        if (i2 <= this.mUpper) {
            return i2;
        }
        throw new Asn1ConsVioException("character index", i2);
    }

    @Override // com.objsys.asn1j.runtime.Asn1CharSet
    public int getCharIndex(int i) throws Asn1ConsVioException {
        int i2 = i - this.mLower;
        if (i2 >= 0) {
            return i2;
        }
        throw new Asn1ConsVioException("character index", i);
    }

    @Override // com.objsys.asn1j.runtime.Asn1CharSet
    public int getMaxValue() {
        return this.mUpper;
    }
}
