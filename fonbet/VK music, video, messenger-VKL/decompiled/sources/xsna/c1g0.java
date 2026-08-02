package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aoq;
import xsna.k8q0;
import xsna.qn60;
import xsna.v2n;
import xsna.w5e0;
import xsna.znq;

/* compiled from: ReplaceNewsEntryEditorAction.kt */
/* loaded from: classes4.dex */
public final class c1g0 implements qn60.b {
    public final NewsEntry a;
    public final NewsEntry b;
    public final pn60 c;
    public final k8q0 d;

    /* compiled from: ReplaceNewsEntryEditorAction.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return c1g0.b((c1g0) this.receiver, obj);
        }
    }

    public c1g0(NewsEntry newsEntry, NewsEntry newsEntry2, pn60 pn60Var, k8q0 k8q0Var) {
        this.a = newsEntry;
        this.b = newsEntry2;
        this.c = pn60Var;
        this.d = k8q0Var;
    }

    public static final List b(c1g0 c1g0Var, Object obj) {
        return pn60.c(c1g0Var.c, obj, c1g0Var.d instanceof k8q0.a ? new k37(new p6s()) : null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        c1g0 c1g0Var;
        DiscoverGridItem Eb;
        NewsEntry newsEntry = this.a;
        NewsEntry newsEntry2 = this.b;
        if (newsEntry == newsEntry2 && aVar.b(newsEntry2)) {
            aVar.e(newsEntry2, new a(1, this, c1g0.class, "transform", "transform(Ljava/lang/Object;)Ljava/util/List;", 0));
            return;
        }
        if (newsEntry2 instanceof Post) {
            Post post = (Post) newsEntry2;
            UserId userId = post.m;
            int i = post.n;
            HashSet c = aVar.c(new w5e0.a(userId, i));
            PromoPost promoPost = c != null ? (PromoPost) j5g.Z(c) : null;
            if (promoPost != null) {
                c1g0Var = this;
                aVar.e(promoPost, new d1g0(1, c1g0Var, c1g0.class, "transform", "transform(Ljava/lang/Object;)Ljava/util/List;", 0));
            } else {
                HashSet c2 = aVar.c(new znq.a(post.m, i));
                FaveEntry faveEntry = c2 != null ? (FaveEntry) j5g.Z(c2) : null;
                if (faveEntry != null) {
                    FaveItem faveItem = faveEntry.i;
                    c1g0Var = this;
                    aVar.k(faveEntry, new FaveEntry(new FaveItem(faveItem.b, faveItem.c, faveItem.d, faveItem.e, (gmq) newsEntry2), faveEntry.j, faveEntry.k), new e1g0(1, c1g0Var, c1g0.class, "transform", "transform(Ljava/lang/Object;)Ljava/util/List;", 0));
                } else {
                    c1g0Var = this;
                    aVar.k(newsEntry, newsEntry2, new f1g0(1, c1g0Var, c1g0.class, "transform", "transform(Ljava/lang/Object;)Ljava/util/List;", 0));
                }
            }
        } else if (newsEntry2 instanceof Videos) {
            Videos videos = (Videos) newsEntry2;
            VideoAttachment Nb = videos.Nb();
            VideoFile videoFile = Nb != null ? Nb.k : null;
            if (videoFile != null) {
                HashSet c3 = aVar.c(new aoq.a(videoFile.I0(), videoFile.o0()));
                FaveEntry faveEntry2 = c3 != null ? (FaveEntry) j5g.Z(c3) : null;
                if (faveEntry2 != null) {
                    FaveItem faveItem2 = faveEntry2.i;
                    aVar.k(faveEntry2, new FaveEntry(new FaveItem(faveItem2.b, faveItem2.c, faveItem2.d, faveItem2.e, Nb), faveEntry2.j, faveEntry2.k), new h1g0(1, this, c1g0.class, "transform", "transform(Ljava/lang/Object;)Ljava/util/List;", 0));
                } else {
                    aVar.k(newsEntry, videos, new i1g0(1, this, c1g0.class, "transform", "transform(Ljava/lang/Object;)Ljava/util/List;", 0));
                }
            } else {
                aVar.k(newsEntry, videos, new j1g0(1, this, c1g0.class, "transform", "transform(Ljava/lang/Object;)Ljava/util/List;", 0));
            }
            c1g0Var = this;
        } else {
            c1g0Var = this;
            aVar.k(newsEntry, newsEntry2, new g1g0(1, c1g0Var, c1g0.class, "transform", "transform(Ljava/lang/Object;)Ljava/util/List;", 0));
        }
        HashSet c4 = aVar.c(new v2n.a(newsEntry));
        if (c4 != null) {
            Iterator it = c4.iterator();
            while (it.hasNext()) {
                DiscoverMediaBlock discoverMediaBlock = (DiscoverMediaBlock) it.next();
                if (aVar.b(discoverMediaBlock) && (Eb = discoverMediaBlock.Eb(newsEntry)) != null) {
                    Eb.c.d = newsEntry2.d;
                    qn60 qn60Var = aVar.a;
                    ux80<Object, List<ol60>> ux80Var = qn60Var.b;
                    List<ol60> d = ux80Var.b.d(discoverMediaBlock);
                    List<ol60> c5 = pn60.c(c1g0Var.c, discoverMediaBlock, new u2n(new w0g0(newsEntry2)), null, 12);
                    qn60.a.n(c5, d);
                    ux80Var.put(discoverMediaBlock, c5);
                    qn60Var.c.a(discoverMediaBlock);
                }
            }
        }
    }
}
