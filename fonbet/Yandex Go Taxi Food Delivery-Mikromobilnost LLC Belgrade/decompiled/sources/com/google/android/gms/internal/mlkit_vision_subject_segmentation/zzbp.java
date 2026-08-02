package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.bvf0;

/* loaded from: classes11.dex */
final class zzbp extends zzav {
    public final transient Object[] c;
    public final transient int w;
    public final transient int x = 1;

    public zzbp(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        bvf0.d0(i, this.x);
        Object obj = this.c[i + i + this.w];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.x;
    }
}
