package xsna;

import android.util.ArrayMap;
import android.util.SparseArray;
import com.vk.api.parsers.BadgesParsers;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.data.VKList;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.parse.NewsfeedParseException;
import com.vk.toggle.features.SmbAdFeatures;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: NewsfeedGetSubscribersFeed.kt */
/* loaded from: classes4.dex */
public final class ok60 extends rsg0<VKList<NewsEntry>> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        final ArrayMap r = tci.r(jSONObject2);
        final SparseArray<BadgeItem> b = BadgesParsers.b(jSONObject2);
        final Map e = vj90.e(jSONObject2);
        final com.vk.dto.newsfeed.entries.a aVar = new com.vk.dto.newsfeed.entries.a();
        SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
        smbAdFeatures.getClass();
        final boolean a = com.vk.toggle.b.A.a(smbAdFeatures);
        return new VKList(jSONObject2, new izs() { // from class: xsna.ym60
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                JSONObject jSONObject3 = (JSONObject) obj;
                try {
                    return com.vk.dto.newsfeed.entries.a.b(com.vk.dto.newsfeed.entries.a.this, jSONObject3.optString("type", jSONObject3.optString("post_type")), jSONObject3, r, b, e, a, null, 64);
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(new NewsfeedParseException(th));
                    return null;
                }
            }
        });
    }
}
