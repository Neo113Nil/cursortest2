package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.jb60;
import xsna.qn60;

/* compiled from: ExpandAttachmentsCutEditorAction.kt */
/* loaded from: classes4.dex */
public final class p7q implements qn60.b {
    public final NewsEntryWithAttachments a;
    public final pn60 b;

    /* compiled from: ExpandAttachmentsCutEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public p7q(NewsEntryWithAttachments newsEntryWithAttachments, pn60 pn60Var) {
        this.a = newsEntryWithAttachments;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        NewsEntryWithAttachments newsEntryWithAttachments = this.a;
        HashSet c = aVar.c(new jb60.a(newsEntryWithAttachments));
        if (c == null) {
            return;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            NewsEntry newsEntry = (NewsEntry) it.next();
            NewsEntryWithAttachments newsEntryWithAttachments2 = null;
            if (!newsEntryWithAttachments.equals(newsEntry)) {
                if (newsEntry instanceof Post) {
                    Post post = (Post) newsEntry;
                    if (epx.f(post.D, newsEntryWithAttachments)) {
                        newsEntryWithAttachments2 = post.D;
                    }
                }
                if (newsEntry instanceof PromoPost) {
                    PromoPost promoPost = (PromoPost) newsEntry;
                    if (epx.f(promoPost.n, newsEntryWithAttachments)) {
                        newsEntryWithAttachments2 = promoPost.n;
                    }
                }
            } else if (newsEntry instanceof NewsEntryWithAttachments) {
                newsEntryWithAttachments2 = (NewsEntryWithAttachments) newsEntry;
            }
            if (newsEntryWithAttachments2 != null) {
                newsEntryWithAttachments2.Hb().e = false;
            }
        }
        aVar.f(c, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
