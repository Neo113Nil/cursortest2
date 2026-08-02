package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.newsfeed.entries.Post;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.i6c0;
import xsna.qn60;

/* compiled from: TogglePinnedPostEditorAction.kt */
/* loaded from: classes4.dex */
public final class t0p0 implements qn60.b {
    public final Post a;
    public final pn60 b;

    /* compiled from: TogglePinnedPostEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public t0p0(Post post, pn60 pn60Var) {
        this.a = post;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Post post = this.a;
        HashSet c = aVar.c(new i6c0.a(post.m));
        if (c == null || c.isEmpty()) {
            return;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Post post2 = (Post) it.next();
            if (epx.f(post2, post)) {
                post2.l.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, post.l.zb(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
            } else {
                post2.l.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, false);
            }
        }
        aVar.f(c, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
