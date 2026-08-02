package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.hua1;
import defpackage.n691;
import java.util.Map;

/* loaded from: classes11.dex */
public final class c extends n691 {
    public final Object b;
    public int c;
    public final /* synthetic */ zzal w;

    public c(zzal zzalVar, int i) {
        super(false, 3);
        this.w = zzalVar;
        Object[] objArr = zzalVar.c;
        objArr.getClass();
        this.b = objArr[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        zzal zzalVar = this.w;
        if (i != -1 && i < zzalVar.size()) {
            int i2 = this.c;
            Object[] objArr = zzalVar.c;
            objArr.getClass();
            if (hua1.i(obj, objArr[i2])) {
                return;
            }
        }
        Object obj2 = zzal.C;
        this.c = zzalVar.g(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzal zzalVar = this.w;
        Map a = zzalVar.a();
        if (a != null) {
            return a.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        Object[] objArr = zzalVar.w;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzal zzalVar = this.w;
        Map a = zzalVar.a();
        Object obj2 = this.b;
        if (a != null) {
            return a.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            zzalVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = zzalVar.w;
        objArr.getClass();
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }
}
