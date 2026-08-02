package com.yandex.go.notifications.acknowledge.lifecycle;

import defpackage.jqr;
import defpackage.lz60;
import defpackage.m0g0;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.jobs.b;
import ru.yandex.taxi.jobs.push.i;
import ru.yandex.taxi.jobs.push.j;

/* loaded from: classes8.dex */
public final class a implements lz60 {
    public final m0g0 a;
    public final b b;
    public final com.yandex.go.notifications.acknowledge.domain.b c;
    public final tt2 d;
    public final tse e;

    public a(m0g0 m0g0Var, b bVar, com.yandex.go.notifications.acknowledge.domain.b bVar2, tt2 tt2Var, tse tseVar) {
        this.a = m0g0Var;
        this.b = bVar;
        this.c = bVar2;
        this.d = tt2Var;
        this.e = tseVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        j jVar = (j) this.a;
        jVar.getClass();
        jqr jqrVar = new jqr(new i(d.b(jVar), jVar), new SendAllPushAckParamsLifecycleListener$onLargestContentfulPaint$1(this, null), 3);
        this.d.getClass();
        e.H(this.e, e.F(jqrVar, uyj.a));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SendAllPushAckParamsLifecycleListener";
    }
}
