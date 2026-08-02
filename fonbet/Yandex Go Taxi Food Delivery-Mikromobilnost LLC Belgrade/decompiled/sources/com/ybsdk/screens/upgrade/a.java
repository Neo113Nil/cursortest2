package com.ybsdk.screens.upgrade;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.b;
import defpackage.ike;
import defpackage.k03;
import defpackage.kbo;
import defpackage.nbp0;
import defpackage.nvd;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class a {
    public final tfl0 a;
    public final AppAnalyticsReporter b;
    public final k03 c;
    public final nbp0 d;
    public final nvd e;
    public final b f;
    public final yvf0 g;
    public final kbo h;

    public a(tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, k03 k03Var, nbp0 nbp0Var, nvd nvdVar, b bVar, yvf0 yvf0Var, kbo kboVar) {
        this.a = tfl0Var;
        this.b = appAnalyticsReporter;
        this.c = k03Var;
        this.d = nbp0Var;
        this.e = nvdVar;
        this.f = bVar;
        this.g = yvf0Var;
        this.h = kboVar;
    }

    public static void a(k03 k03Var, ike ikeVar, String str) {
        tje.N(ikeVar, null, null, new EsiaDeeplinkDelegate$addApplicationIdFromUri$1(k03Var, str, null), 3);
    }
}
