package xsna;

import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PostFriendCommentsModifier.kt */
/* loaded from: classes4.dex */
public final class n3c0 implements wm60 {
    public final Post a;
    public final CommentsActivity b;

    public n3c0(Post post, CommentsActivity commentsActivity) {
        this.a = post;
        this.b = commentsActivity;
    }

    @Override // xsna.wm60
    public final boolean a(wm60 wm60Var) {
        return !(wm60Var instanceof n3c0);
    }

    @Override // xsna.wm60
    public final List<u1c0> c(List<? extends u1c0> list, i170 i170Var) {
        ArrayList arrayList = new ArrayList(list);
        if (epx.f(i170Var.a, this.a)) {
            com.vk.newsfeed.common.util.j jVar = new com.vk.newsfeed.common.util.j();
            Post post = this.a;
            arrayList.addAll(jVar.u(post, post, this.b, "feed_top", false));
        }
        return arrayList;
    }
}
