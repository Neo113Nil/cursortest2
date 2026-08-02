package com.yandex.passport.common.coroutine;

import android.content.ClipboardManager;
import com.yandex.passport.data.network.core.p;
import com.yandex.passport.data.network.k;
import com.yandex.passport.internal.core.accounts.t;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.methods.performer.m;
import com.yandex.passport.internal.report.reporters.a0;
import com.yandex.passport.internal.report.reporters.b0;
import com.yandex.passport.internal.report.reporters.i;
import com.yandex.passport.internal.report.reporters.w;
import com.yandex.passport.internal.ui.sloth.menu.o;
import com.yandex.passport.internal.usecase.r0;
import defpackage.b64;
import defpackage.tpg;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes8.dex */
public final class g implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ g(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new f((b) xvf0Var.get());
            case 1:
                return new k((i) xvf0Var.get());
            case 2:
                return new p((com.yandex.passport.internal.network.d) xvf0Var.get());
            case 3:
                return new com.yandex.passport.internal.clipboard.a((ClipboardManager) xvf0Var.get());
            case 4:
                return new com.yandex.passport.internal.config.template.g((tpg) xvf0Var.get());
            case 5:
                return new t((com.yandex.passport.internal.report.reporters.a) xvf0Var.get());
            case 6:
                return (f) xvf0Var.get();
            case 7:
                return (com.yandex.passport.internal.storage.datastore.a) xvf0Var.get();
            case 8:
                return new com.yandex.passport.internal.features.a((j) xvf0Var.get());
            case 9:
                return new k((b0) xvf0Var.get());
            case 10:
                return new m((com.yandex.passport.internal.usecase.vpn.b) xvf0Var.get());
            case 11:
                return new com.yandex.passport.internal.network.c((com.yandex.passport.internal.report.reporters.k) xvf0Var.get());
            case 12:
                return new com.yandex.passport.internal.provider.communication.f((com.yandex.passport.internal.provider.communication.e) xvf0Var.get());
            case 13:
                return new a0((com.yandex.passport.internal.report.h) xvf0Var.get());
            case 14:
                b64.D(xvf0Var.get());
                return new com.yandex.passport.internal.sloth.performers.c();
            case 15:
                return new com.yandex.passport.internal.sloth.performers.usermenu.a((com.yandex.passport.internal.sloth.performers.usermenu.h) xvf0Var.get());
            case 16:
                return new com.yandex.passport.internal.sloth.performers.usermenu.d((com.yandex.passport.internal.sloth.performers.usermenu.h) xvf0Var.get());
            case 17:
                return new com.yandex.passport.internal.storage.a((tpg) xvf0Var.get());
            case 18:
                return new com.yandex.passport.internal.storage.datastore.a((tpg) xvf0Var.get());
            case 19:
                return new com.yandex.passport.internal.ui.sloth.i((com.yandex.passport.internal.sloth.performers.j) xvf0Var.get());
            case 20:
                return new com.yandex.passport.internal.ui.sloth.menu.a((o) xvf0Var.get());
            case 21:
                return new com.yandex.passport.internal.ui.sloth.webcard.b((com.yandex.passport.internal.sloth.performers.webcard.k) xvf0Var.get());
            default:
                return new r0((w) xvf0Var.get());
        }
    }
}
