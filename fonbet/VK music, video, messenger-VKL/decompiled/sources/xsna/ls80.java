package xsna;

import android.util.LruCache;
import androidx.fragment.app.FragmentActivity;
import com.my.tracker.obfuscated.e0;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserSex;
import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vk.voip.b;
import com.vk.voip.dto.profiles.VoipFriendStatus;
import com.vk.voip.ui.events.VoipException;
import java.util.List;
import org.json.JSONObject;
import xsna.sew0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ls80 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ls80(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String D;
        sew0.b b;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((com.vk.core.telemetry.a) ((ns80) obj3).a.getValue()).c((String) obj2, (ohk0) obj);
                break;
            case 1:
                osq0.c((atq0) obj3, (osq0) obj2, (FragmentActivity) obj);
                break;
            case 2:
                JSONObject jSONObject = (JSONObject) obj3;
                UserId userId = (UserId) obj;
                String str = (String) obj2;
                OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                if (!oKVoipEngine.w()) {
                    L.l("VoipViewModel", "Voip engine was not initialized. Can't handle incoming push");
                    break;
                } else {
                    com.vk.voip.ui.c.b.getClass();
                    v2x0 v2x0Var = com.vk.voip.ui.c.r0;
                    if (v2x0Var == null) {
                        v2x0Var = null;
                    }
                    v2x0Var.getClass();
                    oKVoipEngine.getClass();
                    if (!jSONObject.has("call_id")) {
                        oKVoipEngine = null;
                    }
                    int i2 = 1;
                    if (oKVoipEngine != null) {
                        nru nruVar = new nru(userId, i2);
                        sy5 sy5Var = new sy5(userId, jSONObject);
                        L.A("OKVoipEngine", "Trying to parse incoming OK call from source=" + str + ", data=" + jSONObject);
                        try {
                            fqw0 o = w65.o(String.valueOf(userId.b), jSONObject);
                            OKVoipEngine.c.post(new fv8(new CallId(jSONObject.optString("call_id", "")), o, sy5Var, (b.d) nruVar.invoke(o), 3));
                        } catch (Throwable th) {
                            cnw0 cnw0Var = OKVoipEngine.v;
                            (cnw0Var != null ? cnw0Var : null).getClass();
                            com.vk.metrics.eventtracking.b.a.a(new VoipException("Voip failed with info: tag=OKVoipEngine, message = Unable to handle incoming voip-push", th));
                        }
                    }
                    kqt kqtVar = com.vk.voip.ui.c.j;
                    kqtVar.getClass();
                    JSONObject optJSONObject = jSONObject.optJSONObject("caller_info");
                    if (optJSONObject != null && (D = f370.D(optJSONObject, "user_id")) != null) {
                        String optString = optJSONObject.optString("first_name");
                        String optString2 = optJSONObject.optString("last_name");
                        String optString3 = optJSONObject.optString("photo_base", "");
                        String optString4 = optJSONObject.optString("photo_max", "");
                        int optInt = optJSONObject.optInt("sex", UserSex.UNKNOWN.h());
                        int optInt2 = optJSONObject.optInt("verified");
                        boolean optBoolean = optJSONObject.optBoolean("is_nft");
                        if (myc0.f(optString3)) {
                            LruCache<String, fxj0> lruCache = sew0.a;
                            b = sew0.a.b(optString3, optBoolean, true);
                        } else {
                            LruCache<String, fxj0> lruCache2 = sew0.a;
                            b = sew0.a.b(optString4, optBoolean, false);
                        }
                        sew0.b bVar = b;
                        UserSex.a aVar = UserSex.Companion;
                        Integer valueOf = Integer.valueOf(optInt);
                        aVar.getClass();
                        kqtVar.c = new whr0(D, bVar, UserSex.a.a(valueOf) == UserSex.FEMALE, optInt2 != 0, false, true, VoipFriendStatus.NOT_FRIENDS, optString, optString2, optString, optString, optString, ((Boolean) com.vk.voip.ui.c.s0.g.invoke()).booleanValue(), false, null, false, null, null, 212992);
                        break;
                    }
                }
                break;
            default:
                ((com.my.tracker.obfuscated.e0) obj3).a((e0.a) obj2, (List) obj);
                break;
        }
    }

    public /* synthetic */ ls80(JSONObject jSONObject, UserId userId, String str) {
        this.b = 2;
        this.c = jSONObject;
        this.e = userId;
        this.d = str;
    }
}
