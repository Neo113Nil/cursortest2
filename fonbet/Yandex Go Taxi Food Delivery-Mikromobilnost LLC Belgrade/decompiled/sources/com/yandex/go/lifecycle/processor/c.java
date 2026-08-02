package com.yandex.go.lifecycle.processor;

import defpackage.au50;
import defpackage.h3y;
import defpackage.hit;
import defpackage.jst;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tqt;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes.dex */
public final class c extends a {
    public final hit c;
    public final au50 d;
    public pzt0 e;
    public pzt0 f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h3y h3yVar, tt2 tt2Var, hit hitVar, au50 au50Var) {
        super(h3yVar, uyj.a);
        tt2Var.getClass();
        this.c = hitVar;
        this.d = au50Var;
        this.g = "OnAppLifecycleProcessor";
    }

    @Override // com.yandex.go.lifecycle.processor.a
    public final String a() {
        return this.g;
    }

    public final void c() {
        if (((tqt) this.d.b).a()) {
            jst.e.getClass();
        } else {
            jst.e.getClass();
            this.e = tje.N(this.c.a, null, null, new OnAppLifecycleProcessorImpl$onAppCreated$1(this, null), 3);
        }
    }

    public final void d() {
        if (((tqt) this.d.b).a()) {
            return;
        }
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = tje.N(this.c.a, null, CoroutineStart.UNDISPATCHED, new OnAppLifecycleProcessorImpl$onAppDestroyed$1(this, null), 1);
    }

    public final void e() {
        if (((tqt) this.d.b).a()) {
            return;
        }
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = tje.N(this.c.a, null, null, new OnAppLifecycleProcessorImpl$onAppPaused$1(this, null), 3);
    }

    public final void f(boolean z) {
        if (((tqt) this.d.b).a()) {
            jst.e.getClass();
        } else {
            jst.e.getClass();
            this.f = tje.N(this.c.a, null, null, new OnAppLifecycleProcessorImpl$onAppResumed$1(this, z, null), 3);
        }
    }
}
