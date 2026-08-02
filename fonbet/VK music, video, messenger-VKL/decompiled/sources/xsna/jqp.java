package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.api.di.AdsComponent;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView;
import kotlin.LazyThreadSafetyMode;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.h0x;
import xsna.hux;
import xsna.mqp;

/* compiled from: EntriesListDelegate.kt */
/* loaded from: classes4.dex */
public final class jqp {
    public final mqp a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Handler e;

    public jqp(mqp mqpVar) {
        this.a = mqpVar;
        ek ekVar = new ek(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, ekVar);
        this.c = msy.a(lazyThreadSafetyMode, new t61(22));
        this.d = msy.a(lazyThreadSafetyMode, new hy2(10));
        this.e = new Handler(Looper.getMainLooper());
    }

    public final void a(com.vk.lists.c cVar) {
        hjf0 hjf0Var = this.a.H;
        e05 e05Var = new e05(cVar, 22);
        RecyclerPaginatedView recyclerPaginatedView = ((mqp) hjf0Var.a.c).h;
        if (recyclerPaginatedView instanceof UsableRecyclerPaginatedView) {
            ((UsableRecyclerPaginatedView) recyclerPaginatedView).setOnEmptyViewRefreshListener(e05Var);
        } else if (recyclerPaginatedView instanceof FeedRecyclerPaginatedView) {
            ((FeedRecyclerPaginatedView) recyclerPaginatedView).setOnEmptyViewRefreshListener(e05Var);
        }
    }

