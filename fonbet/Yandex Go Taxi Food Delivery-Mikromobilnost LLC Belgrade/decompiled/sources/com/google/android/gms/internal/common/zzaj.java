package com.google.android.gms.internal.common;

import defpackage.mya1;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzaj extends zzah {
    public static final zzah x = new zzaj(0, new Object[0]);
    public final transient Object[] c;
    public final transient int w;

    public zzaj(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] a() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int f() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.common.zzah, com.google.android.gms.internal.common.zzac
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        mya1.d(i, this.w);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
