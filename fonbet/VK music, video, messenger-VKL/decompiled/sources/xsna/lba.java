package xsna;

import android.util.ArrayMap;
import com.vk.catalog2.common.dto.api.news.CatalogNewsEntry;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* compiled from: CatalogNewsEntryParsers.kt */
/* loaded from: classes16.dex */
public final class lba extends aay<CatalogNewsEntry> {
    public final HashMap a;
    public final com.vk.dto.newsfeed.entries.a b = new com.vk.dto.newsfeed.entries.a();
    public final ArrayMap<String, ReactionSet> c;

    public lba(HashMap hashMap, LinkedHashMap linkedHashMap) {
        this.a = hashMap;
        ArrayMap<String, ReactionSet> arrayMap = new ArrayMap<>();
        arrayMap.putAll(linkedHashMap);
        this.c = arrayMap;
    }

    @Override // xsna.aay
    public final CatalogNewsEntry a(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        NewsEntry b = com.vk.dto.newsfeed.entries.a.b(this.b, jSONObject.getJSONObject(DatabaseHelper.ITEM_COLUMN_NAME).getString("type"), jSONObject.getJSONObject(DatabaseHelper.ITEM_COLUMN_NAME), this.c, null, this.a, false, null, 96);
        if (b == null) {
            return null;
        }
        return new CatalogNewsEntry(string, b);
    }
}
