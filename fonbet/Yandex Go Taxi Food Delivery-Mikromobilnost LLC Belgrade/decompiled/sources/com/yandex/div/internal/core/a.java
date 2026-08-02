package com.yandex.div.internal.core;

import com.yandex.div.core.expression.local.b;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivSeparator;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.cbl;
import defpackage.cjk;
import defpackage.clk;
import defpackage.cxk;
import defpackage.dbl;
import defpackage.ffl;
import defpackage.fg90;
import defpackage.hal;
import defpackage.hsk;
import defpackage.i2k;
import defpackage.j2k;
import defpackage.k2k;
import defpackage.kdl;
import defpackage.l2k;
import defpackage.l6o;
import defpackage.m2k;
import defpackage.m3k;
import defpackage.mdl;
import defpackage.muk;
import defpackage.n2k;
import defpackage.o2k;
import defpackage.p2k;
import defpackage.psk;
import defpackage.q2k;
import defpackage.r2k;
import defpackage.rvo;
import defpackage.s2k;
import defpackage.scc;
import defpackage.sls;
import defpackage.t1l;
import defpackage.t2k;
import defpackage.tcc;
import defpackage.tvo;
import defpackage.u2k;
import defpackage.uxd;
import defpackage.v2k;
import defpackage.w2k;
import defpackage.w511;
import defpackage.x2k;
import defpackage.x7l;
import defpackage.xrk;
import defpackage.y2k;
import defpackage.ycl;
import defpackage.ynl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [cxk] */
    public static final ArrayList a(DivCollectionItemBuilder divCollectionItemBuilder, rvo rvoVar) {
        Object obj;
        JSONArray jSONArray = (JSONArray) divCollectionItemBuilder.a.a(rvoVar);
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            rvo f = f(divCollectionItemBuilder, jSONArray.get(i), i, rvoVar);
            if (f != null) {
                Iterator it = divCollectionItemBuilder.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Boolean) ((cjk) obj).c.a(f)).booleanValue()) {
                        break;
                    }
                }
                cjk cjkVar = (cjk) obj;
                if (cjkVar != null) {
                    m3k m3kVar = cjkVar.a;
                    Expression expression = cjkVar.b;
                    r5 = new cxk(d(m3kVar, expression != null ? (String) expression.a(f) : null), f);
                }
            }
            if (r5 != null) {
                arrayList.add(r5);
            }
        }
        return arrayList;
    }

    public static final List b(DivGallery divGallery, rvo rvoVar) {
        return c(divGallery.u, divGallery.s, rvoVar);
    }

    public static final List c(List list, DivCollectionItemBuilder divCollectionItemBuilder, rvo rvoVar) {
        return divCollectionItemBuilder != null ? a(divCollectionItemBuilder, rvoVar) : list != null ? h(list, rvoVar) : EmptyList.a;
    }

    public static final m3k d(m3k m3kVar, String str) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (m3kVar instanceof n2k) {
            return new n2k(psk.B(((n2k) m3kVar).c, null, str, -67108865));
        }
        if (m3kVar instanceof l2k) {
            xrk xrkVar = ((l2k) m3kVar).c;
            int i = xrk.b0;
            return new l2k(new xrk(xrkVar.a, xrkVar.b, xrkVar.c, xrkVar.d, xrkVar.e, xrkVar.f, xrkVar.g, xrkVar.h, xrkVar.i, xrkVar.j, xrkVar.k, xrkVar.l, xrkVar.m, xrkVar.n, xrkVar.o, xrkVar.p, xrkVar.q, xrkVar.r, xrkVar.s, xrkVar.t, xrkVar.u, xrkVar.v, xrkVar.w, xrkVar.x, str, xrkVar.z, xrkVar.A, xrkVar.B, xrkVar.C, xrkVar.D, xrkVar.E, xrkVar.F, xrkVar.G, xrkVar.H, xrkVar.I, xrkVar.J, xrkVar.K, xrkVar.L, xrkVar.M, xrkVar.N, xrkVar.O, xrkVar.P, xrkVar.Q, xrkVar.R, xrkVar.S, xrkVar.T, xrkVar.U, xrkVar.V, xrkVar.W, xrkVar.X, xrkVar.Y, xrkVar.Z));
        }
        if (m3kVar instanceof x2k) {
            return new x2k(ffl.B(((x2k) m3kVar).c, null, str, -1073741825));
        }
        if (m3kVar instanceof s2k) {
            DivSeparator divSeparator = ((s2k) m3kVar).c;
            return new s2k(new DivSeparator(divSeparator.a, divSeparator.b, divSeparator.c, divSeparator.d, divSeparator.e, divSeparator.f, divSeparator.g, divSeparator.h, divSeparator.i, divSeparator.j, divSeparator.k, divSeparator.l, divSeparator.m, divSeparator.n, divSeparator.o, divSeparator.p, divSeparator.q, divSeparator.r, divSeparator.s, divSeparator.t, divSeparator.u, str, divSeparator.w, divSeparator.x, divSeparator.y, divSeparator.z, divSeparator.A, divSeparator.B, divSeparator.C, divSeparator.D, divSeparator.E, divSeparator.F, divSeparator.G, divSeparator.H, divSeparator.I, divSeparator.J, divSeparator.K, divSeparator.L, divSeparator.M, divSeparator.N, divSeparator.O, divSeparator.P, divSeparator.Q, divSeparator.R));
        }
        if (m3kVar instanceof i2k) {
            DivContainer divContainer = ((i2k) m3kVar).c;
            List list = divContainer.B;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(e((m3k) it.next()));
                }
            } else {
                arrayList = null;
            }
            return new i2k(DivContainer.B(divContainer, null, str, arrayList, -150994945));
        }
        if (m3kVar instanceof m2k) {
            hsk hskVar = ((m2k) m3kVar).c;
            List list3 = hskVar.y;
            if (list3 != null) {
                List list4 = list3;
                arrayList2 = new ArrayList(tcc.n(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(e((m3k) it2.next()));
                }
            }
            return new m2k(hsk.B(hskVar, str, arrayList2, -25165825));
        }
        if (m3kVar instanceof k2k) {
            DivGallery divGallery = ((k2k) m3kVar).c;
            List list5 = divGallery.u;
            if (list5 != null) {
                List list6 = list5;
                arrayList2 = new ArrayList(tcc.n(list6, 10));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(e((m3k) it3.next()));
                }
            }
            return new k2k(DivGallery.B(divGallery, str, arrayList2, -1179649));
        }
        if (m3kVar instanceof q2k) {
            t1l t1lVar = ((q2k) m3kVar).c;
            List list7 = t1lVar.t;
            if (list7 != null) {
                List list8 = list7;
                arrayList2 = new ArrayList(tcc.n(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(e((m3k) it4.next()));
                }
            }
            return new q2k(t1l.B(t1lVar, str, arrayList2, -557057));
        }
        if (m3kVar instanceof w2k) {
            mdl mdlVar = ((w2k) m3kVar).c;
            List<kdl> list9 = mdlVar.q;
            ArrayList arrayList3 = new ArrayList(tcc.n(list9, 10));
            for (kdl kdlVar : list9) {
                arrayList3.add(kdl.a(kdlVar, e(kdlVar.a)));
            }
            return new w2k(mdl.B(mdlVar, str, arrayList3, -98305));
        }
        if (m3kVar instanceof u2k) {
            dbl dblVar = ((u2k) m3kVar).c;
            List<cbl> list10 = dblVar.I;
            ArrayList arrayList4 = new ArrayList(tcc.n(list10, 10));
            for (cbl cblVar : list10) {
                m3k m3kVar2 = cblVar.c;
                arrayList4.add(new cbl(cblVar.a, cblVar.b, m3kVar2 != null ? d(m3kVar2, m3kVar2.d().getId()) : null, cblVar.d, cblVar.e));
            }
            return new u2k(dbl.B(dblVar, str, str, arrayList4, -8421377));
        }
        if (m3kVar instanceof j2k) {
            return new j2k(clk.B(((j2k) m3kVar).c, str, null, -32769));
        }
        if (m3kVar instanceof o2k) {
            DivIndicator divIndicator = ((o2k) m3kVar).c;
            return new o2k(new DivIndicator(divIndicator.a, divIndicator.b, divIndicator.c, divIndicator.d, divIndicator.e, divIndicator.f, divIndicator.g, divIndicator.h, divIndicator.i, divIndicator.j, divIndicator.k, divIndicator.l, divIndicator.m, divIndicator.n, divIndicator.o, divIndicator.p, divIndicator.q, str, divIndicator.s, divIndicator.t, divIndicator.u, divIndicator.v, divIndicator.w, divIndicator.x, divIndicator.y, divIndicator.z, divIndicator.A, divIndicator.B, divIndicator.C, divIndicator.D, divIndicator.E, divIndicator.F, divIndicator.G, divIndicator.H, divIndicator.I, divIndicator.J, divIndicator.K, divIndicator.L, divIndicator.M, divIndicator.N, divIndicator.O, divIndicator.P, divIndicator.Q, divIndicator.R, divIndicator.S));
        }
        if (m3kVar instanceof t2k) {
            return new t2k(hal.B(((t2k) m3kVar).c, str));
        }
        if (m3kVar instanceof p2k) {
            muk mukVar = ((p2k) m3kVar).c;
            return new p2k(new muk(mukVar.a, mukVar.b, mukVar.c, mukVar.d, mukVar.e, mukVar.f, mukVar.g, mukVar.h, mukVar.i, mukVar.j, mukVar.k, mukVar.l, mukVar.m, mukVar.n, mukVar.o, mukVar.p, mukVar.q, mukVar.r, mukVar.s, mukVar.t, mukVar.u, mukVar.v, mukVar.w, mukVar.x, mukVar.y, mukVar.z, str, mukVar.B, mukVar.C, mukVar.D, mukVar.E, mukVar.F, mukVar.G, mukVar.H, mukVar.I, mukVar.J, mukVar.K, mukVar.L, mukVar.M, mukVar.N, mukVar.O, mukVar.P, mukVar.Q, mukVar.R, mukVar.S, mukVar.T, mukVar.U, mukVar.V, mukVar.W, mukVar.X, mukVar.Y, mukVar.Z, mukVar.a0, mukVar.b0, mukVar.c0, mukVar.d0, mukVar.e0, mukVar.f0, mukVar.g0, mukVar.h0));
        }
        if (m3kVar instanceof r2k) {
            return new r2k(x7l.B(((r2k) m3kVar).c, str));
        }
        if (m3kVar instanceof y2k) {
            return new y2k(ynl.B(((y2k) m3kVar).c, str));
        }
        if (m3kVar instanceof v2k) {
            ycl yclVar = ((v2k) m3kVar).c;
            return new v2k(new ycl(yclVar.a, yclVar.b, yclVar.c, yclVar.d, yclVar.e, yclVar.f, yclVar.g, yclVar.h, yclVar.i, yclVar.j, yclVar.k, yclVar.l, yclVar.m, str, yclVar.o, yclVar.p, yclVar.q, yclVar.r, yclVar.s, yclVar.t, yclVar.u, yclVar.v, yclVar.w, yclVar.x, yclVar.y, yclVar.z, yclVar.A, yclVar.B, yclVar.C, yclVar.D, yclVar.E, yclVar.F, yclVar.G, yclVar.H, yclVar.I, yclVar.J));
        }
        w511.b();
        return null;
    }

    public static /* synthetic */ m3k e(m3k m3kVar) {
        return d(m3kVar, m3kVar.d().getId());
    }

    public static final rvo f(final DivCollectionItemBuilder divCollectionItemBuilder, Object obj, final int i, rvo rvoVar) {
        final JSONObject jSONObject;
        final tvo y = bvf0.y(rvoVar);
        if (y == null) {
            return rvoVar;
        }
        JSONObject jSONObject2 = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject2 == null) {
            l6o l6oVar = y.f;
            ParsingException parsingException = fg90.a;
            ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
            StringBuilder t = b64.t(i, "Item builder data at ", " position has wrong type: ");
            t.append(obj.getClass().getName());
            l6oVar.e(new ParsingException(parsingExceptionReason, t.toString(), null, null, null, 28));
            jSONObject = null;
        } else {
            jSONObject = jSONObject2;
        }
        if (jSONObject == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(':');
        sb.append(i);
        final String sb2 = sb.toString();
        b bVar = y.c;
        String d = y.d(sb2);
        sls slsVar = new sls() { // from class: com.yandex.div.internal.core.DivCollectionExtensionsKt$getItemResolver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return y.g(sb2, new uxd(kotlin.collections.b.i(new Pair(DivCollectionItemBuilder.this.b, jSONObject), new Pair("index", Long.valueOf(i)))));
            }
        };
        LinkedHashMap linkedHashMap = bVar.i;
        Object obj2 = linkedHashMap.get(d);
        if (obj2 == null) {
            obj2 = (rvo) slsVar.invoke();
            linkedHashMap.put(d, obj2);
        }
        return (rvo) obj2;
    }

    public static final ArrayList g(mdl mdlVar, rvo rvoVar) {
        List list = mdlVar.q;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new cxk(((kdl) it.next()).a, rvoVar));
        }
        return arrayList;
    }

    public static final ArrayList h(List list, rvo rvoVar) {
        rvo rvoVar2;
        ArrayList f = com.yandex.div.core.state.a.f(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            m3k m3kVar = (m3k) obj;
            tvo y = bvf0.y(rvoVar);
            if (y != null) {
                rvoVar2 = y.c.e(m3kVar, rvoVar, y.d((String) f.get(i))).a;
                if (rvoVar2 != null) {
                    arrayList.add(new cxk(m3kVar, rvoVar2));
                    i = i2;
                }
            }
            rvoVar2 = rvoVar;
            arrayList.add(new cxk(m3kVar, rvoVar2));
            i = i2;
        }
        return arrayList;
    }
}
