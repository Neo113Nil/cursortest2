package com.google.android.gms.internal.mlkit_common;

import defpackage.gtq0;

/* loaded from: classes11.dex */
final class zzae extends zzaf {
    public final transient int c;
    public final transient int w;
    final /* synthetic */ zzaf zzc;

    public zzae(zzaf zzafVar, int i, int i2) {
        this.zzc = zzafVar;
        this.c = i;
        this.w = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int b() {
        return this.zzc.f() + this.c + this.w;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int f() {
        return this.zzc.f() + this.c;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final Object[] g() {
        return this.zzc.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        gtq0.W(i, this.w);
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, java.util.List
    /* renamed from: h */
    public final zzaf subList(int i, int i2) {
        gtq0.Y(i, i2, this.w);
        zzaf zzafVar = this.zzc;
        int i3 = this.c;
        return zzafVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
