package com.yandex.passport.internal.ui.bouncer.error;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.internal.ui.bouncer.model.middleware.e1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.r;
import com.yandex.passport.internal.ui.bouncer.model.middleware.r0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.t;
import com.yandex.passport.internal.ui.bouncer.model.middleware.w0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.z0;
import com.yandex.passport.internal.ui.bouncer.model.p2;
import com.yandex.passport.internal.ui.bouncer.roundabout.d0;
import com.yandex.passport.internal.ui.bouncer.roundabout.q;
import com.yandex.passport.internal.ui.sloth.f0;
import com.yandex.passport.internal.ui.sloth.menu.u;
import com.yandex.passport.internal.usecase.j1;
import com.yandex.passport.internal.usecase.ui.x;
import com.yandex.passport.sloth.v;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class e implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;

    public /* synthetic */ e(yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new d((Activity) this.b.get());
            case 1:
                return new p2((com.yandex.passport.internal.report.reporters.m) this.b.get());
            case 2:
                return new com.yandex.passport.internal.ui.bouncer.model.middleware.j((com.yandex.passport.internal.ui.challenge.n) this.b.get());
            case 3:
                return new r((x) this.b.get());
            case 4:
                return new t((com.yandex.passport.internal.usecase.ui.r) this.b.get());
            case 5:
                return new r0((com.yandex.passport.internal.account.a) this.b.get());
            case 6:
                return new w0((com.yandex.passport.internal.report.reporters.l) this.b.get());
            case 7:
                return new z0((j1) this.b.get());
            case 8:
                return new e1((Context) this.b.get());
            case 9:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.b((Activity) this.b.get());
            case 10:
                return new com.yandex.passport.internal.ui.bouncer.roundabout.m((Activity) this.b.get());
            case 11:
                return new q((Activity) this.b.get());
            case 12:
                return new d0((Activity) this.b.get());
            case 13:
                return new com.yandex.passport.internal.ui.bouncer.sloth.i((com.yandex.passport.internal.ui.bouncer.t) this.b.get());
            case 14:
                return new com.yandex.passport.internal.ui.challenge.p((Activity) this.b.get());
            case 15:
                return new com.yandex.passport.internal.ui.common.web.d((com.yandex.passport.internal.ui.common.web.b) this.b.get());
            case 16:
                return new com.yandex.passport.internal.ui.domik.b((com.yandex.passport.internal.ui.domik.e) this.b.get());
            case 17:
                return new com.yandex.passport.internal.ui.domik.r((com.yandex.passport.internal.ui.domik.e) this.b.get());
            case 18:
                return new com.yandex.passport.internal.ui.sloth.f((com.yandex.passport.sloth.dependencies.g) this.b.get());
            case 19:
                return new com.yandex.passport.internal.ui.sloth.g((com.yandex.passport.internal.util.e) this.b.get());
            case 20:
                return new com.yandex.passport.internal.ui.sloth.h((Context) this.b.get());
            case 21:
                return new com.yandex.passport.internal.ui.sloth.k((com.yandex.passport.internal.ui.g) this.b.get());
            case 22:
                return new f0((Activity) this.b.get());
            case 23:
                return new u((Activity) this.b.get());
            case 24:
                return new com.yandex.passport.sloth.command.performers.a((v) this.b.get());
            case 25:
                return new com.yandex.passport.sloth.command.performers.c((v) this.b.get());
            case 26:
                return new com.yandex.passport.sloth.command.performers.e((v) this.b.get());
            case 27:
                return new com.yandex.passport.sloth.command.performers.f((v) this.b.get());
            case 28:
                return new com.yandex.passport.sloth.command.performers.g((v) this.b.get());
            default:
                return new com.yandex.passport.sloth.command.performers.h((v) this.b.get());
        }
    }
}
