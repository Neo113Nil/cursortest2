package defpackage;

import com.yandex.go.mainscreen.superapp.orders.domain.h;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.PropertyReference0Impl;
import ru.yandex.taxi.multiorder.multi.ServiceType;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes.dex */
public final class chw0 implements w301 {
    public final PropertyReference0Impl a;
    public final sls b;
    public final m601 c;
    public final tls d;
    public final tls e;
    public final y50 f;
    public final j5y0 g;
    public final ibw0 h;
    public final u7y0 i;
    public final a301 j;
    public final ogc0 k;
    public final h l;
    public final h3y m;
    public final i1w0 n;

    public chw0(PropertyReference0Impl propertyReference0Impl, sls slsVar, m601 m601Var, tls tlsVar, tls tlsVar2, y50 y50Var, j5y0 j5y0Var, ibw0 ibw0Var, u7y0 u7y0Var, a301 a301Var, ogc0 ogc0Var, h hVar, h3y h3yVar, i1w0 i1w0Var) {
        this.a = propertyReference0Impl;
        this.b = slsVar;
        this.c = m601Var;
        this.d = tlsVar;
        this.e = tlsVar2;
        this.f = y50Var;
        this.g = j5y0Var;
        this.h = ibw0Var;
        this.i = u7y0Var;
        this.j = a301Var;
        this.k = ogc0Var;
        this.l = hVar;
        this.m = h3yVar;
        this.n = i1w0Var;
    }

    public static void d(String str) {
        jst.e.w(new IllegalStateException(g8e.o("There is no tracking with id ", str)));
    }

