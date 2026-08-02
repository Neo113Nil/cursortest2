package com.yandex.go.app.icon;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.app.icon.experiments.AppDynamicIconExperiment;
import defpackage.d8;
import defpackage.eu2;
import defpackage.gtq0;
import defpackage.jbh;
import defpackage.lz60;
import defpackage.q5h;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tje;
import defpackage.tse;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public final class c implements lz60 {
    public final Lifecycle a;
    public final tse b;
    public final q5h c;
    public final eu2 d;
    public final t1b0 e;

    public c(Lifecycle lifecycle, tse tseVar, q5h q5hVar, eu2 eu2Var, rqo rqoVar) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = q5hVar;
        this.d = eu2Var;
        AppDynamicIconExperiment.Companion.getClass();
        this.e = ((jbh) rqoVar).e(AppDynamicIconExperiment.e);
    }

    @Override // defpackage.lz60
    public final void g() {
        AppIconLifecycleListener$onLargestContentfulPaint$$inlined$collectLatestIn$1 appIconLifecycleListener$onLargestContentfulPaint$$inlined$collectLatestIn$1 = new AppIconLifecycleListener$onLargestContentfulPaint$$inlined$collectLatestIn$1(e.t(new b(this.e.a(), this)), null, this.d);
        tse tseVar = this.b;
        tje.N(tseVar, null, null, appIconLifecycleListener$onLargestContentfulPaint$$inlined$collectLatestIn$1, 3);
        tje.N(tseVar, null, null, new AppIconLifecycleListener$onLargestContentfulPaint$3(this, null), 3);
        gtq0.t(tseVar, new d8(3, this));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AppIconLifecycleListener";
    }
}
