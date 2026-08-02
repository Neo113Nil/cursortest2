package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nfl implements zsq0, nyi {
    public final JsonParserComponent a;

    public nfl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("gradient");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            return new kfl(((yyk) jsonParserComponent.a5.getValue()).a(yf90Var, jSONObject));
        }
        if (R.equals("radial_gradient")) {
            return new lfl(((b6l) jsonParserComponent.B6.getValue()).a(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        sfl sflVar = b instanceof sfl ? (sfl) b : null;
        if (sflVar != null) {
            return ((pfl) jsonParserComponent.s8.getValue()).a(yf90Var, sflVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, mfl mflVar) {
        boolean z = mflVar instanceof kfl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((yyk) jsonParserComponent.a5.getValue()).b(yf90Var, ((kfl) mflVar).b);
        }
        if (mflVar instanceof lfl) {
            return ((b6l) jsonParserComponent.B6.getValue()).b(yf90Var, ((lfl) mflVar).b);
        }
        w511.b();
        return null;
    }
}
