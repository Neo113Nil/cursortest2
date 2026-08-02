package xsna;

import com.vk.dto.newsfeed.entries.Post;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;

/* compiled from: RemoveActivityEditorAction.kt */
/* loaded from: classes4.dex */
public final class iwf0 implements qn60.b {
    public final Post a;
    public final pn60 b;

    /* compiled from: RemoveActivityEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public iwf0(Post post, pn60 pn60Var) {
        this.a = post;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        if (aVar.b(this.a)) {
            aVar.e(Post.Nb(this.a, null, null, 0, null, 0, null, null, null, null, -131073), new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        }
    }
}
