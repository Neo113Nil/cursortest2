package com.yandex.passport.internal.flags.presentation;

import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final /* synthetic */ class x implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ x(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        com.yandex.passport.internal.ui.challenge.delete.v vVar = com.yandex.passport.internal.ui.challenge.delete.v.a;
        f0 f0Var = f0.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(ExperimentsMenuItem.OnClearOverrides);
                break;
            case 1:
                tlsVar.invoke(ExperimentsMenuItem.OnClearNetworkCache);
                break;
            case 2:
                tlsVar.invoke(ExperimentsMenuItem.OnUpdateNetworkCache);
                break;
            case 3:
                tlsVar.invoke(f0Var);
                break;
            case 4:
                tlsVar.invoke(j0.a);
                break;
            case 5:
                tlsVar.invoke(f0Var);
                break;
            case 6:
                tlsVar.invoke(h0.a);
                break;
            case 7:
                tlsVar.invoke(i0.a);
                break;
            case 8:
                tlsVar.invoke(f0Var);
                break;
            case 9:
                tlsVar.invoke(com.yandex.passport.internal.ui.challenge.delete.y.a);
                break;
            case 10:
                tlsVar.invoke(vVar);
                break;
            default:
                tlsVar.invoke(vVar);
                break;
        }
        return zy11Var;
    }
}
