package xsna;

import org.json.JSONObject;
import xsna.ncq0;

/* compiled from: BaseGetUploadServer.kt */
/* loaded from: classes14.dex */
public abstract class nd6 extends rsg0<ncq0> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ncq0 ncq0Var = ncq0.d;
        return ncq0.a.b(jSONObject.getJSONObject("response"));
    }
}
