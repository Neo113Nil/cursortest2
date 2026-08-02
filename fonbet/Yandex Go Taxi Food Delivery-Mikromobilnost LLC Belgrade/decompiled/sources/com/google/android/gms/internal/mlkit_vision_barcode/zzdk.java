package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.qke;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzdk extends zzcs {
    public static final zzcs x = new zzdk(0, new Object[0]);
    public final transient Object[] c;
    public final transient int w;

    public zzdk(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcs, com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int a(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.w;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int b() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final Object[] g() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qke.F(i, this.w);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
