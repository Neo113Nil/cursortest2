package defpackage;

import com.yandex.div2.DivRadialGradientRelativeRadius$Value;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.l1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class k6l implements qfy0 {
    public final JsonParserComponent a;

    public k6l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h6l a(yf90 yf90Var, n6l n6lVar, JSONObject jSONObject) {
        boolean z = n6lVar instanceof l6l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            vqk vqkVar = (vqk) jsonParserComponent.G3.getValue();
            wqk wqkVar = ((l6l) n6lVar).a;
            vqkVar.getClass();
            return new f6l(vqk.b(yf90Var, wqkVar, jSONObject));
        }
        if (!(n6lVar instanceof m6l)) {
            w511.b();
            return null;
        }
        x6l x6lVar = (x6l) jsonParserComponent.A6.getValue();
        y6l y6lVar = ((m6l) n6lVar).a;
        x6lVar.getClass();
        return new g6l(new u6l(xcx.d(yf90Var, y6lVar.a, jSONObject, "value", l1.a, DivRadialGradientRelativeRadius$Value.FROM_STRING)));
    }
}
