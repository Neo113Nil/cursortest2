package com.yandex.messaging.internal.view.timeline;

import com.yandex.messaging.views.AppCompatEmojiTextView;
import defpackage.ase;
import defpackage.fxa1;
import defpackage.iv31;
import defpackage.jng0;
import defpackage.lhs0;
import defpackage.olh0;
import defpackage.ubz0;
import defpackage.vb5;
import defpackage.yab;

/* loaded from: classes15.dex */
public final class v extends lhs0 {
    public static final int H3 = olh0.msg_vh_chat_own_image;

    @Override // defpackage.lhs0
    public final ase K0(boolean z, boolean z2) {
        boolean z3 = this.T0 || this.S0;
        int i = this.v1;
        int i2 = this.p1;
        if (z) {
            return new ase(z3 ? i2 : i, z3 ? i2 : i, i2, i);
        }
        return new ase(z3 ? i2 : i, i2, i2, i);
    }

    @Override // defpackage.lhs0, defpackage.l25, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        this.O = new ubz0(yabVar.Z());
        iv31 iv31Var = this.x1;
        if (iv31Var.b()) {
            ((AppCompatEmojiTextView) iv31Var.a()).setTextColor(fxa1.c(jng0.messagingOutgoingSecondaryColor, iv31Var.d()).data);
        }
    }

    @Override // defpackage.lhs0, com.yandex.messaging.internal.view.timeline.e
    public final boolean b0() {
        return this.k0;
    }
}
