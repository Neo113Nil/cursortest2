package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import android.view.ViewGroup;
import com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.i;
import defpackage.ajr;
import defpackage.ezw;
import defpackage.ffx;
import defpackage.jst;
import defpackage.lhw0;
import defpackage.o4w0;
import defpackage.pzt0;
import defpackage.sy60;
import defpackage.tcw0;
import defpackage.tje;
import defpackage.tse;
import defpackage.v66;
import defpackage.wdw0;
import defpackage.xdw0;
import defpackage.zh0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class e {
    public final xdw0 a;
    public final boolean b;
    public final n0 c = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public boolean d;
    public pzt0 e;
    public final /* synthetic */ o4w0 f;

    public e(o4w0 o4w0Var, xdw0 xdw0Var, boolean z) {
        this.f = o4w0Var;
        this.a = xdw0Var;
        this.b = z;
    }

    public final void a(ViewGroup viewGroup, v66 v66Var) {
        o4w0 o4w0Var = this.f;
        xdw0 xdw0Var = this.a;
        if (o4w0Var.v(xdw0Var)) {
            return;
        }
        tcw0 tcw0Var = o4w0Var.Z;
        tse o = o4w0Var.o();
        boolean z = this.b && !this.d;
        zh0 zh0Var = tcw0Var.a;
        i iVar = new i(o, z, (com.yandex.go.flex.main_screen.presentation.feed.e) zh0Var.a.get(), (ezw) zh0Var.b.get(), (ajr) zh0Var.c.get(), (lhw0) zh0Var.d.get());
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = tje.N(o4w0Var.o(), null, null, new SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1(iVar, o4w0Var, this, null), 3);
        xdw0 xdw0Var2 = o4w0Var.e0;
        if (xdw0Var2 != null) {
            jst.e.s(new IllegalStateException("SuperappSearchbarRouter reference should be null there"));
            xdw0Var2.i();
        }
        o4w0Var.e0 = xdw0Var;
        o4w0Var.A(xdw0Var, new wdw0(viewGroup, v66Var, iVar), sy60.Q2);
        this.d = true;
    }
}
