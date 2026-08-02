package com.yandex.passport.internal.ui.domik.call;

import com.yandex.passport.data.network.mc;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.ui.domik.q;
import com.yandex.passport.internal.ui.domik.r;
import com.yandex.passport.internal.ui.util.l;
import com.yandex.passport.internal.usecase.ui.v0;

/* loaded from: classes2.dex */
public final class e extends com.yandex.passport.internal.ui.domik.base.b {
    public final r B;
    public final b0 C;
    public final v0 D;
    public final com.yandex.passport.internal.interaction.e E;
    public final com.yandex.passport.internal.interaction.b F;
    public final com.yandex.passport.biometric.ui.verification.a G;

    public e(com.yandex.passport.internal.helper.f fVar, mc mcVar, q qVar, com.yandex.passport.internal.network.mappers.b bVar, r rVar, b0 b0Var, v0 v0Var) {
        this.B = rVar;
        this.C = b0Var;
        this.D = v0Var;
        new l();
        com.yandex.passport.internal.interaction.e eVar = new com.yandex.passport.internal.interaction.e(fVar, this.A, new com.yandex.passport.common.ui.compose.a(this, qVar));
        Z(eVar);
        this.E = eVar;
        this.G = new com.yandex.passport.biometric.ui.verification.a(7, this);
        com.yandex.passport.internal.interaction.b bVar2 = new com.yandex.passport.internal.interaction.b(bVar, mcVar, this.A, new CallConfirmViewModel$1(1, this, e.class, "processSuccessSms", "processSuccessSms(Lcom/yandex/passport/internal/ui/domik/RegTrack;)V", 0));
        Z(bVar2);
        this.F = bVar2;
    }
}
