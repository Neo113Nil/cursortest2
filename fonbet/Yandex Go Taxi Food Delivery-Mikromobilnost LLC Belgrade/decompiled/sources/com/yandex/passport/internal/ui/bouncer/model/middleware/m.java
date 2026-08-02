package com.yandex.passport.internal.ui.bouncer.model.middleware;

import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class m extends TimerTask {
    public final /* synthetic */ kotlinx.coroutines.flow.n0 a;

    public m(kotlinx.coroutines.flow.n0 n0Var) {
        this.a = n0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.g(Boolean.TRUE);
    }
}
