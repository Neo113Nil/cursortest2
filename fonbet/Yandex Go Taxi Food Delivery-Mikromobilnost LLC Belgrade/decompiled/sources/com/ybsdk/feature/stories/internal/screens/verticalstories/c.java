package com.ybsdk.feature.stories.internal.screens.verticalstories;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.stories.api.VerticalStoriesScreenParams;
import com.ybsdk.feature.stories.internal.domain.VerticalStoriesAnalyticsInteractor$RefererScreenState;
import com.ybsdk.feature.stories.internal.screens.verticalstories.b;
import defpackage.b931;
import defpackage.ds31;
import defpackage.g8e;
import defpackage.imu0;
import defpackage.kcz0;
import defpackage.ng31;
import defpackage.nmu0;
import defpackage.og31;
import defpackage.pz40;
import defpackage.rt1;
import defpackage.s8j0;
import defpackage.smu0;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.vou0;
import defpackage.wou0;
import defpackage.x4c;
import defpackage.z2z;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class c extends uc5 {
    public final VerticalStoriesScreenParams B;
    public final com.ybsdk.feature.stories.internal.domain.a C;
    public final Context D;
    public final tfl0 E;
    public final nmu0 F;
    public final kcz0 G;

    public c(VerticalStoriesScreenParams verticalStoriesScreenParams, a aVar, com.ybsdk.feature.stories.internal.domain.a aVar2, Context context, tfl0 tfl0Var, nmu0 nmu0Var, kcz0 kcz0Var) {
        super(new b931(8), aVar);
        this.B = verticalStoriesScreenParams;
        this.C = aVar2;
        this.D = context;
        this.E = tfl0Var;
        this.F = nmu0Var;
        this.G = kcz0Var;
        f0();
    }

    public final void b0() {
        kcz0 kcz0Var = this.G;
        kcz0Var.getClass();
        kcz0Var.b = VerticalStoriesAnalyticsInteractor$RefererScreenState.CONFIG_CHANGED;
    }

    public final vou0 c0() {
        List list;
        smu0 smu0Var;
        List list2;
        og31 og31Var = (og31) ((b) X()).a.a();
        wou0 wou0Var = (og31Var == null || (list = og31Var.a) == null || (smu0Var = (smu0) kotlin.collections.a.S(((b) X()).b, list)) == null || (list2 = smu0Var.b) == null) ? null : (wou0) kotlin.collections.a.S(((b) X()).e, list2);
        if (wou0Var instanceof vou0) {
            return (vou0) wou0Var;
        }
        return null;
    }

    public final String d0(int i) {
        List list;
        smu0 smu0Var;
        og31 og31Var = (og31) ((b) X()).a.a();
        if (og31Var == null || (list = og31Var.a) == null || (smu0Var = (smu0) kotlin.collections.a.S(i, list)) == null) {
            return null;
        }
        return smu0Var.a;
    }

    public final boolean e0(String str) {
        z2z c = ((imu0) this.F).a.c(str);
        boolean z = c.b || (c.a instanceof v0h);
        if (!z) {
            x4c.g("Can't handle action", null, "action=".concat(str), null, 10);
        }
        return z;
    }

    public final void f0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, b.a((b) value, new t8j0(), 0, 0, 0, 0, null, 62)));
        tje.N(ds31.a(this), null, null, new VerticalStoriesViewModel$loadData$2(this, null), 3);
    }

    public final void g0() {
        String d0 = d0(((b) X()).b);
        if (d0 == null) {
            d0 = "";
        }
        int i = ((b) X()).e;
        rt1 rt1Var = ((AppAnalyticsReporter) this.G.a).U;
        LinkedHashMap w = g8e.w(2, "story_id", d0);
        w.put("page_index", Integer.valueOf(i + 1));
        rt1Var.a.a("promo_stories.story_screen.close.button.click", w);
        this.E.e();
    }

    public final void h0() {
        f0();
    }

    public final void i0() {
        String supportUrl;
        u8j0 u8j0Var = ((b) X()).a;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Object obj = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = obj instanceof FailDataException ? (FailDataException) obj : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        e0(supportUrl);
    }

    public final void j0() {
        kcz0 kcz0Var = this.G;
        int i = ng31.a[((VerticalStoriesAnalyticsInteractor$RefererScreenState) kcz0Var.b).ordinal()];
        kcz0Var.b = i != 1 ? i != 2 ? VerticalStoriesAnalyticsInteractor$RefererScreenState.NAVIGATION_BACK : VerticalStoriesAnalyticsInteractor$RefererScreenState.CONFIG_CHANGED : VerticalStoriesAnalyticsInteractor$RefererScreenState.VIEW_CREATED_FIRST_TIME;
    }

    public final void k0(int i, int i2) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, b.a((b) value, null, 0, 0, 0, 0, new b.a(i, i2), 31)));
    }
}
