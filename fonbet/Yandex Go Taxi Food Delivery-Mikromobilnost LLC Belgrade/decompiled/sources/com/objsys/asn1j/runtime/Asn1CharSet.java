package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public abstract class Asn1CharSet {
    protected int mABitsPerChar;
    protected int mUBitsPerChar;

    public Asn1CharSet(int i) {
        this.mUBitsPerChar = Asn1Integer.getBitCount(i - 1);
        this.mABitsPerChar = 1;
        while (true) {
            int i2 = this.mUBitsPerChar;
            int i3 = this.mABitsPerChar;
            if (i2 <= i3) {
                return;
            } else {
                this.mABitsPerChar = i3 << 1;
            }
        }
    }

    public abstract int getCharAtIndex(int i) throws Asn1ConsVioException;

    public abstract int getCharIndex(int i) throws Asn1ConsVioException;

    public abstract int getMaxValue();

    public int getNumBitsPerChar(boolean z) {
        return z ? this.mABitsPerChar : this.mUBitsPerChar;
    }
}
