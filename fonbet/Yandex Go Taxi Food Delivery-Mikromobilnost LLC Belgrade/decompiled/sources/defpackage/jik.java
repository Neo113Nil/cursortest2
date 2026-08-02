package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class jik implements zsq0, nyi {
    public final JsonParserComponent a;

    public jik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object likVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        nik nikVar = hexVar instanceof nik ? (nik) hexVar : null;
        if (nikVar != null) {
            if (nikVar instanceof mik) {
                R = "set";
            } else {
                if (!(nikVar instanceof lik)) {
                    w511.b();
                    return null;
                }
                R = "change_bounds";
            }
        }
        boolean equals = R.equals("set");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            dik dikVar = (dik) jsonParserComponent.b2.getValue();
            if (nikVar != null) {
                if (nikVar instanceof mik) {
                    obj2 = ((mik) nikVar).a;
                } else {
                    if (!(nikVar instanceof lik)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((lik) nikVar).a;
                }
                obj3 = obj2;
            }
            likVar = new mik(dikVar.c(yf90Var, (fik) obj3, jSONObject));
        } else {
            if (!R.equals("change_bounds")) {
                throw fg90.m(jSONObject, "type", R);
            }
            yhk yhkVar = (yhk) jsonParserComponent.Y1.getValue();
            if (nikVar != null) {
                if (nikVar instanceof mik) {
                    obj = ((mik) nikVar).a;
                } else {
                    if (!(nikVar instanceof lik)) {
                        w511.b();
                        return null;
                    }
                    obj = ((lik) nikVar).a;
                }
                obj3 = obj;
            }
            yhkVar.getClass();
            likVar = new lik(yhk.c(yf90Var, (aik) obj3, jSONObject));
        }
        return likVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, nik nikVar) {
        boolean z = nikVar instanceof mik;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((dik) jsonParserComponent.b2.getValue()).b(yf90Var, ((mik) nikVar).a);
        }
        if (!(nikVar instanceof lik)) {
            w511.b();
            return null;
        }
        yhk yhkVar = (yhk) jsonParserComponent.Y1.getValue();
        aik aikVar = ((lik) nikVar).a;
        yhkVar.getClass();
        return yhk.d(yf90Var, aikVar);
    }
}
