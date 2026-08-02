package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.qr80;

/* compiled from: InlineCommentTextHolder.kt */
/* loaded from: classes4.dex */
public final class f0x extends rp6<g0x, Post> implements View.OnClickListener, al2 {
    public final h170 E;
    public final com.vk.feed.design.view.newsfeed.inline.a F;
    public int G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0x(ViewGroup viewGroup, h170 h170Var) {
        super(r1, viewGroup);
        com.vk.feed.design.view.newsfeed.inline.a aVar = new com.vk.feed.design.view.newsfeed.inline.a(viewGroup.getContext());
        aVar.setInlineCommentViewId(R.id.container);
        this.E = h170Var;
        com.vk.feed.design.view.newsfeed.inline.a aVar2 = (com.vk.feed.design.view.newsfeed.inline.a) this.itemView;
        this.F = aVar2;
        getContext();
        aVar2.setListener(new e0x(this));
        if (h170Var.e()) {
            aVar2.setPadding(aVar2.getPaddingLeft(), cn70.b(1), aVar2.getPaddingRight(), cn70.b(3));
            aVar2.b.setPadding(cn70.b(8), cn70.b(2), cn70.b(16), cn70.b(1));
            aVar2.setTextFontSize(14.0f);
            aVar2.setNameTextSpaceWidth(cn70.b(7));
        }
    }

    @Override // xsna.rp6
    public final void R6(g0x g0xVar) {
        g0x g0xVar2 = g0xVar;
        boolean e = this.E.e();
        com.vk.feed.design.view.newsfeed.inline.a aVar = this.F;
        if (e) {
            aVar.setAvatar(g0xVar2.q);
            aVar.setCommentStartPadding(g0xVar2.m);
        }
        aVar.a(g0xVar2.k, g0xVar2.n, g0xVar2.p, g0xVar2.r, g0xVar2.t);
        aVar.setContentDescription(g0xVar2.o);
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.G = u1c0Var.f;
        super.a6(u1c0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post post;
        Comment comment;
        ArrayList<Comment> arrayList;
        if (jjc.b()) {
            return;
        }
        g0x g0xVar = (g0x) this.C;
        if (g0xVar != null) {
            post = g0xVar.h;
        } else {
            post = (Post) q6();
            if (post == null) {
                return;
            }
        }
        if (g0xVar != null) {
            comment = g0xVar.i;
        } else {
            Post post2 = (Post) q6();
            Activity activity = post2 != null ? post2.C : null;
            CommentsActivity commentsActivity = activity instanceof CommentsActivity ? (CommentsActivity) activity : null;
            comment = (commentsActivity == null || (arrayList = commentsActivity.d) == null) ? null : (Comment) j5g.b0(this.G, arrayList);
            if (comment == null) {
                return;
            }
        }
        int[] iArr = comment.l;
        int i = comment.b;
        qr80 aVar = !this.E.e() ? new qr80.a(i) : new qr80.d(i);
        if (epx.f(view, this.F.b)) {
            if (iArr != null) {
                if (!(iArr.length == 0)) {
                    this.D.sa(new NewsfeedExternalAction.c.o(post, comment));
                    return;
                }
            }
            this.D.sa(new NewsfeedExternalAction.c.n(post, comment, this.u, aVar));
        }
    }
}
