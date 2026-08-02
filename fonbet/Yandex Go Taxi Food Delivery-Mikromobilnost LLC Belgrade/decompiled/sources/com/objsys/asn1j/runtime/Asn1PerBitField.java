package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1PerBitField {
    private int mBitCount;
    private int mBitOffset;
    private String mName;

    public Asn1PerBitField(String str, int i, int i2) {
        this.mName = str;
        this.mBitOffset = i;
        this.mBitCount = i2;
    }

    public int getBitCount() {
        return this.mBitCount;
    }

    public int getBitOffset() {
        return this.mBitOffset;
    }

    public String getName() {
        return this.mName;
    }

    public void setBitCount(int i) {
        this.mBitCount = i;
    }

    public void setBitCountAndOffset(int i, int i2) {
        this.mBitCount = i;
        this.mBitOffset = i2;
    }

    public void setBitOffset(int i) {
        this.mBitOffset = i;
    }
}
