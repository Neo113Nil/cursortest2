package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.vez0;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzci extends zzbk {
    public final transient Object[] c;
    public final transient int w;
    public final transient int x = 1;

    public zzci(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vez0.k0(i, this.x);
        Object obj = this.c[i + i + this.w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.x;
    }
}
