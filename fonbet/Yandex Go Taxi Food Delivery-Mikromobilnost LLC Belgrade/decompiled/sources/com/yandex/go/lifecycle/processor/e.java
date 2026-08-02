package com.yandex.go.lifecycle.processor;

import defpackage.fyc;
import defpackage.gwk0;
import defpackage.h3y;
import defpackage.jst;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e extends a {
    public final tt2 c;
    public final tse d;
    public final h3y e;
    public final com.yandex.go.lifecycle.a f;
    public final h3y g;
    public final AtomicBoolean h;
    public final fyc i;
    public final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h3y h3yVar, tt2 tt2Var, tse tseVar, h3y h3yVar2, com.yandex.go.lifecycle.a aVar, h3y h3yVar3) {
        super(h3yVar, uyj.a);
        tt2Var.getClass();
        this.c = tt2Var;
        this.d = tseVar;
        this.e = h3yVar2;
        this.f = aVar;
        this.g = h3yVar3;
        this.h = new AtomicBoolean(false);
        this.i = gwk0.b();
        this.j = "onLargestContentfulPaint";
    }

    @Override // com.yandex.go.lifecycle.processor.a
    public final String a() {
        return this.j;
    }

    public final void c() {
        if (!this.h.compareAndSet(false, true)) {
            jst.e.getClass();
        } else {
            tje.N(this.d, null, null, new OnLargestContentfulPaintProcessorImpl$onLargestContentfulPaint$1(this, null), 3);
        }
    }
}
