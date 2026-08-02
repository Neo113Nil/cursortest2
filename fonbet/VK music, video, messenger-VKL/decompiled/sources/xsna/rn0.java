package xsna;

import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: AddStoriesEditorAction.kt */
/* loaded from: classes4.dex */
public final class rn0 implements qn60.b {
    public final int a;
    public final k070 b;
    public final pn60 c;

    /* compiled from: AddStoriesEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    /* compiled from: AddStoriesEditorAction.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    /* compiled from: AddStoriesEditorAction.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public rn0(int i, k070 k070Var, pn60 pn60Var) {
        this.a = i;
        this.b = k070Var;
        this.c = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        if (hd60.a().a().e(m6r0.C) && this.a == 0) {
            k070 k070Var = (k070) aVar.d(fpf0.a(k070.class));
            k070 k070Var2 = this.b;
            if (k070Var == null) {
                aVar.e(k070Var2, new c(1, this.c, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
            } else if (k070Var == k070Var2) {
                aVar.e(k070Var2, new a(1, this.c, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
            } else {
                aVar.k(k070Var, k070Var2, new b(1, this.c, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
            }
        }
    }
}
