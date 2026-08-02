package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class d1l implements qfy0 {
    public final JsonParserComponent a;

    public d1l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a1l a(yf90 yf90Var, q1l q1lVar, JSONObject jSONObject) {
        boolean z = q1lVar instanceof p1l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            m1l m1lVar = (m1l) jsonParserComponent.D5.getValue();
            n1l n1lVar = ((p1l) q1lVar).a;
            m1lVar.getClass();
            return new z0l(m1l.b(yf90Var, n1lVar, jSONObject));
        }
        if (!(q1lVar instanceof o1l)) {
            w511.b();
            return null;
        }
        h1l h1lVar = (h1l) jsonParserComponent.A5.getValue();
        i1l i1lVar = ((o1l) q1lVar).a;
        h1lVar.getClass();
        return new y0l(h1l.b(yf90Var, i1lVar, jSONObject));
    }
}
