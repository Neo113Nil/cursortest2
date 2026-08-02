package com.yandex.messaging.internal.view.timeline.overlay;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.bricks.BrickBoundHelper;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.ThreadChat;
import defpackage.b190;
import defpackage.bvf0;
import defpackage.d5b;
import defpackage.dbi0;
import defpackage.f5b;
import defpackage.ike;
import defpackage.ip31;
import defpackage.jcz0;
import defpackage.jqr;
import defpackage.kgx;
import defpackage.kjs0;
import defpackage.kz10;
import defpackage.lg;
import defpackage.nob1;
import defpackage.p4t;
import defpackage.p8b;
import defpackage.qoi0;
import defpackage.qp3;
import defpackage.t8;
import defpackage.ub5;
import defpackage.yab;
import defpackage.yj6;
import defpackage.z83;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class b implements yj6 {
    public static final /* synthetic */ kgx[] H;
    public final View.OnTouchListener A;
    public final BrickBoundHelper B = new BrickBoundHelper(this);
    public final qp3 C = new qp3();
    public final View D;
    public final r0 E;
    public final r0 F;
    public final int G;
    public final ViewGroup a;
    public final ip31 b;
    public final kz10 c;
    public final dbi0 w;
    public final e x;
    public final a y;
    public final f z;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("updateSubscription", 0, "getUpdateSubscription()Lcom/yandex/alicekit/core/Disposable;", b.class);
        qoi0.a.getClass();
        H = new kgx[]{mutablePropertyReference1Impl};
    }

    public b(ViewGroup viewGroup, ip31 ip31Var, kz10 kz10Var, dbi0 dbi0Var, e eVar, a aVar, f fVar, View.OnTouchListener onTouchListener) {
        this.a = viewGroup;
        this.b = ip31Var;
        this.c = kz10Var;
        this.w = dbi0Var;
        this.x = eVar;
        this.y = aVar;
        this.z = fVar;
        this.A = onTouchListener;
        this.D = eVar.o().a;
        r0 c = bvf0.c(0);
        this.E = c;
        this.F = c;
        this.G = kjs0.b(8);
        dbi0Var.i(new lg(dbi0Var, this));
        eVar.i(new lg(eVar, this));
        aVar.i(new lg(aVar, this));
        fVar.i(new lg(fVar, this));
        viewGroup.setOnTouchListener(new t8(14, this));
    }

    public final void a(ub5 ub5Var, yab yabVar, jcz0 jcz0Var) {
        ServerMessageRef q0 = yabVar.q0();
        if (q0 != null) {
            this.B.bind(this.a, q0);
        }
        this.w.d(yabVar);
        Long B = yabVar.B();
        MessageRef a = MessageRef.a(B != null ? B.longValue() : yabVar.U(), yabVar.d());
        e eVar = this.x;
        eVar.E = jcz0Var;
        boolean b1 = yabVar.b1();
        eVar.I = b1;
        eVar.H = yabVar.P0();
        eVar.L.bind((View) eVar.D, (ViewGroup) a, (MessageRef) Boolean.valueOf(b1));
        kotlinx.coroutines.flow.e.H(eVar.K, new jqr(eVar.B.a(p8b.a(yabVar.d())), new StarDecorationsHelper$bind$1(eVar, null), 3));
        Long B2 = yabVar.B();
        MessageRef a2 = MessageRef.a(B2 != null ? B2.longValue() : yabVar.U(), yabVar.d());
        boolean Q0 = yabVar.Q0();
        a aVar = this.y;
        aVar.C = Q0;
        aVar.D = yabVar.P0();
        aVar.F.bind(aVar.B, a2);
        if (!ub5Var.b) {
            eVar.q(false);
            return;
        }
        boolean z = ub5Var.a;
        f fVar = this.z;
        ike ikeVar = fVar.O;
        p4t p4tVar = fVar.B;
        ServerMessageRef v0 = yabVar.v0();
        fVar.G = v0 != null ? nob1.b(v0) : null;
        fVar.H = yabVar.q0();
        fVar.I = z;
        fVar.E = jcz0Var;
        fVar.F = yabVar.P0();
        fVar.u();
        yabVar.a.getPosition();
        ThreadChat threadChat = fVar.G;
        if (threadChat != null) {
            com.yandex.messaging.extension.flow.c.b(p4tVar.a(threadChat), ikeVar, new ThreadCounterHelper$bind$2$1(fVar, null));
            kotlinx.coroutines.flow.e.H(ikeVar, new m0(p4tVar.a(threadChat), fVar.C.a(threadChat), new ThreadCounterHelper$bind$2$2(fVar, null)));
        }
        eVar.q(fVar.p());
    }

    public final boolean b() {
        if (!this.w.j()) {
            e eVar = this.x;
            if (eVar.F && eVar.H) {
                return true;
            }
            a aVar = this.y;
            if ((!aVar.C || !aVar.D) && !this.z.p()) {
                return false;
            }
        }
        return true;
    }

    public final int c(b190 b190Var, int i) {
        int i2;
        b190Var.e(i);
        lg m = b190Var.m();
        if (m != null) {
            int i3 = m.a;
            Integer valueOf = Integer.valueOf(i3);
            if (i3 == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                i2 = valueOf.intValue() + this.G;
                return i + i2;
            }
        }
        i2 = 0;
        return i + i2;
    }

    public final int d() {
        Integer width = this.w.getWidth();
        int i = this.G;
        int intValue = width != null ? width.intValue() + i : 0;
        Integer width2 = this.x.getWidth();
        int intValue2 = intValue + (width2 != null ? width2.intValue() + i : 0);
        Integer width3 = this.y.getWidth();
        int intValue3 = intValue2 + (width3 != null ? width3.intValue() + i : 0);
        Integer width4 = this.z.getWidth();
        int intValue4 = intValue3 + (width4 != null ? width4.intValue() + i : 0);
        return intValue4 > 0 ? intValue4 + i : intValue4;
    }

    public final void e() {
        this.B.unbind();
        this.w.b();
        e eVar = this.x;
        eVar.L.unbind();
        kotlinx.coroutines.a.g(eVar.K.a, null);
        eVar.E = null;
        a aVar = this.y;
        aVar.F.unbind();
        kotlinx.coroutines.a.g(aVar.E.a, null);
        f fVar = this.z;
        fVar.E = null;
        fVar.G = null;
        fVar.H = null;
        fVar.I = false;
        fVar.J = false;
        fVar.K = null;
        fVar.L = 0;
        kotlinx.coroutines.a.g(fVar.O.a, null);
        kgx kgxVar = H[0];
        this.C.b(null);
    }

    @Override // defpackage.yj6, defpackage.ak6
    public final void onBrickStart() {
        ServerMessageRef serverMessageRef = (ServerMessageRef) this.B.key();
        f5b a = this.c.a(serverMessageRef);
        z83.g(null, Looper.myLooper(), a.c.getLooper());
        d5b d5bVar = new d5b(a, serverMessageRef, this.w);
        kgx kgxVar = H[0];
        this.C.b(d5bVar);
    }

    @Override // defpackage.yj6, defpackage.ak6
    public final void onBrickStop() {
        kgx kgxVar = H[0];
        this.C.b(null);
    }

    @Override // defpackage.yj6
    public final /* bridge */ /* synthetic */ boolean t(Object obj, Object obj2) {
        return true;
    }
}
