package defpackage;

import com.yandex.div2.DivSize;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k9l implements zsq0, nyi {
    public final JsonParserComponent a;

    public k9l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        if (hashCode != 97445748) {
            if (hashCode != 343327108) {
                if (hashCode == 1386124388 && R.equals("match_parent")) {
                    return new i9l(((ozk) jsonParserComponent.g5.getValue()).a(yf90Var, jSONObject));
                }
            } else if (R.equals("wrap_content")) {
                return new j9l(((mql) jsonParserComponent.U9.getValue()).a(yf90Var, jSONObject));
            }
        } else if (R.equals("fixed")) {
            ((tqk) jsonParserComponent.E3.getValue()).getClass();
            return new h9l(tqk.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        q9l q9lVar = b instanceof q9l ? (q9l) b : null;
        if (q9lVar != null) {
            return ((m9l) jsonParserComponent.q7.getValue()).a(yf90Var, q9lVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivSize divSize) {
        boolean z = divSize instanceof h9l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            tqk tqkVar = (tqk) jsonParserComponent.E3.getValue();
            sqk sqkVar = ((h9l) divSize).b;
            tqkVar.getClass();
            return tqk.d(yf90Var, sqkVar);
        }
        if (divSize instanceof i9l) {
            return ((ozk) jsonParserComponent.g5.getValue()).b(yf90Var, ((i9l) divSize).b);
        }
        if (divSize instanceof j9l) {
            return ((mql) jsonParserComponent.U9.getValue()).b(yf90Var, ((j9l) divSize).b);
        }
        w511.b();
        return null;
    }
}
