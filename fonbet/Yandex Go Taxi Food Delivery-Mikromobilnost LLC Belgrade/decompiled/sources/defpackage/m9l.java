package defpackage;

import com.yandex.div2.DivSize;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m9l implements qfy0 {
    public final JsonParserComponent a;

    public m9l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DivSize a(yf90 yf90Var, q9l q9lVar, JSONObject jSONObject) {
        boolean z = q9lVar instanceof n9l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            vqk vqkVar = (vqk) jsonParserComponent.G3.getValue();
            wqk wqkVar = ((n9l) q9lVar).a;
            vqkVar.getClass();
            return new h9l(vqk.b(yf90Var, wqkVar, jSONObject));
        }
        if (q9lVar instanceof o9l) {
            return new i9l(((qzk) jsonParserComponent.i5.getValue()).a(yf90Var, ((o9l) q9lVar).a, jSONObject));
        }
        if (q9lVar instanceof p9l) {
            return new j9l(((oql) jsonParserComponent.W9.getValue()).a(yf90Var, ((p9l) q9lVar).a, jSONObject));
        }
        w511.b();
        return null;
    }
}
