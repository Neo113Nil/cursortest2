package com.yandex.passport.internal.ui.common.web;

import android.app.Activity;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.reporters.p0;
import com.yandex.passport.internal.ui.domik.q;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class h implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;

    public /* synthetic */ h(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = yvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new g((j) this.b.get(), (Activity) this.c.get(), (f) this.d.get(), (c0) this.e.get(), (d) this.f.get());
            default:
                return new q((com.yandex.passport.internal.ui.domik.e) this.b.get(), (com.yandex.passport.internal.flags.j) this.c.get(), (LoginProperties) this.d.get(), (b0) this.e.get(), (p0) this.f.get());
        }
    }
}
