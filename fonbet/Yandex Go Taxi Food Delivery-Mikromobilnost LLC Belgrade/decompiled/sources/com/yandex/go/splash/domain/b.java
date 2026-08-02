package com.yandex.go.splash.domain;

import defpackage.ast0;
import defpackage.b400;
import defpackage.m8t0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes8.dex */
public final class b implements ast0 {
    public final a a;
    public final com.yandex.go.lifecycle.a b;
    public final tse c;

    public b(a aVar, com.yandex.go.lifecycle.a aVar2, tse tseVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = tseVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0.b.d.b() != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Runnable runnable) {
        a aVar = this.a;
        if (!aVar.d) {
            if (aVar.c.d) {
                b400 b400Var = aVar.b;
                if (!b400Var.a.c()) {
                }
            }
            aVar.e.offer(runnable);
            return;
        }
        runnable.run();
    }

    public final pzt0 b(m8t0 m8t0Var) {
        return tje.N(this.c, null, null, new SplashStateInteractorImpl$doAfterFirstContentfulPaint$1(this, m8t0Var, null), 3);
    }
}
