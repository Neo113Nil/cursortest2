package com.yandex.go.walking.navigation.impl.guidance.interactor;

import defpackage.a341;
import defpackage.a3l0;
import defpackage.a640;
import defpackage.ah00;
import defpackage.dib1;
import defpackage.g241;
import defpackage.ha2;
import defpackage.j241;
import defpackage.jqr;
import defpackage.mth;
import defpackage.n241;
import defpackage.q541;
import defpackage.tpr;
import defpackage.vmn0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class x {
    public final vmn0 a;
    public final a341 b;
    public final j241 c;
    public final ah00 d;
    public final k e;
    public final a640 f;
    public final n241 g;
    public final q541 h;
    public final g241 i;
    public final a3l0 j;

    public x(vmn0 vmn0Var, a341 a341Var, j241 j241Var, ah00 ah00Var, k kVar, a640 a640Var, n241 n241Var, q541 q541Var, g241 g241Var, a3l0 a3l0Var) {
        this.a = vmn0Var;
        this.b = a341Var;
        this.c = j241Var;
        this.d = ah00Var;
        this.e = kVar;
        this.f = a640Var;
        this.g = n241Var;
        this.h = q541Var;
        this.i = g241Var;
        this.j = a3l0Var;
    }

    public final u a() {
        a341 a341Var = this.b;
        int i = 6;
        mth mthVar = new mth(a341Var.d, i);
        w wVar = new w(new mth(this.c.b, i));
        n241 n241Var = this.g;
        ha2 m = kotlinx.coroutines.flow.e.m(mthVar, wVar, n241Var.e, this.h.h, new WalkNavGuidanceUiStateInteractor$uiStateFlow$initialStateFlow$1(this, null));
        tpr e = a341Var.e();
        tpr t = kotlinx.coroutines.flow.e.t(new r(com.yandex.go.coroutines.b.d(new p(dib1.c(this.d)), new WalkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$start$1(this, null))));
        k kVar = this.e;
        return new u(new tpr[]{m, e, t, new t(new jqr(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new m0(kVar.m, kVar.n, new WalkNavGuidanceCameraInteractor$availableFocusActionFlow$1(3, null)), new WalkNavGuidanceCameraInteractor$availableFocusActionFlow$$inlined$flatMapLatest$1(kVar, null))), new WalkNavGuidanceCameraInteractor$availableFocusActionFlow$3(kVar, null), 3)), n241Var.g, this.i.b}, this);
    }
}
