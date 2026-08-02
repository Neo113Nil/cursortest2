package com.google.android.gms.internal.mlkit_common;

import defpackage.gtq0;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzap extends zzaf {
    public final transient Object[] c;
    public final transient int w;
    public final transient int x;

    public zzap(int i, int i2, Object[] objArr) {
        this.c = objArr;
        this.w = i;
        this.x = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gtq0.W(i, this.x);
        Object obj = this.c[i + i + this.w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.x;
    }
}
