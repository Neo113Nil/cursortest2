package com.yandex.messaging.internal.view.timeline;

import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MediaFileMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import defpackage.acb;
import defpackage.apq0;
import defpackage.ct21;
import defpackage.evu0;
import defpackage.ex10;
import defpackage.gt10;
import defpackage.h3y;
import defpackage.ht10;
import defpackage.iif;
import defpackage.ike;
import defpackage.j3b;
import defpackage.j6m;
import defpackage.jcz0;
import defpackage.jwf;
import defpackage.kgx;
import defpackage.nu10;
import defpackage.ny61;
import defpackage.okb1;
import defpackage.pzt0;
import defpackage.qdz0;
import defpackage.qoi0;
import defpackage.rp3;
import defpackage.s8b;
import defpackage.sv10;
import defpackage.t8;
import defpackage.tf;
import defpackage.tje;
import defpackage.ub5;
import defpackage.uv10;
import defpackage.vb5;
import defpackage.vkb1;
import defpackage.vse;
import defpackage.vv10;
import defpackage.wb5;
import defpackage.wbz0;
import defpackage.wz31;
import defpackage.x22;
import defpackage.y2r;
import defpackage.y2t;
import defpackage.yab;
import defpackage.z83;
import defpackage.z9z0;
import defpackage.zf0;
import defpackage.zoq0;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public abstract class e extends qdz0 {
    public static final /* synthetic */ kgx[] A0;
    public final boolean R;
    public acb S;
    public final zf0 T;
    public final apq0 U;
    public final vv10 V;
    public Long W;
    public Long Z;
    public String a0;
    public y2r b0;
    public String c0;
    public String d0;
    public Long e0;
    public String f0;
    public LocalMessageRef g0;
    public ServerMessageRef h0;
    public Long i0;
    public Long j0;
    public boolean k0;
    public boolean l0;
    public final ex10 m0;
    public uv10 n0;
    public final wb5 o0;
    public boolean p0;
    public final rp3 q0;
    public String r0;
    public iif s0;
    public ub5 t0;
    public j3b u0;
    public final ike v0;
    public final ike w0;
    public final h3y x0;
    public final y2t y0;
    public final t8 z0;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("viewsCountRequest", 0, "getViewsCountRequest()Lkotlinx/coroutines/Job;", e.class);
        qoi0.a.getClass();
        A0 = new kgx[]{mutablePropertyReference1Impl};
    }

    public e(boolean z, View view, jwf jwfVar) {
        super(view);
        this.R = z;
        this.T = new zf0(view);
        this.U = (apq0) jwfVar.j;
        this.V = (vv10) jwfVar.l;
        this.m0 = new ex10();
        this.o0 = new wb5(view, this);
        this.q0 = new rp3();
        this.t0 = ub5.j;
        vse vseVar = (vse) jwfVar.w;
        this.v0 = vseVar.c(false);
        this.w0 = vseVar.c(true);
        this.x0 = (h3y) jwfVar.R;
        this.y0 = new y2t(view.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.messaging.internal.view.timeline.BaseTimelineViewHolder$messageGestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent e) {
                e.this.r0();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent e) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent e) {
                e.this.n0();
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent e) {
                e eVar = e.this;
                kgx[] kgxVarArr = e.A0;
                eVar.m0(null, null);
                return true;
            }
        }, null);
        t8 t8Var = new t8(3, this);
        this.z0 = t8Var;
        if (!x0()) {
            view.setOnTouchListener(t8Var);
        }
        view.setOnClickListener(new tf(21, this));
    }

    public void X(yab yabVar, vb5 vb5Var) {
        if (yabVar.W0()) {
            long G = yabVar.G();
            apq0 apq0Var = this.U;
            zoq0 n = apq0Var.c.n(G);
            if (n != null) {
                ((LinkedHashMap) apq0Var.c.c).remove(Long.valueOf(G));
                x22 x22Var = this.V.a;
                n.a.getClass();
                x22Var.reportEvent("msg time 2 ui", kotlin.collections.b.i(new Pair("time_diff", Long.valueOf(System.currentTimeMillis() - n.d)), new Pair("msg_type", n.a()), new Pair("connection_status", Integer.valueOf(n.c))));
            }
        }
        this.O = wbz0.a;
        this.h0 = yabVar.x0();
        this.i0 = yabVar.D0();
        this.P = yabVar.o();
        this.j0 = yabVar.B();
        this.e0 = Long.valueOf(yabVar.G());
        this.d0 = yabVar.W();
        this.W = Long.valueOf(yabVar.U());
        this.Z = yabVar.g0();
        this.a0 = yabVar.f0();
        this.l0 = yabVar.R0();
        this.c0 = yabVar.d();
        this.g0 = yabVar.P();
        this.f0 = yabVar.a();
        this.k0 = yabVar.W0();
        MessageData R = yabVar.R();
        this.r0 = R.text;
        this.p0 = R.hiddenByModeration && this.k0;
        String str = this.c0;
        if (str != null) {
            tje.N(this.v0, null, null, new BaseTimelineViewHolder$bind$1$1(this, str, null), 3);
        }
        this.b0 = new y2r(null, null, null, null);
        if (R instanceof MediaFileMessageData) {
            MediaFileMessageData mediaFileMessageData = (MediaFileMessageData) R;
            this.b0 = new y2r(mediaFileMessageData.fileId, mediaFileMessageData.fileName, vkb1.c(mediaFileMessageData), mediaFileMessageData.fileSource);
        }
        ht10 j0 = j0();
        jcz0 jcz0Var = e0().f;
        String str2 = this.d0;
        zf0 zf0Var = this.T;
        zf0Var.e = str2;
        zf0Var.f = jcz0Var;
        ct21 ct21Var = (ct21) zf0Var.d;
        if (ct21Var != null) {
            ct21Var.close();
        }
        zf0Var.d = null;
        if (str2 != null) {
            zf0Var.d = j0 != null ? new ct21((com.yandex.messaging.internal.authorized.j) j0.b, new gt10(j0, str2, zf0Var)) : null;
        }
    }

    public boolean Y() {
        return true;
    }

    public boolean Z() {
        return false;
    }

    public boolean a0() {
        return false;
    }

    public boolean b0() {
        return false;
    }

    public boolean c0() {
        return Y();
    }

    public boolean d0() {
        return b0();
    }

    public final acb e0() {
        acb acbVar = this.S;
        if (acbVar != null) {
            return acbVar;
        }
        ny61.r("Chat dependencies not bound, use bindChat()");
        return null;
    }

    public void f0() {
        this.m0.a = null;
        zf0 zf0Var = this.T;
        ct21 ct21Var = (ct21) zf0Var.d;
        if (ct21Var != null) {
            ct21Var.close();
        }
        zf0Var.d = null;
        uv10 uv10Var = this.n0;
        if (uv10Var != null) {
            uv10Var.c.d(this.o0);
        }
        this.n0 = null;
    }

    public void g0() {
        f0();
    }

    public final nu10 h0() {
        z83.i();
        z83.i();
        Long l = this.e0;
        String str = this.c0;
        if (l == null || str == null) {
            return null;
        }
        long longValue = l.longValue();
        String str2 = null;
        Long l2 = this.i0;
        LocalMessageRef localMessageRef = this.g0;
        Long l3 = this.W;
        Long l4 = this.j0;
        y2r y2rVar = this.b0;
        String str3 = y2rVar != null ? y2rVar.a : null;
        if (y2rVar != null) {
            str2 = y2rVar.b;
        }
        return new nu10(longValue, l2, localMessageRef, l3, l4, str3, str2, str, this.Z, this.a0, this.l0, this.t0.a);
    }

    public void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
    }

    public ht10 j0() {
        return null;
    }

    public String k0() {
        return this.r0;
    }

    public m l0() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(String str, Long l) {
        Long l2;
        String str2;
        String str3;
        if (!e0().b.g || (l2 = this.e0) == null || (str2 = this.c0) == null || evu0.J(str2)) {
            return;
        }
        boolean z = false;
        if (this.t0.e && b0()) {
            Long l3 = this.W;
            Long l4 = this.j0;
            LocalMessageRef localMessageRef = this.g0;
            ex10 ex10Var = this.m0;
            uv10 uv10Var = ex10Var.a;
            if ((uv10Var != null && uv10Var.b()) ? ex10Var.a(l2, l3, l4, localMessageRef) : false) {
                return;
            }
        }
        jcz0 jcz0Var = e0().f;
        if (o0() || !d0() || jcz0Var == null) {
            return;
        }
        if (l != null) {
            if (!this.t0.a || (str3 = this.c0) == null) {
                jcz0Var.B(l.longValue(), str);
                return;
            } else {
                jcz0Var.b(new ServerMessageRef(l.longValue(), str3));
                return;
            }
        }
        boolean z2 = this instanceof wz31 ? ((com.yandex.messaging.internal.view.timeline.poll.a) ((wz31) this)).v3 : false;
        nu10 h0 = h0();
        if (h0 != null) {
            String k0 = k0();
            boolean Y = Y();
            boolean c0 = c0();
            if (this.t0.e && b0()) {
                z = true;
            }
            jcz0Var.x(h0, k0, Y, c0, z, Z(), a0(), this.u0, this.b0, this.p0, z2);
        }
    }

    public boolean n0() {
        Long l;
        if (e0().b.h && b0() && (l = this.e0) != null) {
            return true == this.m0.a(Long.valueOf(l.longValue()), this.W, this.j0, this.g0);
        }
        return false;
    }

    public final boolean o0() {
        uv10 uv10Var = this.m0.a;
        return uv10Var != null && uv10Var.b();
    }

    public final boolean p0() {
        Long l = this.e0;
        Long l2 = this.W;
        Long l3 = this.j0;
        LocalMessageRef localMessageRef = this.g0;
        ex10 ex10Var = this.m0;
        uv10 uv10Var = ex10Var.a;
        if (uv10Var == null || l == null || !uv10Var.b()) {
            return false;
        }
        return ex10Var.a.b.a.contains(new sv10(l.longValue(), l2, l3, localMessageRef));
    }

    public void q0(j3b j3bVar) {
        this.u0 = j3bVar;
    }

    public final void r0() {
        String str;
        j3b j3bVar;
        nu10 h0;
        if (!((j6m) this.x0.get()).c || this.e0 == null || (str = this.c0) == null || evu0.J(str) || (j3bVar = this.u0) == null) {
            return;
        }
        s8b b = okb1.b(j3bVar);
        ChatRightsFlag chatRightsFlag = ChatRightsFlag.SendReactions;
        kgx kgxVar = s8b.d[18];
        if (chatRightsFlag.c(b).booleanValue()) {
            if (o0()) {
                m0(null, null);
                return;
            }
            jcz0 jcz0Var = e0().f;
            if (jcz0Var == null || (h0 = h0()) == null) {
                return;
            }
            jcz0Var.s(h0);
        }
    }

    public void s0() {
        m l0 = l0();
        pzt0 pzt0Var = null;
        if (l0 != null) {
            ike ikeVar = l0.c;
            if (this.l0) {
                Long l = this.Z;
                String str = this.a0;
                Long l2 = this.W;
                if (l != null && str != null && l2 != null) {
                    pzt0Var = tje.N(ikeVar, null, null, new MessageViewsRefresher$requestForwardViews$1(l0, str, l2.longValue(), l.longValue(), null), 3);
                }
            } else {
                Long l3 = this.W;
                if (l3 != null) {
                    pzt0Var = tje.N(ikeVar, null, null, new MessageViewsRefresher$requestMessageViews$1(l0, l3.longValue(), null), 3);
                }
            }
        }
        kgx kgxVar = A0[0];
        this.q0.a(pzt0Var);
    }

    public void t0() {
        kgx kgxVar = A0[0];
        this.q0.a(null);
        Long l = this.e0;
        if (l != null) {
            ((LinkedHashMap) this.U.c.c).remove(Long.valueOf(l.longValue()));
        }
    }

    public void u0(yab yabVar, MessageData messageData) {
    }

    public final void v0(vb5 vb5Var) {
        iif iifVar = this.s0;
        ServerMessageRef serverMessageRef = this.h0;
        if (iifVar == null || serverMessageRef == null) {
            return;
        }
        iifVar.h.put(serverMessageRef, vb5Var);
    }

    public void w0(boolean z, boolean z2) {
    }

    public boolean x0() {
        return this instanceof j;
    }
}
