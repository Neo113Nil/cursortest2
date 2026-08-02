package xsna;

import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cuc0 implements izs {
    public final /* synthetic */ Comment b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Post e;

    public /* synthetic */ cuc0(Comment comment, int i, boolean z, Post post) {
        this.b = comment;
        this.c = i;
        this.d = z;
        this.e = post;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Comment comment = this.b;
        comment.h = this.c;
        comment.i = this.d;
        comment.G2();
        iuc0 iuc0Var = iuc0.b;
        Post post = this.e;
        if ((post.C instanceof CommentsActivity) && comment.p) {
            comment.r = comment.i;
        }
        ysg0.b.a(new b0x(post.m, post.n, comment.b));
        j03.l(th);
        com.vk.metrics.eventtracking.b.a.a(th);
        return s3q0.a;
    }
}
