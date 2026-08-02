package xsna;

import com.vk.catalog2.common.dto.api.video.ShortVideoType;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: CatalogGetClipDiscover.kt */
/* loaded from: classes16.dex */
public final class b6a extends rsg0<hda> {
    public final wba s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6a(wba wbaVar, UserId userId, ShortVideoType shortVideoType, int i) {
        super("catalog.getShortVideoTop");
        shortVideoType = (i & 8) != 0 ? null : shortVideoType;
        this.s = wbaVar;
        C(1, "need_blocks");
        if (fkq0.c(userId)) {
            F(userId, "owner_id");
        }
        if (shortVideoType != null) {
            K("type", shortVideoType.h());
        }
        ahn.D(this);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.s.c(jSONObject.getJSONObject("response"));
    }
}
