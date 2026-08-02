package com.google.android.gms.internal.identity;

import defpackage.mua1;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzey extends zzex {
    public static final zzex x = new zzey(0, new Object[0]);
    public final transient Object[] c;
    public final transient int w;

    public zzey(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final Object[] a() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int f() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        mua1.g(i, this.w);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.identity.zzex, com.google.android.gms.internal.identity.zzeu
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
