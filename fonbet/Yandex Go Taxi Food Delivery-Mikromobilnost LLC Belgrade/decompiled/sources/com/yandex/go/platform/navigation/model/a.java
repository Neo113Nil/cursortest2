package com.yandex.go.platform.navigation.model;

import defpackage.gmp;
import defpackage.pmp;
import defpackage.sls;
import defpackage.tls;
import defpackage.yg50;

/* loaded from: classes13.dex */
public final class a {
    public final gmp a;
    public final pmp b;
    public final tls c = Feature$1.w;
    public final sls d;
    public final yg50 e;

    public a(gmp gmpVar, pmp pmpVar, sls slsVar, yg50 yg50Var) {
        this.a = gmpVar;
        this.b = pmpVar;
        this.d = slsVar;
        this.e = yg50Var;
    }

    public final boolean equals(Object obj) {
        return "main_screen".equals((obj instanceof a ? (a) obj : null) != null ? "main_screen" : null);
    }

    public final int hashCode() {
        return -748911182;
    }

    public final String toString() {
        return "Feature(\"main_screen\")";
    }
}
