package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class bok implements zsq0, nyi {
    public final JsonParserComponent a;

    public bok(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("shape_drawable");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            return new znk(((v8l) jsonParserComponent.f7.getValue()).a(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        eok eokVar = b instanceof eok ? (eok) b : null;
        if (eokVar != null) {
            return ((dok) jsonParserComponent.f3.getValue()).a(yf90Var, eokVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, aok aokVar) {
        if (aokVar instanceof znk) {
            return ((v8l) this.a.f7.getValue()).b(yf90Var, ((znk) aokVar).b);
        }
        w511.b();
        return null;
    }
}
