package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.data.NewsComment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.j6c0;
import xsna.qn60;

/* compiled from: InsertInlineCommentEditorAction.kt */
/* loaded from: classes4.dex */
public final class o3x implements qn60.b {
    public final UserId a;
    public final int b;
    public final iag c;
    public final pn60 d;

    /* compiled from: InsertInlineCommentEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public o3x(UserId userId, int i, iag iagVar, pn60 pn60Var) {
        this.a = userId;
        this.b = i;
        this.c = iagVar;
        this.d = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Iterator it;
        HashSet c = aVar.c(new j6c0.a(this.a, this.b));
        if (c != null) {
            Iterator it2 = c.iterator();
            while (it2.hasNext()) {
                Post post = (Post) it2.next();
                iag iagVar = this.c;
                NewsComment newsComment = iagVar instanceof NewsComment ? (NewsComment) iagVar : null;
                if (newsComment != null) {
                    Activity activity = post.C;
                    CommentsActivity commentsActivity = activity instanceof CommentsActivity ? (CommentsActivity) activity : null;
                    if (commentsActivity != null) {
                        Map<UserId, Owner> map = commentsActivity.e;
                        it = it2;
                        Comment comment = new Comment(newsComment.i, newsComment.j, null, 0, newsComment.f, newsComment.b, 0, false, newsComment.J, newsComment.K, newsComment.l, newsComment.M, newsComment.P, newsComment.Q, newsComment.H, newsComment.A, newsComment.B, newsComment.C, newsComment.D, 204, null);
                        ArrayList<Comment> arrayList = commentsActivity.d;
                        if (arrayList != null) {
                            arrayList.add(comment);
                        }
                        post.E.e++;
                        if (!map.containsKey(comment.c)) {
                            Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                            owner.b = newsComment.j;
                            owner.c = newsComment.c;
                            owner.e = newsComment.h;
                            owner.f = newsComment.N;
                            owner.k = newsComment.O;
                            if (o25.a().a(comment.c)) {
                                cn o = o25.a().o();
                                owner.m = o.a();
                                owner.n = (String) o.n.getValue();
                            } else {
                                owner.m = newsComment.c;
                            }
                            owner.B(newsComment.T);
                            map.put(comment.c, owner);
                        }
                        aVar.e(post, new a(1, this.d, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
                        it2 = it;
                    }
                }
                it = it2;
                aVar.e(post, new a(1, this.d, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
                it2 = it;
            }
        }
    }
}
