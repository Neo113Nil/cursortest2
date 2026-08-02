package xsna;

import org.json.JSONObject;

/* compiled from: AudioSendStartEvent.kt */
/* loaded from: classes14.dex */
public final class gx4 extends rsg0<glk> {
    public gx4(String str, String str2) {
        super("audio.sendStartEvent");
        K("uuid", str2);
        K("audio_id", str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        return new glk(jSONObject2.optInt("has_music_subscription") == 1, jSONObject2.optLong("expires_date") * 1000);
    }
}
