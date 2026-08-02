package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.hua1;
import defpackage.ooa1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class b extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzal b;

    public /* synthetic */ b(zzal zzalVar, int i) {
        this.a = i;
        this.b = zzalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        zzal zzalVar = this.b;
        switch (i) {
            case 0:
                zzalVar.clear();
                break;
            default:
                zzalVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        zzal zzalVar = this.b;
        switch (i) {
            case 0:
                Map a = zzalVar.a();
                if (a != null) {
                    return a.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = zzalVar.g(entry.getKey());
                    if (g != -1) {
                        Object[] objArr = zzalVar.w;
                        objArr.getClass();
                        if (hua1.i(objArr[g], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return zzalVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        zzal zzalVar = this.b;
        switch (i) {
            case 0:
                Map a = zzalVar.a();
                return a != null ? a.entrySet().iterator() : new a(zzalVar, 1);
            default:
                Map a2 = zzalVar.a();
                return a2 != null ? a2.keySet().iterator() : new a(zzalVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        zzal zzalVar = this.b;
        switch (i) {
            case 0:
                Map a = zzalVar.a();
                if (a == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!zzalVar.c()) {
                            int f = zzalVar.f();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = zzalVar.a;
                            obj2.getClass();
                            int[] iArr = zzalVar.b;
                            iArr.getClass();
                            Object[] objArr = zzalVar.c;
                            objArr.getClass();
                            Object[] objArr2 = zzalVar.w;
                            objArr2.getClass();
                            int f2 = ooa1.f(key, value, f, obj2, iArr, objArr, objArr2);
                            if (f2 != -1) {
                                zzalVar.b(f2, f);
                                zzalVar.y--;
                                zzalVar.x += 32;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                Map a2 = zzalVar.a();
                if (a2 == null) {
                    if (zzalVar.i(obj) == zzal.C) {
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
        zzal zzalVar = this.b;
        switch (i) {
        }
        return zzalVar.size();
    }
}