    @Override // defpackage.w301
    public final void a(a201 a201Var) {
        List a;
        List a2;
        d3p d3pVar;
        z2p z2pVar;
        v401 c;
        s501 g = a201Var.g();
        boolean equals = g.equals(m501.b);
        tls tlsVar = this.d;
        if (equals) {
            String p = a201Var.p();
            w201 w201Var = (w201) tlsVar.invoke(p);
            if (w201Var == null) {
                d(p);
                return;
            }
            String str = (String) this.b.invoke();
            a301 a301Var = this.j;
            boolean z = w201Var instanceof pu6;
            a301Var.c.getClass();
            a301Var.a(w201Var, z ? "orders_widget" : "preview_card", this.c, str);
            this.e.invoke(w201Var);
            return;
        }
        if (g instanceof n501) {
            String p2 = a201Var.p();
            w201 w201Var2 = (w201) tlsVar.invoke(p2);
            if (w201Var2 == null) {
                d(p2);
                return;
            }
            if (w201Var2 instanceof q6y0) {
                g301 D = ((q6y0) w201Var2).D();
                t401 d = (D == null || (c = D.c()) == null) ? null : c.d();
                k301 a3 = d instanceof h401 ? ((h401) d).a() : null;
                c(a3 != null ? a3.a() : null);
                return;
            }
            if (!(w201Var2 instanceof d3p) || (z2pVar = (d3pVar = (d3p) w201Var2).j) == null) {
                return;
            }
            b(d3pVar, z2pVar);
            return;
        }
        if (g.equals(o501.b)) {
            String p3 = a201Var.p();
            w201 w201Var3 = (w201) tlsVar.invoke(p3);
            if (w201Var3 instanceof q6y0) {
                g301 D2 = ((q6y0) w201Var3).D();
                if (D2 == null || (a2 = D2.a()) == null) {
                    return;
                }
                k301 k301Var = (k301) a.S(scc.f(a2), a2);
                c(k301Var != null ? k301Var.a() : null);
                return;
            }
            if (w201Var3 instanceof d3p) {
                d3p d3pVar2 = (d3p) w201Var3;
                b(d3pVar2, d3pVar2.c());
                return;
            }
            if ((w201Var3 instanceof z4y0) || (w201Var3 instanceof v7y0) || (w201Var3 instanceof y2y0) || (w201Var3 instanceof jem) || (w201Var3 instanceof q6o0) || (w201Var3 instanceof bjz) || (w201Var3 instanceof xda) || (w201Var3 instanceof qg50) || (w201Var3 instanceof pu6)) {
                return;
            }
            if (w201Var3 == null) {
                d(p3);
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (g.equals(q501.b)) {
            String p4 = a201Var.p();
            w201 w201Var4 = (w201) tlsVar.invoke(p4);
            if (w201Var4 instanceof q6y0) {
                g301 D3 = ((q6y0) w201Var4).D();
                if (D3 == null || (a = D3.a()) == null) {
                    return;
                }
                k301 k301Var2 = (k301) a.S(scc.f(a) - 1, a);
                c(k301Var2 != null ? k301Var2.a() : null);
                return;
            }
            if (w201Var4 instanceof d3p) {
                d3p d3pVar3 = (d3p) w201Var4;
                b(d3pVar3, d3pVar3.m());
                return;
            }
            if ((w201Var4 instanceof z4y0) || (w201Var4 instanceof v7y0) || (w201Var4 instanceof y2y0) || (w201Var4 instanceof jem) || (w201Var4 instanceof q6o0) || (w201Var4 instanceof bjz) || (w201Var4 instanceof xda) || (w201Var4 instanceof qg50) || (w201Var4 instanceof pu6)) {
                return;
            }
            if (w201Var4 == null) {
                d(p4);
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (!(g instanceof p501)) {
            if ((g instanceof k501) || (g instanceof l501) || g.equals(r501.b)) {
                jst.e.w(new IllegalStateException("Trying to handle map screen tracking card action for superapp tracking card"));
                return;
            } else {
                w511.b();
                return;
            }
        }
        String p5 = a201Var.p();
        int a4 = ((p501) g).a();
        w201 w201Var5 = (w201) tlsVar.invoke(p5);
        if (w201Var5 instanceof q6y0) {
            q6y0 q6y0Var = (q6y0) w201Var5;
            this.i.a(a4, q6y0Var.y());
            if (q6y0Var.z() == DriveState.COMPLETE) {
                this.n.a(ServiceType.TAXI.getAlias());
                ((i6y0) ((g6y0) this.m.get())).c(wfz.V);
                ((com.yandex.go.superapp.impl.router.a) this.g.e).b(q6y0Var.y().b(), false, DetailsOpenReason.RATING, TaxiCardNavigationAction.EMPTY, new q251(10));
                return;
            }
            return;
        }
        if ((w201Var5 instanceof z4y0) || (w201Var5 instanceof v7y0) || (w201Var5 instanceof y2y0) || (w201Var5 instanceof jem) || (w201Var5 instanceof q6o0) || (w201Var5 instanceof bjz) || (w201Var5 instanceof xda) || (w201Var5 instanceof d3p) || (w201Var5 instanceof qg50) || (w201Var5 instanceof pu6)) {
            return;
        }
        if (w201Var5 == null) {
            d(p5);
        } else {
            w511.b();
        }
    }

    public final void b(d3p d3pVar, z2p z2pVar) {
        if ((z2pVar != null ? z2pVar.b() : null) == null) {
            if ((z2pVar != null ? z2pVar.i() : null) == null) {
                return;
            }
        }
        String str = d3pVar.a;
        String value = d3pVar.c.getValue();
        String c = z2pVar.c();
        String f = z2pVar.f();
        if (f == null) {
            f = "";
        }
        String e = z2pVar.e();
        String str2 = e != null ? e : "";
        String str3 = (String) this.b.invoke();
        ibw0 ibw0Var = this.h;
        ibw0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("service_w_active_order", value);
        hashMap.put("active_order_id", str);
        if (str3 != null) {
            hashMap.put("filter", str3);
        }
        hashMap.put("button_id", c);
        ibw0Var.a.a("SuperappMain.ActiveOrderOffer.Tapped", hashMap, 1, x4e.q(hashMap, "button_text", f, "button_service", str2));
        c3p i = z2pVar.i();
        if (i != null) {
            String a = i.a();
            boolean b = i.b();
            ogc0 ogc0Var = this.k;
            ((pep0) ogc0Var.a).f((m950) ogc0Var.b.get(), new tg41(a, b), hxx.a);
            return;
        }
        String b2 = z2pVar.b();
        if (b2 == null) {
            return;
        }
        ((a60) this.f).c(b2, v770.b);
    }

    public final void c(j301 j301Var) {
        if (j301Var instanceof i301) {
            ((a60) this.f).c(((i301) j301Var).a(), v770.b);
        } else {
            if (jl40.l(j301Var, h301.a) || j301Var == null) {
                return;
            }
            w511.b();
        }
    }
}
