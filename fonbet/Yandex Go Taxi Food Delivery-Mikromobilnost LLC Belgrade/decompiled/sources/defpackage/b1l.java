package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class b1l implements zsq0, nyi {
    public final JsonParserComponent a;

    public b1l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("slide");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((k1l) jsonParserComponent.B5.getValue()).getClass();
            return new z0l(k1l.c(yf90Var, jSONObject));
        }
        if (R.equals("overlap")) {
            ((f1l) jsonParserComponent.y5.getValue()).getClass();
            return new y0l(f1l.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        q1l q1lVar = b instanceof q1l ? (q1l) b : null;
        if (q1lVar != null) {
            return ((d1l) jsonParserComponent.G5.getValue()).a(yf90Var, q1lVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, a1l a1lVar) {
        boolean z = a1lVar instanceof z0l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            k1l k1lVar = (k1l) jsonParserComponent.B5.getValue();
            j1l j1lVar = ((z0l) a1lVar).b;
            k1lVar.getClass();
            return k1l.d(yf90Var, j1lVar);
        }
        if (!(a1lVar instanceof y0l)) {
            w511.b();
            return null;
        }
        f1l f1lVar = (f1l) jsonParserComponent.y5.getValue();
        e1l e1lVar = ((y0l) a1lVar).b;
        f1lVar.getClass();
        return f1l.d(yf90Var, e1lVar);
    }
}
