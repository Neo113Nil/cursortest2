package com.yandex.passport.internal.report.reporters;

import android.app.Activity;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class q0 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;

    public /* synthetic */ q0(yvf0 yvf0Var, yvf0 yvf0Var2, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new p0((com.yandex.passport.internal.report.j) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 1:
                return new com.yandex.passport.internal.sloth.l((Activity) this.b.get(), (com.yandex.passport.common.coroutine.e) this.c.get());
            case 2:
                return new com.yandex.passport.internal.ui.bouncer.error.g((Activity) this.b.get(), (ProgressPropertiesImpl) this.c.get());
            case 3:
                return new com.yandex.passport.internal.ui.bouncer.error.p((com.yandex.passport.internal.ui.bouncer.error.h) this.b.get(), (com.yandex.passport.internal.ui.bouncer.t) this.c.get());
            case 4:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.w((com.yandex.passport.internal.core.accounts.d) this.b.get(), (com.yandex.passport.internal.usecase.ui.r) this.c.get());
            case 5:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.y((com.yandex.passport.internal.upgrader.k) this.b.get(), (f) this.c.get());
            case 6:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.i0((com.yandex.passport.internal.ui.bouncer.model.b1) this.b.get(), (n) this.c.get());
            case 7:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.t0((com.yandex.passport.internal.core.accounts.d) this.b.get(), (com.yandex.passport.internal.core.accounts.t) this.c.get());
            case 8:
                return new com.yandex.passport.internal.ui.bouncer.model.sloth.b((com.yandex.passport.internal.sloth.h) this.b.get(), (com.yandex.passport.internal.ui.bouncer.model.sloth.a) this.c.get());
            case 9:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.a((Activity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.t) this.c.get());
            case 10:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.e0((Activity) this.b.get(), (com.yandex.passport.common.ui.lang.b) this.c.get());
            case 11:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.items.p((Activity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.t) this.c.get());
            case 12:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.items.t((Activity) this.b.get(), (com.yandex.passport.internal.ui.bouncer.t) this.c.get());
            case 13:
                return new com.yandex.passport.internal.usecase.ui.e((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.flags.j) this.c.get());
            case 14:
                return new com.yandex.passport.internal.usecase.ui.z((com.yandex.passport.common.coroutine.a) this.b.get(), (DatabaseHelper) this.c.get());
            case 15:
                return new com.yandex.passport.sloth.command.performers.o((com.yandex.passport.sloth.v) this.b.get(), (com.yandex.passport.sloth.z0) this.c.get());
            default:
                return new com.yandex.passport.sloth.command.performers.r((com.yandex.passport.sloth.v) this.c.get(), (com.yandex.passport.sloth.z0) this.b.get());
        }
    }
}
