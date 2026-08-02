package com.google.android.gms.internal.play_billing;

import defpackage.vng;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzdk extends zzco {
    public static final zzco x = new zzdk(0, new Object[0]);
    public final transient Object[] c;
    public final transient int w;

    public zzdk(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, com.google.android.gms.internal.play_billing.zzcj
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int b() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vng.Q(i, this.w);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] i() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
