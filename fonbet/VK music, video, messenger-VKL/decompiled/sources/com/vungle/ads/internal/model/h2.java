package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.oqm0;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class h2 {
    public static final g2 Companion = new g2();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ h2(int i, String str, String str2, String str3, String str4, String str5) {
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
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public static final void a(h2 h2Var, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || h2Var.a != null) {
            ctiVar.s(xfb0Var, 0, oqm0.a, h2Var.a);
        }
        if (ctiVar.z() || h2Var.b != null) {
            ctiVar.s(xfb0Var, 1, oqm0.a, h2Var.b);
        }
        if (ctiVar.z() || h2Var.c != null) {
            ctiVar.s(xfb0Var, 2, oqm0.a, h2Var.c);
        }
        if (ctiVar.z() || h2Var.d != null) {
            ctiVar.s(xfb0Var, 3, oqm0.a, h2Var.d);
        }
        if (!ctiVar.z() && h2Var.e == null) {
            return;
        }
        ctiVar.s(xfb0Var, 4, oqm0.a, h2Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return epx.f(this.a, h2Var.a) && epx.f(this.b, h2Var.b) && epx.f(this.c, h2Var.c) && epx.f(this.d, h2Var.d) && epx.f(this.e, h2Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Endpoints(adsEndpoint=");
        a.append(this.a);
        a.append(", riEndpoint=");
        a.append(this.b);
        a.append(", errorLogsEndpoint=");
        a.append(this.c);
        a.append(", metricsEndpoint=");
        a.append(this.d);
        a.append(", csbEndpoint=");
        return ho8.a(a, this.e, ')');
    }
}
