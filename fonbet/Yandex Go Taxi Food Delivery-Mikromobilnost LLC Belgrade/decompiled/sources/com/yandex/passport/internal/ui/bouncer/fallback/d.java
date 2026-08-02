package com.yandex.passport.internal.ui.bouncer.fallback;

import android.app.Activity;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.report.reporters.m;
import com.yandex.passport.internal.report.reporters.n;
import com.yandex.passport.internal.report.reporters.v0;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.loading.e;
import com.yandex.passport.internal.ui.bouncer.loading.g;
import com.yandex.passport.internal.ui.bouncer.loading.k;
import com.yandex.passport.internal.ui.bouncer.model.middleware.f0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.k0;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.s;
import com.yandex.passport.internal.ui.bouncer.sloth.f;
import com.yandex.passport.internal.ui.bouncer.t;
import com.yandex.passport.internal.usecase.ui.c0;
import com.yandex.passport.sloth.h;
import com.yandex.passport.sloth.l;
import com.yandex.passport.sloth.v;
import com.yandex.passport.sloth.z0;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class d implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;

    public /* synthetic */ d(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new c((BouncerActivity) this.b.get(), (t) this.c.get(), (n) this.d.get());
            case 1:
                return new e((Activity) this.b.get(), (ProgressPropertiesImpl) this.c.get(), (p) this.d.get());
            case 2:
                return new g((Activity) this.b.get(), (ProgressPropertiesImpl) this.c.get(), (p) this.d.get());
            case 3:
                return new k((Activity) this.b.get(), (ProgressPropertiesImpl) this.c.get(), (p) this.d.get());
            case 4:
                return new f0((m) this.b.get(), (c0) this.c.get(), (v0) this.d.get());
            case 5:
                return new k0((p) this.b.get(), (com.yandex.passport.internal.core.accounts.d) this.c.get(), (j) this.d.get());
            case 6:
                return new s((Activity) this.b.get(), (t) this.c.get(), (com.yandex.passport.internal.report.reporters.s) this.d.get());
            case 7:
                return new com.yandex.passport.internal.ui.bouncer.sloth.a((ProgressPropertiesImpl) this.b.get(), (com.yandex.passport.internal.ui.sloth.a) this.c.get(), (p) this.d.get());
            case 8:
                return new f((Activity) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (com.yandex.passport.internal.ui.bouncer.sloth.b) this.d.get());
            case 9:
                return new com.yandex.passport.internal.ui.common.c((Activity) this.b.get(), (ProgressPropertiesImpl) this.d.get(), (p) this.c.get());
            case 10:
                return new com.yandex.passport.internal.ui.common.web.j((Activity) this.c.get(), (ProgressPropertiesImpl) this.d.get(), (p) this.b.get());
            default:
                return new l((z0) this.b.get(), (v) this.c.get(), (h) this.d.get());
        }
    }
}
