package xsna;

import org.json.JSONObject;

/* compiled from: MasksGetById.java */
/* loaded from: classes15.dex */
public final class rh10 extends rsg0 {
    public final /* synthetic */ int s = 1;

    public rh10() {
        super("video.clearViewingHistoryRecords");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return new gi10(jSONObject.getJSONObject("response"));
            default:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
        }
    }

    public rh10(String str, int i) {
        super("masks.getById");
        K("mask_ids", str);
        K("extended", "1");
        K("need_counters", "1");
        C(i, "model_version");
    }
}
