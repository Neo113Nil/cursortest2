package com.yandex.div.core.expression.local;

import com.yandex.div.core.state.DivPathUtils$getIds$2;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import defpackage.cbl;
import defpackage.cxk;
import defpackage.dbl;
import defpackage.h6x0;
import defpackage.i2k;
import defpackage.ibl;
import defpackage.j2k;
import defpackage.jl40;
import defpackage.k2k;
import defpackage.kdl;
import defpackage.l2k;
import defpackage.m2k;
import defpackage.m3k;
import defpackage.mdl;
import defpackage.n2k;
import defpackage.o2k;
import defpackage.p2k;
import defpackage.q2k;
import defpackage.r2k;
import defpackage.s2k;
import defpackage.scc;
import defpackage.t1l;
import defpackage.t2k;
import defpackage.tls;
import defpackage.tvo;
import defpackage.u2k;
import defpackage.v2k;
import defpackage.w2k;
import defpackage.x2k;
import defpackage.y2k;
import defpackage.yuf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {
    public final ibl a;
    public final h6x0 b;

    public a(ibl iblVar, h6x0 h6x0Var) {
        this.a = iblVar;
        this.b = h6x0Var;
    }

    public static com.yandex.div.core.expression.a a(m3k m3kVar, Div2View div2View, com.yandex.div.core.state.b bVar, com.yandex.div.core.expression.a aVar) {
        com.yandex.div.core.expression.a e = div2View.getRuntimeStore().e(m3kVar, aVar.a, bVar.b());
        yuf0 yuf0Var = e.c;
        if (yuf0Var != null) {
            yuf0Var.H(div2View);
        }
        return e;
    }

    public final void b(m3k m3kVar, Div2View div2View, com.yandex.div.core.state.b bVar, com.yandex.div.core.expression.a aVar) {
        if (m3kVar instanceof i2k) {
            DivContainer divContainer = ((i2k) m3kVar).c;
            d(m3kVar, div2View, divContainer.B, divContainer.z, bVar, aVar);
            return;
        }
        if (m3kVar instanceof m2k) {
            d(m3kVar, div2View, ((m2k) m3kVar).c.y, null, bVar, aVar);
            return;
        }
        if (m3kVar instanceof k2k) {
            DivGallery divGallery = ((k2k) m3kVar).c;
            d(m3kVar, div2View, divGallery.u, divGallery.s, bVar, aVar);
            return;
        }
        if (m3kVar instanceof q2k) {
            t1l t1lVar = ((q2k) m3kVar).c;
            d(m3kVar, div2View, t1lVar.t, t1lVar.r, bVar, aVar);
            return;
        }
        if (m3kVar instanceof u2k) {
            u2k u2kVar = (u2k) m3kVar;
            e(u2kVar.c, div2View, bVar, a(u2kVar, div2View, bVar, aVar));
            return;
        }
        if (m3kVar instanceof w2k) {
            w2k w2kVar = (w2k) m3kVar;
            f(w2kVar.c, div2View, bVar, a(w2kVar, div2View, bVar, aVar));
            return;
        }
        if (m3kVar instanceof j2k) {
            a(m3kVar, div2View, bVar, aVar);
            return;
        }
        if (m3kVar instanceof l2k) {
            a(m3kVar, div2View, bVar, aVar);
            return;
        }
        if (m3kVar instanceof n2k) {
            a(m3kVar, div2View, bVar, aVar);
            return;
        }
        if (m3kVar instanceof o2k) {
            a(m3kVar, div2View, bVar, aVar);
            return;
        }
        if (m3kVar instanceof p2k) {
            a(m3kVar, div2View, bVar, aVar);
            return;
        }
        if (m3kVar instanceof r2k) {
            a(m3kVar, div2View, bVar, aVar);
            return;
        }
        if (m3kVar instanceof s2k) {
            a(m3kVar, div2View, bVar, aVar);
            return;
        }
        if (m3kVar instanceof t2k) {
            a(m3kVar, div2View, bVar, aVar);
            return;
        }
        if (m3kVar instanceof x2k) {
            a(m3kVar, div2View, bVar, aVar);
        } else if (m3kVar instanceof y2k) {
            a(m3kVar, div2View, bVar, aVar);
        } else if (m3kVar instanceof v2k) {
            a(m3kVar, div2View, bVar, aVar);
        }
    }

    public final void c(m3k m3kVar, final Div2View div2View, com.yandex.div.core.state.b bVar, com.yandex.div.core.expression.a aVar, boolean z) {
        if (z) {
            b(m3kVar, div2View, bVar, aVar);
            return;
        }
        div2View.getRuntimeStore().f(div2View.getRuntimeStore().e(m3kVar, aVar.a, bVar.b()), bVar, new tls() { // from class: com.yandex.div.core.expression.local.DivRuntimeVisitor$visitChild$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Div2View div2View2 = Div2View.this;
                yuf0 yuf0Var = ((com.yandex.div.core.expression.a) obj).c;
                if (yuf0Var != null) {
                    yuf0Var.m(div2View2);
                }
                return zy11.a;
            }
        });
    }

    public final void d(m3k m3kVar, Div2View div2View, List list, DivCollectionItemBuilder divCollectionItemBuilder, com.yandex.div.core.state.b bVar, com.yandex.div.core.expression.a aVar) {
        com.yandex.div.core.expression.a a = a(m3kVar, div2View, bVar, aVar);
        tvo tvoVar = a.a;
        int i = 0;
        if (divCollectionItemBuilder == null) {
            if (list != null) {
                ArrayList f = com.yandex.div.core.state.a.f(list);
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    b((m3k) obj, div2View, bVar.a((String) f.get(i)), a);
                    i = i2;
                }
                return;
            }
            return;
        }
        ArrayList a2 = com.yandex.div.internal.core.a.a(divCollectionItemBuilder, tvoVar);
        ArrayList i3 = com.yandex.div.core.state.a.i(a2);
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            cxk cxkVar = (cxk) next;
            com.yandex.div.core.state.b a3 = bVar.a((String) i3.get(i));
            com.yandex.div.core.expression.a a4 = div2View.getRuntimeStore().a(a3, cxkVar.a, cxkVar.b, tvoVar);
            m3k m3kVar2 = cxkVar.a;
            if (a4 == null) {
                a4 = a;
            }
            b(m3kVar2, div2View, a3, a4);
            i = i4;
        }
    }

    public final void e(dbl dblVar, Div2View div2View, com.yandex.div.core.state.b bVar, com.yandex.div.core.expression.a aVar) {
        a aVar2;
        Div2View div2View2;
        com.yandex.div.core.expression.a aVar3;
        tvo tvoVar = aVar.a;
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.e());
        sb.append('/');
        List list = bVar.c;
        sb.append((String) kotlin.collections.a.Z(list));
        String b = this.a.b(dblVar, div2View, tvoVar, sb.toString());
        for (cbl cblVar : dblVar.I) {
            m3k m3kVar = cblVar.c;
            String str = cblVar.d;
            if (m3kVar == null) {
                aVar2 = this;
                div2View2 = div2View;
                aVar3 = aVar;
            } else {
                com.yandex.div.core.state.b a = com.yandex.div.core.state.a.a(bVar, (String) kotlin.collections.a.Z(list), cblVar, str);
                boolean l = jl40.l(str, b);
                aVar2 = this;
                div2View2 = div2View;
                aVar3 = aVar;
                aVar2.c(m3kVar, div2View2, a, aVar3, l);
            }
            this = aVar2;
            div2View = div2View2;
            aVar = aVar3;
        }
    }

    public final void f(mdl mdlVar, Div2View div2View, com.yandex.div.core.state.b bVar, com.yandex.div.core.expression.a aVar) {
        com.yandex.div.core.expression.a aVar2;
        int i;
        ArrayList g;
        boolean z;
        a aVar3;
        Div2View div2View2;
        String str = div2View.getDivTag().a;
        String b = bVar.b();
        Map map = (Map) this.b.a.get(str);
        Integer num = map != null ? (Integer) map.get(b) : null;
        if (num != null) {
            i = num.intValue();
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            long longValue = ((Number) mdlVar.y.a(aVar2.a)).longValue();
            long j = longValue >> 31;
            i = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        g = com.yandex.div.core.state.a.g(mdlVar.q, DivRuntimeVisitor$visitTabs$ids$1.w, DivPathUtils$getIds$2.w);
        int i2 = 0;
        for (Object obj : mdlVar.q) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            m3k m3kVar = ((kdl) obj).a;
            com.yandex.div.core.state.b a = bVar.a((String) g.get(i2));
            if (i == i2) {
                z = true;
                div2View2 = div2View;
                aVar3 = this;
            } else {
                z = false;
                aVar3 = this;
                div2View2 = div2View;
            }
            aVar3.c(m3kVar, div2View2, a, aVar2, z);
            aVar2 = aVar;
            i2 = i3;
        }
    }
}
