package com.yandex.messaging.ui.settings;

import android.content.Context;
import com.yandex.messaging.internal.v;
import defpackage.ab4;
import defpackage.b00;
import defpackage.bu11;
import defpackage.bvf0;
import defpackage.ce80;
import defpackage.di9;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.hb4;
import defpackage.lqo;
import defpackage.oyh0;
import defpackage.qj80;
import defpackage.r5b0;
import defpackage.rk80;
import defpackage.sb2;
import defpackage.tje;
import defpackage.tz10;
import defpackage.vqb1;
import defpackage.w2b1;
import defpackage.w5t;
import defpackage.wwg0;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.yz10;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class e extends yr31 {
    public final yz10 A;
    public final rk80 B;
    public final r0 C;
    public final gci0 D;
    public final v b;
    public final w5t c;
    public final ce80 w;
    public final lqo x;
    public final com.yandex.messaging.domain.unreadcount.d y;
    public final b00 z;

    public e(v vVar, w5t w5tVar, ce80 ce80Var, lqo lqoVar, com.yandex.messaging.domain.unreadcount.d dVar, b00 b00Var, lqo lqoVar2, yz10 yz10Var, qj80 qj80Var) {
        this.b = vVar;
        this.c = w5tVar;
        this.w = ce80Var;
        this.x = lqoVar;
        this.y = dVar;
        this.z = b00Var;
        this.A = yz10Var;
        bu11 bu11Var = qj80Var.c ? new bu11(oyh0.messaging_external_organization_name) : new bu11(oyh0.messaging_zero_organization_name);
        Context context = ce80Var.a;
        ab4 ab4Var = ce80Var.b;
        String valueOf = String.valueOf(0L);
        yvf0 yvf0Var = ce80Var.c;
        this.B = new rk80(0L, bu11Var, ab4Var.a.l(valueOf, ((qj80) yvf0Var.get()).c ? w2b1.a(context.getString(oyh0.messaging_external_organization_name)) : null, !((qj80) yvf0Var.get()).c ? vqb1.e(wwg0.msg_ic_zero_org, context) : null, hb4.a), false, 0);
        r0 c = bvf0.c(new r5b0(0));
        this.C = c;
        this.D = kotlinx.coroutines.flow.e.d(c);
        new di9(sb2.a(0, null, null, 7));
        if (lqoVar2.a(tz10.j)) {
            tje.N(ds31.a(this), null, null, new PersonalOrganizationsViewModel$loadOrganizations$1(this, null), 3);
        }
    }
}
