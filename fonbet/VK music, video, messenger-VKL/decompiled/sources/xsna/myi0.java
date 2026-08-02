package xsna;

import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: SetFavePagesEditorAction.kt */
/* loaded from: classes4.dex */
public final class myi0 implements qn60.b {
    public final tqq a;
    public final pn60 b;

    /* compiled from: SetFavePagesEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    /* compiled from: SetFavePagesEditorAction.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public myi0(tqq tqqVar, pn60 pn60Var) {
        this.a = tqqVar;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        tqq tqqVar = this.a;
        if (tqqVar == null) {
            aVar.j(fpf0.a(tqq.class));
            return;
        }
        tqq tqqVar2 = (tqq) aVar.d(fpf0.a(tqq.class));
        if (tqqVar2 != null) {
            aVar.k(tqqVar2, tqqVar, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        } else {
            aVar.g(tqqVar, new b(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0), new s6x(28));
        }
    }
}
