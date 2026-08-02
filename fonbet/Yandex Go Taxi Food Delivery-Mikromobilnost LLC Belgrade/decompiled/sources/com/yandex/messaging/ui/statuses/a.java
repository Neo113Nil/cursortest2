package com.yandex.messaging.ui.statuses;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.statuses.f;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import defpackage.i2b;
import defpackage.jqr;
import defpackage.ms11;
import defpackage.pzt0;
import defpackage.ss11;
import defpackage.tje;
import defpackage.ut21;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a extends ss11 {
    public final ChatRequest a;
    public final i2b b;
    public final f c;
    public final ChatInputHeightState w;
    public final ut21 x;
    public pzt0 y;

    public a(ChatRequest chatRequest, i2b i2bVar, f fVar, ChatInputHeightState chatInputHeightState, ut21 ut21Var) {
        this.a = chatRequest;
        this.b = i2bVar;
        this.c = fVar;
        this.w = chatInputHeightState;
        this.x = ut21Var;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        this.y = e.H(getBrickScope(), new jqr(this.c.a(this.a), new ChatDndWarningBrick$onBrickAttach$1(this, null), 3));
        e.H(getBrickScope(), new jqr(this.w.c, new ChatDndWarningBrick$onBrickAttach$2(this, null), 3));
    }

    @Override // defpackage.ss11
    public final ms11 q() {
        return this.b;
    }

    public final void r() {
        tje.N(getBrickScope(), null, null, new ChatDndWarningBrick$close$1(this, null), 3);
    }
}
