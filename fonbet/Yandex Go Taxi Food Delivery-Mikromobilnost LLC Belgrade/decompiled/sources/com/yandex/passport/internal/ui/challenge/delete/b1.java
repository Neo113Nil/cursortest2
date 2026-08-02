package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes2.dex */
public final class b1 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ b1(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a1((z0) xvf0Var.get());
            case 1:
                return new com.yandex.passport.internal.ui.common.d((com.yandex.passport.internal.ui.common.c) xvf0Var.get());
            case 2:
                return new com.yandex.passport.internal.ui.common.web.f((com.yandex.passport.internal.ui.common.web.j) xvf0Var.get());
            case 3:
                return new com.yandex.passport.internal.ui.sloth.b0((com.yandex.passport.internal.ui.sloth.a0) xvf0Var.get());
            case 4:
                return new com.yandex.passport.internal.ui.sloth.authsdk.g0((com.yandex.passport.internal.ui.sloth.authsdk.f0) xvf0Var.get());
            case 5:
                return new com.yandex.passport.sloth.v((com.yandex.passport.sloth.z0) xvf0Var.get());
            default:
                return new com.yandex.passport.sloth.command.performers.b((com.yandex.passport.sloth.v) xvf0Var.get());
        }
    }
}
