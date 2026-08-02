package com.google.android.gms.internal.identity;

import defpackage.mua1;

/* loaded from: classes11.dex */
final class zzew extends zzex {
    public final transient int c;
    public final transient int w;
    final /* synthetic */ zzex zzc;

    public zzew(zzex zzexVar, int i, int i2) {
        this.zzc = zzexVar;
        this.c = i;
        this.w = i2;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final Object[] a() {
        return this.zzc.a();
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int b() {
        return this.zzc.b() + this.c;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final int f() {
        return this.zzc.b() + this.c + this.w;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        mua1.g(i, this.w);
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.identity.zzex, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final zzex subList(int i, int i2) {
        mua1.h(i, i2, this.w);
        zzex zzexVar = this.zzc;
        int i3 = this.c;
        return zzexVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
