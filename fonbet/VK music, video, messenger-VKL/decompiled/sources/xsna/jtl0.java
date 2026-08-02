package xsna;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.di.BridgeComponent;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.DiscoverStubStoriesContainer;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.PromoStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.lists.ListDataSet;
import com.vk.metrics.logging.PerfLogger;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: StoriesItemHolderImpl.kt */
/* loaded from: classes6.dex */
public final class jtl0 extends gtl0 implements View.OnClickListener, View.OnLongClickListener, w8i {
    public static final /* synthetic */ int A = 0;
    public final opl0 n;
    public final y4m0 o;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint p;
    public final String q;
    public final StoryViewerRouter r;
    public final xsl0 s;
    public final wvl0 t;
    public final fsl0 u;
    public final bpn0 v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final View z;

    public jtl0(l0m0 l0m0Var, ViewGroup viewGroup, opl0 opl0Var, y4m0 y4m0Var, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, StoryViewerRouter storyViewerRouter, xsl0 xsl0Var, wvl0 wvl0Var, fsl0 fsl0Var) {
        super(l0m0Var, viewGroup);
        this.n = opl0Var;
        this.o = y4m0Var;
        this.p = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.q = str;
        this.r = storyViewerRouter;
        this.s = xsl0Var;
        this.t = wvl0Var;
        this.u = fsl0Var;
        this.v = new bpn0(new jcf0(this, 7));
        z4d0 z4d0Var = new z4d0(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = msy.a(lazyThreadSafetyMode, z4d0Var);
        this.x = msy.a(lazyThreadSafetyMode, new wp40(this, 27));
        this.y = msy.a(lazyThreadSafetyMode, new ap80(9));
        l0m0Var.setOnLongClickListener(this);
        l0m0Var.setOnClickListener(this);
        this.z = l0m0Var.getStoryImageView();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    public final void i6(Object obj) {
        StoriesContainer storiesContainer = (StoriesContainer) obj;
        ((y8m0) this.itemView).b(storiesContainer, ((uvl0) this.w.getValue()).d(storiesContainer));
        if (arl0.J && com.vk.toggle.d.e().b && gz80.a(28)) {
            View view = this.itemView;
            if (view instanceof l0m0) {
                l0m0 l0m0Var = (l0m0) view;
                if (b6().getConfiguration().getLayoutDirection() != 1) {
                    l0m0Var.addOnLayoutChangeListener(new htl0(this));
                }
            }
        }
        StoryOwner storyOwner = storiesContainer.b;
        String Db = storyOwner != null ? storyOwner.Db() : null;
        if (fsk.A(storiesContainer)) {
            this.itemView.setContentDescription(h6(R.string.story_accessibility_live_author, Db));
        } else if (storiesContainer instanceof LiveFinishedStoriesContainer) {
            this.itemView.setContentDescription(h6(R.string.story_accessibility_live_archive_author, Db));
        } else if (storiesContainer instanceof DiscoverStoriesContainer) {
            this.itemView.setContentDescription(g6(R.string.story_accessibility_discover));
        } else if (!storiesContainer.Qb() || storiesContainer.Eb()) {
            this.itemView.setContentDescription(h6(R.string.story_accessibility_story_author, Db));
        } else {
            this.itemView.setContentDescription(g6(R.string.story_accessibility_take_history));
        }
        ((anm0) this.v.getValue()).O(storiesContainer, this.p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.c(1000L)) {
            return;
        }
        this.u.f();
        StoriesContainer storiesContainer = (StoriesContainer) this.m;
        if (storiesContainer == null) {
            return;
        }
        ((v2m0) this.x.getValue()).a(storiesContainer);
        if (storiesContainer.Qb() && !storiesContainer.Eb()) {
            ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).f5().p(this.itemView.getContext(), this.q);
            return;
        }
        View view2 = this.itemView;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int a = wtu.a(21);
        if (a != -1) {
            view2.performHapticFeedback(a, 1);
        }
        as80 as80Var = new as80(storiesContainer, SystemClock.elapsedRealtime());
        xsl0 xsl0Var = this.s;
        v6(as80Var, new sec(xsl0Var, 9), new foh(1, this, jtl0.class, "openStoryAndSetTime", "openStoryAndSetTime(Lcom/vk/story/api/domain/interactor/common/OpenStoriesRequest;)V", 0, 7));
        if (this.p != MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST || xsl0Var.f(storiesContainer)) {
            x6(as80Var);
        } else {
            v6(as80Var, new u19(xsl0Var, 7), new odg(1, this, jtl0.class, "openStoryOnClick", "openStoryOnClick(Lcom/vk/story/api/domain/interactor/common/OpenStoriesRequest;)V", 0, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        StoriesContainer storiesContainer = (StoriesContainer) this.m;
        boolean z = false;
        if (storiesContainer != null && !jjc.b()) {
            if (storiesContainer instanceof DiscoverStoriesContainer) {
                StoriesFeatures storiesFeatures = StoriesFeatures.REMOVE_HIDE_DISCOVER;
                storiesFeatures.getClass();
                if (com.vk.toggle.b.A.a(storiesFeatures)) {
                    return true;
                }
                or1 or1Var = new or1(this.itemView.getContext());
                or1Var.a(R.string.stories_discover_hide_block, new tnf(this, 10));
                or1Var.c().m();
                return true;
            }
            if (!storiesContainer.Qb() && !(storiesContainer instanceof PromoStoriesContainer) && storiesContainer.Eb()) {
                srl0 srl0Var = new srl0(this.l.getContext(), this.s);
                srl0Var.e = storiesContainer;
                if (this.o.a && !storiesContainer.Pb() && !fsk.B(storiesContainer)) {
                    z = true;
                }
                srl0Var.d = z;
                srl0Var.a();
                return true;
            }
        }
        return false;
    }

    public final void t6() {
        int i = opl0.u;
        opl0 opl0Var = this.n;
        int h = e43.h(opl0Var.y0());
        Iterator it = ((ArrayList) opl0Var.y0()).iterator();
        boolean z = false;
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            StoriesContainer storiesContainer = (StoriesContainer) next;
            if (i2 >= 0 && i2 <= h && storiesContainer.d) {
                storiesContainer.d = false;
                opl0Var.s.e();
                opl0Var.K0(new gd90(opl0Var, i2, 1));
                z = true;
            }
            i2 = i3;
        }
        if (z) {
            o6();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e0
    public final String toString() {
        return "StoriesItemHolderImpl " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v6(as80 as80Var, izs<? super as80, ? extends io.reactivex.rxjava3.disposables.c> izsVar, izs<? super as80, s3q0> izsVar2) {
        StoriesContainer storiesContainer = as80Var.a;
        if (storiesContainer.d) {
            return;
        }
        t6();
        storiesContainer.d = true;
        io.reactivex.rxjava3.disposables.c invoke = izsVar.invoke(as80Var);
        opl0 opl0Var = this.n;
        opl0Var.s.b(invoke);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Iterator it = ((ArrayList) opl0Var.y0()).iterator();
        int i = 0;
        Integer num = null;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            StoriesContainer storiesContainer2 = (StoriesContainer) next;
            boolean f = epx.f(storiesContainer2.f, storiesContainer.f);
            if (storiesContainer2.d != f) {
                num = Integer.valueOf(i);
            }
            storiesContainer2.d = f;
            if (f) {
                ref$IntRef.element = i;
            }
            i = i2;
        }
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        if (num != null) {
            ref$IntRef2.element = num.intValue();
            if (opl0Var.W()) {
                ref$IntRef.element++;
                ref$IntRef2.element++;
            }
            opl0Var.K0(new jch(opl0Var, ref$IntRef, ref$IntRef2, 5));
        }
        opl0Var.r = (FunctionReferenceImpl) izsVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x6(as80 as80Var) {
        t6();
        Long valueOf = Long.valueOf(as80Var.b);
        c4g0.k = null;
        c4g0.l = valueOf;
        new PerfLogger().a(PerfLogger.Event.STORIES_START_OPEN_STORY_CLICK);
        long j = as80Var.b;
        StoriesContainer storiesContainer = (StoriesContainer) this.m;
        if (storiesContainer == null) {
            return;
        }
        ListDataSet.ArrayListImpl arrayListImpl = (ListDataSet.ArrayListImpl) this.n.y0();
        wvl0 wvl0Var = this.t;
        ArrayList f = wvl0Var.f(storiesContainer, arrayListImpl);
        StoriesContainer e = wvl0Var.e(storiesContainer.Ob(), f);
        Activity h = e3m.h(this.itemView.getContext());
        if (e == null || h == 0) {
            return;
        }
        MobileOfficialAppsConStoriesStat$ViewEntryPoint a = gan.a(e, f, MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER);
        GetStoriesResponse getStoriesResponse = m9n.f;
        ArrayList<StoriesContainer> arrayList = getStoriesResponse != null ? getStoriesResponse.c : null;
        if ((e instanceof DiscoverStoriesContainer) && arrayList != null && !arrayList.isEmpty()) {
            Iterator it = f.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((StoriesContainer) it.next()) instanceof DiscoverStubStoriesContainer) {
                    break;
                } else {
                    i++;
                }
            }
            if (i > -1) {
                while (f.size() - 1 >= i) {
                    f.remove(e43.h(f));
                }
            }
            f.addAll(arrayList);
            if (i != -1) {
                int i2 = 0;
                for (Object obj : f) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    StoriesContainer storiesContainer2 = (StoriesContainer) obj;
                    if (i2 > i) {
                        storiesContainer2.k = Integer.valueOf(i2 - i);
                    }
                    i2 = i3;
                }
            }
            storiesContainer = arrayList.get(0);
        }
        bfj h2 = this.s.h(f, e, storiesContainer);
        if (h2 == null) {
            return;
        }
        this.u.e(this.p);
        List<StoriesContainer> list = h2.a;
        String str = h2.b;
        GetStoriesResponse getStoriesResponse2 = m9n.f;
        this.r.h(h, list, str, null, (r42 & 16) != 0 ? true : true, this.p, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : a, this.q, null, (r42 & 512) != 0 ? null : getStoriesResponse2 != null ? getStoriesResponse2.d : null, new itl0(this), (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : null, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : h instanceof f5z ? (f5z) h : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : j);
    }
}
