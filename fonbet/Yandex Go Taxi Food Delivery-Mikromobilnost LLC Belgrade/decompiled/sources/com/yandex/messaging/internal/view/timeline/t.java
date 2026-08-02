package com.yandex.messaging.internal.view.timeline;

import defpackage.ase;
import defpackage.olh0;
import defpackage.tbz0;
import defpackage.vb5;
import defpackage.yab;

/* loaded from: classes15.dex */
public final class t extends f {
    public static final int V3 = olh0.msg_vh_chat_other_video;

    @Override // com.yandex.messaging.internal.view.timeline.f
    public final ase K0(boolean z, boolean z2) {
        boolean z3 = this.T0 || this.S0;
        int i = this.v1;
        int i2 = this.p1;
        if (z2) {
            return new ase(i2, z3 ? i2 : i, i, i);
        }
        return new ase(i2, z3 ? i2 : i, i, i2);
    }

    @Override // com.yandex.messaging.internal.view.timeline.f, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        this.O = new tbz0(yabVar.Z(), yabVar.a());
    }
}
