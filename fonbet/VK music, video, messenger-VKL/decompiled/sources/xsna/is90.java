package xsna;

import com.vk.voip.api.dto.VoipChatInfo;
import org.json.JSONObject;

/* compiled from: PayloadCreator.kt */
/* loaded from: classes7.dex */
public final class is90 {
    public final bew0 a;

    public is90(bew0 bew0Var) {
        this.a = bew0Var;
    }

    public static JSONObject a(String str, boolean z, dhw0 dhw0Var) {
        VoipChatInfo voipChatInfo;
        JSONObject jSONObject = new JSONObject();
        if (str.length() > 0) {
            jSONObject.put("community_user_id", str);
        }
        jSONObject.put("is_video", z);
        if (dhw0Var.D && (voipChatInfo = dhw0Var.B) != null) {
            jSONObject.put("chat_id", voipChatInfo.b - 2000000000);
        }
        return jSONObject;
    }

    public static JSONObject c(String str, boolean z, dhw0 dhw0Var) {
        return a(str, z, dhw0Var);
    }

    public final JSONObject b(String str, boolean z, dhw0 dhw0Var) {
        JSONObject a = a(str, z, dhw0Var);
        a.put("caller_app_id", this.a.getApiConfig().a);
        a.put("with_join_link", true);
        a.put("join_by_link", true);
        return a;
    }

    public final JSONObject d(String str, boolean z, dhw0 dhw0Var) {
        JSONObject a = a(str, z, dhw0Var);
        a.put("caller_app_id", this.a.getApiConfig().a);
        return a;
    }
}
