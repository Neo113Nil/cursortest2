package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1DiscreteCharSet extends Asn1CharSet {
    private int[] mCharSet;

    public Asn1DiscreteCharSet(String str) {
        super(str.length());
        this.mCharSet = new int[str.length()];
        int i = 0;
        while (true) {
            int[] iArr = this.mCharSet;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = str.charAt(i);
            i++;
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1CharSet
    public int getCharAtIndex(int i) throws Asn1ConsVioException {
        int[] iArr = this.mCharSet;
        if (i < iArr.length) {
            return iArr[i];
        }
        throw new Asn1ConsVioException("character index", i);
    }

    @Override // com.objsys.asn1j.runtime.Asn1CharSet
    public int getCharIndex(int i) throws Asn1ConsVioException {
        int[] iArr;
        int i2 = 0;
        while (true) {
            iArr = this.mCharSet;
            if (i2 >= iArr.length || iArr[i2] == i) {
                break;
            }
            i2++;
        }
        if (i2 < iArr.length) {
            return i2;
        }
        throw new Asn1ConsVioException("character index", i);
    }

    @Override // com.objsys.asn1j.runtime.Asn1CharSet
    public int getMaxValue() {
        return this.mCharSet[r1.length - 1];
    }

    public Asn1DiscreteCharSet(int[] iArr) {
        super(iArr.length);
        this.mCharSet = iArr;
    }
}
