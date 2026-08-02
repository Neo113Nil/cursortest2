package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation;

import defpackage.e4w0;
import defpackage.jst;
import defpackage.k1w0;
import defpackage.ney;
import defpackage.pjc0;
import defpackage.pwz0;
import defpackage.qc5;
import defpackage.tig0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.xby;

/* loaded from: classes.dex */
public final class b extends qc5 {
    public final tt2 A;
    public final k1w0 B;
    public final com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.a C;
    public final tig0 D;

    public b(tt2 tt2Var, k1w0 k1w0Var, com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.a aVar, tig0 tig0Var, ney neyVar) {
        super(e4w0.class, neyVar);
        this.A = tt2Var;
        this.B = k1w0Var;
        this.C = aVar;
        this.D = tig0Var;
    }

    public final void Mg(e4w0 e4w0Var) {
        Bg(e4w0Var);
        tje.N(Jg(), null, null, new SuperAppMainScreenTopPlaquePresenter$listenToAddressClarificationNecessity$1(this, null), 3);
    }

    public final void Ng(pjc0 pjc0Var, pwz0 pwz0Var) {
        if (this.c && Eg()) {
            this.C.a(pjc0Var, pwz0Var);
        } else {
            xby.t(jst.e, "CLARIFY_ERROR:PERFORM_ACTION", new IllegalStateException(), "View not attached", 2);
        }
    }
}
