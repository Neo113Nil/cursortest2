package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ofl implements zsq0, nyi {
    public final JsonParserComponent a;

    public ofl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object rflVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        sfl sflVar = hexVar instanceof sfl ? (sfl) hexVar : null;
        if (sflVar != null) {
            if (sflVar instanceof qfl) {
                R = "gradient";
            } else {
                if (!(sflVar instanceof rfl)) {
                    w511.b();
                    return null;
                }
                R = "radial_gradient";
            }
        }
        boolean equals = R.equals("gradient");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            zyk zykVar = (zyk) jsonParserComponent.b5.getValue();
            if (sflVar != null) {
                if (sflVar instanceof qfl) {
                    obj2 = ((qfl) sflVar).a;
                } else {
                    if (!(sflVar instanceof rfl)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((rfl) sflVar).a;
                }
                obj3 = obj2;
            }
            rflVar = new qfl(zykVar.c(yf90Var, (dzk) obj3, jSONObject));
        } else {
            if (!R.equals("radial_gradient")) {
                throw fg90.m(jSONObject, "type", R);
            }
            c6l c6lVar = (c6l) jsonParserComponent.C6.getValue();
            if (sflVar != null) {
                if (sflVar instanceof qfl) {
                    obj = ((qfl) sflVar).a;
                } else {
                    if (!(sflVar instanceof rfl)) {
                        w511.b();
                        return null;
                    }
                    obj = ((rfl) sflVar).a;
                }
                obj3 = obj;
            }
            rflVar = new rfl(c6lVar.c(yf90Var, (a7l) obj3, jSONObject));
        }
        return rflVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, sfl sflVar) {
        boolean z = sflVar instanceof qfl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((zyk) jsonParserComponent.b5.getValue()).b(yf90Var, ((qfl) sflVar).a);
        }
        if (sflVar instanceof rfl) {
            return ((c6l) jsonParserComponent.C6.getValue()).b(yf90Var, ((rfl) sflVar).a);
        }
        w511.b();
        return null;
    }
}
