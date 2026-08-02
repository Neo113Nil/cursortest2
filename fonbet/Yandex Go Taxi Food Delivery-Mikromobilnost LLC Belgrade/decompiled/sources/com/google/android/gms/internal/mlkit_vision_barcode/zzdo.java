package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.qke;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzdo extends zzcs {
    public final transient Object[] c;
    public final transient int w;
    public final transient int x = 1;

    public zzdo(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qke.F(i, this.x);
        Object obj = this.c[i + i + this.w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.x;
    }
}
