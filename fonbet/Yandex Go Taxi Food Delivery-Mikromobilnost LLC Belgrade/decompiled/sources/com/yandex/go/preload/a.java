package com.yandex.go.preload;

import defpackage.b1;
import defpackage.dho;
import defpackage.fpe0;
import defpackage.iph;

/* loaded from: classes8.dex */
public final class a {
    public final dho a;
    public final fpe0 b;
    public final iph c;
    public final b1 d;

    public a(dho dhoVar, fpe0 fpe0Var, iph iphVar, b1 b1Var) {
        this.a = dhoVar;
        this.b = fpe0Var;
        this.c = iphVar;
        this.d = b1Var;
    }

    public final Double a(PreloadAnalytics$EventMarker preloadAnalytics$EventMarker) {
        if (this.a.b(preloadAnalytics$EventMarker) != null) {
            return Double.valueOf(r0.floatValue());
        }
        return null;
    }
}
