package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.bvf0;

/* loaded from: classes11.dex */
final class zzau extends zzav {
    public final transient int c;
    public final transient int w;
    final /* synthetic */ zzav zzc;

    public zzau(zzav zzavVar, int i, int i2) {
        this.zzc = zzavVar;
        this.c = i;
        this.w = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzaq
    public final int b() {
        return this.zzc.f() + this.c + this.w;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzaq
    public final int f() {
        return this.zzc.f() + this.c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzaq
    public final Object[] g() {
        return this.zzc.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        bvf0.d0(i, this.w);
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzav, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final zzav subList(int i, int i2) {
        bvf0.e0(i, i2, this.w);
        zzav zzavVar = this.zzc;
        int i3 = this.c;
        return zzavVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
