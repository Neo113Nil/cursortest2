package com.yandex.go.rida.bids.router;

import defpackage.cms;
import defpackage.h55;
import defpackage.sls;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tls;

/* loaded from: classes13.dex */
public final class c implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;
    public final /* synthetic */ cms c;
    public final /* synthetic */ cms w;

    public /* synthetic */ c(h55 h55Var, cms cmsVar, cms cmsVar2, int i) {
        this.a = i;
        this.b = h55Var;
        this.c = cmsVar;
        this.w = cmsVar2;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        cms cmsVar = this.w;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                tje.N(((e) h55Var).o(), null, null, new BidsModalRouter$InnerNavigator$showPopupDialog$1$onExitCalledInside$1((tls) cmsVar, null), 3);
                break;
            default:
                tje.N(((g) h55Var).o(), null, null, new RidaBidsRootRouterImpl$showDialog$1$onExitCalledInside$1((sls) cmsVar, null), 3);
                break;
        }
    }

    public final void n1() {
        int i = this.a;
        cms cmsVar = this.c;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                tje.N(((e) h55Var).o(), null, null, new BidsModalRouter$InnerNavigator$showPopupDialog$1$onAccept$1((tls) cmsVar, null), 3);
                break;
            default:
                tje.N(((g) h55Var).o(), null, null, new RidaBidsRootRouterImpl$showDialog$1$onAccept$1((sls) cmsVar, null), 3);
                break;
        }
    }

    public final void onCancel() {
        int i = this.a;
        cms cmsVar = this.w;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                tje.N(((e) h55Var).o(), null, null, new BidsModalRouter$InnerNavigator$showPopupDialog$1$onCancel$1((tls) cmsVar, null), 3);
                break;
            default:
                tje.N(((g) h55Var).o(), null, null, new RidaBidsRootRouterImpl$showDialog$1$onCancel$1((sls) cmsVar, null), 3);
                break;
        }
    }
}
