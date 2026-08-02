package com.google.android.gms.internal.play_billing;

import defpackage.vng;

/* loaded from: classes11.dex */
final class zzcm extends zzco {
    public final transient zzco c;

    public zzcm(zzco zzcoVar) {
        this.c = zzcoVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzco zzcoVar = this.c;
        vng.Q(i, zzcoVar.size());
        return zzcoVar.get((zzcoVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean h() {
        return this.c.h();
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco
    public final zzco j() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final zzco subList(int i, int i2) {
        zzco zzcoVar = this.c;
        vng.S(i, i2, zzcoVar.size());
        return zzcoVar.subList(zzcoVar.size() - i2, zzcoVar.size() - i).j();
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r1.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
