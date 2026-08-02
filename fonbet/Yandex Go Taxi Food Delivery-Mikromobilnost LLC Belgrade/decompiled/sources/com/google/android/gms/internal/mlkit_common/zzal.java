package com.google.android.gms.internal.mlkit_common;

import defpackage.gtq0;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzal extends zzaf {
    public static final zzaf x = new zzal(0, new Object[0]);
    public final transient Object[] c;
    public final transient int w;

    public zzal(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, com.google.android.gms.internal.mlkit_common.zzab
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int b() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final Object[] g() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gtq0.W(i, this.w);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
