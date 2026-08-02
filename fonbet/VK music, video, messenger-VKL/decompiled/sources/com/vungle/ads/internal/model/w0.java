package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.sp;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class w0 {
    public static final v0 Companion = new v0();
    public final String a;

    public /* synthetic */ w0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            sp.x(i, 1, u0.a.getDescriptor());
            throw null;
        }
    }

    public static final void a(w0 w0Var, cti ctiVar, xfb0 xfb0Var) {
        ctiVar.m(xfb0Var, 0, w0Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && epx.f(this.a, ((w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(com.iab.omid.library.vungle.internal.l.a("CCPA(status="), this.a, ')');
    }

    public w0(String str) {
        this.a = str;
    }
}
