package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.reactions.ItemReactions;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.j6c0;
import xsna.qn60;
import xsna.rym;
import xsna.w5e0;

/* compiled from: UpdateEntriesAfterRepostEditorAction.kt */
/* loaded from: classes4.dex */
public final class e8q0 implements qn60.b {
    public final u0q a;
    public final pn60 b;
    public final d2f0 c = new d2f0();

    /* compiled from: UpdateEntriesAfterRepostEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    /* compiled from: UpdateEntriesAfterRepostEditorAction.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public e8q0(u0q u0qVar, pn60 pn60Var) {
        this.a = u0qVar;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        ArrayList arrayList;
        u0q u0qVar = this.a;
        UserId userId = u0qVar.b;
        int i = u0qVar.a;
        HashSet c = aVar.c(new j6c0.a(userId, i));
        UserId userId2 = u0qVar.b;
        HashSet c2 = aVar.c(new w5e0.a(userId2, i));
        HashSet c3 = aVar.c(new rym.a(userId2, i));
        HashSet hashSet = new HashSet();
        if (c != null) {
            hashSet.addAll(c);
        }
        if (c2 != null) {
            hashSet.addAll(c2);
        }
        if (c3 != null) {
            arrayList = new ArrayList();
            Iterator it = c3.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = ((Digest) it.next()).q;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    Post post = (Post) next;
                    if (epx.f(post.m, userId2) && post.n == i) {
                        arrayList3.add(next);
                    }
                }
                g5g.y(arrayList3, arrayList);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            Object obj = (NewsEntry) it3.next();
            ItemReactions itemReactions = u0qVar.e;
            if ((obj instanceof o2f0) && itemReactions != null) {
                this.c.getClass();
                d2f0.c((o2f0) obj, itemReactions);
            }
            if (obj instanceof c6z) {
                grj0 grj0Var = (grj0) obj;
                grj0Var.f(u0qVar.c);
                c6z c6zVar = (c6z) obj;
                c6zVar.U8(u0qVar.d);
                if (u0qVar.f) {
                    grj0Var.f0(true);
                }
                if (u0qVar.g) {
                    c6zVar.W2();
                }
            }
            if (aVar.b(obj)) {
                aVar.e(obj, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
            }
        }
        if (c3 == null || c3.isEmpty()) {
            return;
        }
        aVar.f(c3, new b(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
