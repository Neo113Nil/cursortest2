package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: CatalogGetVideo.kt */
/* loaded from: classes16.dex */
public final class w6a extends rsg0<hda> {
    public final wba s;

    public w6a(wba wbaVar, UserId userId, String str, String str2, String str3) {
        super("catalog.getVideo");
        this.s = wbaVar;
        K("url", str);
        K("from_trackcode", str2);
        C(1, "need_blocks");
        if (fkq0.c(userId)) {
            F(userId, "owner_id");
        }
        if (str3 == null || str3.length() == 0) {
            return;
        }
        K("forced_video_id", str3);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.s.c(jSONObject.getJSONObject("response"));
    }
}
