package com.google.android.gms.internal.mlkit_vision_common;

import defpackage.q5z;

/* loaded from: classes11.dex */
final class zzo extends zzp {
    public final transient int c;
    public final transient int w;
    final /* synthetic */ zzp zzc;

    public zzo(zzp zzpVar, int i, int i2) {
        this.zzc = zzpVar;
        this.c = i;
        this.w = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int b() {
        return this.zzc.f() + this.c + this.w;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int f() {
        return this.zzc.f() + this.c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final Object[] g() {
        return this.zzc.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        q5z.p0(i, this.w);
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, java.util.List
    /* renamed from: h */
    public final zzp subList(int i, int i2) {
        q5z.q0(i, i2, this.w);
        zzp zzpVar = this.zzc;
        int i3 = this.c;
        return zzpVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
