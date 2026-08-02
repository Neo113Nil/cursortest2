package xsna;

import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;

/* compiled from: ActivityCommentPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class g90 extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 1;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        Activity activity;
        ArrayList<String> arrayList;
        NewsEntry newsEntry = u1c0Var.a;
        if (!(newsEntry instanceof Post) || (activity = ((Post) newsEntry).C) == null || (arrayList = activity.c) == null) {
            return null;
        }
        return (String) j5g.a0(arrayList);
    }
}
