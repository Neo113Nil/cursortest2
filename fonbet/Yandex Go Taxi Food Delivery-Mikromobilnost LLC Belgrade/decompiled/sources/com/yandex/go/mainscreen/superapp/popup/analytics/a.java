package com.yandex.go.mainscreen.superapp.popup.analytics;

import defpackage.d3w0;
import defpackage.g3w0;
import defpackage.jse;
import defpackage.tig0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes.dex */
public final class a {
    public final tig0 a;
    public final tse b;
    public final jse c = uyj.a.P(1);
    public g3w0 d = d3w0.a;

    public a(tig0 tig0Var, tse tseVar, tt2 tt2Var) {
        this.a = tig0Var;
        this.b = tseVar;
    }

    public final void a(g3w0 g3w0Var) {
        tje.N(this.b, this.c, null, new FallbackAssistantAnalyticsWrapper$reportState$1(this, g3w0Var, null), 2);
    }
}
