package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.qn60;
import xsna.y6c0;

/* compiled from: SyncAuthorBanStateEditorAction.kt */
/* loaded from: classes4.dex */
public final class eon0 implements qn60.b {
    public final UserId a;
    public final boolean b;
    public final pn60 c;

    /* compiled from: SyncAuthorBanStateEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public eon0(UserId userId, boolean z, pn60 pn60Var) {
        this.a = userId;
        this.b = z;
        this.c = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        HashSet c = aVar.c(new y6c0.a(this.a));
        if (c == null) {
            return;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Post post = (Post) it.next();
            post.uc(this.b);
            aVar.e(post, new a(1, this.c, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
        }
    }
}
