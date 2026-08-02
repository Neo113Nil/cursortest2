package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: ReplaceAllNewsEntryEditorAction.kt */
/* loaded from: classes4.dex */
public final class t0g0 implements qn60.b {
    public final List<NewsEntry> a;
    public final pn60 b;

    /* compiled from: ReplaceAllNewsEntryEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0g0(List<? extends NewsEntry> list, pn60 pn60Var) {
        this.a = list;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        aVar.l(this.a, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
