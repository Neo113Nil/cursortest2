package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nfk implements zsq0, nyi {
    public final JsonParserComponent a;

    public nfk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -30518633:
                if (R.equals("nine_patch_image")) {
                    return new hfk(((e0l) jsonParserComponent.m5.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 89650992:
                if (R.equals("gradient")) {
                    return new gfk(((yyk) jsonParserComponent.a5.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 100313435:
                if (R.equals("image")) {
                    return new ffk(((tsk) jsonParserComponent.f4.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 109618859:
                if (R.equals("solid")) {
                    ((yal) jsonParserComponent.D7.getValue()).getClass();
                    return new jfk(yal.c(yf90Var, jSONObject));
                }
                break;
            case 1881846096:
                if (R.equals("radial_gradient")) {
                    return new ifk(((b6l) jsonParserComponent.B6.getValue()).a(yf90Var, jSONObject));
                }
                break;
        }
        hex b = yf90Var.b().b(R, jSONObject);
        dgk dgkVar = b instanceof dgk ? (dgk) b : null;
        if (dgkVar != null) {
            return ((pfk) jsonParserComponent.Q1.getValue()).a(yf90Var, dgkVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, kfk kfkVar) {
        boolean z = kfkVar instanceof gfk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((yyk) jsonParserComponent.a5.getValue()).b(yf90Var, ((gfk) kfkVar).b);
        }
        if (kfkVar instanceof ifk) {
            return ((b6l) jsonParserComponent.B6.getValue()).b(yf90Var, ((ifk) kfkVar).b);
        }
        if (kfkVar instanceof ffk) {
            return ((tsk) jsonParserComponent.f4.getValue()).b(yf90Var, ((ffk) kfkVar).b);
        }
        if (kfkVar instanceof jfk) {
            yal yalVar = (yal) jsonParserComponent.D7.getValue();
            wal walVar = ((jfk) kfkVar).b;
            yalVar.getClass();
            return yal.d(yf90Var, walVar);
        }
        if (kfkVar instanceof hfk) {
            return ((e0l) jsonParserComponent.m5.getValue()).b(yf90Var, ((hfk) kfkVar).d());
        }
        w511.b();
        return null;
    }
}
