package com.yandex.passport.internal.flags.presentation;

import defpackage.oz40;
import defpackage.sls;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes15.dex */
public final /* synthetic */ class p0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ p0(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                oz40Var.setValue(Boolean.valueOf(!((Boolean) oz40Var.getValue()).booleanValue()));
                break;
            case 1:
                oz40Var.setValue(Boolean.FALSE);
                break;
            case 2:
                if (((List) oz40Var.getValue()).size() > 1) {
                    oz40Var.setValue(kotlin.collections.a.J((List) oz40Var.getValue(), 1));
                    break;
                }
                break;
            case 3:
                oz40Var.setValue(Boolean.FALSE);
                break;
            default:
                oz40Var.setValue(Boolean.TRUE);
                break;
        }
        return zy11Var;
    }
}
