package com.yandex.messaging.internal.view.timeline;

import android.graphics.Canvas;
import com.yandex.messaging.views.AppCompatEmojiTextView;
import defpackage.fxa1;
import defpackage.iv31;
import defpackage.jng0;
import defpackage.olh0;
import defpackage.pa5;
import defpackage.ubz0;
import defpackage.vb5;
import defpackage.yab;
import defpackage.z9z0;

/* loaded from: classes15.dex */
public final class w extends pa5 {
    public static final int V2 = olh0.msg_vh_chat_own_sticker;

    @Override // defpackage.pa5, defpackage.l25, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        this.O = new ubz0(yabVar.Z());
        iv31 iv31Var = this.x1;
        if (iv31Var.b()) {
            ((AppCompatEmojiTextView) iv31Var.a()).setTextColor(fxa1.c(jng0.messagingOutgoingSecondaryColor, iv31Var.d()).data);
        }
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
    }
}
