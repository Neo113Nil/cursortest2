package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.n9x;
import xsna.uqi;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class f {
    public static final e Companion = new e();
    public final Integer a;
    public final Integer b;

    public /* synthetic */ f(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = num2;
        }
    }

    public static final void a(f fVar, cti ctiVar, xfb0 xfb0Var) {
        Integer num;
        Integer num2;
        if (ctiVar.z() || (num2 = fVar.a) == null || num2.intValue() != 0) {
            ctiVar.s(xfb0Var, 0, n9x.a, fVar.a);
        }
        if (ctiVar.z() || (num = fVar.b) == null || num.intValue() != 0) {
            ctiVar.s(xfb0Var, 1, n9x.a, fVar.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AdSizeInfo(width=");
        a.append(this.a);
        a.append(", height=");
        return uqi.b(a, this.b, ')');
    }
}
