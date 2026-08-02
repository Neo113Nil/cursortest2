package com.yandex.passport.internal.ui.bouncer;

import androidx.activity.ComponentActivity;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes2.dex */
public final class m implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ m(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new l((BouncerActivity) xvf0Var.get());
            default:
                return new t((ComponentActivity) xvf0Var.get());
        }
    }
}
