package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedDeduplicator;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import xsna.qn60;

/* compiled from: AppendUiDataSetEditorAction.kt */
/* loaded from: classes4.dex */
public final class xc3 implements qn60.b {
    public final List<NewsEntry> a;
    public final qtc0 b;
    public final pn60 c;
    public final NewsfeedDeduplicator d;
    public final h6c0 e;
    public final boolean f;
    public final Map<NewsEntry, Object> g;
    public final Object h = msy.a(LazyThreadSafetyMode.NONE, new x0(2));

    /* JADX WARN: Multi-variable type inference failed */
    public xc3(List<? extends NewsEntry> list, qtc0 qtc0Var, pn60 pn60Var, NewsfeedDeduplicator newsfeedDeduplicator, h6c0 h6c0Var, boolean z, Map<NewsEntry, ? extends Object> map) {
        this.a = list;
        this.b = qtc0Var;
        this.c = pn60Var;
        this.d = newsfeedDeduplicator;
        this.e = h6c0Var;
        this.f = z;
        this.g = map;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        LinkedHashSet c = aVar.a.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c) {
            if (obj instanceof NewsEntry) {
                arrayList.add(obj);
            }
        }
        ArrayList<NewsEntry> a = this.d.a(this.f ? NewsfeedDeduplicator.ActionType.Refresh : NewsfeedDeduplicator.ActionType.Append, arrayList, this.a);
        h6c0 h6c0Var = this.e;
        if (h6c0Var != null) {
            LinkedHashSet<NewsEntry> linkedHashSet = h6c0Var.a;
            linkedHashSet.clear();
            LinkedHashMap linkedHashMap = h6c0Var.b;
            linkedHashMap.clear();
            for (NewsEntry newsEntry : a) {
                if (linkedHashMap.containsKey(k9q0.o(newsEntry))) {
                    linkedHashSet.add(newsEntry);
                    NewsEntry newsEntry2 = (NewsEntry) linkedHashMap.get(k9q0.o(newsEntry));
                    if (newsEntry2 != null) {
                        linkedHashSet.add(newsEntry2);
                    }
                }
                linkedHashMap.put(k9q0.o(newsEntry), newsEntry);
            }
            for (NewsEntry newsEntry3 : linkedHashSet) {
                h6c0Var.c.h(newsEntry3.Cb().b, Integer.valueOf(di60.n(newsEntry3)), k9q0.o(newsEntry3), MobileOfficialAppsFeedStat$TypeFeedDuplicateOwnerPost.Subtype.DETECT_IN_BATCH);
            }
        }
        aVar.f(a, new j5(this, 3));
    }
}
