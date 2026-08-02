package xsna;

import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: SetSearchStoriesEditorAction.kt */
/* loaded from: classes4.dex */
public final class zyi0 implements qn60.b {
    public final ry60 a;
    public final pn60 b;

    /* compiled from: SetSearchStoriesEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    /* compiled from: SetSearchStoriesEditorAction.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    /* compiled from: SetSearchStoriesEditorAction.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public zyi0(ry60 ry60Var, pn60 pn60Var) {
        this.a = ry60Var;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        ry60 ry60Var = this.a;
        if (ry60Var == null) {
            aVar.j(fpf0.a(ry60.class));
            return;
        }
        ry60 ry60Var2 = (ry60) aVar.d(fpf0.a(ry60.class));
        if (ry60Var2 == null) {
            aVar.g(ry60Var, new c(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0), new a60(1));
        } else if (ry60Var2 == ry60Var) {
            aVar.e(ry60Var, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        } else {
            aVar.k(ry60Var2, ry60Var, new b(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        }
    }
}
