package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.ui.bouncer.model.f2;
import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ q(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        t tVar = this.b;
        switch (i) {
            case 0:
                tVar.a(f2.b);
                break;
            case 1:
                tVar.a(f2.a);
                break;
            case 2:
                tVar.a(f2.c);
                break;
            default:
                tVar.a(f2.b);
                break;
        }
        return zy11Var;
    }
}
