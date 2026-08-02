package com.google.android.gms.internal.common;

import defpackage.mya1;

/* loaded from: classes11.dex */
final class zzag extends zzah {
    public final transient int c;
    public final transient int w;
    final /* synthetic */ zzah zzc;

    public zzag(zzah zzahVar, int i, int i2) {
        this.zzc = zzahVar;
        this.c = i;
        this.w = i2;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] a() {
        return this.zzc.a();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int b() {
        return this.zzc.b() + this.c;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int f() {
        return this.zzc.b() + this.c + this.w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        mya1.d(i, this.w);
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* renamed from: i */
    public final zzah subList(int i, int i2) {
        mya1.e(i, i2, this.w);
        zzah zzahVar = this.zzc;
        int i3 = this.c;
        return zzahVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
