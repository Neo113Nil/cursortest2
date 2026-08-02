package com.yandex.messaging.internal.view.timeline;

import android.graphics.Canvas;
import android.view.View;
import defpackage.dx10;
import defpackage.fxa1;
import defpackage.jng0;
import defpackage.olh0;
import defpackage.ubz0;
import defpackage.vb5;
import defpackage.x3;
import defpackage.yab;
import defpackage.z9z0;

/* loaded from: classes15.dex */
public final class x extends d {
    public static final int T2 = olh0.msg_vh_chat_own_message_item;

    @Override // com.yandex.messaging.internal.view.timeline.d, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        e0().g.c = fxa1.c(jng0.messagingOutgoingLinkColor, this.a.getContext()).data;
        View view = this.B1;
        if (view != null) {
            this.L0.k(view);
        }
        super.X(yabVar, vb5Var);
        this.O = new ubz0(yabVar.Z());
    }

    @Override // com.yandex.messaging.internal.view.timeline.d, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
        View Jg;
        x3 x3Var;
        super.i0(canvas, z9z0Var, z, z2);
        dx10 K0 = K0();
        x3 x3Var2 = K0.f;
        if (x3Var2 == null || (Jg = x3Var2.Jg()) == null || Jg.getVisibility() != 0 || (x3Var = K0.f) == null) {
            return;
        }
        x3Var.Tg(this.H1, z9z0Var, canvas, z, z2, true);
    }
}
