package com.yandex.passport.internal.ui.domik.common;

import com.yandex.passport.data.network.mc;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.ui.util.l;
import com.yandex.passport.internal.usecase.ui.i0;

/* loaded from: classes2.dex */
public abstract class e extends com.yandex.passport.internal.ui.domik.base.b {
    public final i0 B;
    public final l C = new l();
    public final com.yandex.passport.internal.interaction.b D;

    public e(com.yandex.passport.internal.network.mappers.b bVar, mc mcVar, i0 i0Var) {
        this.B = i0Var;
        com.yandex.passport.internal.interaction.b bVar2 = new com.yandex.passport.internal.interaction.b(bVar, mcVar, this.A, new BaseSmsViewModel$verifySmsInteraction$1(1, this, e.class, "onPhoneConfirmed", "onPhoneConfirmed(Lcom/yandex/passport/internal/ui/domik/BaseTrack;)V", 0));
        Z(bVar2);
        this.D = bVar2;
    }

    public abstract void a0(BaseTrack baseTrack);
}
