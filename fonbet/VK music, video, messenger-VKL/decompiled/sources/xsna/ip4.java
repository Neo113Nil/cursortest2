package xsna;

import com.vk.dto.music.MusicDynamicRestriction;
import org.json.JSONObject;

/* compiled from: AudioGetRestrictionPopup.java */
/* loaded from: classes14.dex */
public final class ip4 extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip4(String str, int i) {
        super(str);
        this.s = i;
        switch (i) {
            case 2:
                super("messages.forceCallFinish");
                K("call_id", str);
                break;
            default:
                break;
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return new MusicDynamicRestriction(jSONObject.getJSONObject("response"));
            case 1:
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                return new se3(jSONObject2.getString("view_url"), jSONObject2.optString("original_url", ""), jSONObject2.optString("screen_title"));
            default:
                return Integer.valueOf(jSONObject.optInt("response", -1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip4(String str, String str2) {
        super("audio.getRestrictionPopup");
        this.s = 0;
        K("audio_id", str);
        K("track_code", str2);
    }
}
