package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.go.chargers.offer.experiments.ChargersOfferComposeExperiment;
import com.yandex.go.chargers.plus.a;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.g;
import com.yandex.go.route.interactor.c;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes12.dex */
public final class f9a extends h55 {
    public final /* synthetic */ int D = 0;
    public final yvf0 E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public Object L;

    public f9a(yvf0 yvf0Var, yvf0 yvf0Var2, g gVar, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, dqe0 dqe0Var, c cVar) {
        super(null);
        this.E = yvf0Var;
        this.F = yvf0Var2;
        this.G = gVar;
        this.H = yvf0Var3;
        this.I = yvf0Var4;
        this.J = yvf0Var5;
        this.K = dqe0Var;
        this.L = cVar;
    }

    public static final void P(f9a f9aVar) {
        f9aVar.E((m950) ((yvf0) f9aVar.I).get(), new ore0(((dqe0) f9aVar.K).a, "show summary after route confirmation in suggest", new vnv0(null, null)), sy60.Q2, hxx.a);
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        switch (this.D) {
            case 0:
                ((a) this.H).a(o());
                break;
        }
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        switch (this.D) {
            case 0:
                a aVar = (a) this.H;
                aVar.g.b();
                aVar.i = null;
                aVar.h = null;
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.D) {
            case 0:
                this.L = null;
                break;
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        switch (this.D) {
            case 0:
                R((b9a) obj);
                break;
            case 1:
                Q((Uri) obj);
                break;
            default:
                A((gkw0) this.F, (o2y0) obj, new dfk0(this, 1));
                break;
        }
    }

    public void Q(Uri uri) {
        m950 m950Var = (m950) this.E.get();
        PointType pointType = PointType.SOURCE;
        SourcePicker sourcePicker = SourcePicker.B_FROM_HOME;
        o501 o501Var = new o501(kyh0.address_search_modal_view_from, kyh0.address_search_modal_view_to, 14);
        D(m950Var, new jsd(pointType, sourcePicker, false, new q501(o501Var, o501Var), ((c) this.L).c().b(), "superapp_main", uri, 1280), new k0i(this, 5));
    }

    public void R(b9a b9aVar) {
        d8a d8aVar = (d8a) this.F;
        c9a c9aVar = new c9a(this, b9aVar);
        boolean z = ((ChargersOfferComposeExperiment) ((n3a) this.K).b.b()).b;
        jwf jwfVar = (jwf) this.L;
        if (!z) {
            if (jwfVar == null) {
                d8aVar.getClass();
                jwfVar = new jwf(d8aVar);
                this.L = jwfVar;
            }
            d8a d8aVar2 = (d8a) jwfVar.k;
            fva0 fva0Var = (fva0) d8aVar2.n;
            q5z.h(fva0Var);
            w030 w030Var = (w030) d8aVar2.p;
            q5z.h(w030Var);
            vxf vxfVar = (vxf) jwfVar.l;
            iwa iwaVar = (iwa) d8aVar2.v;
            q5z.h(iwaVar);
            vn9 vn9Var = (vn9) d8aVar2.C;
            q5z.h(vn9Var);
            uxf uxfVar = (uxf) jwfVar.m;
            xma xmaVar = (xma) d8aVar2.z;
            q5z.h(xmaVar);
            w8a w8aVar = (w8a) ((n3w) jwfVar.i).a;
            q8a q8aVar = (q8a) ((n3w) jwfVar.j).a;
            awa awaVar = (awa) ((n3w) jwfVar.a).a;
            r9a r9aVar = (r9a) d8aVar2.K;
            q5z.h(r9aVar);
            D(new h9a(fva0Var, w030Var, vxfVar, iwaVar, vn9Var, uxfVar, xmaVar, w8aVar, q8aVar, awaVar, r9aVar, (uxf) jwfVar.r, (uxf) jwfVar.s, (uxf) jwfVar.t, (uxf) jwfVar.u, (uxf) jwfVar.v, (uxf) jwfVar.w), new g9a(b9aVar.a, b9aVar.b, b9aVar.c), c9aVar);
            return;
        }
        if (jwfVar == null) {
            d8aVar.getClass();
            jwfVar = new jwf(d8aVar);
            this.L = jwfVar;
        }
        d8a d8aVar3 = (d8a) jwfVar.k;
        Context context = (Context) d8aVar3.a;
        q5z.h(context);
        w030 w030Var2 = (w030) d8aVar3.p;
        q5z.h(w030Var2);
        vxf vxfVar2 = (vxf) jwfVar.l;
        iwa iwaVar2 = (iwa) d8aVar3.v;
        q5z.h(iwaVar2);
        uxf uxfVar2 = (uxf) jwfVar.m;
        vn9 vn9Var2 = (vn9) d8aVar3.C;
        q5z.h(vn9Var2);
        xma xmaVar2 = (xma) d8aVar3.z;
        q5z.h(xmaVar2);
        rea0 rea0Var = (rea0) d8aVar3.E;
        q5z.h(rea0Var);
        awa awaVar2 = (awa) ((n3w) jwfVar.a).a;
        r9a r9aVar2 = (r9a) d8aVar3.K;
        q5z.h(r9aVar2);
        uxf uxfVar3 = (uxf) jwfVar.r;
        uxf uxfVar4 = (uxf) jwfVar.s;
        uxf uxfVar5 = (uxf) jwfVar.t;
        uxf uxfVar6 = (uxf) jwfVar.u;
        uxf uxfVar7 = (uxf) jwfVar.v;
        uxf uxfVar8 = (uxf) jwfVar.w;
        qaa qaaVar = (qaa) ((n3w) jwfVar.g).a;
        kaa kaaVar = (kaa) ((n3w) jwfVar.h).a;
        tla tlaVar = (tla) d8aVar3.H;
        q5z.h(tlaVar);
        D(new u7a(context, w030Var2, vxfVar2, iwaVar2, uxfVar2, vn9Var2, xmaVar2, rea0Var, awaVar2, r9aVar2, uxfVar3, uxfVar4, uxfVar5, uxfVar6, uxfVar7, uxfVar8, qaaVar, kaaVar, tlaVar), new s7a(b9aVar.a, b9aVar.b, b9aVar.c), c9aVar);
    }

    public f9a(d8a d8aVar, j6a j6aVar, a aVar, yvf0 yvf0Var, kj7 kj7Var, g6 g6Var, n3a n3aVar) {
        super(null);
        this.F = d8aVar;
        this.G = j6aVar;
        this.H = aVar;
        this.E = yvf0Var;
        this.I = kj7Var;
        this.J = g6Var;
        this.K = n3aVar;
    }

    public f9a(gkw0 gkw0Var, yvf0 yvf0Var, oep0 oep0Var, oiw0 oiw0Var, but0 but0Var, oiw0 oiw0Var2, oiw0 oiw0Var3, oiw0 oiw0Var4) {
        super(null);
        this.F = gkw0Var;
        this.E = yvf0Var;
        this.G = oep0Var;
        this.H = oiw0Var;
        this.I = but0Var;
        this.J = oiw0Var2;
        this.K = oiw0Var3;
        this.L = oiw0Var4;
    }
}
