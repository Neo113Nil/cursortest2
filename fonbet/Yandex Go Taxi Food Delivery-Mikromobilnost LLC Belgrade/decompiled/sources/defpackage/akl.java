package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class akl implements qfy0 {
    public final JsonParserComponent a;

    public akl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xjl a(yf90 yf90Var, dkl dklVar, JSONObject jSONObject) {
        boolean z = dklVar instanceof bkl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return new vjl(((h7l) jsonParserComponent.J6.getValue()).a(yf90Var, ((bkl) dklVar).a, jSONObject));
        }
        if (dklVar instanceof ckl) {
            return new wjl(((dll) jsonParserComponent.v9.getValue()).a(yf90Var, ((ckl) dklVar).a, jSONObject));
        }
        w511.b();
        return null;
    }
}
