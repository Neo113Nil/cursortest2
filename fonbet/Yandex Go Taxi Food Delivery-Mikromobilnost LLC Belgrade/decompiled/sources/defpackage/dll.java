package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public final class dll implements qfy0 {
    public final JsonParserComponent a;

    public dll(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final all a(yf90 yf90Var, ell ellVar, JSONObject jSONObject) {
        exq exqVar = ellVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.y9;
        i3y i3yVar2 = jsonParserComponent.w9;
        return new all((tkl) xcx.h(yf90Var, exqVar, jSONObject, RemoteBioParameters.X, i3yVar, i3yVar2), (tkl) xcx.h(yf90Var, ellVar.b, jSONObject, RemoteBioParameters.Y, jsonParserComponent.y9, i3yVar2));
    }
}
