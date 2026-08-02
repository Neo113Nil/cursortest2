package com.yandex.messaging.ui.calllist;

import com.yandex.messaging.internal.v;
import defpackage.a8u;
import defpackage.bvf0;
import defpackage.cd0;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.f4t;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.ha2;
import defpackage.j4t;
import defpackage.jqr;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.key0;
import defpackage.kp50;
import defpackage.lqo;
import defpackage.o430;
import defpackage.pb;
import defpackage.pm50;
import defpackage.q2u0;
import defpackage.qj80;
import defpackage.sc5;
import defpackage.tf7;
import defpackage.tft;
import defpackage.ti7;
import defpackage.tpr;
import defpackage.wsr0;
import defpackage.x22;
import defpackage.xsr0;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class d extends sc5 {
    public final j4t w;
    public final tft x;
    public final lqo y;
    public final r0 z;

    public d(qj80 qj80Var, a8u a8uVar, j4t j4tVar, tft tftVar, f4t f4tVar, v vVar, x22 x22Var, lqo lqoVar, h3y h3yVar, tf7 tf7Var, pm50 pm50Var, key0 key0Var) {
        this.w = j4tVar;
        this.x = tftVar;
        this.y = lqoVar;
        zy11 zy11Var = zy11.a;
        tpr t = e.t(new pb(vVar.a(zy11Var), 18));
        k5c a = ds31.a(this);
        xsr0.a.getClass();
        q2u0 q2u0Var = wsr0.b;
        Boolean bool = Boolean.FALSE;
        e.R(t, a, q2u0Var, bool);
        r0 c = bvf0.c(bool);
        this.z = c;
        r0 c2 = bvf0.c(null);
        r0 c3 = bvf0.c(EmptyList.a);
        r0 c4 = bvf0.c(null);
        r0 c5 = bvf0.c(Boolean.TRUE);
        ffx.c(0, 1, null, 5);
        int i = 3;
        ha2 l = e.l(c, new cd0(13, e.X(new m0(c2, c3, new CallListViewModel$callHistoryWithDisplayNames$1(3, null)), new CallListViewModel$special$$inlined$flatMapLatest$1(this, null)), this), c4, e.t(new pb(vVar.a(zy11Var), 19)), c5, new CallListViewModel$state$3(this, null));
        k5c a2 = ds31.a(this);
        o430 o430Var = e3n.b;
        e.R(l, a2, jx81.a(2, kp50.U(5, DurationUnit.SECONDS)), new ti7(0));
        if (qj80Var.c) {
            e.H(ds31.a(this), new jqr(a8uVar.a(zy11Var), new CallListViewModel$1(this, null), i));
        }
    }
}
