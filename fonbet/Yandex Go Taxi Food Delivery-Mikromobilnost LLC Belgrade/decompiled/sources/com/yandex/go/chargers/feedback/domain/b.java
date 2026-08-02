package com.yandex.go.chargers.feedback.domain;

import com.yandex.go.chargers.feedback.data.d;
import defpackage.rxf;
import defpackage.tje;
import defpackage.tse;
import defpackage.yvf0;
import java.util.List;

/* loaded from: classes12.dex */
public final class b {
    public final tse a;
    public final d b;
    public final yvf0 c;

    public b(tse tseVar, d dVar, rxf rxfVar) {
        this.a = tseVar;
        this.b = dVar;
        this.c = rxfVar;
    }

    public final void a(String str, Integer num, List list) {
        tje.N(this.a, null, null, new ChargersFeedbackSendInteractor$sendFeedback$1(this, str, num, list, null), 3);
    }
}
