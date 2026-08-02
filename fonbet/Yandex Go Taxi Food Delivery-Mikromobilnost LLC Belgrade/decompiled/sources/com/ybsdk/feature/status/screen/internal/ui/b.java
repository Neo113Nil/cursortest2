package com.ybsdk.feature.status.screen.internal.ui;

import android.net.Uri;
import com.ybsdk.feature.status.screen.api.StatusScreenParams;
import com.ybsdk.feature.status.screen.internal.data.c;
import defpackage.c9u0;
import defpackage.ds31;
import defpackage.h791;
import defpackage.j3h;
import defpackage.k9u0;
import defpackage.p05;
import defpackage.pzt0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.v0h;
import defpackage.vo6;

/* loaded from: classes3.dex */
public final class b extends p05 {
    public final StatusScreenParams B;
    public final c C;
    public final j3h D;
    public final com.ybsdk.widgets.common.shimmer.b E;
    public final k9u0 F;
    public final tfl0 G;
    public pzt0 H;

    public b(StatusScreenParams statusScreenParams, c cVar, j3h j3hVar, com.ybsdk.widgets.common.shimmer.b bVar, k9u0 k9u0Var, tfl0 tfl0Var) {
        super(new vo6(bVar, 4));
        this.B = statusScreenParams;
        this.C = cVar;
        this.D = j3hVar;
        this.E = bVar;
        this.F = k9u0Var;
        this.G = tfl0Var;
    }

    @Override // defpackage.p05
    public final void b0() {
        this.G.e();
    }

    @Override // defpackage.p05
    public final boolean c0(Uri uri) {
        return h791.d(this.D, uri, 14) instanceof v0h;
    }

    @Override // defpackage.p05
    public final void d0() {
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = tje.N(ds31.a(this), null, null, new StatusScreenViewModel$loadData$1(this, null), 3);
    }

    @Override // defpackage.p05
    public final void e0(String str) {
        h791.f(this.D, str, com.ybsdk.feature.webview.api.a.b(((c9u0) this.F).a, str, null, null, 6));
    }

    public final void f0() {
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = tje.N(ds31.a(this), null, null, new StatusScreenViewModel$loadData$1(this, null), 3);
    }
}
