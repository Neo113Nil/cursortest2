package com.yandex.go.beginners.presentation;

import com.yandex.go.coroutines.b;
import defpackage.ad5;
import defpackage.ahe0;
import defpackage.bk1;
import defpackage.ed;
import defpackage.gym;
import defpackage.pj;
import defpackage.xge0;
import defpackage.zge0;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class a extends ad5 {
    public final gym A;
    public final ed B;
    public final bk1 C;
    public boolean D;
    public final zge0 x;
    public final ahe0 y;
    public final com.yandex.go.lifecycle.a z;

    public a(zge0 zge0Var, ahe0 ahe0Var, com.yandex.go.lifecycle.a aVar, gym gymVar, ed edVar, bk1 bk1Var) {
        super(xge0.class);
        this.x = zge0Var;
        this.y = ahe0Var;
        this.z = aVar;
        this.A = gymVar;
        this.B = edVar;
        this.C = bk1Var;
    }

    public final void Kg(xge0 xge0Var) {
        Bg(xge0Var);
        pj pjVar = (pj) this.A.a;
        pjVar.getClass();
        pjVar.a.a("EarlyAuthOnboarding.Shown", new HashMap(), 1, new HashMap());
        xge0Var.render(this.y);
        b.g(Jg(), null, null, new PreGeoAuthOnboardingPresenter$attachView$1(this, xge0Var, null), 3);
    }
}
