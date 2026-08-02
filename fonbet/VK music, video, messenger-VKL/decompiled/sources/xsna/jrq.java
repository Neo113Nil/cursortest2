package xsna;

import org.json.JSONObject;

/* compiled from: FaveRemoveArticle.kt */
/* loaded from: classes18.dex */
public final class jrq extends rsg0<Boolean> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.getInt("response") == 1);
    }
}
