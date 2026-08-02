package com.google.android.gms.internal.fido;

import defpackage.tra1;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzct extends zzcc {
    public static final zzcc x = new zzct(0, new Object[0]);
    public final transient Object[] c;
    public final transient int w;

    public zzct(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int b() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tra1.d(i, this.w);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] h() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
