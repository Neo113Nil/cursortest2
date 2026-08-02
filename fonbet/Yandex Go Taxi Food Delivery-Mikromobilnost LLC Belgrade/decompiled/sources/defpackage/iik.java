package defpackage;

import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class iik implements zsq0, nyi {
    public final JsonParserComponent a;

    public iik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("set");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            return new hik(((cik) jsonParserComponent.a2.getValue()).a(yf90Var, jSONObject));
        }
        if (R.equals("change_bounds")) {
            ((xhk) jsonParserComponent.X1.getValue()).getClass();
            return new gik(xhk.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        nik nikVar = b instanceof nik ? (nik) b : null;
        if (nikVar != null) {
            return ((kik) jsonParserComponent.f2.getValue()).a(yf90Var, nikVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivChangeTransition divChangeTransition) {
        boolean z = divChangeTransition instanceof hik;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((cik) jsonParserComponent.a2.getValue()).b(yf90Var, ((hik) divChangeTransition).b);
        }
        if (!(divChangeTransition instanceof gik)) {
            w511.b();
            return null;
        }
        xhk xhkVar = (xhk) jsonParserComponent.X1.getValue();
        whk whkVar = ((gik) divChangeTransition).b;
        xhkVar.getClass();
        return xhk.d(yf90Var, whkVar);
    }
}
