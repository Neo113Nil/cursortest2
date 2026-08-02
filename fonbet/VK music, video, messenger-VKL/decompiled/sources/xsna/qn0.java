package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: AddSituationalSuggestEditorAction.kt */
/* loaded from: classes4.dex */
public final class qn0 implements qn60.b {
    public final SituationalSuggest a;
    public final pn60 b;

    /* compiled from: AddSituationalSuggestEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public qn0(SituationalSuggest situationalSuggest, pn60 pn60Var) {
        this.a = situationalSuggest;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        SituationalSuggest situationalSuggest = this.a;
        if (situationalSuggest != null && epx.f(situationalSuggest.c, "fixed")) {
            aVar.e(situationalSuggest, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        }
    }
}
