package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.g18;
import xsna.ho8;
import xsna.oqm0;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class k2 {
    public static final j2 Companion = new j2();
    public final Boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ k2(int i, Boolean bool, String str, String str2, String str3, String str4, String str5) {
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
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    public static final void a(k2 k2Var, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || k2Var.a != null) {
            ctiVar.s(xfb0Var, 0, g18.a, k2Var.a);
        }
        if (ctiVar.z() || k2Var.b != null) {
            ctiVar.s(xfb0Var, 1, oqm0.a, k2Var.b);
        }
        if (ctiVar.z() || k2Var.c != null) {
            ctiVar.s(xfb0Var, 2, oqm0.a, k2Var.c);
        }
        if (ctiVar.z() || k2Var.d != null) {
            ctiVar.s(xfb0Var, 3, oqm0.a, k2Var.d);
        }
        if (ctiVar.z() || k2Var.e != null) {
            ctiVar.s(xfb0Var, 4, oqm0.a, k2Var.e);
        }
        if (!ctiVar.z() && k2Var.f == null) {
            return;
        }
        ctiVar.s(xfb0Var, 5, oqm0.a, k2Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return epx.f(this.a, k2Var.a) && epx.f(this.b, k2Var.b) && epx.f(this.c, k2Var.c) && epx.f(this.d, k2Var.d) && epx.f(this.e, k2Var.e) && epx.f(this.f, k2Var.f);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("GDPRSettings(isCountryDataProtected=");
        a.append(this.a);
        a.append(", consentTitle=");
        a.append(this.b);
        a.append(", consentMessage=");
        a.append(this.c);
        a.append(", consentMessageVersion=");
        a.append(this.d);
        a.append(", buttonAccept=");
        a.append(this.e);
        a.append(", buttonDeny=");
        return ho8.a(a, this.f, ')');
    }
}
