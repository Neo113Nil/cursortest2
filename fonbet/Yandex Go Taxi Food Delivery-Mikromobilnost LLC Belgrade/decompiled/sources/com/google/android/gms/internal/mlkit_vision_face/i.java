package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.cza1;
import defpackage.lqa1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class i extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbd b;

    public /* synthetic */ i(zzbd zzbdVar, int i) {
        this.a = i;
        this.b = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        zzbd zzbdVar = this.b;
        switch (i) {
            case 0:
                zzbdVar.clear();
                break;
            default:
                zzbdVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        zzbd zzbdVar = this.b;
        switch (i) {
            case 0:
                Map a = zzbdVar.a();
                if (a != null) {
                    return a.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = zzbdVar.g(entry.getKey());
                    if (g != -1) {
                        Object[] objArr = zzbdVar.w;
                        objArr.getClass();
                        if (cza1.c(objArr[g], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return zzbdVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        zzbd zzbdVar = this.b;
        switch (i) {
            case 0:
                Map a = zzbdVar.a();
                return a != null ? a.entrySet().iterator() : new h(zzbdVar, 1);
            default:
                Map a2 = zzbdVar.a();
                return a2 != null ? a2.keySet().iterator() : new h(zzbdVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        zzbd zzbdVar = this.b;
        switch (i) {
            case 0:
                Map a = zzbdVar.a();
                if (a == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!zzbdVar.c()) {
                            int f = zzbdVar.f();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = zzbdVar.a;
                            obj2.getClass();
                            int[] iArr = zzbdVar.b;
                            iArr.getClass();
                            Object[] objArr = zzbdVar.c;
                            objArr.getClass();
                            Object[] objArr2 = zzbdVar.w;
                            objArr2.getClass();
                            int d = lqa1.d(key, value, f, obj2, iArr, objArr, objArr2);
                            if (d != -1) {
                                zzbdVar.b(d, f);
                                zzbdVar.y--;
                                zzbdVar.x += 32;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                Map a2 = zzbdVar.a();
                if (a2 == null) {
                    if (zzbdVar.i(obj) == zzbd.C) {
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
        zzbd zzbdVar = this.b;
        switch (i) {
        }
        return zzbdVar.size();
    }
}
