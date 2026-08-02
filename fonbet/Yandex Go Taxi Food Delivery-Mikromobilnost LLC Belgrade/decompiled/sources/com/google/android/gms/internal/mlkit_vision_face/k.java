package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class k extends AbstractCollection {
    public final /* synthetic */ zzbd a;

    public k(zzbd zzbdVar) {
        this.a = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzbd zzbdVar = this.a;
        Map a = zzbdVar.a();
        return a != null ? a.values().iterator() : new h(zzbdVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
