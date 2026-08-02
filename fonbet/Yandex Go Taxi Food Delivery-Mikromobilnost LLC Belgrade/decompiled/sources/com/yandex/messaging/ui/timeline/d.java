package com.yandex.messaging.ui.timeline;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.input.InputState;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.messaging.views.BadgedFloatingActionButton;
import defpackage.dbb;
import defpackage.hbz0;
import defpackage.hi91;
import defpackage.ike;
import defpackage.jqr;
import defpackage.kux0;
import defpackage.mdb;
import defpackage.sdz0;
import defpackage.tdz0;
import defpackage.vse;

/* loaded from: classes15.dex */
public final class d implements sdz0 {
    public final ChatRequest A;
    public final i B;
    public final ike C;
    public boolean D = true;
    public final BadgedFloatingActionButton E;
    public final BadgedFloatingActionButton F;
    public boolean G;
    public long H;
    public final com.yandex.messaging.internal.view.timeline.common.a a;
    public final tdz0 b;
    public final ChatInputHeightState c;
    public final dbb w;
    public final com.yandex.messaging.input.c x;
    public final mdb y;
    public final com.yandex.messaging.domain.personal.mentions.a z;

    public d(hbz0 hbz0Var, com.yandex.messaging.internal.view.timeline.common.a aVar, tdz0 tdz0Var, ChatInputHeightState chatInputHeightState, dbb dbbVar, com.yandex.messaging.input.c cVar, vse vseVar, mdb mdbVar, com.yandex.messaging.domain.personal.mentions.a aVar2, ChatRequest chatRequest, i iVar) {
        this.a = aVar;
        this.b = tdz0Var;
        this.c = chatInputHeightState;
        this.w = dbbVar;
        this.x = cVar;
        this.y = mdbVar;
        this.z = aVar2;
        this.A = chatRequest;
        this.B = iVar;
        this.C = vseVar.c(false);
        BadgedFloatingActionButton badgedFloatingActionButton = hbz0Var.A;
        badgedFloatingActionButton.hide();
        hi91.g(new TimelineFloatingButtonController$scrollToBottomFab$1$1(this, null), badgedFloatingActionButton);
        this.E = badgedFloatingActionButton;
        BadgedFloatingActionButton badgedFloatingActionButton2 = hbz0Var.B;
        badgedFloatingActionButton2.hide();
        hi91.g(new TimelineFloatingButtonController$mentionsFab$1$1(this, null), badgedFloatingActionButton2);
        this.F = badgedFloatingActionButton2;
        this.H = -1L;
        a();
        tdz0Var.a.b(this);
    }

    public final void a() {
        if (this.D) {
            this.D = false;
            jqr jqrVar = new jqr(this.a.c, new TimelineFloatingButtonController$onCreate$1(this, null), 3);
            ike ikeVar = this.C;
            kotlinx.coroutines.flow.e.H(ikeVar, jqrVar);
            kotlinx.coroutines.flow.e.H(ikeVar, new jqr(this.z.a(this.A), new TimelineFloatingButtonController$onCreate$2(this, null), 3));
            kotlinx.coroutines.flow.e.H(ikeVar, new jqr(this.c.b, new TimelineFloatingButtonController$onCreate$3(this, null), 3));
            kotlinx.coroutines.flow.e.H(ikeVar, new jqr(this.x.f, new TimelineFloatingButtonController$onCreate$4(this, null), 3));
        }
    }

    public final void b() {
        boolean z = this.G && ((InputState) this.x.f.getValue()) != InputState.EMPTY;
        BadgedFloatingActionButton badgedFloatingActionButton = this.E;
        if (z == (badgedFloatingActionButton.getVisibility() == 0)) {
            return;
        }
        BadgedFloatingActionButton badgedFloatingActionButton2 = this.F;
        if (!z || !this.y.f) {
            badgedFloatingActionButton.hide();
            badgedFloatingActionButton2.hide();
            return;
        }
        badgedFloatingActionButton.show();
        if (badgedFloatingActionButton.isInLayout()) {
            badgedFloatingActionButton.post(new kux0(11, this));
        }
        if (this.H > 0) {
            badgedFloatingActionButton2.show();
        }
    }

    @Override // defpackage.sdz0
    public final void c(boolean z) {
        this.G = z;
        b();
    }
}
