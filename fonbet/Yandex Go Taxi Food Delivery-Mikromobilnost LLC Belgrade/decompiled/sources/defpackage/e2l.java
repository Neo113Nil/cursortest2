package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class e2l implements zsq0, nyi {
    public final JsonParserComponent a;

    public e2l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    @Override // defpackage.nyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object c2lVar;
        k2l k2lVar;
        String R = wwg.R(jSONObject);
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        if (hashCode != -921832806) {
            if (hashCode != 97445748) {
                if (hashCode == 343327108 && R.equals("wrap_content")) {
                    ((p0l) jsonParserComponent.s5.getValue()).getClass();
                    return new b2l(new o0l());
                }
            } else if (R.equals("fixed")) {
                c2lVar = new a2l(((zzk) jsonParserComponent.j5.getValue()).a(yf90Var, jSONObject));
                return c2lVar;
            }
            hex b = yf90Var.b().b(R, jSONObject);
            k2lVar = !(b instanceof k2l) ? (k2l) b : null;
            if (k2lVar == null) {
                return ((g2l) jsonParserComponent.J5.getValue()).a(yf90Var, k2lVar, jSONObject);
            }
            throw fg90.m(jSONObject, "type", R);
        }
        if (R.equals("percentage")) {
            c2lVar = new c2l(((u0l) jsonParserComponent.v5.getValue()).a(yf90Var, jSONObject));
            return c2lVar;
        }
        hex b2 = yf90Var.b().b(R, jSONObject);
        if (!(b2 instanceof k2l)) {
        }
        if (k2lVar == null) {
        }
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, d2l d2lVar) {
        boolean z = d2lVar instanceof c2l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((u0l) jsonParserComponent.v5.getValue()).b(yf90Var, ((c2l) d2lVar).b);
        }
        if (d2lVar instanceof a2l) {
            return ((zzk) jsonParserComponent.j5.getValue()).b(yf90Var, ((a2l) d2lVar).b);
        }
        if (!(d2lVar instanceof b2l)) {
            w511.b();
            return null;
        }
        ((p0l) jsonParserComponent.s5.getValue()).getClass();
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
