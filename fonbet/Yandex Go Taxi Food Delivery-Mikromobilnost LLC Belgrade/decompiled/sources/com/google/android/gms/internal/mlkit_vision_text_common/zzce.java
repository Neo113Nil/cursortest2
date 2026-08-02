package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.vez0;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzce extends zzbk {
    public static final zzbk x = new zzce(0, new Object[0]);
    public final transient Object[] c;
    public final transient int w;

    public zzce(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk, com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int b() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final Object[] g() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vez0.k0(i, this.w);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
