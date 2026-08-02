package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class cgl implements zsq0, nyi {
    public final JsonParserComponent a;

    public cgl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object eglVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        ggl gglVar = hexVar instanceof ggl ? (ggl) hexVar : null;
        if (gglVar != null) {
            if (gglVar instanceof fgl) {
                R = "solid";
            } else {
                if (!(gglVar instanceof egl)) {
                    w511.b();
                    return null;
                }
                R = "cloud";
            }
        }
        boolean equals = R.equals("solid");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            zal zalVar = (zal) jsonParserComponent.E7.getValue();
            if (gglVar != null) {
                if (gglVar instanceof fgl) {
                    obj2 = ((fgl) gglVar).a;
                } else {
                    if (!(gglVar instanceof egl)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((egl) gglVar).a;
                }
                obj3 = obj2;
            }
            zalVar.getClass();
            eglVar = new fgl(zal.c(yf90Var, (bbl) obj3, jSONObject));
        } else {
            if (!R.equals("cloud")) {
                throw fg90.m(jSONObject, "type", R);
            }
            wik wikVar = (wik) jsonParserComponent.k2.getValue();
            if (gglVar != null) {
                if (gglVar instanceof fgl) {
                    obj = ((fgl) gglVar).a;
                } else {
                    if (!(gglVar instanceof egl)) {
                        w511.b();
                        return null;
                    }
                    obj = ((egl) gglVar).a;
                }
                obj3 = obj;
            }
            eglVar = new egl(wikVar.c(yf90Var, (yik) obj3, jSONObject));
        }
        return eglVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ggl gglVar) {
        boolean z = gglVar instanceof fgl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            zal zalVar = (zal) jsonParserComponent.E7.getValue();
            bbl bblVar = ((fgl) gglVar).a;
            zalVar.getClass();
            return zal.d(yf90Var, bblVar);
        }
        if (gglVar instanceof egl) {
            return ((wik) jsonParserComponent.k2.getValue()).b(yf90Var, ((egl) gglVar).a);
        }
        w511.b();
        return null;
    }
}
