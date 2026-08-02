package xsna;

import org.json.JSONObject;

/* compiled from: CatalogGetDebug.kt */
/* loaded from: classes16.dex */
public final class f6a extends rsg0<hda> {
    public final wba s;

    public f6a(wba wbaVar) {
        super("catalog.getDebug");
        this.s = wbaVar;
        C(1, "need_blocks");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.s.c(jSONObject.getJSONObject("response"));
    }
}
