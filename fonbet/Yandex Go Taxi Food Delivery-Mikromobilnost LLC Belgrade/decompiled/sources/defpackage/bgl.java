package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class bgl implements zsq0, nyi {
    public final JsonParserComponent a;

    public bgl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("solid");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((yal) jsonParserComponent.D7.getValue()).getClass();
            return new zfl(yal.c(yf90Var, jSONObject));
        }
        if (R.equals("cloud")) {
            return new yfl(((vik) jsonParserComponent.j2.getValue()).a(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        ggl gglVar = b instanceof ggl ? (ggl) b : null;
        if (gglVar != null) {
            return ((dgl) jsonParserComponent.v8.getValue()).a(yf90Var, gglVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, agl aglVar) {
        boolean z = aglVar instanceof zfl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            yal yalVar = (yal) jsonParserComponent.D7.getValue();
            wal walVar = ((zfl) aglVar).b;
            yalVar.getClass();
            return yal.d(yf90Var, walVar);
        }
        if (aglVar instanceof yfl) {
            return ((vik) jsonParserComponent.j2.getValue()).b(yf90Var, ((yfl) aglVar).b);
        }
        w511.b();
        return null;
    }
}
