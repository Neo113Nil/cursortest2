package xsna;

import android.util.ArrayMap;
import android.util.SparseArray;
import com.vk.api.parsers.BadgesParsers;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import xsna.ak90;

/* compiled from: NewsfeedGetBreakingNewsBlockContent.kt */
/* loaded from: classes4.dex */
public final class ak60 extends rsg0<Digest> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        NewsEntriesContainer newsEntriesContainer = new NewsEntriesContainer(null, null, 3, null);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("block");
        Map e = vj90.e(jSONObject2);
        ArrayMap r = tci.r(jSONObject2);
        SparseArray<BadgeItem> b = BadgesParsers.b(jSONObject2);
        NewsEntry b2 = com.vk.dto.newsfeed.entries.a.b(new com.vk.dto.newsfeed.entries.a(), jSONObject3.optString("type", jSONObject3.optString("post_type")), jSONObject3, r, b, e, false, ak90.a.a.getSTUB(), 32);
        List<NewsEntry> list = newsEntriesContainer.c;
        if (b2 != null) {
            list.add(b2);
        }
        return (Digest) j5g.a0(list);
    }
}
