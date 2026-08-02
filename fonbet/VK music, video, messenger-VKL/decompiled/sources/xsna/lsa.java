package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.bb60;
import xsna.qn60;

/* compiled from: ChangeObsceneTextFilterStateEditorAction.kt */
/* loaded from: classes4.dex */
public final class lsa implements qn60.b {
    public final boolean a;
    public final pn60 b;

    /* compiled from: ChangeObsceneTextFilterStateEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public lsa(boolean z, pn60 pn60Var) {
        this.a = z;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        HashSet c = aVar.c(bb60.a.a);
        if (c == null) {
            return;
        }
        ab60 ab60Var = new ab60();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ab60Var.d(di60.R((NewsEntry) it.next()), this.a);
        }
        aVar.f(c, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
