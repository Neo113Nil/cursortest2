package com.yandex.go.chargers.plus;

import com.yandex.go.chargers.payments.domain.c;
import defpackage.czo0;
import defpackage.e5d0;
import defpackage.eci0;
import defpackage.em9;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.hbp0;
import defpackage.ima;
import defpackage.j6a;
import defpackage.jma;
import defpackage.mth;
import defpackage.q2u0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyo0;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes12.dex */
public final class a {
    public final em9 a;
    public final e5d0 b;
    public final j6a c;
    public final ima d;
    public final c e;
    public final jma f;
    public final hbp0 g;
    public eci0 h;
    public gci0 i;

    public a(em9 em9Var, e5d0 e5d0Var, j6a j6aVar, ima imaVar, c cVar, jma jmaVar) {
        this.a = em9Var;
        this.b = e5d0Var;
        this.c = j6aVar;
        this.d = imaVar;
        this.e = cVar;
        this.f = jmaVar;
        String simpleName = (2 & 1) != 0 ? null : a.class.getSimpleName();
        this.g = new hbp0(new czo0(14), simpleName == null ? "" : simpleName, null);
    }

    public final void a(tse tseVar) {
        hbp0 hbp0Var = this.g;
        hbp0Var.a();
        gtq0.t(tseVar, new uyo0(4, hbp0Var));
        g b = this.e.b();
        tse c = hbp0Var.c();
        xsr0.a.getClass();
        q2u0 q2u0Var = wsr0.b;
        this.h = e.O(b, c, q2u0Var, 0);
        this.i = e.R(this.b.c, hbp0Var.c(), q2u0Var, null);
        eci0 eci0Var = this.h;
        if (eci0Var != null) {
            tje.N(hbp0Var.c(), null, null, new ChargersPlusToggleDelegateImpl$collectToggleEventForAnalytics$$inlined$collectIn$1(eci0Var, null, this), 3);
        }
        eci0 eci0Var2 = this.h;
        if (eci0Var2 == null) {
            return;
        }
        tje.N(hbp0Var.c(), null, null, new ChargersPlusToggleDelegateImpl$collectPlusEnabledNotification$$inlined$collectLatestIn$1(new mth(e.I(eci0Var2, new ChargersPlusToggleDelegateImpl$collectPlusEnabledNotification$1(this, null)), 6), null, this), 3);
    }
}
