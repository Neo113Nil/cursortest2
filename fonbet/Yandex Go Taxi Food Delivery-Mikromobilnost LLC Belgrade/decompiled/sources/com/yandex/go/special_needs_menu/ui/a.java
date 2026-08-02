package com.yandex.go.special_needs_menu.ui;

import defpackage.h3y;
import defpackage.n4j0;
import defpackage.oep0;
import defpackage.oot0;
import defpackage.pwy0;
import defpackage.qot0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class a {
    public final qot0 a;
    public final n4j0 b;
    public final h3y c;
    public final oep0 d;
    public final m0 e;

    public a(qot0 qot0Var, n4j0 n4j0Var, h3y h3yVar, oep0 oep0Var, oot0 oot0Var, pwy0 pwy0Var) {
        this.a = qot0Var;
        this.b = n4j0Var;
        this.c = h3yVar;
        this.d = oep0Var;
        this.e = new m0(oot0Var.a.a(), pwy0Var.a(), new SpecialNeedsMenuItemPresenterImpl$state$1(this, null));
    }
}
