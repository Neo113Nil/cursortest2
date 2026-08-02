package xsna;

import org.json.JSONObject;

/* compiled from: NotificationsGetGrouped.kt */
/* loaded from: classes15.dex */
public final class ij70 extends rsg0<com.vk.dto.notifications.a> {
    public int s;

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return new com.vk.dto.notifications.a(jSONObject.getJSONObject("response"), this.s);
    }
}
