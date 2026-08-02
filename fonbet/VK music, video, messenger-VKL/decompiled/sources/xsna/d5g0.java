package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.j6c0;
import xsna.qn60;

/* compiled from: ReportContentEditorAction.kt */
/* loaded from: classes4.dex */
public final class d5g0 implements qn60.b {
    public final UserId a;
    public final int b;
    public final pn60 c;

    /* compiled from: ReportContentEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public d5g0(UserId userId, int i, pn60 pn60Var) {
        this.a = userId;
        this.b = i;
        this.c = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Post post;
        HashSet c = aVar.c(new j6c0.a(this.a, this.b));
        if (c == null || (post = (Post) j5g.Z(c)) == null || post.isReported()) {
            return;
        }
        post.l.Ab(140737488355328L, true);
        aVar.e(post, new a(1, this.c, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
