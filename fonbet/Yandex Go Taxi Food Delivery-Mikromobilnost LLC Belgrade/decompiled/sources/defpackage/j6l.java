package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class j6l implements zsq0, nyi {
    public final JsonParserComponent a;

    public j6l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object m6lVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        n6l n6lVar = hexVar instanceof n6l ? (n6l) hexVar : null;
        if (n6lVar != null) {
            if (n6lVar instanceof l6l) {
                R = "fixed";
            } else {
                if (!(n6lVar instanceof m6l)) {
                    w511.b();
                    return null;
                }
                R = "relative";
            }
        }
        boolean equals = R.equals("fixed");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            uqk uqkVar = (uqk) jsonParserComponent.F3.getValue();
            if (n6lVar != null) {
                if (n6lVar instanceof l6l) {
                    obj2 = ((l6l) n6lVar).a;
                } else {
                    if (!(n6lVar instanceof m6l)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((m6l) n6lVar).a;
                }
                obj3 = obj2;
            }
            uqkVar.getClass();
            m6lVar = new l6l(uqk.c(yf90Var, (wqk) obj3, jSONObject));
        } else {
            if (!R.equals("relative")) {
                throw fg90.m(jSONObject, "type", R);
            }
            w6l w6lVar = (w6l) jsonParserComponent.z6.getValue();
            if (n6lVar != null) {
                if (n6lVar instanceof l6l) {
                    obj = ((l6l) n6lVar).a;
                } else {
                    if (!(n6lVar instanceof m6l)) {
                        w511.b();
                        return null;
                    }
                    obj = ((m6l) n6lVar).a;
                }
                obj3 = obj;
            }
            w6lVar.getClass();
            m6lVar = new m6l(w6l.c(yf90Var, (y6l) obj3, jSONObject));
        }
        return m6lVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, n6l n6lVar) {
        boolean z = n6lVar instanceof l6l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            uqk uqkVar = (uqk) jsonParserComponent.F3.getValue();
            wqk wqkVar = ((l6l) n6lVar).a;
            uqkVar.getClass();
            return uqk.d(yf90Var, wqkVar);
        }
        if (!(n6lVar instanceof m6l)) {
            w511.b();
            return null;
        }
        w6l w6lVar = (w6l) jsonParserComponent.z6.getValue();
        y6l y6lVar = ((m6l) n6lVar).a;
        w6lVar.getClass();
        return w6l.d(yf90Var, y6lVar);
    }
}
