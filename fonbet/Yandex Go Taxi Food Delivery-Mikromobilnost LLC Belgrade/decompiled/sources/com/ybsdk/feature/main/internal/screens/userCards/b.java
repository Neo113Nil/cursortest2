package com.ybsdk.feature.main.internal.screens.userCards;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.ext.c;
import defpackage.ds31;
import defpackage.evu0;
import defpackage.h791;
import defpackage.n800;
import defpackage.p05;
import defpackage.pzt0;
import defpackage.q400;
import defpackage.r90;
import defpackage.rb00;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.vk21;
import defpackage.vo6;

/* loaded from: classes3.dex */
public final class b extends p05 {
    public final com.ybsdk.feature.main.internal.domain.userCards.a B;
    public final n800 C;
    public final AppAnalyticsReporter D;
    public final com.ybsdk.widgets.common.shimmer.b E;
    public final tfl0 F;
    public pzt0 G;
    public boolean H;
    public boolean I;

    public b(com.ybsdk.feature.main.internal.domain.userCards.a aVar, n800 n800Var, r90 r90Var, AppAnalyticsReporter appAnalyticsReporter, com.ybsdk.widgets.common.shimmer.b bVar, rb00 rb00Var, tfl0 tfl0Var) {
        super(new vo6(bVar, 5), new vk21(rb00Var));
        this.B = aVar;
        this.C = n800Var;
        this.D = appAnalyticsReporter;
        this.E = bVar;
        this.F = tfl0Var;
        this.H = true;
        c.a(r90Var.d, ds31.a(this), new a(this));
    }

    @Override // defpackage.p05
    public final void b0() {
        this.F.e();
    }

    @Override // defpackage.p05
    public final boolean c0(Uri uri) {
        boolean a = ((q400) this.C).a(uri.toString());
        boolean z = false;
        if (evu0.y(uri.toString(), "/personal_wallet", false) && a) {
            z = true;
        }
        this.I = z;
        return a;
    }

    @Override // defpackage.p05
    public final void d0() {
        f0();
    }

    @Override // defpackage.p05
    public final void e0(String str) {
        q400 q400Var = (q400) this.C;
        h791.f(q400Var.a, str, com.ybsdk.feature.webview.api.a.b(q400Var.b, str, null, null, 6));
    }

    public final void f0() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = tje.N(ds31.a(this), null, null, new UserCardsViewModel$loadUserCards$1(this, null), 3);
    }

    public final void g0() {
        f0();
    }

    public final void h0() {
        if (this.I) {
            this.I = false;
            f0();
        }
    }
}
