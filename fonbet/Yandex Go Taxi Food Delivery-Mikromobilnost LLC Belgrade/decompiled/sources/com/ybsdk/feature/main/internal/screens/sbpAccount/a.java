package com.ybsdk.feature.main.internal.screens.sbpAccount;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.main.api.SbpAccountInfoScreenParams;
import com.ybsdk.feature.main.internal.data.network.c;
import defpackage.b3z;
import defpackage.bem0;
import defpackage.dem0;
import defpackage.ds31;
import defpackage.eem0;
import defpackage.fem0;
import defpackage.lrp0;
import defpackage.mv3;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.rem0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.v4m0;
import defpackage.x4c;
import java.util.Collections;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final SbpAccountInfoScreenParams B;
    public final c C;
    public final b3z D;
    public final tfl0 E;
    public final AppAnalyticsReporter F;
    public pzt0 G;
    public pzt0 H;

    public a(SbpAccountInfoScreenParams sbpAccountInfoScreenParams, c cVar, b3z b3zVar, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter) {
        super(new v4m0(4), new rem0());
        this.B = sbpAccountInfoScreenParams;
        this.C = cVar;
        this.D = b3zVar;
        this.E = tfl0Var;
        this.F = appAnalyticsReporter;
        d0();
        b3zVar.a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, this, 26));
    }

    public final void b0() {
        d0();
    }

    public final void c0() {
        r0 r0Var;
        Object value;
        fem0 fem0Var;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            fem0Var = (fem0) value;
            if (fem0Var instanceof eem0) {
                fem0Var = new dem0(((eem0) fem0Var).a);
            } else {
                x4c.g("Incorrect screen order", null, "in unbindAccount()", Collections.singletonList(lrp0.C), 2);
            }
        } while (!r0Var.k(value, fem0Var));
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = tje.N(ds31.a(this), null, null, new SbpAccountInfoViewModel$unbindAccount$2(this, null), 3);
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, bem0.a));
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = tje.N(ds31.a(this), null, null, new SbpAccountInfoViewModel$loadSbpAccountInfoScreen$2(this, null), 3);
    }

    public final void e0() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E.e();
    }

    public final void f0() {
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E.e();
    }

    public final boolean g0(Uri uri) {
        return this.D.c(uri.toString()).b;
    }
}
