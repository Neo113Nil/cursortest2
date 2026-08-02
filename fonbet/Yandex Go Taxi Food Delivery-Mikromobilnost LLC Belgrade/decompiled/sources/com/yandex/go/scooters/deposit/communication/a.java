package com.yandex.go.scooters.deposit.communication;

import android.content.Context;
import com.yandex.go.scooters.deposit.communication.ui.ScootersDepositCommunicationModalView;
import defpackage.m230;
import defpackage.sdn0;
import defpackage.tdn0;
import defpackage.tig0;
import defpackage.u45;
import defpackage.w030;
import defpackage.wdn0;
import defpackage.xvf0;
import defpackage.ydn0;
import defpackage.yxm0;
import defpackage.zdn0;

/* loaded from: classes13.dex */
public final class a extends m230 {
    public final w030 E;
    public final wdn0 F;
    public final zdn0 G;
    public final boolean H;

    public a(w030 w030Var, wdn0 wdn0Var, zdn0 zdn0Var) {
        super(null);
        this.E = w030Var;
        this.F = wdn0Var;
        this.G = zdn0Var;
        this.H = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.H;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        ydn0 ydn0Var = new ydn0((tdn0) this.G.a.a.get(), new ScootersDepositCommunicationRouterImpl$provideModalView$1(0, this, a.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0));
        tig0 tig0Var = this.F.a;
        return new ScootersDepositCommunicationModalView((Context) ((xvf0) tig0Var.a).get(), (sdn0) ((yxm0) tig0Var.b).get(), ydn0Var);
    }
}
