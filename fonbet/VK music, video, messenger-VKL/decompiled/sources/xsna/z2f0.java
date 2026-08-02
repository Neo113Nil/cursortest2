package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.contracts.modalcommon.ModalPostDestination;
import kotlin.LazyThreadSafetyMode;
import xsna.qr80;

/* compiled from: ReactionsCallbackNewsEntriesImpl.kt */
/* loaded from: classes4.dex */
public class z2f0 implements x2f0, w8i {
    public final Object b;
    public final Object c;
    public final Object d;
    public final d2f0 e;

    public z2f0() {
        kr50 kr50Var = new kr50(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, kr50Var);
        this.c = msy.a(lazyThreadSafetyMode, new gd40(this, 19));
        this.d = msy.a(lazyThreadSafetyMode, new re40(this, 19));
        this.e = new d2f0();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.x2f0
    public final void d(Context context, Badgeable badgeable) {
        if (badgeable.ca() != null) {
            ((oz5) this.c.getValue()).a(context, badgeable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.x2f0
    public final void g(Context context, Badgeable badgeable) {
        NewsEntry newsEntry = badgeable instanceof NewsEntry ? (NewsEntry) badgeable : null;
        if (newsEntry != null) {
            ((NewsfeedRouter) this.d.getValue()).b0(context, newsEntry, ModalPostDestination.REACTIONS_DONATS, false, null, null, newsEntry.Cb().b, qr80.c.a);
        }
    }

    @Override // xsna.x2f0
    public final a2f0 h(u5f0 u5f0Var, ReactionMeta reactionMeta, boolean z) {
        Object obj = u5f0Var.a;
        this.e.getClass();
        return d2f0.b(obj, reactionMeta, z);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.x2f0
    public void i(Context context, u5f0 u5f0Var, ReactionMeta reactionMeta, a2f0 a2f0Var, p2f0 p2f0Var) {
        Object obj = u5f0Var.a;
        Object obj2 = u5f0Var.b;
        boolean z = a2f0Var.b;
        ?? r6 = this.b;
        if (z && (obj instanceof Comment) && (obj2 instanceof Post)) {
            ((c1c0) r6.getValue()).V((Comment) obj, (Post) obj2, a2f0Var.a, reactionMeta, (String) u5f0Var.c);
            return;
        }
        if (z && (obj instanceof c6z)) {
            c6z c6zVar = obj2 instanceof PromoPost ? (c6z) obj2 : (c6z) obj;
            boolean z2 = a2f0Var.a;
            String str = (String) u5f0Var.c;
            String str2 = (String) u5f0Var.d;
            if (c6zVar instanceof bss0) {
                Serializer.c<Videos> cVar = Videos.CREATOR;
                c6zVar = Videos.a.a(((bss0) c6zVar).t());
            }
            ((c1c0) r6.getValue()).f(context, new l6z(c6zVar, z2, reactionMeta, str, null, str2), null, null);
        }
    }

    @Override // xsna.x2f0
    public void a() {
    }

    @Override // xsna.x2f0
    public void b() {
    }

    @Override // xsna.x2f0
    public void c() {
    }

    @Override // xsna.x2f0
    public void f(m3r m3rVar) {
    }
}
