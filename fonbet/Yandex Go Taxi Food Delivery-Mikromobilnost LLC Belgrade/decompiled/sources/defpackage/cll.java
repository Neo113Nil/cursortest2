package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public final class cll implements zsq0, yey0 {
    public final JsonParserComponent a;

    public cll(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final ell c(yf90 yf90Var, ell ellVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq exqVar = ellVar != null ? ellVar.a : null;
        JsonParserComponent jsonParserComponent = this.a;
        return new ell(wcx.i(Q, jSONObject, RemoteBioParameters.X, i, exqVar, jsonParserComponent.x9), wcx.i(Q, jSONObject, RemoteBioParameters.Y, i, ellVar != null ? ellVar.b : null, jsonParserComponent.x9));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ell ellVar) {
        JSONObject w = n.w(yf90Var, "type", "translation");
        exq exqVar = ellVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, w, RemoteBioParameters.X, exqVar, jsonParserComponent.x9);
        wcx.u(yf90Var, w, RemoteBioParameters.Y, ellVar.b, jsonParserComponent.x9);
        return w;
    }
}
