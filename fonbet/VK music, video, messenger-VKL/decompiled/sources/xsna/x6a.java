package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.search.model.VideoSearchFiltersImpl;
import org.json.JSONObject;

/* compiled from: CatalogGetVideoSearch.kt */
/* loaded from: classes16.dex */
public final class x6a extends rsg0<hda> {
    public final wba s;

    public x6a(wba wbaVar, String str, String str2, String str3, boolean z, String str4, VideoSearchFiltersImpl videoSearchFiltersImpl, boolean z2) {
        super("catalog.getVideoSearch");
        this.s = wbaVar;
        j("ref", "");
        K(CampaignEx.JSON_KEY_AD_Q, str);
        C(20, "count");
        R("no_spellcheck", z2);
        if (str2 != null) {
            K("input_method", str2);
        }
        R("show_suggests", z);
        K("suggest_trackcode", str3);
        K("screen_ref", str4);
        String str5 = null;
        if (videoSearchFiltersImpl.f) {
            K("content_type", "author");
        } else {
            String str6 = videoSearchFiltersImpl.l;
            str6 = (str6 == null || str6.equals("all")) ? null : str6;
            if (str6 != null) {
                K("content_type", str6);
            }
        }
        String str7 = videoSearchFiltersImpl.o;
        if (str7 != null) {
            K("date", str7);
        }
        String str8 = videoSearchFiltersImpl.m;
        str8 = (str8 == null || str8.equals("any")) ? null : str8;
        if (str8 != null) {
            K("duration", str8);
        }
        String str9 = videoSearchFiltersImpl.n;
        if (str9 != null && !str9.equals("2")) {
            str5 = str9;
        }
        if (str5 != null) {
            K("sort", str5);
        }
        if (videoSearchFiltersImpl.d) {
            K("hd", "1");
        }
        C(2, "func_v");
        String str10 = videoSearchFiltersImpl.j;
        if (str10 != null) {
            K("category", str10);
        }
        String str11 = videoSearchFiltersImpl.k;
        if (str11 != null) {
            K("search_section_id", str11);
        }
        C(1, "need_blocks");
        K("device_info", zeq0.a());
        ahn.D(this);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.s.c(jSONObject.getJSONObject("response"));
    }
}
