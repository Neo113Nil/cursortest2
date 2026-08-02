package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.y5e;

/* loaded from: classes11.dex */
final class zzbm extends zzbn {
    public final transient int c;
    public final transient int w;
    final /* synthetic */ zzbn zzc;

    public zzbm(zzbn zzbnVar, int i, int i2) {
        this.zzc = zzbnVar;
        this.c = i;
        this.w = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int b() {
        return this.zzc.f() + this.c + this.w;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int f() {
        return this.zzc.f() + this.c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final Object[] g() {
        return this.zzc.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        y5e.R(i, this.w);
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final zzbn subList(int i, int i2) {
        y5e.S(i, i2, this.w);
        zzbn zzbnVar = this.zzc;
        int i3 = this.c;
        return zzbnVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
