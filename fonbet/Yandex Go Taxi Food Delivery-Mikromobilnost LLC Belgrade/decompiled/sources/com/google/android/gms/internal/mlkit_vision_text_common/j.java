package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class j extends AbstractCollection {
    public final /* synthetic */ zzba a;

    public j(zzba zzbaVar) {
        this.a = zzbaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzba zzbaVar = this.a;
        Map f = zzbaVar.f();
        return f != null ? f.values().iterator() : new g(zzbaVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
