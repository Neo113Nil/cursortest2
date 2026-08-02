package com.yandex.go.splash.v2;

import com.yandex.go.splash.AfterSplashType;
import defpackage.k7x0;
import defpackage.mdh;
import defpackage.oqt0;
import defpackage.pav;
import defpackage.sjh;
import defpackage.tje;
import defpackage.trt0;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class g {
    public final d a;
    public final pav b;
    public final k7x0 c;
    public final tt2 d;
    public final trt0 e;
    public final oqt0 f;

    public g(d dVar, pav pavVar, k7x0 k7x0Var, tt2 tt2Var, trt0 trt0Var, oqt0 oqt0Var) {
        this.a = dVar;
        this.b = pavVar;
        this.c = k7x0Var;
        this.d = tt2Var;
        this.e = trt0Var;
        this.f = oqt0Var;
    }

    public final Object a(Continuation continuation) {
        if (this.f.a() != AfterSplashType.V2) {
            return null;
        }
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SplashScreenV2Interactor$splashScreenV2Config$2(this, null), continuation);
    }
}
