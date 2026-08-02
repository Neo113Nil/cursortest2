package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.oqm0;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class f3 {
    public static final e3 Companion = new e3();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ f3(int i, String str, String str2, String str3) {
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
    }

    public static final void a(f3 f3Var, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || f3Var.a != null) {
            ctiVar.s(xfb0Var, 0, oqm0.a, f3Var.a);
        }
        if (ctiVar.z() || f3Var.b != null) {
            ctiVar.s(xfb0Var, 1, oqm0.a, f3Var.b);
        }
        if (!ctiVar.z() && f3Var.c == null) {
            return;
        }
        ctiVar.s(xfb0Var, 2, oqm0.a, f3Var.c);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return epx.f(this.a, f3Var.a) && epx.f(this.b, f3Var.b) && epx.f(this.c, f3Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("OmSdkData(params=");
        a.append(this.a);
        a.append(", vendorKey=");
        a.append(this.b);
        a.append(", vendorURL=");
        return ho8.a(a, this.c, ')');
    }

    public final String a() {
        return this.a;
    }
}
