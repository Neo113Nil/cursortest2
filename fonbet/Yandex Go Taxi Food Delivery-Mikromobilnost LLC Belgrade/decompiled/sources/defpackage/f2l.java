package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f2l implements zsq0, nyi {
    public final JsonParserComponent a;

    public f2l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [exq] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object j2lVar;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        k2l k2lVar = hexVar instanceof k2l ? (k2l) hexVar : null;
        if (k2lVar != null) {
            if (k2lVar instanceof j2l) {
                R = "percentage";
            } else if (k2lVar instanceof h2l) {
                R = "fixed";
            } else {
                if (!(k2lVar instanceof i2l)) {
                    w511.b();
                    return null;
                }
                R = "wrap_content";
            }
        }
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        if (hashCode == -921832806) {
            if (R.equals("percentage")) {
                v0l v0lVar = (v0l) jsonParserComponent.w5.getValue();
                x0l x0lVar = (x0l) (k2lVar != null ? k2lVar.a() : null);
                v0lVar.getClass();
                j2lVar = new j2l(new x0l(wcx.c(udq0.Q(yf90Var), jSONObject, "page_width", yf90Var.i(), x0lVar != null ? x0lVar.a : null, v0lVar.a.S5)));
                return j2lVar;
            }
            throw fg90.m(jSONObject, "type", R);
        }
        if (hashCode != 97445748) {
            if (hashCode == 343327108 && R.equals("wrap_content")) {
                q0l q0lVar = (q0l) jsonParserComponent.t5.getValue();
                q0lVar.getClass();
                return new i2l(q0l.c());
            }
        } else if (R.equals("fixed")) {
            j2lVar = new h2l(((a0l) jsonParserComponent.k5.getValue()).c(yf90Var, (c0l) (k2lVar != null ? k2lVar.a() : null), jSONObject));
            return j2lVar;
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, k2l k2lVar) {
        boolean z = k2lVar instanceof j2l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((v0l) jsonParserComponent.w5.getValue()).b(yf90Var, ((j2l) k2lVar).a);
        }
        if (k2lVar instanceof h2l) {
            return ((a0l) jsonParserComponent.k5.getValue()).b(yf90Var, ((h2l) k2lVar).b());
        }
        if (k2lVar instanceof i2l) {
            ((q0l) jsonParserComponent.t5.getValue()).getClass();
            return q0l.d(yf90Var);
        }
        w511.b();
        return null;
    }
}
