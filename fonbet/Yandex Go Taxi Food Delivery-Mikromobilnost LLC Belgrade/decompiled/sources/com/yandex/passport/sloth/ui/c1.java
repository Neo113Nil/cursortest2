package com.yandex.passport.sloth.ui;

import com.yandex.passport.common.logger.LogLevel;

/* loaded from: classes2.dex */
public final class c1 {
    public b1 a;

    public final void a(com.yandex.passport.sloth.v0 v0Var) {
        b1 b1Var = this.a;
        if (b1Var != null) {
            ((com.yandex.passport.sloth.b1) b1Var).b.B.a(v0Var);
            return;
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "interactor is not ready", 8);
        }
    }
}
