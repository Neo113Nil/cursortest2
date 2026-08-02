package com.yandex.go.chargers.order.active;

import defpackage.fua;
import defpackage.m950;
import defpackage.sva;
import defpackage.sy60;
import defpackage.tje;
import defpackage.vk9;

/* loaded from: classes12.dex */
public final class r implements fua {
    public final /* synthetic */ vk9 a;

    public r(vk9 vk9Var) {
        this.a = vk9Var;
    }

    @Override // defpackage.fua
    public final void U() {
        vk9 vk9Var = this.a;
        vk9Var.A((m950) vk9Var.K.get(), new sva(null), sy60.Q2);
    }

    @Override // defpackage.sy60
    public final void a() {
        vk9 vk9Var = this.a;
        tje.N(vk9Var.o(), null, null, new ChargersActiveOrderRouter$InnerNavigator$showSubscription$1$onExitCalledInside$1(vk9Var, null), 3);
    }
}
