package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding;

import defpackage.bvf0;
import defpackage.pp30;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wp30;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b {
    public final r0 a;
    public final tpr b;

    public b(pwy0 pwy0Var, tt2 tt2Var, pp30 pp30Var) {
        r0 c = bvf0.c(wp30.a);
        this.a = c;
        tpr t = e.t(new m0(pwy0Var.a(), c, new MtMosMetroAuthOnboardingUiStateRepository$uiStateFlow$1(3, null)));
        tt2Var.getClass();
        this.b = e.F(t, uyj.a);
    }
}
