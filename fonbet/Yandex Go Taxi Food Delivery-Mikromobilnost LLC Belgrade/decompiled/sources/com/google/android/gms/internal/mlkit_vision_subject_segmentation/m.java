package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.n991;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class m implements n991 {
    public transient h a;
    public transient g b;

    public final Map a() {
        g gVar = this.b;
        if (gVar != null) {
            return gVar;
        }
        zzw zzwVar = (zzw) this;
        g gVar2 = new g(zzwVar, zzwVar.c);
        this.b = gVar2;
        return gVar2;
    }

    public final Set b() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar;
        }
        zzw zzwVar = (zzw) this;
        h hVar2 = new h(zzwVar, zzwVar.c);
        this.a = hVar2;
        return hVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n991) {
            return a().equals(((m) ((n991) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((g) a()).c.hashCode();
    }

    public final String toString() {
        return ((g) a()).c.toString();
    }
}
