package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g2l implements qfy0 {
    public final JsonParserComponent a;

    public g2l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d2l a(yf90 yf90Var, k2l k2lVar, JSONObject jSONObject) {
        boolean z = k2lVar instanceof j2l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            w0l w0lVar = (w0l) jsonParserComponent.x5.getValue();
            x0l x0lVar = ((j2l) k2lVar).a;
            w0lVar.getClass();
            exq exqVar = x0lVar.a;
            JsonParserComponent jsonParserComponent2 = w0lVar.a;
            return new c2l(new t0l((j3l) xcx.b(yf90Var, exqVar, jSONObject, "page_width", jsonParserComponent2.T5, jsonParserComponent2.R5)));
        }
        if (k2lVar instanceof h2l) {
            return new a2l(((b0l) jsonParserComponent.l5.getValue()).a(yf90Var, ((h2l) k2lVar).b(), jSONObject));
        }
        if (k2lVar instanceof i2l) {
            ((r0l) jsonParserComponent.u5.getValue()).getClass();
            return new b2l(r0l.b());
        }
        w511.b();
        return null;
    }
}
