package xsna;

import com.vk.dto.reactions.ReactionSet;
import com.vk.newsfeed.api.data.NewsfeedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: NewsfeedHeaterRemotePage.kt */
/* loaded from: classes4.dex */
public final class bl60 extends lu60 {
    public final List<NewsfeedList> d;
    public final HashMap e;
    public final Map<String, ReactionSet> f;

    public bl60(ArrayList arrayList, String str, Boolean bool, List list, HashMap hashMap, Map map) {
        super(arrayList, str, bool);
        this.d = list;
        this.e = hashMap;
        this.f = map;
    }
}
