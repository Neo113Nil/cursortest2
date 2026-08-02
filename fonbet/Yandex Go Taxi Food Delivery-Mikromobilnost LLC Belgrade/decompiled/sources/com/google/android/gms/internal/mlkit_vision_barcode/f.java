package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.ii91;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class f implements ii91 {
    public transient d a;
    public transient c b;

    public final Map a() {
        c cVar = this.b;
        if (cVar != null) {
            return cVar;
        }
        zzbr zzbrVar = (zzbr) this;
        c cVar2 = new c(zzbrVar, zzbrVar.c);
        this.b = cVar2;
        return cVar2;
    }

    public final Set b() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar;
        }
        zzbr zzbrVar = (zzbr) this;
        d dVar2 = new d(zzbrVar, zzbrVar.c);
        this.a = dVar2;
        return dVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ii91) {
            return a().equals(((f) ((ii91) obj)).a());
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
