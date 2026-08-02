package com.yandex.messaging.input.bricks;

import android.app.Activity;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import defpackage.b00;
import defpackage.gvg0;
import defpackage.hi91;
import defpackage.ms11;
import defpackage.p4t;
import defpackage.pu31;
import defpackage.ss11;
import defpackage.u3b;

/* loaded from: classes15.dex */
public final class a extends ss11 {
    public final Activity a;
    public final u3b b;
    public final b00 c;
    public final pu31 w;
    public final ChatInputHeightState x;
    public final ChatRequest y;
    public final p4t z;

    public a(Activity activity, u3b u3bVar, b00 b00Var, pu31 pu31Var, SelectedMessagesPanel selectedMessagesPanel, ChatInputHeightState chatInputHeightState, ChatRequest chatRequest, p4t p4tVar) {
        this.a = activity;
        this.b = u3bVar;
        this.c = b00Var;
        this.w = pu31Var;
        this.x = chatInputHeightState;
        this.y = chatRequest;
        this.z = p4tVar;
        hi91.g(new ChatInputUnblockBrick$1$1(this, null), u3bVar.w);
        u3bVar.x.a(selectedMessagesPanel);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        this.x.a(this.a.getResources().getDimensionPixelSize(gvg0.chat_input_button_height));
        this.w.a(this.b.b, "unblock_user_input_button", null);
    }

    @Override // defpackage.ss11
    public final ms11 q() {
        return this.b;
    }
}
