package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.qke;

/* loaded from: classes11.dex */
final class zzcr extends zzcs {
    public final transient int c;
    public final transient int w;
    final /* synthetic */ zzcs zzc;

    public zzcr(zzcs zzcsVar, int i, int i2) {
        this.zzc = zzcsVar;
        this.c = i;
        this.w = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int b() {
        return this.zzc.f() + this.c + this.w;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int f() {
        return this.zzc.f() + this.c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final Object[] g() {
        return this.zzc.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        qke.F(i, this.w);
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcs, java.util.List
    /* renamed from: h */
    public final zzcs subList(int i, int i2) {
        qke.G(i, i2, this.w);
        zzcs zzcsVar = this.zzc;
        int i3 = this.c;
        return zzcsVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
