package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.sloth.data.SlothParams;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes2.dex */
public final class e0 implements v7p {
    public final /* synthetic */ int a;
    public final d0 b;

    public /* synthetic */ e0(d0 d0Var, int i) {
        this.a = i;
        this.b = d0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        d0 d0Var = this.b;
        switch (i) {
            case 0:
                return d0Var.a;
            default:
                SlothParams slothParams = d0Var.b;
                q5z.i(slothParams);
                return slothParams;
        }
    }
}
