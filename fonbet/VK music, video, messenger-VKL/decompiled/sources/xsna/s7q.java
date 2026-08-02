package xsna;

import com.vk.feed.core.models.dzen.DzenNews;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: ExpandDzenNewsEditorAction.kt */
/* loaded from: classes4.dex */
public final class s7q implements qn60.b {
    public final DzenNews a;
    public final pn60 b;

    /* compiled from: ExpandDzenNewsEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public s7q(DzenNews dzenNews, pn60 pn60Var) {
        this.a = dzenNews;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        DzenNews dzenNews = this.a;
        if (aVar.b(dzenNews)) {
            int i = dzenNews.k + dzenNews.l;
            int size = dzenNews.j.size();
            if (i > size) {
                i = size;
            }
            dzenNews.k = i;
            dzenNews.q = i == dzenNews.j.size();
            aVar.e(dzenNews, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        }
    }
}
