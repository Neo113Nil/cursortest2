package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Result;
import xsna.hux;
import xsna.qn60;
import xsna.qr60;

/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class odq {
    public static final int a(String str, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            ol60 ol60Var = (ol60) it.next();
            if ((ol60Var instanceof z1c0) && epx.f(((z1c0) ol60Var).h.b.Ab(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final void b(h7m h7mVar, FragmentImpl fragmentImpl, Activity activity, Context context, RecyclerView recyclerView, rjf0 rjf0Var, boolean z, boolean z2) {
        RecyclerView.u rruVar;
        RecyclerView.t tVar;
        RecyclerView.t tVar2 = rjf0Var.c;
        ?? r6 = rjf0Var.p;
        ?? r7 = rjf0Var.o;
        ?? r8 = rjf0Var.j;
        a4r a4rVar = rjf0Var.a;
        a4rVar.h(recyclerView);
        recyclerView.setHasFixedSize(true);
        Context context2 = recyclerView.getContext();
        ?? r13 = rjf0Var.f;
        EntriesListFragment.FocusableLinearLayoutManager focusableLinearLayoutManager = new EntriesListFragment.FocusableLinearLayoutManager(context2, fragmentImpl, (com.vk.stat.recycler.d) r13.getValue());
        focusableLinearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(focusableLinearLayoutManager);
        FeedFeatures feedFeatures = FeedFeatures.SHARED_VIEW_POOL;
        feedFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (!bVar.a(feedFeatures)) {
            rruVar = new rru();
        } else if (activity != null) {
            WeakHashMap<Activity, RecyclerView.u> weakHashMap = jz60.a;
            RecyclerView.u uVar = weakHashMap.get(activity);
            if (uVar == null) {
                uVar = new rru();
                weakHashMap.put(activity, uVar);
            }
            rruVar = uVar;
        } else {
            rruVar = new rru();
        }
        recyclerView.setRecycledViewPool(rruVar);
        recyclerView.setItemViewCacheSize(fxc0.B().N().a);
        RecyclerView.t c5rVar = new c5r((ClipsViewerComponent) h7mVar.a(fpf0.a(ClipsViewerComponent.class)), (NewsfeedOptionalAdsComponent) h7mVar.mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class)));
        if (z2) {
            rjf0Var.b().l(c5rVar);
        } else {
            recyclerView.addOnScrollListener(c5rVar);
        }
        recyclerView.addOnScrollListener(rjf0Var.b());
        ((tc60) rjf0Var.h.getValue()).a(recyclerView);
        ((o170) rjf0Var.i.getValue()).a(recyclerView);
        ((aw60) rjf0Var.q.getValue()).a();
        rjf0Var.b().l(new j6f0(((sr60) r8.getValue()).a()));
        bw60 bw60Var = new bw60(recyclerView);
        fh9 fh9Var = rjf0Var.b;
        if (context != null) {
            tVar = new ehv(context, bw60Var, fh9Var.a());
            if (z2) {
                rjf0Var.b().l(tVar);
            } else {
                recyclerView.addOnScrollListener(tVar);
            }
        } else {
            tVar = null;
        }
        fh9Var.b = tVar;
        recyclerView.setItemAnimator((hm60) rjf0Var.k.getValue());
        rjf0Var.a().C0((or60) rjf0Var.d.getValue());
        rjf0Var.a().C0((oc60) rjf0Var.e.getValue());
        rjf0Var.a().D0(((sr60) r8.getValue()).c);
        rjf0Var.a().D0((rl60) rjf0Var.m.getValue());
        rjf0Var.a().D0((zjf0) rjf0Var.n.getValue());
        dui b = rjf0Var.b();
        yl60 yl60Var = (yl60) r7.getValue();
        yl60Var.getClass();
        b.l(new xl60(yl60Var));
        ((yl60) r7.getValue()).c();
        com.vk.stat.recycler.d dVar = (com.vk.stat.recycler.d) r13.getValue();
        if (dVar != null) {
            rjf0Var.a().k = dVar;
        }
        recyclerView.setAdapter(rjf0Var.a());
        if (z2) {
            final bs60 bs60Var = (bs60) r6.getValue();
            ho60 a = rjf0Var.a();
            dui b2 = rjf0Var.b();
            bs60Var.t = recyclerView;
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.vr60
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    ks60 ks60Var = bs60.this.o;
                    if (ks60Var != null) {
                        ks60Var.b();
                    }
                }
            });
            a.D0(bs60Var.m);
            zr60 zr60Var = new zr60(bs60Var);
            b2.l(zr60Var);
            bs60Var.q = zr60Var;
        } else {
            ((bs60) r6.getValue()).i(recyclerView, rjf0Var.a());
        }
        if (z) {
            a4rVar.f = new sm60(recyclerView, new rm60(recyclerView, null));
            a4rVar.g(hux.c.C3024c.a);
            a4rVar.g(hux.f.b.a);
        }
        if (bVar.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS)) {
            if (z2) {
                rjf0Var.b().l(tVar2);
            } else {
                recyclerView.addOnScrollListener(tVar2);
            }
        }
    }

    public static final io.reactivex.rxjava3.internal.operators.single.b c(qn60 qn60Var, qn60.b... bVarArr) {
        return new io.reactivex.rxjava3.internal.operators.single.b(new ex0(2, qn60Var, bVarArr));
    }

    public static void d(gzs gzsVar, izs izsVar) {
        Object d = ((Result) gzsVar.invoke()).d();
        if (!(d instanceof Result.Failure)) {
            qn60.c cVar = (qn60.c) d;
            izsVar.invoke(new qr60.a.c(cVar.a, cVar.b, false, null, 24));
        }
        Throwable a = Result.a(d);
        if (a != null) {
            com.vk.metrics.eventtracking.b.a.a(a);
        }
    }
}
