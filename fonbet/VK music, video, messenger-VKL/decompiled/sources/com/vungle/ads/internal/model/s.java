package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.oqm0;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class s {
    public static final r Companion = new r();
    public final String a;
    public final i b;
    public final l c;

    public /* synthetic */ s(int i, String str, i iVar, l lVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = iVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = lVar;
        }
    }

    public static final void a(s sVar, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || sVar.a != null) {
            ctiVar.s(xfb0Var, 0, oqm0.a, sVar.a);
        }
        if (ctiVar.z() || sVar.b != null) {
            ctiVar.s(xfb0Var, 1, g.a, sVar.b);
        }
        if (!ctiVar.z() && sVar.c == null) {
            return;
        }
        ctiVar.s(xfb0Var, 2, j.a, sVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return epx.f(this.a, sVar.a) && epx.f(this.b, sVar.b) && epx.f(this.c, sVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        i iVar = this.b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l lVar = this.c;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("PlacementAdUnit(placementReferenceId=");
        a.append(this.a);
        a.append(", adMarkup=");
        a.append(this.b);
        a.append(", csb=");
        a.append(this.c);
        a.append(')');
        return a.toString();
    }
}
