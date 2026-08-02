package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import defpackage.ah00;
import defpackage.b2l0;
import defpackage.gh00;
import defpackage.qv20;
import defpackage.sv20;
import defpackage.tje;
import defpackage.w4e0;
import defpackage.xm00;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class b {
    public final ah00 a;
    public final b2l0 b;
    public final sv20 c;
    public xm00 d;
    public w4e0 f;
    public final ArrayList e = new ArrayList();
    public final float g = 21.0f;

    public b(ah00 ah00Var, b2l0 b2l0Var, sv20 sv20Var) {
        this.a = ah00Var;
        this.b = b2l0Var;
        this.c = sv20Var;
    }

    public final void a() {
        if (this.d == null) {
            this.d = ((gh00) this.a).i.p();
        }
        qv20 qv20Var = new qv20(this);
        sv20 sv20Var = this.c;
        sv20Var.Bg(qv20Var);
        ((gh00) sv20Var.x).e(sv20Var.F);
        tje.N(sv20Var.Jg(), null, null, new MobilityHubOverlayPresenter$attachView$1(sv20Var, null), 3);
        tje.N(sv20Var.Jg(), null, null, new MobilityHubOverlayPresenter$attachView$2(sv20Var, qv20Var, null), 3);
    }
}
