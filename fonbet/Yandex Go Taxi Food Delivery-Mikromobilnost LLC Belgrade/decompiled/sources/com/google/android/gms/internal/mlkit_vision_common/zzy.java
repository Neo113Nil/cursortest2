package com.google.android.gms.internal.mlkit_vision_common;

import defpackage.q5z;

/* loaded from: classes11.dex */
final class zzy extends zzp {
    public final transient Object[] c;
    public final transient int w;
    public final transient int x = 1;

    public zzy(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        q5z.p0(i, this.x);
        Object obj = this.c[i + i + this.w];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.x;
    }
}
