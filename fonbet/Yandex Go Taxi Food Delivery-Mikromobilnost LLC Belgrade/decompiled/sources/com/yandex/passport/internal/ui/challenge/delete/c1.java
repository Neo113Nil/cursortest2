package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class c1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.passport.sloth.c1 b;

    public /* synthetic */ c1(com.yandex.passport.sloth.c1 c1Var, int i) {
        this.a = i;
        this.b = c1Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        com.yandex.passport.sloth.c1 c1Var = this.b;
        switch (i) {
            case 0:
                c1Var.close();
                break;
            case 1:
                c1Var.close();
                break;
            default:
                c1Var.close();
                break;
        }
        return zy11Var;
    }
}
