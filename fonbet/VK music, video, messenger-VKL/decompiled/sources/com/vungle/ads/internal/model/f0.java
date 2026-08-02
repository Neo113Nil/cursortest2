package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.g18;
import xsna.tn;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class f0 {
    public static final e0 Companion = new e0();
    public final Boolean a;
    public final Boolean b;

    public /* synthetic */ f0(int i, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
    }

    public static final void a(f0 f0Var, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || f0Var.a != null) {
            ctiVar.s(xfb0Var, 0, g18.a, f0Var.a);
        }
        if (!ctiVar.z() && f0Var.b == null) {
            return;
        }
        ctiVar.s(xfb0Var, 1, g18.a, f0Var.b);
    }

    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return epx.f(this.a, f0Var.a) && epx.f(this.b, f0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("WebViewSettings(allowFileAccessFromFileUrls=");
        a.append(this.a);
        a.append(", allowUniversalAccessFromFileUrls=");
        return tn.a(a, this.b, ')');
    }

    public final Boolean a() {
        return this.a;
    }
}
