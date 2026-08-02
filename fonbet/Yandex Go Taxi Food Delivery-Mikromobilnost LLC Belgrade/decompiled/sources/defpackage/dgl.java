package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class dgl implements qfy0 {
    public final JsonParserComponent a;

    public dgl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final agl a(yf90 yf90Var, ggl gglVar, JSONObject jSONObject) {
        boolean z = gglVar instanceof fgl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            abl ablVar = (abl) jsonParserComponent.F7.getValue();
            bbl bblVar = ((fgl) gglVar).a;
            ablVar.getClass();
            return new zfl(abl.b(yf90Var, bblVar, jSONObject));
        }
        if (gglVar instanceof egl) {
            return new yfl(((xik) jsonParserComponent.l2.getValue()).a(yf90Var, ((egl) gglVar).a, jSONObject));
        }
        w511.b();
        return null;
    }
}
