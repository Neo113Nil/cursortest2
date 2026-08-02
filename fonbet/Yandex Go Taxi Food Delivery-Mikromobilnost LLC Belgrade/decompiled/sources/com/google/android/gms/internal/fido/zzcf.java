package com.google.android.gms.internal.fido;

import defpackage.mta1;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.sb91;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class zzcf extends zzby implements Set {
    public static final /* synthetic */ int c = 0;
    public transient zzcc b;

    public static zzcf i(int i, Object... objArr) {
        if (i == 0) {
            return zzcu.C;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzcz(obj);
        }
        int k = k(i);
        Object[] objArr2 = new Object[k];
        int i2 = k - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                ny61.t(oyr.i(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i6 = rotateLeft & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    rotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzcz(obj4);
        }
        if (k(i4) < k / 2) {
            return i(i4, objArr);
        }
        if (i4 <= 0) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzcu(objArr, i3, objArr2, i2, i4);
    }

    public static int k(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        ny61.g("collection too large");
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcf) && j() && ((zzcf) obj).j() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return mta1.g(this);
    }

    public boolean j() {
        return this instanceof zzcu;
    }

    public zzcc l() {
        zzcc zzccVar = this.b;
        if (zzccVar != null) {
            return zzccVar;
        }
        zzcc m = m();
        this.b = m;
        return m;
    }

    public zzcc m() {
        Object[] array = toArray(zzby.a);
        sb91 sb91Var = zzcc.b;
        return zzcc.k(array.length, array);
    }
}
