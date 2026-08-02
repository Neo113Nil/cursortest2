package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.drm0;
import xsna.epx;

/* loaded from: classes10.dex */
public final class qh1 {
    public final kg a;
    public final gw2 b;
    public final qs1 c;
    public final ez d;
    public final x30 e;
    public final ki1 f;

    public qh1(kg kgVar, gw2 gw2Var, qs1 qs1Var, ez ezVar, x30 x30Var, ki1 ki1Var) {
        this.a = kgVar;
        this.b = gw2Var;
        this.c = qs1Var;
        this.d = ezVar;
        this.e = x30Var;
        this.f = ki1Var;
    }

    public final b80 a() {
        t80 t80Var;
        String d;
        String c;
        c80 c80Var;
        m50 a = this.a.a();
        gw2 gw2Var = this.b;
        bv1 bv1Var = gw2Var.b;
        Context context = gw2Var.a;
        bv1Var.getClass();
        av1 a2 = bv1.a(context);
        boolean z = false;
        if (epx.f(a2, yu1.a)) {
            t80Var = new t80(true, EmptyList.b);
        } else {
            if (!(a2 instanceof zu1)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((zu1) a2).a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((xb1) it.next()).getMessage());
            }
            t80Var = new t80(false, arrayList);
        }
        qs1 qs1Var = this.c;
        qs1Var.getClass();
        ArrayList a3 = qs1Var.a.a(nr1.a());
        ez ezVar = this.d;
        boolean a4 = ezVar.a.a();
        Boolean b = ezVar.a.b();
        Boolean d2 = ezVar.a.d();
        String b2 = ((zw) ezVar.b).b();
        if ((b2 != null && !drm0.N(b2)) || (((d = ((zw) ezVar.b).d()) != null && !drm0.N(d)) || ((c = ((zw) ezVar.b).c()) != null && !drm0.N(c)))) {
            z = true;
        }
        t50 t50Var = new t50(a4, b, d2, z);
        u70 u70Var = new u70(this.e.a.c());
        ki1 ki1Var = this.f;
        ki1Var.getClass();
        synchronized (ki1.c) {
            c80Var = !fv1.b ? null : new c80(ki1Var.a.b(), ki1Var.b.b());
        }
        return new b80(a, t80Var, a3, t50Var, u70Var, c80Var);
    }
}
