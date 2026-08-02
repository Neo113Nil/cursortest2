package xsna;

import android.util.ArrayMap;
import android.util.SparseArray;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.discover.PhotoDiscoverGridItem;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.discover.DiscoverAction;
import com.vk.feed.core.models.discover.DiscoverSimilarClipsAction;
import com.vk.feed.core.models.discover.DiscoverSimilarPostsAction;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.sdk.SharedKt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class f4n implements gzs {
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ ArrayMap d;
    public final /* synthetic */ SparseArray e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ f4n(JSONObject jSONObject, Map map, ArrayMap arrayMap, SparseArray sparseArray, ArrayList arrayList) {
        this.b = jSONObject;
        this.c = map;
        this.d = arrayMap;
        this.e = sparseArray;
        this.f = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        DiscoverAction discoverAction;
        Object photoDiscoverGridItem;
        JSONObject optJSONObject;
        EntryAttachment c;
        com.vk.dto.newsfeed.entries.a aVar = new com.vk.dto.newsfeed.entries.a();
        JSONObject jSONObject = this.b;
        JSONObject jSONObject2 = jSONObject.getJSONObject(DatabaseHelper.ITEM_COLUMN_NAME);
        String optString = jSONObject2.optString("type");
        ArrayMap arrayMap = this.d;
        SparseArray sparseArray = this.e;
        Map map = this.c;
        NewsEntry c2 = com.vk.dto.newsfeed.entries.a.c(aVar, jSONObject2, arrayMap, sparseArray, map, false, 48);
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("cover");
        Object obj = null;
        String optString2 = optJSONObject2 != null ? optJSONObject2.optString("icon") : null;
        String optString3 = jSONObject.optString("title");
        String optString4 = jSONObject.optString("subtitle");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("cover");
        Attachment attachment = (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject(SharedKt.PARAM_ATTACHMENT)) == null || (c = p6c0.c(optJSONObject, map)) == null) ? null : c.b;
        JSONObject optJSONObject4 = jSONObject.optJSONObject("action");
        if (optJSONObject4 != null) {
            String optString5 = optJSONObject4.optString("type");
            discoverAction = epx.f(optString5, "similar_posts") ? new DiscoverSimilarPostsAction(optJSONObject4.optString("feed_id"), cqm0.a(optJSONObject4.optString("screen_title"))) : epx.f(optString5, "similar_clips") ? new DiscoverSimilarClipsAction(optJSONObject4.optString("screen_title")) : null;
        } else {
            discoverAction = null;
        }
        ArrayList H = dz5.H(jSONObject.optJSONArray("tags"));
        if (!(attachment instanceof VideoAttachment)) {
            if (attachment instanceof PhotoAttachment) {
                photoDiscoverGridItem = new PhotoDiscoverGridItem(optString, c2, (PhotoAttachment) attachment, optInt2, optInt, optString2, optString3, optString4, H, discoverAction, g4n.a(optString4));
            }
            if (obj != null) {
                this.f.add(obj);
            }
            return s3q0.a;
        }
        photoDiscoverGridItem = new VideoDiscoverGridItem(optString, c2, (VideoAttachment) attachment, optInt2, optInt, optString2, optString3, optString4, H, discoverAction, false, g4n.a(optString4), 1024, null);
        obj = photoDiscoverGridItem;
        if (obj != null) {
        }
        return s3q0.a;
    }
}
