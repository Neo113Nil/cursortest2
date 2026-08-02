package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class j extends AbstractCollection {
    public final /* synthetic */ zzci a;

    public j(zzci zzciVar) {
        this.a = zzciVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzci zzciVar = this.a;
        Map f = zzciVar.f();
        return f != null ? f.values().iterator() : new g(zzciVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
