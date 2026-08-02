package com.yandex.messaging.internal.suspend.extensions;

import defpackage.hjt;
import defpackage.ie60;
import defpackage.jse;
import defpackage.tje;
import defpackage.tls;
import defpackage.x08;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jse b;
    public final /* synthetic */ x08 c;

    public /* synthetic */ a(jse jseVar, x08 x08Var, int i) {
        this.a = i;
        this.b = jseVar;
        this.c = x08Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        x08 x08Var = this.c;
        jse jseVar = this.b;
        hjt hjtVar = hjt.a;
        switch (i) {
            case 0:
                tje.N(hjtVar, jseVar.plus(ie60.a), null, new HistoryRequestExecutorKt$execute$2$1$1$1(x08Var, null), 2);
                break;
            default:
                tje.N(hjtVar, jseVar.plus(ie60.a), null, new HistoryRequestExecutorKt$executeReduced$2$1$1$1(x08Var, null), 2);
                break;
        }
        return zy11Var;
    }
}
