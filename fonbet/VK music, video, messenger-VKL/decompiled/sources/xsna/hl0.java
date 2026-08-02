package xsna;

import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: AddFaveCartEditorAction.kt */
/* loaded from: classes4.dex */
public final class hl0 implements qn60.b {
    public final umq a;
    public final pn60 b;

    /* compiled from: AddFaveCartEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public hl0(umq umqVar, pn60 pn60Var) {
        this.a = umqVar;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        umq umqVar = this.a;
        if (umqVar != null) {
            aVar.e(umqVar, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        } else {
            aVar.j(fpf0.a(umq.class));
        }
    }
}
