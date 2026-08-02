package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.epa1;
import defpackage.n691;
import java.util.Map;

/* loaded from: classes11.dex */
public final class i extends n691 {
    public final Object b;
    public int c;
    public final /* synthetic */ zzci w;

    public i(zzci zzciVar, int i) {
        super(false, 2);
        this.w = zzciVar;
        Object obj = zzci.C;
        this.b = zzciVar.b()[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        zzci zzciVar = this.w;
        if (i != -1 && i < zzciVar.size()) {
            if (epa1.d(obj, zzciVar.b()[this.c])) {
                return;
            }
        }
        Object obj2 = zzci.C;
        this.c = zzciVar.j(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzci zzciVar = this.w;
        Map f = zzciVar.f();
        if (f != null) {
            return f.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return zzciVar.c()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzci zzciVar = this.w;
        Map f = zzciVar.f();
        Object obj2 = this.b;
        if (f != null) {
            return f.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            zzciVar.put(obj2, obj);
            return null;
        }
        Object obj3 = zzciVar.c()[i];
        zzciVar.c()[this.c] = obj;
        return obj3;
    }
}
