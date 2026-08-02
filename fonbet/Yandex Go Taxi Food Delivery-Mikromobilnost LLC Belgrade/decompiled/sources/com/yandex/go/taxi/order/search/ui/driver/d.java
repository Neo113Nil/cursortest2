package com.yandex.go.taxi.order.search.ui.driver;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.taxi.order.domain.repositories.f;
import defpackage.eim;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.iup0;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.pzt0;
import defpackage.q6y0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.widget.buttons.LoadingIconCircleButton;

/* loaded from: classes14.dex */
public final class d {
    public final hit a;
    public final tt2 b;
    public final iup0 c;
    public final f d;
    public final eim e;
    public boolean f;
    public String g = "";
    public pzt0 h;
    public pzt0 i;

    public d(ConstraintLayout constraintLayout, hit hitVar, tt2 tt2Var, iup0 iup0Var, f fVar) {
        this.a = hitVar;
        this.b = tt2Var;
        this.c = iup0Var;
        this.d = fVar;
        this.e = new eim(constraintLayout);
    }

    public final void a(LoadingIconCircleButton loadingIconCircleButton, q6y0 q6y0Var) {
        this.e.a(loadingIconCircleButton);
        boolean l = jl40.l(q6y0Var.a(), this.g);
        tt2 tt2Var = this.b;
        hit hitVar = this.a;
        if (!l) {
            b();
            this.g = q6y0Var.a();
            hbp0 hbp0Var = hitVar.a;
            tt2Var.getClass();
            sjh sjhVar = uyj.a;
            this.i = tje.N(hbp0Var, mdh.b, null, new DriverButtonDelegate$onAttach$1(this, null), 2);
        }
        if (q6y0Var.l != DriveState.DRIVING || loadingIconCircleButton == null || this.f) {
            return;
        }
        this.f = true;
        hbp0 hbp0Var2 = hitVar.a;
        tt2Var.getClass();
        sjh sjhVar2 = uyj.a;
        this.h = tje.N(hbp0Var2, mdh.b, null, new DriverButtonDelegate$animateAcceptanceIfItNeed$1(this, null), 2);
    }

    public final void b() {
        this.g = "";
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.i;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.h = null;
        this.i = null;
    }
}
