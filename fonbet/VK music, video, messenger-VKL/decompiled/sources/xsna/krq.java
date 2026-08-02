package xsna;

import org.json.JSONObject;

/* compiled from: FaveRemoveNarrative.kt */
/* loaded from: classes18.dex */
public final class krq extends rsg0<Boolean> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.getInt("response") == 1);
    }
}
