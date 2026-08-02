package com.yandex.passport.internal.flags.presentation;

import com.yandex.passport.common.core.Environment;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final /* synthetic */ class q implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ oz40 c;

    public /* synthetic */ q(tls tlsVar, oz40 oz40Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = oz40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(oz40Var.getValue());
                break;
            default:
                tlsVar.invoke((Environment) oz40Var.getValue());
                break;
        }
        return zy11Var;
    }
}
