package com.google.android.gms.internal.play_billing;

import defpackage.vng;

/* loaded from: classes11.dex */
final class zzcn extends zzco {
    public final transient int c;
    public final transient int w;
    final /* synthetic */ zzco zzc;

    public zzcn(zzco zzcoVar, int i, int i2) {
        this.zzc = zzcoVar;
        this.c = i;
        this.w = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int b() {
        return this.zzc.f() + this.c + this.w;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int f() {
        return this.zzc.f() + this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vng.Q(i, this.w);
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] i() {
        return this.zzc.i();
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    /* renamed from: k */
    public final zzco subList(int i, int i2) {
        vng.S(i, i2, this.w);
        zzco zzcoVar = this.zzc;
        int i3 = this.c;
        return zzcoVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
