package defpackage;

import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class kik implements qfy0 {
    public final JsonParserComponent a;

    public kik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DivChangeTransition a(yf90 yf90Var, nik nikVar, JSONObject jSONObject) {
        boolean z = nikVar instanceof mik;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            eik eikVar = (eik) jsonParserComponent.c2.getValue();
            fik fikVar = ((mik) nikVar).a;
            eikVar.getClass();
            exq exqVar = fikVar.a;
            JsonParserComponent jsonParserComponent2 = eikVar.a;
            return new hik(new bik(xcx.g(yf90Var, exqVar, jSONObject, "items", jsonParserComponent2.f2, jsonParserComponent2.d2, m991.a)));
        }
        if (!(nikVar instanceof lik)) {
            w511.b();
            return null;
        }
        zhk zhkVar = (zhk) jsonParserComponent.Z1.getValue();
        aik aikVar = ((lik) nikVar).a;
        zhkVar.getClass();
        return new gik(zhk.b(yf90Var, aikVar, jSONObject));
    }
}
