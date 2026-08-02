package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class i6l implements zsq0, nyi {
    public final JsonParserComponent a;

    public i6l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("fixed");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((tqk) jsonParserComponent.E3.getValue()).getClass();
            return new f6l(tqk.c(yf90Var, jSONObject));
        }
        if (R.equals("relative")) {
            ((v6l) jsonParserComponent.y6.getValue()).getClass();
            return new g6l(v6l.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        n6l n6lVar = b instanceof n6l ? (n6l) b : null;
        if (n6lVar != null) {
            return ((k6l) jsonParserComponent.u6.getValue()).a(yf90Var, n6lVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, h6l h6lVar) {
        boolean z = h6lVar instanceof f6l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            tqk tqkVar = (tqk) jsonParserComponent.E3.getValue();
            sqk sqkVar = ((f6l) h6lVar).b;
            tqkVar.getClass();
            return tqk.d(yf90Var, sqkVar);
        }
        if (!(h6lVar instanceof g6l)) {
            w511.b();
            return null;
        }
        v6l v6lVar = (v6l) jsonParserComponent.y6.getValue();
        u6l u6lVar = ((g6l) h6lVar).b;
        v6lVar.getClass();
        return v6l.d(yf90Var, u6lVar);
    }
}
