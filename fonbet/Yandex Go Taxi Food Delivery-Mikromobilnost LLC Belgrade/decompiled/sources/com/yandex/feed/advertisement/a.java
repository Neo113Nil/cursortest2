package com.yandex.feed.advertisement;

import defpackage.dw;
import defpackage.evu0;
import defpackage.he1;
import defpackage.je1;
import defpackage.kr;
import defpackage.n6u;
import defpackage.tje;
import defpackage.ue1;

/* loaded from: classes.dex */
public final class a implements dw {
    public final /* synthetic */ int a;
    public final je1 b;

    public /* synthetic */ a(je1 je1Var, int i) {
        this.a = i;
        this.b = je1Var;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        int i = this.a;
        je1 je1Var = this.b;
        switch (i) {
            case 0:
                he1 he1Var = (he1) krVar;
                if (!evu0.J(he1Var.a)) {
                    tje.N(je1Var.d, null, null, new AdvertisementBillingSenderImpl$sendEvent$1(je1Var, he1Var.a, null), 3);
                    break;
                }
                break;
            default:
                ue1 ue1Var = (ue1) krVar;
                if (!evu0.J(ue1Var.a)) {
                    String str = ue1Var.a;
                    Boolean bool = ue1Var.b;
                    tje.N(je1Var.d, null, null, new AdvertisementBillingSenderImpl$sendPixelEvent$1(je1Var, str, bool != null ? bool.booleanValue() : true, ue1Var.c, null), 3);
                    break;
                }
                break;
        }
    }
}
