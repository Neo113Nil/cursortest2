package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class o5l implements zsq0, nyi {
    public final JsonParserComponent a;

    public o5l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("fixed");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((x5l) jsonParserComponent.p6.getValue()).getClass();
            return new l5l(x5l.c(yf90Var, jSONObject));
        }
        if (R.equals("relative")) {
            ((p6l) jsonParserComponent.v6.getValue()).getClass();
            return new m5l(p6l.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        t5l t5lVar = b instanceof t5l ? (t5l) b : null;
        if (t5lVar != null) {
            return ((q5l) jsonParserComponent.o6.getValue()).a(yf90Var, t5lVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, n5l n5lVar) {
        boolean z = n5lVar instanceof l5l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            x5l x5lVar = (x5l) jsonParserComponent.p6.getValue();
            w5l w5lVar = ((l5l) n5lVar).b;
            x5lVar.getClass();
            return x5l.d(yf90Var, w5lVar);
        }
        if (!(n5lVar instanceof m5l)) {
            w511.b();
            return null;
        }
        p6l p6lVar = (p6l) jsonParserComponent.v6.getValue();
        o6l o6lVar = ((m5l) n5lVar).b;
        p6lVar.getClass();
        return p6l.d(yf90Var, o6lVar);
    }
}
