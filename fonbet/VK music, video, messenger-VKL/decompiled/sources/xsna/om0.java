package xsna;

import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedDeduplicator;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: AddOnTopFreshNewsEditorAction.kt */
/* loaded from: classes4.dex */
public final class om0 implements qn60.b {
    public final List<NewsEntry> a;
    public final qtc0 b;
    public final int c;
    public final pn60 d;
    public final NewsfeedDeduplicator e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new nm0(0));

    /* compiled from: AddOnTopFreshNewsEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public om0(List<? extends NewsEntry> list, qtc0 qtc0Var, int i, pn60 pn60Var, NewsfeedDeduplicator newsfeedDeduplicator) {
        this.a = list;
        this.b = qtc0Var;
        this.c = i;
        this.d = pn60Var;
        this.e = newsfeedDeduplicator;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        qn60 qn60Var = aVar.a;
        int i = this.c;
        if (i >= 0) {
            int i2 = i + 1;
            List O0 = j5g.O0(qn60Var.c());
            if (!O0.isEmpty()) {
                int size = O0.size() - 1;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 <= size) {
                    size = i2;
                }
                aVar.i(O0.subList(size, O0.size()));
            }
        }
        List<NewsEntry> list = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (NewsEntry newsEntry : list) {
            if (aVar.b(newsEntry)) {
                arrayList2.add(newsEntry);
            } else {
                arrayList.add(newsEntry);
            }
        }
        Object k0 = j5g.k0(qn60Var.b.c);
        NewsEntry newsEntry2 = k0 instanceof NewsEntry ? (NewsEntry) k0 : null;
        if (newsEntry2 != null && ((newsEntry2 instanceof PromoPost) || (newsEntry2 instanceof ShitAttachment) || (newsEntry2 instanceof Html5Entry))) {
            NewsEntry newsEntry3 = (NewsEntry) j5g.a0(arrayList);
            if ((newsEntry3 instanceof PromoPost) || (newsEntry3 instanceof ShitAttachment) || (newsEntry3 instanceof Html5Entry)) {
                arrayList.remove(0);
            }
        }
        aVar.l(arrayList2, new a(1, this.d, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        LinkedHashSet c = qn60Var.c();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : c) {
            if (obj instanceof NewsEntry) {
                arrayList3.add(obj);
            }
        }
        aVar.f(this.e.a(NewsfeedDeduplicator.ActionType.Append, arrayList3, arrayList), new m7(this, 2));
    }
}
