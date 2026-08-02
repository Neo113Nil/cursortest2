package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public final class bll implements zsq0, nyi {
    public final JsonParserComponent a;

    public bll(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final all a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        return new all((tkl) wwg.M(yf90Var, jSONObject, RemoteBioParameters.X, jsonParserComponent.w9), (tkl) wwg.M(yf90Var, jSONObject, RemoteBioParameters.Y, jsonParserComponent.w9));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, all allVar) {
        JSONObject w = n.w(yf90Var, "type", "translation");
        tkl tklVar = allVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, w, RemoteBioParameters.X, tklVar, jsonParserComponent.w9);
        wwg.b0(yf90Var, w, RemoteBioParameters.Y, allVar.b, jsonParserComponent.w9);
        return w;
    }
}
