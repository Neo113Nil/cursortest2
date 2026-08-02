package com.yandex.go.flex.main_screen.data.widgets.tracking;

import androidx.lifecycle.Lifecycle;
import defpackage.j551;
import defpackage.lz60;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes.dex */
public final class c implements lz60 {
    public final Lifecycle a;
    public final tse b;
    public final j551 c;
    public final com.yandex.div.core.expression.variables.a d;

    public c(Lifecycle lifecycle, tse tseVar, j551 j551Var, com.yandex.div.core.expression.variables.a aVar) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = j551Var;
        this.d = aVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.b, null, null, new TrackingListCountersVariableLcpListener$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "TrackingListCountersVariableLcpListener";
    }
}
