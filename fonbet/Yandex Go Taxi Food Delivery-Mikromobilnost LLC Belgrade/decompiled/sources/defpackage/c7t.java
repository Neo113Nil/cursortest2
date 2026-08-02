package defpackage;

import com.yandex.messenger.websdk.internal.web.MessageType;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.collections.b;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class c7t extends vg41 {
    public final nax c;
    public final c9v d;
    public final ew2 e;

    public c7t(nax naxVar, c9v c9vVar, ew2 ew2Var) {
        super("getEnv", false);
        this.c = naxVar;
        this.d = c9vVar;
        this.e = ew2Var;
    }

    @Override // defpackage.vg41
    public final void a(fqv fqvVar) {
        this.e.b("wm_ask_support_env");
        Map f = b.f();
        hdu hduVar = this.c.a;
        String str = fqvVar.d;
        MessageType messageType = MessageType.Response;
        JSONObject jSONObject = new JSONObject(f);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("channelId", (String) hduVar.b);
        jSONObject2.put("id", udq0.F());
        jSONObject2.put("type", messageType.getRawValue());
        jSONObject2.put("refId", str);
        jSONObject2.put(Constants.KEY_DATA, jSONObject);
        c9v.h(this.d, nax.b(jSONObject2));
    }
}
