package com.yandex.passport.internal.flags.presentation;

import defpackage.oz40;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final /* synthetic */ class p implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ p(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                oz40Var.setValue((String) obj);
                break;
            case 1:
                oz40Var.setValue((String) obj);
                break;
            case 2:
                oz40Var.setValue((String) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                oz40Var.setValue(bool);
                break;
        }
        return zy11Var;
    }
}
