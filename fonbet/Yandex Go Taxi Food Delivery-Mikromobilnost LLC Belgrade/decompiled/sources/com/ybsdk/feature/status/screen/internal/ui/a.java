package com.ybsdk.feature.status.screen.internal.ui;

import androidx.lifecycle.Lifecycle;
import com.yandex.div.state.db.StateEntry;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.BottomNavigationEvents$BottomNavigationClickButtonVersion;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams;
import defpackage.b3z;
import defpackage.ds31;
import defpackage.esl;
import defpackage.g8e;
import defpackage.h791;
import defpackage.hsl;
import defpackage.isl;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.msl;
import defpackage.mv3;
import defpackage.nsl;
import defpackage.pv3;
import defpackage.pzt0;
import defpackage.qis;
import defpackage.rt1;
import defpackage.rv3;
import defpackage.s8j0;
import defpackage.sb6;
import defpackage.t8j0;
import defpackage.tb6;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.w4x0;
import defpackage.wgk;
import defpackage.wsl;
import defpackage.x4x0;
import defpackage.xgk;
import defpackage.xz3;
import defpackage.ymj;
import java.util.LinkedHashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final DivkitCommonScreenParams B;
    public final tfl0 C;
    public final com.ybsdk.feature.status.screen.internal.data.a D;
    public final j3h E;
    public final AppAnalyticsReporter F;
    public final hsl G;
    public final com.ybsdk.feature.banners.impl.domain.interactors.a H;
    public final w4x0 I;
    public final sb6 J;
    public pzt0 K;

    public a(DivkitCommonScreenParams divkitCommonScreenParams, tfl0 tfl0Var, com.ybsdk.feature.status.screen.internal.data.a aVar, j3h j3hVar, AppAnalyticsReporter appAnalyticsReporter, hsl hslVar, com.ybsdk.feature.banners.impl.domain.interactors.a aVar2, w4x0 w4x0Var, sb6 sb6Var, tpr tprVar, isl islVar, wsl wslVar) {
        super(new ymj(7, divkitCommonScreenParams, islVar), wslVar);
        this.B = divkitCommonScreenParams;
        this.C = tfl0Var;
        this.D = aVar;
        this.E = j3hVar;
        this.F = appAnalyticsReporter;
        this.G = hslVar;
        this.H = aVar2;
        this.I = w4x0Var;
        this.J = sb6Var;
        DivkitCommonViewModel$2 divkitCommonViewModel$2 = new DivkitCommonViewModel$2(0, this, a.class, "reloadScreen", "reloadScreen()V", 0);
        b3z b3zVar = ((esl) hslVar).a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        b3zVar.a(new rv3(deeplinkHandleResult$DeeplinkType, divkitCommonViewModel$2, 2));
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new nsl(this, 0), 14));
        tje.N(ds31.a(this), null, null, new DivkitCommonViewModel$4(tprVar, this, null), 3);
    }

    public final void b0(boolean z) {
        a0(new xz3(this, z, 7));
        rt1 rt1Var = this.F.v;
        DivkitCommonScreenParams divkitCommonScreenParams = this.B;
        String path = divkitCommonScreenParams.getPath();
        String screen = divkitCommonScreenParams.getScreen();
        LinkedHashMap w = g8e.w(2, StateEntry.COLUMN_PATH, path);
        if (screen != null) {
            w.put(MetaDataField.SCREEN_FIELD, screen);
        }
        rt1Var.a.a("divkit_common_screen.initiated", w);
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.K = tje.N(ds31.a(this), null, null, new DivkitCommonViewModel$load$2(this, null), 3);
    }

    public final boolean c0() {
        rt1 rt1Var = this.F.v;
        DivkitCommonScreenParams divkitCommonScreenParams = this.B;
        String path = divkitCommonScreenParams.getPath();
        String screen = divkitCommonScreenParams.getScreen();
        LinkedHashMap w = g8e.w(2, StateEntry.COLUMN_PATH, path);
        if (screen != null) {
            w.put(MetaDataField.SCREEN_FIELD, screen);
        }
        rt1Var.a.a("divkit_common_screen.back.click", w);
        this.C.e();
        return true;
    }

    public final void d0(tb6 tb6Var) {
        String str = tb6Var.a;
        DivkitCommonScreenParams divkitCommonScreenParams = this.B;
        String bottomBarItemId = divkitCommonScreenParams.getScreenConfig().getBottomBarItemId();
        if (bottomBarItemId == null) {
            bottomBarItemId = "";
        }
        this.J.a(str, bottomBarItemId, BottomNavigationEvents$BottomNavigationClickButtonVersion.SCREEN_BUTTON);
        if (jl40.l(str, divkitCommonScreenParams.getScreenConfig().getBottomBarItemId())) {
            return;
        }
        ((x4x0) this.I).b(tb6Var.e);
    }

    public final void e0() {
        a0(new nsl(this, 1));
    }

    public final void f0() {
        u8j0 u8j0Var = ((msl) X()).d;
        if (u8j0Var == null || !(this.B.getScreenConfig().getOnlyInitialDataLoad() || (u8j0Var instanceof t8j0) || u8j0Var.b())) {
            b0(true);
        }
    }

    public final void g0() {
        b0(false);
    }

    public final void h0() {
        String supportUrl;
        u8j0 u8j0Var = ((msl) X()).d;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        h791.e(this.E, supportUrl, false, null, 14);
    }

    public final void i0(Lifecycle lifecycle) {
        esl eslVar = (esl) this.G;
        xgk xgkVar = eslVar.b;
        pv3 pv3Var = new pv3(eslVar.a, 1);
        xgkVar.a.add(pv3Var);
        lifecycle.a(new wgk(0, xgkVar, pv3Var));
    }

    public final void j0(qis qisVar) {
        tje.N(ds31.a(this), null, null, new DivkitCommonViewModel$showFullscreen$1(this, qisVar, null), 3);
    }
}
