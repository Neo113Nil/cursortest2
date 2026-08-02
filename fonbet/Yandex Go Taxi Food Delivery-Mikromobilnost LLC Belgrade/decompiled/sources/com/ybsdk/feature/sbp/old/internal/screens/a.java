package com.ybsdk.feature.sbp.old.internal.screens;

import android.net.Uri;
import com.ybsdk.widgets.common.shimmer.b;
import defpackage.ds31;
import defpackage.h791;
import defpackage.i5z0;
import defpackage.j3h;
import defpackage.np41;
import defpackage.p05;
import defpackage.pzt0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.v0h;
import defpackage.vfc0;
import defpackage.vo6;

/* loaded from: classes3.dex */
public final class a extends p05 {
    public final com.ybsdk.feature.sbp.old.internal.data.a B;
    public final j3h C;
    public final b D;
    public final vfc0 E;
    public final tfl0 F;
    public pzt0 G;

    public a(com.ybsdk.feature.sbp.old.internal.data.a aVar, j3h j3hVar, b bVar, vfc0 vfc0Var, tfl0 tfl0Var) {
        super(new vo6(bVar, 3));
        this.B = aVar;
        this.C = j3hVar;
        this.D = bVar;
        this.E = vfc0Var;
        this.F = tfl0Var;
    }

    @Override // defpackage.p05
    public final void b0() {
        this.F.e();
    }

    @Override // defpackage.p05
    public final boolean c0(Uri uri) {
        boolean z = h791.d(this.C, uri, 14) instanceof v0h;
        if (z) {
            i5z0.a.a("SbpOldConsentScreen deeplink resolved", new Object[0]);
        }
        return z;
    }

    @Override // defpackage.p05
    public final void d0() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = tje.N(ds31.a(this), null, null, new SbpOldViewModel$loadData$1(this, null), 3);
    }

    @Override // defpackage.p05
    public final void e0(String str) {
        h791.f(this.C, str, com.ybsdk.feature.webview.api.a.b((np41) this.E.b, str, null, null, 6));
    }

    public final void f0() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = tje.N(ds31.a(this), null, null, new SbpOldViewModel$loadData$1(this, null), 3);
    }
}
