package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class dek implements zsq0, nyi {
    public final JsonParserComponent a;

    public dek(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object gekVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        hek hekVar = hexVar instanceof hek ? (hek) hexVar : null;
        if (hekVar != null) {
            if (hekVar instanceof fek) {
                R = "color_animator";
            } else {
                if (!(hekVar instanceof gek)) {
                    w511.b();
                    return null;
                }
                R = "number_animator";
            }
        }
        boolean equals = R.equals("color_animator");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            njk njkVar = (njk) jsonParserComponent.t2.getValue();
            if (hekVar != null) {
                if (hekVar instanceof fek) {
                    obj2 = ((fek) hekVar).a;
                } else {
                    if (!(hekVar instanceof gek)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((gek) hekVar).a;
                }
                obj3 = obj2;
            }
            gekVar = new fek(njkVar.c(yf90Var, (pjk) obj3, jSONObject));
        } else {
            if (!R.equals("number_animator")) {
                throw fg90.m(jSONObject, "type", R);
            }
            k0l k0lVar = (k0l) jsonParserComponent.q5.getValue();
            if (hekVar != null) {
                if (hekVar instanceof fek) {
                    obj = ((fek) hekVar).a;
                } else {
                    if (!(hekVar instanceof gek)) {
                        w511.b();
                        return null;
                    }
                    obj = ((gek) hekVar).a;
                }
                obj3 = obj;
            }
            gekVar = new gek(k0lVar.c(yf90Var, (m0l) obj3, jSONObject));
        }
        return gekVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, hek hekVar) {
        boolean z = hekVar instanceof fek;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((njk) jsonParserComponent.t2.getValue()).b(yf90Var, ((fek) hekVar).a);
        }
        if (hekVar instanceof gek) {
            return ((k0l) jsonParserComponent.q5.getValue()).b(yf90Var, ((gek) hekVar).a);
        }
        w511.b();
        return null;
    }
}
