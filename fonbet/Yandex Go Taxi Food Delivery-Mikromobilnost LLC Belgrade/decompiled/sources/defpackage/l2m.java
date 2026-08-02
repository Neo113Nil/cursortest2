package defpackage;

import java.util.Map;
import kotlin.a;

/* loaded from: classes9.dex */
public final class l2m {
    public final sls a;
    public final sls b;
    public final i3y c;

    public l2m(sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
        this.c = a.a(new sbc(14, this));
    }

    public static void a(odx odxVar, ywl ywlVar, u1m u1mVar, Map map, String str, String str2) {
        sf90 A = bvf0.A(odxVar.a);
        q1m q1mVar = new q1m(ywlVar);
        w1m w1mVar = new w1m(u1mVar);
        if (str2 == null) {
            str2 = (String) map.get("x-market-req-id");
        }
        A.e(q1mVar, w1mVar, new e7j0(str2), new nez(str));
    }

    public final k2m b(u1m u1mVar, ywl ywlVar, String str) {
        ndx ndxVar = (ndx) this.c.getValue();
        zcx a = tje.a(ndxVar.a, new dq0(6, ndxVar));
        return new k2m(new odx(a, gtq0.B(a.b, qoi0.a(h2m.class))), this, ywlVar, u1mVar, str);
    }

    public l2m(d0m d0mVar, uyg uygVar) {
        this(new sbc(13, d0mVar), new sbc(15, uygVar));
    }
}
