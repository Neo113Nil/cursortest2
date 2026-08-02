package xsna;

import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: ShowReactionsFeedPhotosBlockEditorAction.kt */
/* loaded from: classes4.dex */
public final class djj0 implements qn60.b {
    public final c5f0 a;
    public final pn60 b;

    /* compiled from: ShowReactionsFeedPhotosBlockEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public djj0(c5f0 c5f0Var, pn60 pn60Var) {
        this.a = c5f0Var;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        c5f0 c5f0Var = this.a;
        if (c5f0Var.a.isEmpty()) {
            return;
        }
        aVar.e(c5f0Var, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
