package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class cek implements zsq0, nyi {
    public final JsonParserComponent a;

    public cek(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("color_animator");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            return new wdk(((mjk) jsonParserComponent.s2.getValue()).a(yf90Var, jSONObject));
        }
        if (R.equals("number_animator")) {
            return new xdk(((j0l) jsonParserComponent.p5.getValue()).a(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        hek hekVar = b instanceof hek ? (hek) b : null;
        if (hekVar != null) {
            return ((eek) jsonParserComponent.E1.getValue()).a(yf90Var, hekVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ydk ydkVar) {
        boolean z = ydkVar instanceof wdk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((mjk) jsonParserComponent.s2.getValue()).b(yf90Var, ((wdk) ydkVar).b);
        }
        if (ydkVar instanceof xdk) {
            return ((j0l) jsonParserComponent.p5.getValue()).b(yf90Var, ((xdk) ydkVar).b);
        }
        w511.b();
        return null;
    }
}
