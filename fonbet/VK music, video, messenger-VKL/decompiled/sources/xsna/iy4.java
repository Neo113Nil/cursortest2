package xsna;

import org.json.JSONObject;

/* compiled from: AudioSubscribeToQueue.kt */
/* loaded from: classes14.dex */
public final class iy4 extends rsg0<String> {
    public iy4() {
        super("audio.subscribeToQueue");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return jSONObject.getJSONObject("response").getString("url");
    }
}
