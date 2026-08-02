package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.iq;
import xsna.oqm0;
import xsna.u500;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class m1 {
    public static final l1 Companion = new l1();
    public final String a;
    public String b;
    public final Long c;

    public /* synthetic */ m1(int i, String str, String str2, Long l) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
    }

    public static final void a(m1 m1Var, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || m1Var.a != null) {
            ctiVar.s(xfb0Var, 0, oqm0.a, m1Var.a);
        }
        if (ctiVar.z() || m1Var.b != null) {
            ctiVar.s(xfb0Var, 1, oqm0.a, m1Var.b);
        }
        if (!ctiVar.z() && m1Var.c == null) {
            return;
        }
        ctiVar.s(xfb0Var, 2, u500.a, m1Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return epx.f(this.a, m1Var.a) && epx.f(this.b, m1Var.b) && epx.f(this.c, m1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("RequestExt(configExtension=");
        a.append(this.a);
        a.append(", signals=");
        a.append(this.b);
        a.append(", configLastValidatedTimestamp=");
        return iq.b(a, this.c, ')');
    }

    public m1(String str, String str2, Long l) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }
}
