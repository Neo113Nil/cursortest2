package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.masks.Mask;
import com.vk.dto.masks.MaskSection;
import com.vk.dto.masks.MasksCatalogItem;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: MasksGetCatalogEffectsNoAuth.kt */
/* loaded from: classes15.dex */
public final class uh10 extends rsg0<ArrayList<MasksCatalogItem>> {
    public final String s;
    public final String t;

    public uh10(int i, String str, String str2) {
        super("masks.getEffectsClips");
        this.s = str;
        this.t = str2;
        C(0, "model_version");
        C(i, "code_version");
        C(1, "extended");
        C(1, "need_counters");
        this.d = true;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        VKList<Mask> vKList = new gi10(jSONObject.getJSONObject("response")).a;
        return e43.a(new MasksCatalogItem(new MaskSection(-1, this.t, this.s, false, vKList.size()), vKList));
    }
}
