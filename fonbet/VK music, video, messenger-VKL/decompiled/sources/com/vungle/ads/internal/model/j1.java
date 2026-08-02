package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.sp;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class j1 {
    public static final i1 Companion = new i1();
    public final String a;

    public /* synthetic */ j1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            sp.x(i, 1, h1.a.getDescriptor());
            throw null;
        }
    }

    public static final void a(j1 j1Var, cti ctiVar, xfb0 xfb0Var) {
        ctiVar.m(xfb0Var, 0, j1Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && epx.f(this.a, ((j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(com.iab.omid.library.vungle.internal.l.a("IAB(tcf="), this.a, ')');
    }

    public j1(String str) {
        this.a = str;
    }
}
