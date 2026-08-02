package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StoriesGetAudioMeta.kt */
/* loaded from: classes15.dex */
public abstract class spt extends rsg0<a> {

    /* compiled from: StoriesGetAudioMeta.kt */
    public static final class a {
        public final String a;
        public final int b;

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    public spt(UserId userId, int i, String str, String str2) {
        super(str);
        K("audio", r11.b(new StringBuilder(), userId.b, '_', i));
        K("track_code", str2);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("response");
            JSONArray optJSONArray = optJSONObject.optJSONArray("waveform");
            int length = optJSONArray.length();
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) optJSONArray.getInt(i);
            }
            return new a(optJSONObject.optString("url"), optJSONObject.optInt("start_position"));
        } catch (JSONException unused) {
            return new a("", 0);
        }
    }
}
