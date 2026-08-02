package com.yandex.go.lifecycle.processor;

import android.os.SystemClock;
import defpackage.by2;
import defpackage.h3y;
import defpackage.jst;
import defpackage.ms2;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import io.appmetrica.analytics.MviTimestamp;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.perf.Milestone;

/* loaded from: classes.dex */
public final class d extends a {
    public final tt2 c;
    public final tse d;
    public final h3y e;
    public final h3y f;
    public final h3y g;
    public final com.yandex.go.lifecycle.a h;
    public final h3y i;
    public final h3y j;
    public final AtomicBoolean k;
    public final String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h3y h3yVar, tt2 tt2Var, tse tseVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, com.yandex.go.lifecycle.a aVar, h3y h3yVar5, h3y h3yVar6) {
        super(h3yVar, uyj.a);
        tt2Var.getClass();
        this.c = tt2Var;
        this.d = tseVar;
        this.e = h3yVar2;
        this.f = h3yVar3;
        this.g = h3yVar4;
        this.h = aVar;
        this.i = h3yVar5;
        this.j = h3yVar6;
        this.k = new AtomicBoolean(false);
        this.l = "onFirstContentfulPaint";
    }

    @Override // com.yandex.go.lifecycle.processor.a
    public final String a() {
        return this.l;
    }

    public final void c() {
        if (!this.k.compareAndSet(false, true)) {
            jst.e.getClass();
            return;
        }
        jst.e.getClass();
        h3y h3yVar = this.f;
        ((ms2) h3yVar.get()).a(Milestone.SplashScreen);
        ((ms2) h3yVar.get()).a(Milestone.FirstContentfulPaint);
        by2 by2Var = (by2) this.e.get();
        SystemClock.elapsedRealtime();
        ru.yandex.taxi.perf.c cVar = (ru.yandex.taxi.perf.c) by2Var;
        cVar.c.onFirstFrameDrawn(cVar.d, MviTimestamp.now());
        r0 r0Var = this.h.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.c.getClass();
        tje.N(this.d, uyj.a, null, new OnFirstContentfulPaintProcessorImpl$onFirstContentfulPaint$1(this, null), 2);
    }
}
