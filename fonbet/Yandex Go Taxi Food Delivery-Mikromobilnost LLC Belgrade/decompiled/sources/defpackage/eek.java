package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class eek implements qfy0 {
    public final JsonParserComponent a;

    public eek(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ydk a(yf90 yf90Var, hek hekVar, JSONObject jSONObject) {
        boolean z = hekVar instanceof fek;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return new wdk(((ojk) jsonParserComponent.u2.getValue()).a(yf90Var, ((fek) hekVar).a, jSONObject));
        }
        if (hekVar instanceof gek) {
            return new xdk(((l0l) jsonParserComponent.r5.getValue()).a(yf90Var, ((gek) hekVar).a, jSONObject));
        }
        w511.b();
        return null;
    }
}
