package com.yandex.messaging.internal.view.timeline;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import defpackage.ewh0;
import defpackage.g8a1;
import defpackage.jwf;
import defpackage.olh0;
import defpackage.oyh0;
import defpackage.vb5;
import defpackage.vbz0;
import defpackage.yab;

/* loaded from: classes15.dex */
public final class b0 extends e {
    public static final int C0 = olh0.msg_vh_chat_removed_message_item;
    public final TextView B0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b0(jwf jwfVar) {
        super(false, r0, jwfVar);
        View g = g8a1.g((ViewGroup) jwfVar.k, olh0.msg_vh_chat_removed_message_item);
        this.B0 = (TextView) g;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        String quantityString;
        super.X(yabVar, vb5Var);
        RemovedMessageData removedMessageData = (RemovedMessageData) yabVar.R();
        int i = removedMessageData.removedGroupSize;
        View view = this.a;
        if (i == 1) {
            quantityString = view.getResources().getString(oyh0.messenger_removed_message_text);
        } else {
            Resources resources = view.getResources();
            int i2 = ewh0.messaging_removed_messages_group_plural;
            int i3 = removedMessageData.removedGroupSize;
            quantityString = resources.getQuantityString(i2, i3, Integer.valueOf(i3));
        }
        this.O = new vbz0(yabVar.Z());
        this.B0.setText(quantityString);
    }
}
