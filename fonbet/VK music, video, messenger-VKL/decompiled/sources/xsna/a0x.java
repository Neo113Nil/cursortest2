package xsna;

import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.h0x;
import xsna.mo60;

/* compiled from: NewsfeedInlineCommentScrollController.kt */
/* loaded from: classes4.dex */
public final class a0x implements h0x.a {
    public final mo60.a a;
    public final Object b;
    public final Object c;
    public final float d;
    public final long e;
    public final long f;

    public a0x(c0x c0xVar, mo60.a aVar) {
        this.a = aVar;
        r rVar = new r(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, rVar);
        this.c = msy.a(lazyThreadSafetyMode, new gu0(21));
        this.d = c0xVar.a;
        this.e = c0xVar.b;
        this.f = c0xVar.c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h0x.a
    public final void a(List<? extends NewsEntry> list) {
        fo60 fo60Var;
        for (NewsEntry newsEntry : list) {
            mo60.a aVar = this.a;
            WeakReference<fo60> weakReference = aVar.a;
            if ((newsEntry instanceof Post) && hd60.a().a().e(m6r0.u0)) {
                Post post = (Post) newsEntry;
                boolean l0 = post.l0();
                boolean zb = post.l.zb(4398046511104L);
                if ((post.C instanceof CommentsActivity) && l0 && !zb && ((Boolean) this.c.getValue()).booleanValue()) {
                    fo60 fo60Var2 = weakReference.get();
                    if (fo60Var2 != null) {
                        fo60Var2.a(new ao60(post));
                    }
                    aVar.b.t = true;
                } else if (((Boolean) this.b.getValue()).booleanValue() && l0 && !zb && (fo60Var = weakReference.get()) != null) {
                    fo60Var.a(new bo60(post));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h0x.a
    public final void b(List<? extends NewsEntry> list) {
        fo60 fo60Var;
        for (NewsEntry newsEntry : list) {
            mo60.a aVar = this.a;
            WeakReference<fo60> weakReference = aVar.a;
            if ((newsEntry instanceof Post) && hd60.a().a().e(m6r0.u0)) {
                Post post = (Post) newsEntry;
                boolean zb = post.l.zb(35184372088832L);
                Activity activity = post.C;
                CommentsActivity commentsActivity = activity instanceof CommentsActivity ? (CommentsActivity) activity : null;
                ArrayList<Comment> arrayList = commentsActivity != null ? commentsActivity.d : null;
                if (arrayList != null && !arrayList.isEmpty() && !zb && ((Boolean) this.c.getValue()).booleanValue()) {
                    fo60 fo60Var2 = weakReference.get();
                    if (fo60Var2 != null) {
                        fo60Var2.a(new yn60(post));
                    }
                    aVar.b.t = true;
                } else if (((Boolean) this.b.getValue()).booleanValue() && !zb && (fo60Var = weakReference.get()) != null) {
                    fo60Var.a(new zn60(post));
                }
            }
        }
    }

    @Override // xsna.h0x.a
    public final long c() {
        return this.e;
    }

    @Override // xsna.h0x.a
    public final long d() {
        return this.f;
    }

    @Override // xsna.h0x.a
    public final float e() {
        return this.d;
    }
}
