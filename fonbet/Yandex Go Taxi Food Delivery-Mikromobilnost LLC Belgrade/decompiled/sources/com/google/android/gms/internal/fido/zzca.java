package com.google.android.gms.internal.fido;

import defpackage.tra1;

/* loaded from: classes11.dex */
final class zzca extends zzcc {
    public final transient zzcc c;

    public zzca(zzcc zzccVar) {
        this.c = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzcc zzccVar = this.c;
        tra1.d(i, zzccVar.size());
        return zzccVar.get((zzccVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    public final zzcc i() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* renamed from: j */
    public final zzcc subList(int i, int i2) {
        zzcc zzccVar = this.c;
        tra1.e(i, i2, zzccVar.size());
        return zzccVar.subList(zzccVar.size() - i2, zzccVar.size() - i).i();
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
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
