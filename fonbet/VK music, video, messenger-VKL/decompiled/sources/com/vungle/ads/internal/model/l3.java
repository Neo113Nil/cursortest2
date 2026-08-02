package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.oqm0;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class l3 {
    public static final k3 Companion = new k3();
    public final String a;

    public /* synthetic */ l3(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public static final void a(l3 l3Var, cti ctiVar, xfb0 xfb0Var) {
        if (!ctiVar.z() && l3Var.a == null) {
            return;
        }
        ctiVar.s(xfb0Var, 0, oqm0.a, l3Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3) && epx.f(this.a, ((l3) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(com.iab.omid.library.vungle.internal.l.a("RtbRequest(sdkUserAgent="), this.a, ')');
    }

    public l3(String str) {
        this.a = str;
    }
}
