package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes.dex */
public final class a5l implements c4x, hex {
    public final exq a;
    public final exq b;

    public a5l(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        z4l z4lVar = (z4l) ft6.b.k6.getValue();
        lb7 lb7Var = ft6.a;
        z4lVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonParserComponent jsonParserComponent = z4lVar.a;
        wcx.u(lb7Var, jSONObject, RemoteBioParameters.X, this.a, jsonParserComponent.V2);
        wcx.u(lb7Var, jSONObject, RemoteBioParameters.Y, this.b, jsonParserComponent.V2);
        return jSONObject;
    }
}
