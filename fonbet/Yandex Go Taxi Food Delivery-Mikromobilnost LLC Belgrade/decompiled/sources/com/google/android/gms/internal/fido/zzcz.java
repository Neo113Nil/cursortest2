package com.google.android.gms.internal.fido;

import defpackage.me91;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.sb91;
import defpackage.z591;
import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzcz extends zzcf {
    public final transient Object w;

    public zzcz(Object obj) {
        this.w = obj;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        objArr[0] = this.w;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.w.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final z591 g() {
        return new me91(this.w);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.w.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new me91(this.w);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc l() {
        Object[] objArr = {this.w};
        for (int i = 0; i < 1; i++) {
            sb91 sb91Var = zzcc.b;
            if (objArr[i] == null) {
                ny61.t(oyr.i(i, "at index "));
                return null;
            }
        }
        return zzcc.k(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return oyr.p("[", this.w.toString(), "]");
    }
}
