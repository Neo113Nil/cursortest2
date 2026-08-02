package com.yandex.passport.internal.ui.bouncer;

import androidx.activity.ComponentActivity;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ui.bouncer.model.o2;
import defpackage.eja1;
import defpackage.ffx;
import defpackage.ike;
import defpackage.tje;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class t implements com.yandex.passport.common.mvi.h {
    public final n0 a = ffx.c(0, 0, null, 7);
    public final ike b;

    public t(ComponentActivity componentActivity) {
        this.b = com.yandex.passport.internal.util.p.s(eja1.s(componentActivity));
    }

    public final void a(o2 o2Var) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "new wish " + o2Var, 8);
        }
        if (this.a.g(o2Var)) {
            return;
        }
        tje.N(this.b, null, null, new BouncerWishSource$wish$2(this, o2Var, null), 3);
    }
}
