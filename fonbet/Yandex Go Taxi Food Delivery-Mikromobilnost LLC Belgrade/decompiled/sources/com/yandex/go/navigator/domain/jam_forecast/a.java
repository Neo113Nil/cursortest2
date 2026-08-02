package com.yandex.go.navigator.domain.jam_forecast;

import com.yandex.go.coroutines.b;
import defpackage.l4u;
import defpackage.mwd;
import defpackage.pwd;
import defpackage.uyd;
import defpackage.vff;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class a {
    public final pwd a;
    public final mwd b;
    public final m0 c;

    public a(pwd pwdVar, mwd mwdVar, l4u l4uVar, vff vffVar, uyd uydVar) {
        this.a = pwdVar;
        this.b = mwdVar;
        this.c = new m0(e.X(new m0(vffVar.c, b.d(uydVar.b, new JamForecastReporter$special$$inlined$start$1(2, null)), new JamForecastReporter$segmentsWithJamInfo$2(3, null)), new JamForecastReporter$segmentsWithJamInfo$3(this, null)), e.t(l4uVar.a), new JamForecastReporter$leftInJamFlow$1(this, null));
    }
}
