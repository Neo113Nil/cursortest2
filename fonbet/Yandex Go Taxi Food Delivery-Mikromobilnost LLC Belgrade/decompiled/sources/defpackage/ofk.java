package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ofk implements zsq0, nyi {
    public final JsonParserComponent a;

    public ofk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object agkVar;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        dgk dgkVar = hexVar instanceof dgk ? (dgk) hexVar : null;
        if (dgkVar != null) {
            if (dgkVar instanceof zfk) {
                R = "gradient";
            } else if (dgkVar instanceof bgk) {
                R = "radial_gradient";
            } else if (dgkVar instanceof yfk) {
                R = "image";
            } else if (dgkVar instanceof cgk) {
                R = "solid";
            } else {
                if (!(dgkVar instanceof agk)) {
                    w511.b();
                    return null;
                }
                R = "nine_patch_image";
            }
        }
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -30518633:
                if (R.equals("nine_patch_image")) {
                    agkVar = new agk(((f0l) jsonParserComponent.n5.getValue()).c(yf90Var, (h0l) (dgkVar != null ? dgkVar.a() : null), jSONObject));
                    return agkVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 89650992:
                if (R.equals("gradient")) {
                    agkVar = new zfk(((zyk) jsonParserComponent.b5.getValue()).c(yf90Var, (dzk) (dgkVar != null ? dgkVar.a() : null), jSONObject));
                    return agkVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 100313435:
                if (R.equals("image")) {
                    agkVar = new yfk(((usk) jsonParserComponent.g4.getValue()).c(yf90Var, (wsk) (dgkVar != null ? dgkVar.a() : null), jSONObject));
                    return agkVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 109618859:
                if (R.equals("solid")) {
                    zal zalVar = (zal) jsonParserComponent.E7.getValue();
                    Object a = dgkVar != null ? dgkVar.a() : null;
                    zalVar.getClass();
                    agkVar = new cgk(zal.c(yf90Var, (bbl) a, jSONObject));
                    return agkVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 1881846096:
                if (R.equals("radial_gradient")) {
                    agkVar = new bgk(((c6l) jsonParserComponent.C6.getValue()).c(yf90Var, (a7l) (dgkVar != null ? dgkVar.a() : null), jSONObject));
                    return agkVar;
                }
                throw fg90.m(jSONObject, "type", R);
            default:
                throw fg90.m(jSONObject, "type", R);
        }
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, dgk dgkVar) {
        boolean z = dgkVar instanceof zfk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((zyk) jsonParserComponent.b5.getValue()).b(yf90Var, ((zfk) dgkVar).a);
        }
        if (dgkVar instanceof bgk) {
            return ((c6l) jsonParserComponent.C6.getValue()).b(yf90Var, ((bgk) dgkVar).a);
        }
        if (dgkVar instanceof yfk) {
            return ((usk) jsonParserComponent.g4.getValue()).b(yf90Var, ((yfk) dgkVar).a);
        }
        if (dgkVar instanceof cgk) {
            zal zalVar = (zal) jsonParserComponent.E7.getValue();
            bbl bblVar = ((cgk) dgkVar).a;
            zalVar.getClass();
            return zal.d(yf90Var, bblVar);
        }
        if (dgkVar instanceof agk) {
            return ((f0l) jsonParserComponent.n5.getValue()).b(yf90Var, ((agk) dgkVar).b());
        }
        w511.b();
        return null;
    }
}
