package com.yandex.go.flex.main_screen.presentation;

import defpackage.c900;
import defpackage.i3m;
import defpackage.l1o;
import defpackage.mdh;
import defpackage.nbl0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xzl;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements i3m {
    public final c900 a;
    public final tse b;
    public final tt2 c;
    public final nbl0 d;

    public a(c900 c900Var, tse tseVar, tt2 tt2Var, nbl0 nbl0Var) {
        this.a = c900Var;
        this.b = tseVar;
        this.c = tt2Var;
        this.d = nbl0Var;
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    @Override // defpackage.i3m
    public final void onDocumentApplied(l1o l1oVar, xzl xzlVar, List list) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.b, mdh.b, null, new ExpectedDestinationsTracker$onDocumentApplied$1(this, xzlVar, null), 2);
    }
}
