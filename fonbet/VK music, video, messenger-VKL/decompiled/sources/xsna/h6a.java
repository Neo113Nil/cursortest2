package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.search.model.VideoSearchFiltersImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: CatalogGetOwnerVideoSearch.kt */
/* loaded from: classes16.dex */
public final class h6a extends rsg0<hda> {
    public final wba s;

    public h6a(long j, wba wbaVar, String str, boolean z, String str2, VideoSearchFiltersImpl videoSearchFiltersImpl, boolean z2) {
        super("catalog.getOwnerVideosSearch");
        this.s = wbaVar;
        j("ref", "search_owner_videos");
        K(CampaignEx.JSON_KEY_AD_Q, str);
        D(j, "owner_id");
        C(20, "count");
        R("no_spellcheck", z2);
        R("show_suggests", z);
        K("suggest_trackcode", "");
        K("screen_ref", str2);
        K("hd", videoSearchFiltersImpl.d ? "1" : "0");
        K("sort", String.valueOf(videoSearchFiltersImpl.g));
        K("live", videoSearchFiltersImpl.e ? "1" : "0");
        C(2, "func_v");
        int i = videoSearchFiltersImpl.i;
        if (i > 0) {
            C(i, "longer");
        } else if (i < 0) {
            C(Math.abs(i), "shorter");
        }
        int i2 = videoSearchFiltersImpl.b;
        if (i2 > 0) {
            C(i2, "date");
        }
        C(1, "need_blocks");
        ahn.D(this);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        hda c = this.s.c(jSONObject.getJSONObject("response"));
        List<CatalogBlock> list = ((CatalogCatalog) c.a).Ab().i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((CatalogBlock) obj).c == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((CatalogBlock) it.next()).d = "search_video";
        }
        return c;
    }
}
