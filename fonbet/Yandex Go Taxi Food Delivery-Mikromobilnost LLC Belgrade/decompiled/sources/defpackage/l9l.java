package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l9l implements zsq0, nyi {
    public final JsonParserComponent a;

    public l9l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object n9lVar;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        q9l q9lVar = hexVar instanceof q9l ? (q9l) hexVar : null;
        if (q9lVar != null) {
            if (q9lVar instanceof n9l) {
                R = "fixed";
            } else if (q9lVar instanceof o9l) {
                R = "match_parent";
            } else {
                if (!(q9lVar instanceof p9l)) {
                    w511.b();
                    return null;
                }
                R = "wrap_content";
            }
        }
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        if (hashCode == 97445748) {
            if (R.equals("fixed")) {
                uqk uqkVar = (uqk) jsonParserComponent.F3.getValue();
                Object a = q9lVar != null ? q9lVar.a() : null;
                uqkVar.getClass();
                n9lVar = new n9l(uqk.c(yf90Var, (wqk) a, jSONObject));
                return n9lVar;
            }
            throw fg90.m(jSONObject, "type", R);
        }
        if (hashCode == 343327108) {
            if (R.equals("wrap_content")) {
                n9lVar = new p9l(((nql) jsonParserComponent.V9.getValue()).c(yf90Var, (pql) (q9lVar != null ? q9lVar.a() : null), jSONObject));
                return n9lVar;
            }
            throw fg90.m(jSONObject, "type", R);
        }
        if (hashCode == 1386124388 && R.equals("match_parent")) {
            n9lVar = new o9l(((pzk) jsonParserComponent.h5.getValue()).c(yf90Var, (rzk) (q9lVar != null ? q9lVar.a() : null), jSONObject));
            return n9lVar;
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, q9l q9lVar) {
        boolean z = q9lVar instanceof n9l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            uqk uqkVar = (uqk) jsonParserComponent.F3.getValue();
            wqk wqkVar = ((n9l) q9lVar).a;
            uqkVar.getClass();
            return uqk.d(yf90Var, wqkVar);
        }
        if (q9lVar instanceof o9l) {
            return ((pzk) jsonParserComponent.h5.getValue()).b(yf90Var, ((o9l) q9lVar).a);
        }
        if (q9lVar instanceof p9l) {
            return ((nql) jsonParserComponent.V9.getValue()).b(yf90Var, ((p9l) q9lVar).a);
        }
        w511.b();
        return null;
    }
}
