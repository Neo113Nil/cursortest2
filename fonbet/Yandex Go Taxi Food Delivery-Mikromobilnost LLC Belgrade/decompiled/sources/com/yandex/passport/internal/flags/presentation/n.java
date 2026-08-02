package com.yandex.passport.internal.flags.presentation;

import com.yandex.passport.api.b3;
import com.yandex.passport.common.core.Environment;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final /* synthetic */ class n implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ n(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke((String) obj);
                break;
            case 1:
                tlsVar.invoke(new m0((Environment) obj));
                break;
            case 2:
                tlsVar.invoke(new k0((v) obj));
                break;
            case 3:
                tlsVar.invoke(new com.yandex.passport.internal.ui.bouncer.chooser.b0((com.yandex.passport.internal.ui.bouncer.chooser.z) obj));
                break;
            case 4:
                tlsVar.invoke((String) obj);
                break;
            default:
                tlsVar.invoke((b3) obj);
                break;
        }
        return zy11Var;
    }
}
