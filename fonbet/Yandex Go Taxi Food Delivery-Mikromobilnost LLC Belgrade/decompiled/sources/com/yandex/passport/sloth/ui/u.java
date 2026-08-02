package com.yandex.passport.sloth.ui;

import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ u(p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        p pVar = this.b;
        switch (i) {
            case 0:
                pVar.a(SlothUiWish.CANCEL);
                break;
            case 1:
                pVar.a(SlothUiWish.BACK);
                break;
            case 2:
                pVar.a(SlothUiWish.CANCEL);
                break;
            default:
                pVar.a(SlothUiWish.FINISH_LOGIN);
                break;
        }
        return zy11Var;
    }
}
