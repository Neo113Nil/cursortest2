package com.yandex.passport.sloth.ui;

import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ t(z1 z1Var, int i) {
        this.a = i;
        this.b = z1Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        z1 z1Var = this.b;
        switch (i) {
            case 0:
                z1Var.W(new s1((String) obj));
                break;
            case 1:
                z1Var.W(new x1((z0) obj));
                break;
            case 2:
                z1Var.W(new u1((com.yandex.passport.sloth.ui.webview.f) obj));
                break;
            default:
                z1Var.W(new t1((String) obj));
                break;
        }
        return zy11Var;
    }
}
