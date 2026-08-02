package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.cza1;
import defpackage.n691;
import java.util.Map;

/* loaded from: classes11.dex */
public final class j extends n691 {
    public final Object b;
    public int c;
    public final /* synthetic */ zzbd w;

    public j(zzbd zzbdVar, int i) {
        super(false, 1);
        this.w = zzbdVar;
        Object[] objArr = zzbdVar.c;
        objArr.getClass();
        this.b = objArr[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        zzbd zzbdVar = this.w;
        if (i != -1 && i < zzbdVar.size()) {
            int i2 = this.c;
            Object[] objArr = zzbdVar.c;
            objArr.getClass();
            if (cza1.c(obj, objArr[i2])) {
                return;
            }
        }
        Object obj2 = zzbd.C;
        this.c = zzbdVar.g(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzbd zzbdVar = this.w;
        Map a = zzbdVar.a();
        if (a != null) {
            return a.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        Object[] objArr = zzbdVar.w;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzbd zzbdVar = this.w;
        Map a = zzbdVar.a();
        Object obj2 = this.b;
        if (a != null) {
            return a.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            zzbdVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = zzbdVar.w;
        objArr.getClass();
        Object obj3 = objArr[i];
        int i2 = this.c;
        Object[] objArr2 = zzbdVar.w;
        objArr2.getClass();
        objArr2[i2] = obj;
        return obj3;
    }
}
