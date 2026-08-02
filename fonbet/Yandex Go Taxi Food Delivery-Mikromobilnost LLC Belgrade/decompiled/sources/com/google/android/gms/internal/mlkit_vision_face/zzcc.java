package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.y5e;

/* loaded from: classes.dex */
final class zzcc extends zzbn {
    public static final zzbn x = new zzcc(0, new Object[0]);
    public final transient Object[] c;
    public final transient int w;

    public zzcc(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.w;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int b() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final Object[] g() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        y5e.R(i, this.w);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
