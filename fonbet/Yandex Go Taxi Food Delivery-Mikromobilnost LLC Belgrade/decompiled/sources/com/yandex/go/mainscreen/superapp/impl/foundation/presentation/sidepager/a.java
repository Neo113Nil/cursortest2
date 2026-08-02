package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager;

import android.content.Context;
import com.yandex.go.mainscreen.superapp.api.sidepager.MainSidePagerSidePage;
import defpackage.a941;
import defpackage.b941;
import defpackage.g3p;
import defpackage.ga1;
import defpackage.ihr;
import defpackage.kyh0;
import defpackage.oep0;
import defpackage.psn;
import defpackage.rfw0;
import defpackage.sas0;
import defpackage.sls;
import defpackage.t841;
import defpackage.tls;
import defpackage.v841;
import defpackage.vc00;
import defpackage.wc00;
import defpackage.xvf0;
import defpackage.xyz;
import defpackage.yc00;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public final class a {
    public final sas0 a;
    public final vc00 b;
    public final wc00 c;
    public final yc00 d;
    public a941 e;
    public b941 f;
    public MainSidePagerSidePage g = MainSidePagerSidePage.NONE;
    public MainSidePager h;
    public ga1 i;
    public sls j;

    public a(sas0 sas0Var, vc00 vc00Var, wc00 wc00Var, yc00 yc00Var) {
        this.a = sas0Var;
        this.b = vc00Var;
        this.c = wc00Var;
        this.d = yc00Var;
    }

    public final void a(MainSidePager mainSidePager) {
        this.h = mainSidePager;
        wc00 wc00Var = this.c;
        mainSidePager.setNestedScrollDelegate(wc00Var);
        CharSequence string = this.f != null ? mainSidePager.getContext().getString(kyh0.main_wallet_pager_pull_hint) : null;
        if (string == null) {
            string = "";
        }
        mainSidePager.setPullHint(string);
        a941 a941Var = this.e;
        if (a941Var != null) {
            if (!mainSidePager.isSidePageView(a941Var.b())) {
                mainSidePager.setSidePage(a941Var.b());
            }
            wc00Var.e = new MainSidePagerIntegration$bind$1$1(a941Var);
        }
        tls tlsVar = this.i;
        if (tlsVar != null) {
            mainSidePager.removeProgressListener(tlsVar);
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ga1 ga1Var = new ga1(7, this, mainSidePager, ref$BooleanRef);
        this.i = ga1Var;
        mainSidePager.addProgressListener(ga1Var);
        a941 a941Var2 = this.e;
        yc00 yc00Var = this.d;
        if (a941Var2 == null || !mainSidePager.isOnSidePage()) {
            yc00Var.a(false);
            return;
        }
        ref$BooleanRef.element = true;
        a941Var2.d();
        yc00Var.a(true);
    }

    public final a941 b(MainSidePager mainSidePager) {
        MainSidePagerSidePage mainSidePagerSidePage = this.g;
        if (mainSidePagerSidePage == MainSidePagerSidePage.NONE) {
            return null;
        }
        b941 b941Var = this.f;
        if (b941Var == null && (b941Var = (b941) this.a.a.get(mainSidePagerSidePage)) == null) {
            return null;
        }
        this.f = b941Var;
        a941 a941Var = this.e;
        if (a941Var != null) {
            return a941Var;
        }
        xyz xyzVar = new xyz(8, this);
        t841 t841Var = b941Var.a;
        Context context = t841Var.a;
        psn psnVar = t841Var.b;
        com.yandex.go.wallet.flex.a aVar = t841Var.c;
        rfw0 rfw0Var = t841Var.d.a;
        a941 a941Var2 = new a941(new v841(context, psnVar, aVar, new ihr((g3p) rfw0Var.a, (oep0) ((xvf0) rfw0Var.b).get(), xyzVar), t841Var.e, t841Var.f, xyzVar));
        this.e = a941Var2;
        mainSidePager.setSidePage(a941Var2.b());
        this.c.e = new MainSidePagerIntegration$ensureSideContent$2(a941Var2);
        return a941Var2;
    }
}
