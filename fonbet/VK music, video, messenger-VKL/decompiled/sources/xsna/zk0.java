package xsna;

import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;
import java.util.List;
import xsna.qn60;

/* compiled from: AddCommentsActivityToPostEditorAction.kt */
/* loaded from: classes4.dex */
public final class zk0 implements qn60.b {
    public final pn60 a;
    public final Post b;
    public final CommentsActivity c;

    public zk0(pn60 pn60Var, Post post, CommentsActivity commentsActivity) {
        this.a = pn60Var;
        this.b = post;
        this.c = commentsActivity;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        qn60 qn60Var = aVar.a;
        ux80<Object, List<ol60>> ux80Var = qn60Var.b;
        uvh0 uvh0Var = qn60Var.c;
        Post post = this.b;
        if (aVar.b(post)) {
            uvh0Var.b(post);
            List<ol60> d = ux80Var.b.d(post);
            List<ol60> c = pn60.c(this.a, post, new n3c0(post, this.c), null, 12);
            qn60.a.n(c, d);
            ux80Var.b(post, post, c);
            uvh0Var.a(post);
        }
    }
}
