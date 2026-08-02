package xsna;

import com.vk.dto.newsfeed.activities.LikesActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PostFriendLikesModifier.kt */
/* loaded from: classes4.dex */
public final class o3c0 implements wm60 {
    public final Post a;
    public final LikesActivity b;

    public o3c0(Post post, LikesActivity likesActivity) {
        this.a = post;
        this.b = likesActivity;
    }

    @Override // xsna.wm60
    public final boolean a(wm60 wm60Var) {
        return !(wm60Var instanceof o3c0);
    }

    @Override // xsna.wm60
    public final List<u1c0> c(List<? extends u1c0> list, i170 i170Var) {
        ArrayList arrayList = new ArrayList(list);
        NewsEntry newsEntry = i170Var.a;
        Post post = this.a;
        if (epx.f(newsEntry, post)) {
            new com.vk.newsfeed.common.util.j();
            u1c0 i = com.vk.newsfeed.common.util.j.i(post, post, this.b, true);
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((u1c0) it.next()).c == 1) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                arrayList.add(i2, i);
                return arrayList;
            }
            arrayList.add(i);
        }
        return arrayList;
    }
}
