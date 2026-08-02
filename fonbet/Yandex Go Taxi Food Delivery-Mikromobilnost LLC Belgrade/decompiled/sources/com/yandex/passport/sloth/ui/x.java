package com.yandex.passport.sloth.ui;

import com.yandex.passport.sloth.ui.webview.WebViewController;
import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ x(d0 d0Var, int i) {
        this.a = i;
        this.b = d0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d0 d0Var = this.b;
        switch (i) {
            case 0:
                d0Var.I.a(SlothUiWish.CANCEL);
                return zy11Var;
            case 1:
                d0Var.I.a(SlothUiWish.CANCEL);
                return zy11Var;
            case 2:
                return new androidx.lifecycle.t(d0Var, true);
            default:
                return new WebViewController(d0Var.F, d0Var.o(), d0Var.M, d0Var.O, d0Var.P, d0Var.Q);
        }
    }
}
