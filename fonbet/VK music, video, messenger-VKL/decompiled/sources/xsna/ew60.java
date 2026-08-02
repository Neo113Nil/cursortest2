package xsna;

import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.NewsfeedList;
import java.util.List;
import java.util.Map;

/* compiled from: NewsfeedRemotePage.kt */
/* loaded from: classes4.dex */
public final class ew60 extends lu60 {
    public final List<NewsfeedList> d;
    public final Map<String, ReactionSet> e;

    /* JADX WARN: Multi-variable type inference failed */
    public ew60(List<? extends NewsEntry> list, String str, Boolean bool, List<? extends NewsfeedList> list2, Map<String, ReactionSet> map) {
        super(list, str, bool);
        this.d = list2;
        this.e = map;
    }
}
