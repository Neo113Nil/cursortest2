package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class pfl implements qfy0 {
    public final JsonParserComponent a;

    public pfl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mfl a(yf90 yf90Var, sfl sflVar, JSONObject jSONObject) {
        boolean z = sflVar instanceof qfl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return new kfl(((azk) jsonParserComponent.c5.getValue()).a(yf90Var, ((qfl) sflVar).a, jSONObject));
        }
        if (sflVar instanceof rfl) {
            return new lfl(((d6l) jsonParserComponent.D6.getValue()).a(yf90Var, ((rfl) sflVar).a, jSONObject));
        }
        w511.b();
        return null;
    }
}
