package com.yandex.messaging.isolated;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.bricks.Brick;
import defpackage.e1k;
import defpackage.gc60;
import defpackage.iki0;
import defpackage.jn3;
import defpackage.jqr;
import defpackage.k1b;
import defpackage.kgx;
import defpackage.lqo;
import defpackage.m4b;
import defpackage.md6;
import defpackage.n4b;
import defpackage.njp;
import defpackage.pu31;
import defpackage.pzw;
import defpackage.q4b;
import defpackage.qoi0;
import defpackage.qp3;
import defpackage.r4t;
import defpackage.rz10;
import defpackage.s4b;
import defpackage.sfl0;
import defpackage.tje;
import defpackage.u4b;
import defpackage.x22;
import defpackage.xqi0;
import defpackage.yk3;
import defpackage.ymp;
import java.util.Map;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class c extends Brick {
    public static final /* synthetic */ kgx[] L;
    public final rz10 A;
    public final k1b B;
    public final s4b C;
    public final sfl0 D;
    public final lqo E;
    public final njp F;
    public final ymp G;
    public final LinearLayoutManager H;
    public final RecyclerView I;
    public final qp3 J;
    public boolean K;
    public final m4b a;
    public final b b;
    public final md6 c;
    public final jn3 w;
    public final xqi0 x;
    public final n4b y;
    public final pu31 z;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("authStatusSubscription", 0, "getAuthStatusSubscription()Lcom/yandex/alicekit/core/Disposable;", c.class);
        qoi0.a.getClass();
        L = new kgx[]{mutablePropertyReference1Impl};
    }

    public c(Activity activity, m4b m4bVar, b bVar, md6 md6Var, jn3 jn3Var, xqi0 xqi0Var, n4b n4bVar, pu31 pu31Var, rz10 rz10Var, k1b k1bVar, s4b s4bVar, u4b u4bVar, sfl0 sfl0Var, lqo lqoVar, njp njpVar, ymp ympVar) {
        this.a = m4bVar;
        this.b = bVar;
        this.c = md6Var;
        this.w = jn3Var;
        this.x = xqi0Var;
        this.y = n4bVar;
        this.z = pu31Var;
        this.A = rz10Var;
        this.B = k1bVar;
        this.C = s4bVar;
        this.D = sfl0Var;
        this.E = lqoVar;
        this.F = njpVar;
        this.G = ympVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        linearLayoutManager.T = true;
        this.H = linearLayoutManager;
        RecyclerView recyclerView = new RecyclerView(activity);
        recyclerView.setPadding(0, 0, 0, 0);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new q4b(activity));
        recyclerView.setRecycledViewPool(new gc60());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(m4bVar);
        recyclerView.addOnScrollListener(new iki0(u4bVar, u4bVar.b));
        this.I = recyclerView;
        this.J = new qp3();
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.I;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        tje.e();
        super.onBrickAttach();
        n4b n4bVar = this.y;
        Boolean bool = n4bVar.c;
        boolean booleanValue = bool != null ? bool.booleanValue() : ((r4t) this.F.get()).a.getBoolean("compact_chat_list_mode_on", false);
        m4b m4bVar = this.a;
        boolean z = m4bVar.b;
        m4bVar.b = booleanValue;
        if (booleanValue != z) {
            m4bVar.notifyDataSetChanged();
        }
        md6 md6Var = this.c;
        md6Var.getClass();
        Map a = n4bVar.a.a();
        ((x22) md6Var.b).reportEvent("chatlist opened", a);
        md6Var.c = a;
        this.z.a(this.I, "chatlist", null);
        q(this.w.d(new pzw(this)));
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(this.b.a(n4bVar.d), new IsolatedChatListBrick$launchChatListUpdates$1(this, null), 3));
        xqi0 xqi0Var = this.x;
        xqi0Var.getClass();
        tje.e();
        xqi0Var.q = true;
        yk3 yk3Var = xqi0Var.p;
        if (yk3Var != null) {
            yk3Var.b();
        }
        k1b k1bVar = this.B;
        com.yandex.messaging.internal.suspend.a.b(k1bVar.f(k1bVar.k.a), getBrickScope());
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        q(null);
    }

    public final void q(e1k e1kVar) {
        kgx kgxVar = L[0];
        this.J.b(e1kVar);
    }
}
