package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.g18;
import xsna.ho8;
import xsna.oqm0;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class c0 {
    public static final b0 Companion = new b0();
    public final Boolean a;
    public final String b;

    public /* synthetic */ c0(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public static final void a(c0 c0Var, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || c0Var.a != null) {
            ctiVar.s(xfb0Var, 0, g18.a, c0Var.a);
        }
        if (!ctiVar.z() && c0Var.b == null) {
            return;
        }
        ctiVar.s(xfb0Var, 1, oqm0.a, c0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return epx.f(this.a, c0Var.a) && epx.f(this.b, c0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("ViewAbilityInfo(isEnabled=");
        a.append(this.a);
        a.append(", extraVast=");
        return ho8.a(a, this.b, ')');
    }
}
