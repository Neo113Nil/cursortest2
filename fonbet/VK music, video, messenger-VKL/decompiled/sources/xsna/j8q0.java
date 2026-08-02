package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.data.NewsComment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.j6c0;
import xsna.qn60;

/* compiled from: UpdateInlineCommentEditorAction.kt */
/* loaded from: classes4.dex */
public final class j8q0 implements qn60.b {
    public final NewsComment a;
    public final UserId b;
    public final int c;
    public final pn60 d;

    /* compiled from: UpdateInlineCommentEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public j8q0(NewsComment newsComment, UserId userId, int i, pn60 pn60Var) {
        this.a = newsComment;
        this.b = userId;
        this.c = i;
        this.d = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        ArrayList<Comment> arrayList;
        NewsComment newsComment;
        HashSet c = aVar.c(new j6c0.a(this.b, this.c));
        if (c == null) {
            return;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Activity activity = ((Post) it.next()).C;
            Object obj = null;
            CommentsActivity commentsActivity = activity instanceof CommentsActivity ? (CommentsActivity) activity : null;
            if (commentsActivity != null && (arrayList = commentsActivity.d) != null) {
                Iterator<T> it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    newsComment = this.a;
                    if (!hasNext) {
                        break;
                    }
                    Object next = it2.next();
                    if (((Comment) next).b == newsComment.i) {
                        obj = next;
                        break;
                    }
                }
                Comment comment = (Comment) obj;
                if (comment != null) {
                    if (!epx.f(comment.g, newsComment.b)) {
                        comment.g = newsComment.b;
                        comment.u = newsComment.I.a();
                        comment.v = newsComment.Z;
                    }
                    comment.i = newsComment.q;
                    comment.h = newsComment.p;
                    List<Attachment> list = comment.j;
                    if (list != null) {
                        list.clear();
                        list.addAll(newsComment.J);
                    } else {
                        comment.j = new ArrayList(newsComment.J);
                    }
                    comment.k = newsComment.K;
                }
            }
        }
        aVar.f(c, new a(1, this.d, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
