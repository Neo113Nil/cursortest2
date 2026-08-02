package xsna;

import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentActivity;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ej90;
import xsna.xa60;

/* compiled from: NewsEntryObsceneTextChanger.kt */
/* loaded from: classes4.dex */
public final class ab60 {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new cj4(29));

    /* compiled from: NewsEntryObsceneTextChanger.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: NewsEntryObsceneTextChanger.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public final io.reactivex.rxjava3.disposables.c a(final List<? extends NewsEntry> list, final ListDataSet<u1c0> listDataSet, final xa60 xa60Var) {
        return io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.ya60
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ab60 ab60Var;
                HashMap hashMap = new HashMap();
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    ab60Var = ab60.this;
                    if (!hasNext) {
                        break;
                    }
                    NewsEntry newsEntry = (NewsEntry) it.next();
                    if (ab60Var.c(di60.R(newsEntry), xa60Var) && !hashMap.containsKey(newsEntry)) {
                        hashMap.put(newsEntry, newsEntry);
                    }
                }
                if (hashMap.isEmpty()) {
                    return new SparseArray();
                }
                SparseArray sparseArray = new SparseArray();
                listDataSet.u(new fdc(hashMap, ab60Var, sparseArray));
                return sparseArray;
            }
        })).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new m5y(new b140(listDataSet, 2), 9), new uk40(new b(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 2));
    }

    public final io.reactivex.rxjava3.disposables.c b(final List<? extends NewsEntry> list, final ListDataSet<u1c0> listDataSet, final boolean z) {
        return io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.za60
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ab60 ab60Var;
                HashMap hashMap = new HashMap();
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    ab60Var = ab60.this;
                    if (!hasNext) {
                        break;
                    }
                    NewsEntry newsEntry = (NewsEntry) it.next();
                    if (ab60Var.d(di60.R(newsEntry), z) && !hashMap.containsKey(newsEntry)) {
                        hashMap.put(newsEntry, newsEntry);
                    }
                }
                if (hashMap.isEmpty()) {
                    return new SparseArray();
                }
                SparseArray sparseArray = new SparseArray();
                listDataSet.u(new fdc(hashMap, ab60Var, sparseArray));
                return sparseArray;
            }
        })).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new n240(new ux40(listDataSet, 3), 4), new iu1(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 29));
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean c(Post post, xa60 xa60Var) {
        boolean z;
        String str;
        boolean z2 = false;
        if (post == null) {
            return false;
        }
        boolean z3 = xa60Var.c;
        NewsEntry newsEntry = xa60Var.a;
        ObsceneTextFilter.a aVar = ObsceneTextFilter.Companion;
        Boolean valueOf = Boolean.valueOf(!z3);
        aVar.getClass();
        ObsceneTextFilter a2 = ObsceneTextFilter.a.a(valueOf);
        ej90.c cVar = new ej90.c(0);
        if (epx.f(newsEntry, post)) {
            if (((Boolean) this.a.getValue()).booleanValue()) {
                post.l.Ab(17179869184L, z3);
            } else {
                post.P = ej90.a.a(post.s, new ej90.b(post.K, post.N.d, post.a0, a2, new zg90(cn70.b(6)), 0, 0, null, null, 480), cVar);
            }
            z = true;
        } else {
            z = false;
        }
        xa60.a aVar2 = xa60Var.b;
        if (aVar2 != null && epx.f(aVar2.a, post.m) && aVar2.b == post.n) {
            ej90.b bVar = new ej90.b(post.K, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, a2, null, 11019, 0, null, null, 470);
            Activity activity = post.C;
            ArrayList<Comment> arrayList = activity instanceof CommentsActivity ? ((CommentsActivity) activity).d : activity instanceof CommentActivity ? ((CommentActivity) activity).d : null;
            if (arrayList != null) {
                for (Comment comment : arrayList) {
                    if (comment.b == aVar2.c && (str = comment.g) != null && comment.v) {
                        comment.u = ej90.a.a(str, bVar, cVar);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                z = true;
            }
        }
        Post post2 = post.D;
        if (post2 != null && post2.equals(newsEntry) && c(post.D, xa60Var)) {
            return true;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean d(Post post, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (post == null) {
            return false;
        }
        Flags flags = post.l;
        ObsceneTextFilter.a aVar = ObsceneTextFilter.Companion;
        Boolean valueOf = Boolean.valueOf(z);
        aVar.getClass();
        ObsceneTextFilter a2 = ObsceneTextFilter.a.a(valueOf);
        ej90.b bVar = new ej90.b(post.K, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, a2, null, 11019, 0, null, null, 470);
        ej90.c cVar = new ej90.c(0);
        if (flags.zb(68719476736L)) {
            if (((Boolean) this.a.getValue()).booleanValue()) {
                z2 = true;
                flags.Ab(17179869184L, !z);
            } else {
                post.P = ej90.a.a(post.s, new ej90.b(post.K, post.N.d, post.a0, a2, new zg90(cn70.b(6)), 0, 0, null, null, 480), cVar);
                z2 = true;
            }
            z3 = z2;
        } else {
            z2 = true;
        }
        Activity activity = post.C;
        ArrayList<Comment> arrayList = activity instanceof CommentsActivity ? ((CommentsActivity) activity).d : activity instanceof CommentActivity ? ((CommentActivity) activity).d : null;
        if (arrayList != null) {
            boolean z4 = z3;
            for (Comment comment : arrayList) {
                String str = comment.g;
                if (str != null && comment.v) {
                    comment.u = ej90.a.a(str, bVar, cVar);
                    z4 = z2;
                }
            }
            z3 = z4;
        }
        Post post2 = post.D;
        return (post2 != null && post2.l.zb(68719476736L) == z2 && d(post.D, z)) ? z2 : z3;
    }
}
