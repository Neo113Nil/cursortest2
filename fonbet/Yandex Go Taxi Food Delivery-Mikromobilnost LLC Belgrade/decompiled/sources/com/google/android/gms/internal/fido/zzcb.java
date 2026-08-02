package com.google.android.gms.internal.fido;

import defpackage.tra1;

/* loaded from: classes11.dex */
final class zzcb extends zzcc {
    public final transient int c;
    public final transient int w;
    final /* synthetic */ zzcc zzc;

    public zzcb(zzcc zzccVar, int i, int i2) {
        this.zzc = zzccVar;
        this.c = i;
        this.w = i2;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int b() {
        return this.zzc.f() + this.c + this.w;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int f() {
        return this.zzc.f() + this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tra1.d(i, this.w);
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] h() {
        return this.zzc.h();
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* renamed from: j */
    public final zzcc subList(int i, int i2) {
        tra1.e(i, i2, this.w);
        zzcc zzccVar = this.zzc;
        int i3 = this.c;
        return zzccVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