    public final int b() {
        mqp mqpVar = this.a;
        RecyclerView recyclerView = mqpVar.y.c;
        a920 a920Var = null;
        RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter instanceof pd90) {
            T t = ((pd90) adapter).c;
            if (t instanceof a920) {
                a920Var = (a920) t;
            }
        } else if (adapter instanceof a920) {
            a920Var = (a920) adapter;
        }
        if (a920Var != null) {
            return a920Var.O0(mqpVar.O);
        }
        return 0;
    }

    public final void c() {
        mqp mqpVar = this.a;
        hbt0 hbt0Var = mqpVar.p;
        if (hbt0Var != null) {
            hbt0Var.u();
        }
        mqpVar.p = null;
        ehv ehvVar = mqpVar.m;
        if (ehvVar != null) {
            ehvVar.p();
        }
        mqpVar.m = null;
        mqpVar.b.onDestroy();
    }

    public final void d() {
        mqp mqpVar = this.a;
        a4r a4rVar = mqpVar.y;
        a4rVar.b();
        xif0 xif0Var = mqpVar.u;
        if (xif0Var != null) {
            xif0Var.b();
        }
        mqp.a aVar = mqpVar.B;
        RecyclerView recyclerView = a4rVar.c;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(aVar);
        }
        aVar.getClass();
        mqpVar.b.onDestroyView();
        mqpVar.h = null;
        ehv ehvVar = mqpVar.m;
        if (ehvVar != null) {
            ehvVar.q();
        }
        mqpVar.v.e();
        mqpVar.w.c = null;
        FragmentEntry Kn = mqpVar.d.Kn();
        String str = Kn != null ? Kn.d : null;
        if (str != null) {
            String str2 = com.vk.newsfeed.common.util.k.a;
            com.vk.newsfeed.common.util.k.d.remove(str);
        }
        hl60 hl60Var = hl60.a;
        hl60.b();
    }

    public final void e() {
        mqp mqpVar = this.a;
        qt3 qt3Var = mqpVar.q;
        if (qt3Var != null) {
            qt3Var.b();
        }
        xif0 xif0Var = mqpVar.u;
        if (xif0Var != null) {
            xif0Var.a();
        }
        mqpVar.a().a();
        RecyclerView recyclerView = mqpVar.y.c;
        if (recyclerView != null) {
            mqpVar.v.g(recyclerView);
        }
    }

    public final void f(NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        mqp mqpVar = this.a;
        Context mo2getContext = mqpVar.d.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        iuc0 iuc0Var = iuc0.b;
        String a = mqpVar.b.a();
        if (a == null) {
            a = "";
        }
        iuc0Var.T(mo2getContext, newsEntry, newsEntry2, a, i);
        if (newsEntry instanceof UxPollsEntry) {
            mqpVar.e().b(mo2getContext, ((UxPollsEntry) newsEntry).i).hide();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void g() {
        mqp mqpVar = this.a;
        mqpVar.R.onPause();
        mqpVar.A.pause();
        mqpVar.b.v0(mqpVar.d);
        ehv ehvVar = mqpVar.m;
        if (ehvVar != null) {
            ehvVar.n();
        }
        qt3 qt3Var = mqpVar.q;
        if (qt3Var != null) {
            qt3Var.c(false);
        }
        ((g3f0) mqpVar.I.getValue()).a.a();
        mqpVar.v.h();
        h0x h0xVar = mqpVar.w;
        h0x.b bVar = h0xVar.a;
        bVar.b = null;
        bVar.c = null;
        bVar.d.removeCallbacksAndMessages("CANCELLABLE_TASK_TAG");
        h0xVar.d = false;
        rwc0<? extends pwc0> rwc0Var = mqpVar.r;
        if (rwc0Var != null) {
            rwc0Var.c();
        }
        rwc0<? extends pwc0> rwc0Var2 = mqpVar.r;
        if (rwc0Var2 != null) {
            rwc0Var2.b();
        }
        ((hs60) mqpVar.x.getValue()).b();
        ((t4r) mqpVar.F.getValue()).getClass();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void h() {
        mqp mqpVar = this.a;
        mqpVar.a().terminate();
        hbt0 hbt0Var = mqpVar.p;
        if (hbt0Var != null) {
            hbt0Var.v();
        }
        qt3 qt3Var = mqpVar.q;
        if (qt3Var != null) {
            qt3Var.c(false);
        }
        mqpVar.q = null;
        rwc0<? extends pwc0> rwc0Var = mqpVar.r;
        if (rwc0Var != null) {
            rwc0Var.c();
        }
        rwc0<? extends pwc0> rwc0Var2 = mqpVar.r;
        if (rwc0Var2 != null) {
            rwc0Var2.b();
        }
        mqpVar.r = null;
        ((hs60) mqpVar.x.getValue()).b();
        mqpVar.v.h();
        hl60 hl60Var = hl60.a;
        hl60.b();
        mqpVar.G = false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void i() {
        mqp mqpVar = this.a;
        dqp dqpVar = mqpVar.b;
        FragmentImpl fragmentImpl = mqpVar.d;
        dqpVar.A0(fragmentImpl);
        ehv ehvVar = mqpVar.m;
        if (ehvVar != null) {
            ehvVar.o();
        }
        mqpVar.R.onResume();
        Context mo2getContext = fragmentImpl.mo2getContext();
        if (mo2getContext != null) {
            mqpVar.A.a(mo2getContext);
        }
        qt3 qt3Var = mqpVar.q;
        if (qt3Var != null) {
            qt3Var.b();
        }
        xif0 xif0Var = mqpVar.u;
        if (xif0Var != null) {
            xif0Var.a();
        }
        qg1 qg1Var = mqpVar.D;
        if (qg1Var != null) {
            qg1Var.invoke();
        }
        mqpVar.v.f();
        mqpVar.w.d = true;
        rwc0<? extends pwc0> rwc0Var = mqpVar.r;
        if (rwc0Var != null) {
            rwc0Var.a();
        }
        ((hs60) mqpVar.x.getValue()).a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xsna.fqp] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void j() {
        mqp mqpVar = this.a;
        dqp dqpVar = mqpVar.b;
        mqpVar.G = true;
        hbt0 hbt0Var = mqpVar.p;
        if (hbt0Var != null) {
            hbt0Var.w();
        }
        ?? r2 = mqpVar.c;
        RecyclerView c = mqpVar.c();
        if (c != null) {
            qt3 qt3Var = new qt3(c, mqpVar.b, ((NewsfeedOptionalAdsComponent) mqpVar.f.getValue()).d5(), dqpVar.r0(), dqpVar.c(), new pqp(dqpVar), r2.Y7(), r2.Si());
            qt3Var.b();
            mqpVar.q = qt3Var;
        }
        String ref = dqpVar.getRef();
        RecyclerView c2 = mqpVar.c();
        if (c2 != null) {
            if (mqpVar.r == null) {
                jg30 j2 = ((AdsComponent) mqpVar.e.getValue()).j2(c2, ref, null);
                mqpVar.r = j2;
                if (j2 != null) {
                    j2.j = dqpVar.r0().d;
                }
            }
            rwc0<? extends pwc0> rwc0Var = mqpVar.r;
            if (rwc0Var != null) {
                rwc0Var.a();
            }
        }
        ((hs60) mqpVar.x.getValue()).a();
        RecyclerView recyclerView = mqpVar.y.c;
        if (recyclerView != null) {
            mqpVar.v.g(recyclerView);
        }
        mqpVar.g();
        if (mqpVar.j()) {
            FragmentEntry Kn = mqpVar.d.Kn();
            String str = Kn != null ? Kn.d : null;
            if (str != null) {
                String str2 = com.vk.newsfeed.common.util.k.a;
                com.vk.newsfeed.common.util.k.m(str, new iqp(this, 0));
            }
        }
        RecyclerView c3 = mqpVar.c();
        if (c3 == null) {
            return;
        }
        awt0.t(c3, new h1j(c3, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [T extends com.vk.feed.core.models.news.NewsEntry, com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T extends com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final void k(u1c0 u1c0Var, int i) {
        mqp mqpVar = this.a;
        RecyclerView c = mqpVar.c();
        if (c == null) {
            return;
        }
        int childCount = c.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c.getChildAt(i2);
            if (childAt != null) {
                RecyclerView.e0 findContainingViewHolder = c.findContainingViewHolder(childAt);
                if (findContainingViewHolder instanceof qi6) {
                    qi6 qi6Var = (qi6) findContainingViewHolder;
                    if (qi6Var.J0() == u1c0Var) {
                        u1c0 j6 = qi6Var.j6();
                        NewsEntry newsEntry = j6 != null ? j6.a : null;
                        ?? r8 = newsEntry != null ? newsEntry : 0;
                        if (r8 == 0) {
                            r8 = qi6Var.p;
                        }
                        if (r8 != 0) {
                            qi6Var.p = r8;
                            qi6Var.E6(r8);
                            return;
                        }
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        mqpVar.O.notifyItemChanged(i);
    }

    public final void l(gzs<s3q0> gzsVar) {
        qg1 qg1Var;
        mqp mqpVar = this.a;
        if (mqpVar.D != null) {
            L.l("You're trying to overwrite the callback before it was invoked! Fix it or switch to a collection");
            return;
        }
        mqpVar.D = new qg1(10, gzsVar, this);
        if (!mqpVar.d.isResumed() || (qg1Var = mqpVar.D) == null) {
            return;
        }
        qg1Var.invoke();
    }

    public final void m(View view) {
        this.a.y.g(new hux.a.c(view));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final VkContextMenu n(View view, xm60 xm60Var, z960 z960Var, gzs<s3q0> gzsVar, View view2) {
        if (xm60Var.f) {
            m(view);
        } else {
            m(null);
        }
        la60 la60Var = (la60) this.b.getValue();
        h3i h3iVar = new h3i(z960Var, this);
        com.vk.movika.sdk.base.ui.r rVar = new com.vk.movika.sdk.base.ui.r(9, gzsVar, this);
        la60Var.getClass();
        return la60.d(view, xm60Var, h3iVar, rVar, view2);
    }

    public final void o() {
        mqp mqpVar = this.a;
        hbt0 hbt0Var = mqpVar.p;
        if (hbt0Var != null) {
            hbt0Var.y();
        }
        ehv ehvVar = mqpVar.m;
        if (ehvVar != null) {
            ehvVar.r();
        }
    }
}
