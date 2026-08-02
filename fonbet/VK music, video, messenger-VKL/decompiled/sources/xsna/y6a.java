package xsna;

import com.vk.catalog2.video.VideoCatalogId;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: CatalogGetVideoStandalone.kt */
/* loaded from: classes16.dex */
public final class y6a extends rsg0<hda> {
    public final wba s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6a(wba wbaVar, VideoCatalogId videoCatalogId, UserId userId, String str, String str2, String str3, boolean z, int i) {
        super("catalog.getVideoStandalone");
        z = (i & 128) != 0 ? false : z;
        this.s = wbaVar;
        if (z) {
            K("ref", "vk_video_promo");
        }
        K("url", str);
        K("from_trackcode", str2);
        C(1, "need_blocks");
        if (videoCatalogId != null) {
            K("catalog_id", videoCatalogId.getId());
        }
        if (fkq0.c(userId)) {
            F(userId, "owner_id");
        }
        if (str3 != null && str3.length() != 0) {
            K("forced_video_id", str3);
        }
        K("device_info", zeq0.c(true));
        ahn.D(this);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.s.c(jSONObject.getJSONObject("response"));
    }
}
