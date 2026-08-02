package com.google.android.gms.internal.play_billing;

import defpackage.le91;
import defpackage.ng91;
import defpackage.oyr;
import defpackage.rta1;
import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzdt extends zzcv {
    public final transient Object c;

    public zzdt(Object obj) {
        this.c = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int a(Object[] objArr) {
        objArr[0] = this.c;
        return 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    public final zzco g() {
        le91 le91Var = zzco.b;
        Object[] objArr = {this.c};
        rta1.h(0, objArr[0]);
        return zzco.l(1, objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new ng91(this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return oyr.p("[", this.c.toString(), "]");
    }
}
