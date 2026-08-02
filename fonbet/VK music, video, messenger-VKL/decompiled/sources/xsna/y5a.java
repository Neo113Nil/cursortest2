package xsna;

import org.json.JSONObject;

/* compiled from: CatalogGetAudioCurator.kt */
/* loaded from: classes16.dex */
public final class y5a extends rsg0<hda> {
    public final wba s;

    public y5a(wba wbaVar, String str, String str2, String str3) {
        super("catalog.getAudioCurator");
        this.s = wbaVar;
        C(1, "need_blocks");
        K("curator_id", str);
        K("from_trackcode", str2);
        K("url", str3);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.s.c(jSONObject.getJSONObject("response"));
    }
}
