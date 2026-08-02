package com.google.android.gms.internal.play_billing;

import defpackage.vng;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzdo extends zzco {
    public final transient Object[] c;
    public final transient int w;
    public final transient int x;

    public zzdo(int i, int i2, Object[] objArr) {
        this.c = objArr;
        this.w = i;
        this.x = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vng.Q(i, this.x);
        Object obj = this.c[i + i + this.w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.x;
    }
}
