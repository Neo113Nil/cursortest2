package com.yandex.plus.pay.ui.core.debug.internal.domain.form;

import defpackage.bad0;
import defpackage.ebd0;
import defpackage.jse;
import defpackage.mdd0;
import defpackage.sls;
import defpackage.tje;
import defpackage.xkz;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a {
    public final ebd0 a;
    public final mdd0 b;
    public final xkz c;
    public final bad0 d;
    public final sls e;
    public final jse f;

    public a(ebd0 ebd0Var, mdd0 mdd0Var, xkz xkzVar, bad0 bad0Var, sls slsVar, jse jseVar) {
        this.a = ebd0Var;
        this.b = mdd0Var;
        this.c = xkzVar;
        this.d = bad0Var;
        this.e = slsVar;
        this.f = jseVar;
    }

    public final Object a(Continuation continuation) {
        return tje.k0(this.f, new GetReportFormInfoInteractorImpl$getReportFormInfo$2(this, null), continuation);
    }
}
