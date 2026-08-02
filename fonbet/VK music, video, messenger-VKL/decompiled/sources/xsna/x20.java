package xsna;

import org.json.JSONObject;

/* compiled from: ActionLinksDelete.kt */
/* loaded from: classes14.dex */
public final class x20 extends xsg0 {
    @Override // xsna.xsg0, xsna.oer0, xsna.k7r0
    /* renamed from: F0 */
    public final Boolean a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optInt("response") == 1);
    }
}
