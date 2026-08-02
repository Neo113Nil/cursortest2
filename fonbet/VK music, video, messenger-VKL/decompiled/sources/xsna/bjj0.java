package xsna;

import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: ShowPlaceholderEditorAction.kt */
/* loaded from: classes4.dex */
public final class bjj0 implements qn60.b {
    public final int a;
    public final lu60 b;
    public final pn60 c;

    /* compiled from: ShowPlaceholderEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public bjj0(int i, lu60 lu60Var, pn60 pn60Var) {
        this.a = i;
        this.b = lu60Var;
        this.c = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        lu60 lu60Var = this.b;
        if (lu60Var.a().isEmpty()) {
            String b = lu60Var.b();
            if (b == null || b.length() == 0) {
                aVar.e(new mv60(this.a), new a(1, this.c, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
            }
        }
    }
}
