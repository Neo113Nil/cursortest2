package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.ad91;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class g implements ad91 {
    public transient d a;
    public transient c b;

    public final Map a() {
        c cVar = this.b;
        if (cVar != null) {
            return cVar;
        }
        zzap zzapVar = (zzap) this;
        c cVar2 = new c(zzapVar, zzapVar.c);
        this.b = cVar2;
        return cVar2;
    }

    public final Set b() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar;
        }
        zzap zzapVar = (zzap) this;
        d dVar2 = new d(zzapVar, zzapVar.c);
        this.a = dVar2;
        return dVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ad91) {
            return a().equals(((g) ((ad91) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((c) a()).c.hashCode();
    }

    public final String toString() {
        return ((c) a()).c.toString();
    }
}
