package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.bvf0;

/* loaded from: classes.dex */
final class zzbl extends zzav {
    public static final zzav x = new zzbl(0, new Object[0]);
    public final transient Object[] c;
    public final transient int w;

    public zzbl(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzav, com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzaq
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzaq
    public final int b() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzaq
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzaq
    public final Object[] g() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        bvf0.d0(i, this.w);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
