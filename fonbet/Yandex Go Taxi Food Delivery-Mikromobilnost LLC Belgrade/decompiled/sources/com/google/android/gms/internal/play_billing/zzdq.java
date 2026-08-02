package com.google.android.gms.internal.play_billing;

import defpackage.rzo;
import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzdq extends zzcv {
    public static final Object[] A;
    public static final zzdq B;
    public final transient Object[] c;
    public final transient int w;
    public final transient Object[] x;
    public final transient int y;
    public final transient int z;

    static {
        Object[] objArr = new Object[0];
        A = objArr;
        B = new zzdq(objArr, 0, objArr, 0, 0);
    }

    public zzdq(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.c = objArr;
        this.w = i;
        this.x = objArr2;
        this.y = i2;
        this.z = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.z;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int b() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.x;
            if (objArr.length != 0) {
                int e0 = rzo.e0(obj.hashCode());
                while (true) {
                    int i = e0 & this.y;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    e0 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] i() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv
    public final zzco k() {
        return zzco.l(this.z, this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.z;
    }
}
