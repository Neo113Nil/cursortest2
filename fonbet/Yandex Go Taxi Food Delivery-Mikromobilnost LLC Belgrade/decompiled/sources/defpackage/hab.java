package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.translator.k;
import com.yandex.messaging.internal.view.timeline.b0;
import com.yandex.messaging.internal.view.timeline.d0;
import com.yandex.messaging.internal.view.timeline.e;
import com.yandex.messaging.internal.view.timeline.e0;
import com.yandex.messaging.internal.view.timeline.f0;
import com.yandex.messaging.internal.view.timeline.h0;
import com.yandex.messaging.internal.view.timeline.j;
import com.yandex.messaging.internal.view.timeline.n;
import com.yandex.messaging.internal.view.timeline.p;
import com.yandex.messaging.internal.view.timeline.q;
import com.yandex.messaging.internal.view.timeline.r;
import com.yandex.messaging.internal.view.timeline.s;
import com.yandex.messaging.internal.view.timeline.suggest.a;
import com.yandex.messaging.internal.view.timeline.suggest.c;
import com.yandex.messaging.internal.view.timeline.t;
import com.yandex.messaging.internal.view.timeline.u;
import com.yandex.messaging.internal.view.timeline.v;
import com.yandex.messaging.internal.view.timeline.w;
import com.yandex.messaging.internal.view.timeline.x;
import com.yandex.messaging.internal.view.timeline.y;
import defpackage.iaz0;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class hab extends RecyclerView.Adapter implements t9x, dns0, paz0 {
    public final key0 A;
    public final acb B;
    public j3b C;
    public ub5 D;
    public ub5 E;
    public final ly10 a;
    public final iif b;
    public final iif c;
    public final a w;
    public final h3y x;
    public final ChatRequest y;
    public final izy0 z;

    public hab(ly10 ly10Var, iif iifVar, iif iifVar2, a aVar, h3y h3yVar, ChatRequest chatRequest, izy0 izy0Var, key0 key0Var, acb acbVar) {
        this.a = ly10Var;
        this.b = iifVar;
        this.c = iifVar2;
        this.w = aVar;
        this.x = h3yVar;
        this.y = chatRequest;
        this.z = izy0Var;
        this.A = key0Var;
        this.B = acbVar;
        ub5 ub5Var = ub5.j;
        this.D = ub5Var;
        this.E = ub5Var;
        setHasStableIds(true);
        aVar.c = new l7b(3, this);
    }

    public final int f() {
        return this.c.a() > 0 ? 1 : 0;
    }

    public final void g(yab yabVar, iaz0 iaz0Var, yab yabVar2) {
        this.c.g = yabVar;
        this.b.g = yabVar2;
        if (yabVar == null) {
            iaz0Var.a(new iaz0.a());
        }
        Iterator it = Collections.unmodifiableList(iaz0Var.a).iterator();
        while (it.hasNext()) {
            ((haz0) it.next()).a(new gab(this));
        }
        if (f() > 0) {
            notifyItemChanged(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.C == null) {
            return 0;
        }
        return f() + this.b.a() + this.c.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (i < f()) {
            this.w.getClass();
            return -1L;
        }
        int f = i - f();
        iif iifVar = this.c;
        if (f < iifVar.a()) {
            yab yabVar = iifVar.g;
            if (yabVar != null) {
                yabVar.moveToPosition(f);
                return yabVar.G();
            }
            ny61.r("cursor is not ready");
            return 0L;
        }
        int a = f - iifVar.a();
        yab yabVar2 = this.b.g;
        if (yabVar2 != null) {
            yabVar2.moveToPosition(a);
            return yabVar2.G();
        }
        ny61.r("cursor is not ready");
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (i < f()) {
            return c.x1;
        }
        int f = i - f();
        iif iifVar = this.c;
        if (f < iifVar.a()) {
            return iifVar.b(f);
        }
        return this.b.b(f - iifVar.a());
    }

    public final boolean h(int i) {
        int f;
        yab yabVar;
        if (i >= f() && (f = i - f()) >= 0) {
            iif iifVar = this.c;
            if (f < iifVar.a() && (yabVar = iifVar.g) != null) {
                if (!yabVar.moveToPosition(f)) {
                    yabVar = null;
                }
                if (yabVar != null && !wkb1.k(yabVar.a.getLong(2), 16L)) {
                    yabVar.R();
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        e eVar = (e) x0Var;
        ex10 ex10Var = eVar.m0;
        wb5 wb5Var = eVar.o0;
        z83.i();
        int f = f();
        iif iifVar = this.c;
        if (i < f) {
            yab yabVar = iifVar.g;
            if (yabVar != null) {
                if (yabVar.moveToPosition(i)) {
                    this.w.a(yabVar, (c) eVar);
                    return;
                } else {
                    z83.i();
                    return;
                }
            }
            return;
        }
        int f2 = i - f();
        eVar.f0();
        h3y h3yVar = this.x;
        uv10 uv10Var = (uv10) h3yVar.get();
        ex10Var.a = uv10Var;
        uv10 uv10Var2 = eVar.n0;
        if (uv10Var2 != null) {
            uv10Var2.c.d(wb5Var);
        }
        eVar.n0 = uv10Var;
        uv10Var.c.b(wb5Var);
        if (f2 >= iifVar.a()) {
            int a = f2 - iifVar.a();
            eVar.t0 = this.E;
            boolean z = this.D.g;
            this.b.c(eVar, a);
            lbz0 lbz0Var = lbz0.a;
            eVar.P = lbz0Var;
            eVar.Q = lbz0Var;
            return;
        }
        eVar.t0 = this.D;
        iifVar.c(eVar, f2);
        uv10 uv10Var3 = (uv10) h3yVar.get();
        ex10Var.a = uv10Var3;
        uv10 uv10Var4 = eVar.n0;
        if (uv10Var4 != null) {
            uv10Var4.c.d(wb5Var);
        }
        eVar.n0 = uv10Var3;
        uv10Var3.c.b(wb5Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        e dx80Var;
        e pVar;
        e eVar;
        if (i == c.x1) {
            q4g a = this.w.a.a(viewGroup);
            jwf o = a.o();
            p8g p8gVar = (p8g) a.w;
            p4t a2 = p8gVar.a();
            k kVar = (k) ((h8g) a.y).D.get();
            com.yandex.messaging.internal.backendconfig.a aVar = (com.yandex.messaging.internal.backendconfig.a) p8gVar.t0.get();
            lqo lqoVar = p8gVar.b.a.d;
            q5z.i(lqoVar);
            nz01 nz01Var = new nz01(aVar, lqoVar, i5m.a(p8gVar.u2));
            lqo lqoVar2 = ((z8g) a.c).a.d;
            q5z.i(lqoVar2);
            eVar = new c(o, a2, kVar, nz01Var, lqoVar2);
        } else {
            iif iifVar = this.c;
            ocz0 ocz0Var = iifVar.a;
            if (i == x.T2) {
                jwf o2 = ocz0Var.a(viewGroup).o();
                dx80Var = new x(true, g8a1.g((ViewGroup) o2.k, olh0.msg_vh_chat_own_message_item), o2);
            } else if (i == s.V2) {
                dx80Var = new s(ocz0Var.a(viewGroup).o());
            } else if (i == j.H0) {
                dx80Var = new j(ocz0Var.a(viewGroup).o());
            } else if (i == v.H3) {
                jwf o3 = ocz0Var.a(viewGroup).o();
                dx80Var = new v(true, g8a1.g((ViewGroup) o3.k, olh0.msg_vh_chat_own_image), o3);
            } else if (i == q.H3) {
                jwf o4 = ocz0Var.a(viewGroup).o();
                dx80Var = new q(false, g8a1.g((ViewGroup) o4.k, olh0.msg_vh_chat_other_image), o4);
            } else {
                if (i == u.T3) {
                    jwf o5 = ocz0Var.a(viewGroup).o();
                    ViewGroup viewGroup2 = (ViewGroup) o5.k;
                    pVar = new u(true, g8a1.g(viewGroup2, olh0.msg_vh_chat_own_gallery), fxa1.c(jng0.messagingOutgoingLinkColor, viewGroup2.getContext()).data, fxa1.c(jng0.messagingOutgoingPrimaryColor, viewGroup2.getContext()).data, o5);
                } else if (i == p.T3) {
                    jwf o6 = ocz0Var.a(viewGroup).o();
                    ViewGroup viewGroup3 = (ViewGroup) o6.k;
                    pVar = new p(false, g8a1.g(viewGroup3, olh0.msg_vh_chat_other_gallery), fxa1.c(jng0.messagingIncomingLinkColor, viewGroup3.getContext()).data, fxa1.c(jng0.messagingIncomingPrimaryColor, viewGroup3.getContext()).data, o6);
                } else if (i == w.V2) {
                    jwf o7 = ocz0Var.a(viewGroup).o();
                    dx80Var = new w(true, g8a1.g((ViewGroup) o7.k, olh0.msg_vh_chat_own_sticker), o7);
                } else if (i == r.V2) {
                    jwf o8 = ocz0Var.a(viewGroup).o();
                    dx80Var = new r(false, g8a1.g((ViewGroup) o8.k, olh0.msg_vh_chat_other_sticker), o8);
                } else {
                    e0.J0.getClass();
                    if (i == e0.L0) {
                        dx80Var = new e0(ocz0Var.a(viewGroup).o());
                    } else if (i == f390.v3) {
                        dx80Var = new f390(ocz0Var.a(viewGroup).o());
                    } else if (i == dr80.v3) {
                        dx80Var = new dr80(ocz0Var.a(viewGroup).o());
                    } else if (i == y.V3) {
                        jwf o9 = ocz0Var.a(viewGroup).o();
                        dx80Var = new y(true, g8a1.g((ViewGroup) o9.k, olh0.msg_vh_chat_own_video), o9);
                    } else if (i == t.V3) {
                        jwf o10 = ocz0Var.a(viewGroup).o();
                        dx80Var = new t(false, g8a1.g((ViewGroup) o10.k, olh0.msg_vh_chat_other_video), o10);
                    } else if (i == i390.v3) {
                        dx80Var = new i390(ocz0Var.a(viewGroup).o());
                    } else if (i == rr80.v3) {
                        dx80Var = new rr80(ocz0Var.a(viewGroup).o());
                    } else if (i == g390.C3) {
                        dx80Var = new g390(ocz0Var.a(viewGroup).o());
                    } else if (i == ir80.C3) {
                        dx80Var = new ir80(ocz0Var.a(viewGroup).o());
                    } else if (i == h390.T2) {
                        q4g a3 = ocz0Var.a(viewGroup);
                        dx80Var = new h390(new or80(((d8g) a3.x).a, 1), a3.o());
                    } else if (i == pr80.T2) {
                        q4g a4 = ocz0Var.a(viewGroup);
                        dx80Var = new pr80(new or80(((d8g) a4.x).a, 0), a4.o());
                    } else if (i == b0.C0) {
                        dx80Var = new b0(ocz0Var.a(viewGroup).o());
                    } else if (i == h0.F0) {
                        dx80Var = new h0(ocz0Var.a(viewGroup).o());
                    } else if (i == com.yandex.messaging.internal.view.timeline.k.E0) {
                        dx80Var = new com.yandex.messaging.internal.view.timeline.k(ocz0Var.a(viewGroup).o());
                    } else if (i == n.B0) {
                        jwf o11 = ocz0Var.a(viewGroup).o();
                        dx80Var = new n(false, g8a1.g((ViewGroup) o11.k, olh0.msg_vh_chat_moderated_out_message_item), o11);
                    } else if (i == d0.H0) {
                        dx80Var = new d0(ocz0Var.a(viewGroup).o());
                    } else if (i == f0.H0) {
                        dx80Var = new f0(ocz0Var.a(viewGroup).o());
                    } else if (i == eqv.M0) {
                        dx80Var = new eqv(ocz0Var.a(viewGroup).o(), false, eqv.L0);
                    } else {
                        if (i != dx80.M0) {
                            ny61.r(qv10.g(i, "Unknown viewType: "));
                            return null;
                        }
                        dx80Var = new dx80(ocz0Var.a(viewGroup).o(), true, dx80.L0);
                    }
                }
                dx80Var = pVar;
            }
            dx80Var.s0 = iifVar;
            eVar = dx80Var;
        }
        eVar.S = this.B;
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(x0 x0Var) {
        e eVar = (e) x0Var;
        z83.i();
        eVar.g0();
        return super.onFailedToRecycleView(eVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        ((e) x0Var).s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        ((e) x0Var).t0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        e eVar = (e) x0Var;
        eVar.g0();
        super.onViewRecycled(eVar);
    }
}
