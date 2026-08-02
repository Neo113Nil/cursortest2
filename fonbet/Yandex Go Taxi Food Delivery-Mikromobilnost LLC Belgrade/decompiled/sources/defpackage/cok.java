package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cok implements zsq0, nyi {
    public final JsonParserComponent a;

    public cok(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        y8l y8lVar = null;
        eok eokVar = hexVar instanceof eok ? (eok) hexVar : null;
        if (eokVar != null) {
            if (!(eokVar instanceof eok)) {
                w511.b();
                return null;
            }
            R = "shape_drawable";
        }
        if (!R.equals("shape_drawable")) {
            throw fg90.m(jSONObject, "type", R);
        }
        w8l w8lVar = (w8l) this.a.g7.getValue();
        if (eokVar != null) {
            if (!(eokVar instanceof eok)) {
                w511.b();
                return null;
            }
            y8lVar = eokVar.a;
        }
        return new eok(w8lVar.c(yf90Var, y8lVar, jSONObject));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        eok eokVar = (eok) obj;
        if (eokVar instanceof eok) {
            return ((w8l) this.a.g7.getValue()).b(yf90Var, eokVar.a);
        }
        w511.b();
        return null;
    }
}
