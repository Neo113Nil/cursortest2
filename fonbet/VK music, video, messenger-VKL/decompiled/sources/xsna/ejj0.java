package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: ShowReactionsFeedPlaceholderEditorAction.kt */
/* loaded from: classes4.dex */
public final class ejj0 implements qn60.b {
    public final ArrayList a;
    public final String b;
    public final pn60 c;

    /* compiled from: ShowReactionsFeedPlaceholderEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public ejj0(ArrayList arrayList, String str, pn60 pn60Var) {
        this.a = arrayList;
        this.b = str;
        this.c = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        if (this.a.isEmpty()) {
            String str = this.b;
            if (str == null || str.length() == 0) {
                aVar.e(d5f0.a, new a(1, this.c, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
            }
        }
    }
}
