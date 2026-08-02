package com.yandex.messaging.internal.view.timeline;

import defpackage.pbz0;
import defpackage.tje;

/* loaded from: classes15.dex */
public final /* synthetic */ class g {
    public final /* synthetic */ i a;

    public /* synthetic */ g(i iVar) {
        this.a = iVar;
    }

    public final void a(int i, int i2) {
        pbz0 pbz0Var = this.a.d0;
        if (pbz0Var == null || i == i2) {
            return;
        }
        pbz0Var.a(null);
        if (i2 == -1) {
            return;
        }
        pbz0Var.a(tje.N(pbz0Var.c, null, null, new TimelineInlinePlaybackController$onCenterPositionChanged$1(pbz0Var, null), 3));
    }
}
