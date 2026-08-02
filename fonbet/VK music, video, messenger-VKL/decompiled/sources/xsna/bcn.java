package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: DismissFeedbackEditorAction.kt */
/* loaded from: classes4.dex */
public final class bcn implements qn60.b {
    public final NewsEntry a;
    public final pn60 b;

    /* compiled from: DismissFeedbackEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public bcn(NewsEntry newsEntry, pn60 pn60Var) {
        this.a = newsEntry;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Feedback feedback;
        NewsEntry newsEntry = this.a;
        if (aVar.b(newsEntry)) {
            Post R = di60.R(newsEntry);
            if (R != null && (feedback = R.g) != null) {
                feedback.e = true;
            }
            aVar.e(newsEntry, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        }
    }
}
