package com.yandex.go.walking.navigation.impl.guidance.interactor;

import defpackage.a341;
import defpackage.b741;
import defpackage.pzt0;
import defpackage.q541;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes14.dex */
public final class n {
    public final tse a;
    public final q541 b;
    public final a341 c;
    public final b741 d;
    public pzt0 e;
    public boolean f;

    public n(tse tseVar, q541 q541Var, a341 a341Var, b741 b741Var) {
        this.a = tseVar;
        this.b = q541Var;
        this.c = a341Var;
        this.d = b741Var;
    }

    public final void a(String str) {
        if (this.f) {
            return;
        }
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = tje.N(this.a, null, null, new WalkNavGuidanceInProgressAnalyticsInteractor$start$1(this, str, null), 3);
    }

    public final void b() {
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = null;
        this.f = false;
    }
}
