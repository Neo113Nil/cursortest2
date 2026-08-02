package xsna;

import com.vk.superapp.bridges.SuperappUiRouterBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;
import xsna.lvv0;

/* compiled from: JsVkBrowserCoreBridge.kt */
/* loaded from: classes6.dex */
public final class a7y implements SuperappUiRouterBridge.f {
    public final /* synthetic */ x6y a;
    public final /* synthetic */ boolean b;

    public a7y(x6y x6yVar, boolean z) {
        this.a = x6yVar;
        this.b = z;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.f
    public final void a() {
        this.a.J().g0();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.f
    public final void b() {
        this.a.J().G();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.f
    public final void onSuccess() {
        x6y x6yVar = this.a;
        x6yVar.J().K();
        if (this.b) {
            JSONObject jSONObject = new JSONObject();
            String optString = jSONObject.optString("text");
            String optString2 = jSONObject.optString("status");
            JSONObject optJSONObject = jSONObject.optJSONObject("payload");
            lvv0.c cVar = new lvv0.c(optString, optString2, optJSONObject != null ? optJSONObject.toString() : null, jSONObject.optString(CommonUrlParts.REQUEST_ID));
            x6yVar.getClass();
            String str = cVar.a;
            if (!drm0.N(str)) {
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                superappUiRouterBridge.j(str);
            }
            qro0.c(new mh3(11, x6yVar, cVar));
        }
    }
}
