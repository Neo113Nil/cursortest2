package com.google.gson.internal;

import defpackage.aqy;
import defpackage.ny61;
import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class c implements Iterator {
    public aqy a;
    public aqy b = null;
    public int c;
    public final /* synthetic */ LinkedTreeMap w;

    public c(LinkedTreeMap linkedTreeMap) {
        this.w = linkedTreeMap;
        this.a = linkedTreeMap.header.w;
        this.c = linkedTreeMap.modCount;
    }

    public final aqy a() {
        aqy aqyVar = this.a;
        LinkedTreeMap linkedTreeMap = this.w;
        if (aqyVar == linkedTreeMap.header) {
            ny61.p();
            return null;
        }
        if (linkedTreeMap.modCount != this.c) {
            ny61.y();
            return null;
        }
        this.a = aqyVar.w;
        this.b = aqyVar;
        return aqyVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.w.header;
    }

    @Override // java.util.Iterator
    public Object next() {
        return a();
    }

    @Override // java.util.Iterator
    public final void remove() {
        aqy aqyVar = this.b;
        if (aqyVar == null) {
            ny61.k();
            return;
        }
        LinkedTreeMap linkedTreeMap = this.w;
        linkedTreeMap.c(aqyVar, true);
        this.b = null;
        this.c = linkedTreeMap.modCount;
    }
}
