package xsna;

import org.json.JSONObject;

/* compiled from: FaveEditTag.kt */
/* loaded from: classes4.dex */
public final class pnq extends rsg0<Boolean> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.getInt("response") == 1);
    }
}
