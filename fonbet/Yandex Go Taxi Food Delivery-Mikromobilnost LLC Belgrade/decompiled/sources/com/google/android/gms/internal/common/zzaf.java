package com.google.android.gms.internal.common;

import defpackage.mya1;

/* loaded from: classes11.dex */
final class zzaf extends zzah {
    public final transient zzah c;

    public zzaf(zzah zzahVar) {
        this.c = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzah zzahVar = this.c;
        mya1.d(i, zzahVar.size());
        return zzahVar.get((zzahVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final zzah h() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final zzah subList(int i, int i2) {
        zzah zzahVar = this.c;
        mya1.e(i, i2, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i2, zzahVar.size() - i).h();
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
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
