package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.j6c0;
import xsna.qn60;
import xsna.w5e0;
import xsna.xa60;

/* compiled from: ChangeNewsEntryObsceneTextFilterStateEditorAction.kt */
/* loaded from: classes4.dex */
public final class ksa implements qn60.b {
    public final xa60 a;
    public final pn60 b;

    /* compiled from: ChangeNewsEntryObsceneTextFilterStateEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public ksa(xa60 xa60Var, pn60 pn60Var) {
        this.a = xa60Var;
        this.b = pn60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // xsna.qn60.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(qn60.a aVar) {
        xa60 xa60Var = this.a;
        NewsEntry newsEntry = xa60Var.a;
        if (newsEntry == null) {
            xa60.a aVar2 = xa60Var.b;
            if (aVar2 != null) {
                int i = aVar2.b;
                UserId userId = aVar2.a;
                HashSet c = aVar.c(new j6c0.a(userId, i));
                if (c == null || c.isEmpty()) {
                    HashSet c2 = aVar.c(new w5e0.a(userId, i));
                    if (c2 != null && !c2.isEmpty()) {
                        newsEntry = (NewsEntry) j5g.Z(c2);
                    }
                } else {
                    newsEntry = (NewsEntry) j5g.Z(c);
                }
                if (newsEntry == null) {
                    return;
                }
            }
            newsEntry = null;
            if (newsEntry == null) {
            }
        }
        if (aVar.b(newsEntry)) {
            ab60 ab60Var = new ab60();
            Iterator it = Collections.singletonList(newsEntry).iterator();
            while (it.hasNext()) {
                ab60Var.c(di60.R((NewsEntry) it.next()), xa60Var);
            }
            aVar.e(newsEntry, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        }
    }
}
