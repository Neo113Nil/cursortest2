package xsna;

import org.json.JSONObject;

/* compiled from: CatalogGetClipMusicTemplates.kt */
/* loaded from: classes16.dex */
public final class c6a extends rsg0<hda> {
    public final wba s;

    public c6a(wba wbaVar) {
        super("catalog.getShortVideoTemplates");
        this.s = wbaVar;
        ahn.D(this);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.s.c(jSONObject.getJSONObject("response"));
    }
}
