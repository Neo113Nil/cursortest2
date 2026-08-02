package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.sp;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class r3 {
    public static final q3 Companion = new q3();
    public final String a;
    public String b;

    public /* synthetic */ r3(int i, String str, String str2) {
        if (1 != (i & 1)) {
            sp.x(i, 1, p3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public static final void a(r3 r3Var, cti ctiVar, xfb0 xfb0Var) {
        ctiVar.m(xfb0Var, 0, r3Var.a);
        if (!ctiVar.z() && epx.f(r3Var.b, "")) {
            return;
        }
        ctiVar.m(xfb0Var, 1, r3Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj != null && r3.class.equals(obj.getClass())) {
            r3 r3Var = (r3) obj;
            if (epx.f(this.a, r3Var.a) && epx.f(this.b, r3Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("UnclosedAd(eventId=");
        a.append(this.a);
        a.append(", sessionId=");
        return ho8.a(a, this.b, ')');
    }

    public r3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void a(String str) {
        this.b = str;
    }

    public /* synthetic */ r3(String str) {
        this(str, "");
    }
}
