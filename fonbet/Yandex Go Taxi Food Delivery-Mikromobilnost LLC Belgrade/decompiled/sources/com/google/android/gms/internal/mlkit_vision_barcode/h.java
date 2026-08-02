package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.epa1;
import defpackage.ysa1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class h extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzci b;

    public /* synthetic */ h(zzci zzciVar, int i) {
        this.a = i;
        this.b = zzciVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        zzci zzciVar = this.b;
        switch (i) {
            case 0:
                zzciVar.clear();
                break;
            default:
                zzciVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        zzci zzciVar = this.b;
        switch (i) {
            case 0:
                Map f = zzciVar.f();
                if (f != null) {
                    return f.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int j = zzciVar.j(entry.getKey());
                    if (j != -1 && epa1.d(zzciVar.c()[j], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return zzciVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        zzci zzciVar = this.b;
        switch (i) {
            case 0:
                Map f = zzciVar.f();
                return f != null ? f.entrySet().iterator() : new g(zzciVar, 1);
            default:
                Map f2 = zzciVar.f();
                return f2 != null ? f2.keySet().iterator() : new g(zzciVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        zzci zzciVar = this.b;
        switch (i) {
            case 0:
                Map f = zzciVar.f();
                if (f == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!zzciVar.h()) {
                            int i2 = zzciVar.i();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = zzciVar.a;
                            Objects.requireNonNull(obj2);
                            int e = ysa1.e(key, value, i2, obj2, zzciVar.a(), zzciVar.b(), zzciVar.c());
                            if (e != -1) {
                                zzciVar.g(e, i2);
                                zzciVar.y--;
                                zzciVar.x += 32;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                Map f2 = zzciVar.f();
                if (f2 == null) {
                    if (zzciVar.l(obj) == zzci.C) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        zzci zzciVar = this.b;
        switch (i) {
        }
        return zzciVar.size();
    }
}
