package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.vez0;

/* loaded from: classes11.dex */
final class zzbj extends zzbk {
    public final transient int c;
    public final transient int w;
    final /* synthetic */ zzbk zzc;

    public zzbj(zzbk zzbkVar, int i, int i2) {
        this.zzc = zzbkVar;
        this.c = i;
        this.w = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int b() {
        return this.zzc.f() + this.c + this.w;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int f() {
        return this.zzc.f() + this.c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final Object[] g() {
        return this.zzc.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        vez0.k0(i, this.w);
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final zzbk subList(int i, int i2) {
        vez0.l0(i, i2, this.w);
        zzbk zzbkVar = this.zzc;
        int i3 = this.c;
        return zzbkVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
