package com.google.android.gms.internal.play_billing;

import defpackage.le91;
import defpackage.ny61;
import defpackage.rta1;
import defpackage.rzo;
import defpackage.xta1;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzcv extends zzcj implements Set {
    public transient zzco b;

    public static int j(int i) {
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

    public static zzcv l(int i, Object... objArr) {
        if (i == 0) {
            return zzdq.B;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzdt(obj);
        }
        int j = j(i);
        Object[] objArr2 = new Object[j];
        int i2 = j - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            rta1.h(i5, obj2);
            int hashCode = obj2.hashCode();
            int e0 = rzo.e0(hashCode);
            while (true) {
                int i6 = e0 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    e0++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzdt(obj4);
        }
        if (j(i4) < j / 2) {
            return l(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzdq(objArr, i3, objArr2, i2, i4);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcv) && (this instanceof zzdq) && (((zzcv) obj) instanceof zzdq) && hashCode() != obj.hashCode()) {
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

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public zzco g() {
        zzco zzcoVar = this.b;
        if (zzcoVar != null) {
            return zzcoVar;
        }
        zzco k = k();
        this.b = k;
        return k;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return xta1.c(this);
    }

    public zzco k() {
        Object[] array = toArray();
        le91 le91Var = zzco.b;
        return zzco.l(array.length, array);
    }
}
