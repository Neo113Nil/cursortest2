package com.yandex.passport.internal.ui.domik.smsauth;

import com.yandex.passport.data.network.mc;
import com.yandex.passport.internal.analytics.DomikScreenSuccessMessages$AuthBySms;
import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.helper.f;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.reporters.p0;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.ui.domik.common.e;
import com.yandex.passport.internal.ui.domik.q;
import com.yandex.passport.internal.usecase.ui.i0;
import com.yandex.passport.legacy.lx.m;

/* loaded from: classes2.dex */
public final class b extends e {
    public final q E;
    public final b0 F;
    public final com.yandex.passport.internal.interaction.b G;

    public b(com.yandex.passport.internal.network.mappers.b bVar, mc mcVar, f fVar, q qVar, b0 b0Var, i0 i0Var, p0 p0Var, LoginProperties loginProperties) {
        super(bVar, mcVar, i0Var);
        this.E = qVar;
        this.F = b0Var;
        com.yandex.passport.internal.interaction.b bVar2 = new com.yandex.passport.internal.interaction.b(fVar, this.A, new AuthBySmsViewModel$authBySmsInteraction$1(2, this, b.class, "onSuccessAuth", "onSuccessAuth(Lcom/yandex/passport/internal/ui/domik/AuthTrack;Lcom/yandex/passport/internal/ui/domik/DomikResult;)V", 0), new a0(18, this));
        Z(bVar2);
        this.G = bVar2;
    }

    @Override // com.yandex.passport.internal.ui.domik.common.e
    public final void a0(BaseTrack baseTrack) {
        this.F.g(DomikScreenSuccessMessages$AuthBySms.phoneIsConfirmed);
        com.yandex.passport.internal.interaction.b bVar = this.G;
        bVar.c.m(Boolean.TRUE);
        bVar.a.a.add(m.d(new com.yandex.passport.internal.interaction.a(0, bVar, (AuthTrack) baseTrack)));
    }
}
