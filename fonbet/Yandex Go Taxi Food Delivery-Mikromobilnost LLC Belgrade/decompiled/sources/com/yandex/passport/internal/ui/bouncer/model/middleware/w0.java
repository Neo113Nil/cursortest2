package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.tpr;

/* loaded from: classes2.dex */
public final class w0 implements com.yandex.passport.common.mvi.e {
    public final com.yandex.passport.internal.report.reporters.l a;

    public w0(com.yandex.passport.internal.report.reporters.l lVar) {
        this.a = lVar;
    }

    @Override // com.yandex.passport.common.mvi.e
    public final tpr a(kotlinx.coroutines.flow.n0 n0Var) {
        return new com.yandex.passport.common.mvi.c(new com.yandex.passport.internal.impl.d(n0Var, 16), this, 8);
    }
}
