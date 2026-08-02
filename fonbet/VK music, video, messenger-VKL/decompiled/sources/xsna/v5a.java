package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: CatalogGetAudioAuto.kt */
/* loaded from: classes16.dex */
public final class v5a extends rsg0<hda> {
    public final wba s;

    public v5a(wba wbaVar, UserId userId, String str, String str2, ArrayList arrayList) {
        super("catalog.getAudioAuto");
        this.s = wbaVar;
        C(1, "need_blocks");
        if (fkq0.c(userId)) {
            F(userId, "owner_id");
        }
        K("url", str2);
        K("ref", str);
        if (arrayList != null) {
            K("applied_toggles", GsonHolder.a().toJson(arrayList));
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.s.c(jSONObject.getJSONObject("response"));
    }
}
