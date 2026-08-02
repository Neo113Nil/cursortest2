package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class p5l implements zsq0, nyi {
    public final JsonParserComponent a;

    public p5l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object s5lVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        t5l t5lVar = hexVar instanceof t5l ? (t5l) hexVar : null;
        if (t5lVar != null) {
            if (t5lVar instanceof r5l) {
                R = "fixed";
            } else {
                if (!(t5lVar instanceof s5l)) {
                    w511.b();
                    return null;
                }
                R = "relative";
            }
        }
        boolean equals = R.equals("fixed");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            y5l y5lVar = (y5l) jsonParserComponent.q6.getValue();
            if (t5lVar != null) {
                if (t5lVar instanceof r5l) {
                    obj2 = ((r5l) t5lVar).a;
                } else {
                    if (!(t5lVar instanceof s5l)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((s5l) t5lVar).a;
                }
                obj3 = obj2;
            }
            y5lVar.getClass();
            s5lVar = new r5l(y5l.c(yf90Var, (a6l) obj3, jSONObject));
        } else {
            if (!R.equals("relative")) {
                throw fg90.m(jSONObject, "type", R);
            }
            q6l q6lVar = (q6l) jsonParserComponent.w6.getValue();
            if (t5lVar != null) {
                if (t5lVar instanceof r5l) {
                    obj = ((r5l) t5lVar).a;
                } else {
                    if (!(t5lVar instanceof s5l)) {
                        w511.b();
                        return null;
                    }
                    obj = ((s5l) t5lVar).a;
                }
                obj3 = obj;
            }
            q6lVar.getClass();
            s5lVar = new s5l(q6l.c(yf90Var, (s6l) obj3, jSONObject));
        }
        return s5lVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, t5l t5lVar) {
        boolean z = t5lVar instanceof r5l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            y5l y5lVar = (y5l) jsonParserComponent.q6.getValue();
            a6l a6lVar = ((r5l) t5lVar).a;
            y5lVar.getClass();
            return y5l.d(yf90Var, a6lVar);
        }
        if (!(t5lVar instanceof s5l)) {
            w511.b();
            return null;
        }
        q6l q6lVar = (q6l) jsonParserComponent.w6.getValue();
        s6l s6lVar = ((s5l) t5lVar).a;
        q6lVar.getClass();
        return q6l.d(yf90Var, s6lVar);
    }
}
