package xsna;

import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;

/* compiled from: ActivityLikesPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class na0 extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        Activity activity;
        ArrayList<String> arrayList;
        NewsEntry newsEntry = u1c0Var.a;
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        return Math.min((post == null || (activity = post.C) == null || (arrayList = activity.c) == null) ? 0 : arrayList.size(), 3);
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        Activity activity;
        ArrayList<String> arrayList;
        NewsEntry newsEntry = u1c0Var.a;
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        if (post == null || (activity = post.C) == null || (arrayList = activity.c) == null) {
            return null;
        }
        return (String) j5g.b0(i, arrayList);
    }
}
