package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.vpa1;
import defpackage.xya1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class h extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzba b;

    public /* synthetic */ h(zzba zzbaVar, int i) {
        this.a = i;
        this.b = zzbaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        zzba zzbaVar = this.b;
        switch (i) {
            case 0:
                zzbaVar.clear();
                break;
            default:
                zzbaVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        zzba zzbaVar = this.b;
        switch (i) {
            case 0:
                Map f = zzbaVar.f();
                if (f != null) {
                    return f.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int j = zzbaVar.j(entry.getKey());
                    if (j != -1 && xya1.g(zzbaVar.c()[j], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return zzbaVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        zzba zzbaVar = this.b;
        switch (i) {
            case 0:
                Map f = zzbaVar.f();
                return f != null ? f.entrySet().iterator() : new g(zzbaVar, 1);
            default:
                Map f2 = zzbaVar.f();
                return f2 != null ? f2.keySet().iterator() : new g(zzbaVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        zzba zzbaVar = this.b;
        switch (i) {
            case 0:
                Map f = zzbaVar.f();
                if (f == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!zzbaVar.h()) {
                            int i2 = zzbaVar.i();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = zzbaVar.a;
                            Objects.requireNonNull(obj2);
                            int d = vpa1.d(key, value, i2, obj2, zzbaVar.a(), zzbaVar.b(), zzbaVar.c());
                            if (d != -1) {
                                zzbaVar.g(d, i2);
                                zzbaVar.y--;
                                zzbaVar.x += 32;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                Map f2 = zzbaVar.f();
                if (f2 == null) {
                    if (zzbaVar.l(obj) == zzba.C) {
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
        zzba zzbaVar = this.b;
        switch (i) {
        }
        return zzbaVar.size();
    }
}
