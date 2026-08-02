package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class c1l implements zsq0, nyi {
    public final JsonParserComponent a;

    public c1l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object o1lVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        q1l q1lVar = hexVar instanceof q1l ? (q1l) hexVar : null;
        if (q1lVar != null) {
            if (q1lVar instanceof p1l) {
                R = "slide";
            } else {
                if (!(q1lVar instanceof o1l)) {
                    w511.b();
                    return null;
                }
                R = "overlap";
            }
        }
        boolean equals = R.equals("slide");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            l1l l1lVar = (l1l) jsonParserComponent.C5.getValue();
            if (q1lVar != null) {
                if (q1lVar instanceof p1l) {
                    obj2 = ((p1l) q1lVar).a;
                } else {
                    if (!(q1lVar instanceof o1l)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((o1l) q1lVar).a;
                }
                obj3 = obj2;
            }
            l1lVar.getClass();
            o1lVar = new p1l(l1l.c(yf90Var, (n1l) obj3, jSONObject));
        } else {
            if (!R.equals("overlap")) {
                throw fg90.m(jSONObject, "type", R);
            }
            g1l g1lVar = (g1l) jsonParserComponent.z5.getValue();
            if (q1lVar != null) {
                if (q1lVar instanceof p1l) {
                    obj = ((p1l) q1lVar).a;
                } else {
                    if (!(q1lVar instanceof o1l)) {
                        w511.b();
                        return null;
                    }
                    obj = ((o1l) q1lVar).a;
                }
                obj3 = obj;
            }
            g1lVar.getClass();
            o1lVar = new o1l(g1l.c(yf90Var, (i1l) obj3, jSONObject));
        }
        return o1lVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, q1l q1lVar) {
        boolean z = q1lVar instanceof p1l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            l1l l1lVar = (l1l) jsonParserComponent.C5.getValue();
            n1l n1lVar = ((p1l) q1lVar).a;
            l1lVar.getClass();
            return l1l.d(yf90Var, n1lVar);
        }
        if (!(q1lVar instanceof o1l)) {
            w511.b();
            return null;
        }
        g1l g1lVar = (g1l) jsonParserComponent.z5.getValue();
        i1l i1lVar = ((o1l) q1lVar).a;
        g1lVar.getClass();
        return g1l.d(yf90Var, i1lVar);
    }
}
