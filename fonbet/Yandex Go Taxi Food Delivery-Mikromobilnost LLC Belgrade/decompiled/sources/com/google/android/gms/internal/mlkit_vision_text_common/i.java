package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.n691;
import defpackage.xya1;
import java.util.Map;

/* loaded from: classes11.dex */
public final class i extends n691 {
    public final Object b;
    public int c;
    public final /* synthetic */ zzba w;

    public i(zzba zzbaVar, int i) {
        super(false, 0);
        this.w = zzbaVar;
        Object obj = zzba.C;
        this.b = zzbaVar.b()[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        zzba zzbaVar = this.w;
        if (i != -1 && i < zzbaVar.size()) {
            if (xya1.g(obj, zzbaVar.b()[this.c])) {
                return;
            }
        }
        Object obj2 = zzba.C;
        this.c = zzbaVar.j(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzba zzbaVar = this.w;
        Map f = zzbaVar.f();
        if (f != null) {
            return f.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return zzbaVar.c()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzba zzbaVar = this.w;
        Map f = zzbaVar.f();
        Object obj2 = this.b;
        if (f != null) {
            return f.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            zzbaVar.put(obj2, obj);
            return null;
        }
        Object obj3 = zzbaVar.c()[i];
        zzbaVar.c()[this.c] = obj;
        return obj3;
    }
}
