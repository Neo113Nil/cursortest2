package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.dxq0;
import xsna.hux;
import xsna.m8v0;
import xsna.wnq0;

/* compiled from: UserProfileWallView.kt */
/* loaded from: classes4.dex */
public final class mxq0 implements pxq0, obs, pds, w8i {
    public final FragmentImpl b;
    public final RecyclerPaginatedView c;
    public final WallGetMode d;
    public final boolean e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final bpn0 j;
    public foq0 k;
    public foq0 l;
    public io.reactivex.rxjava3.disposables.b m;
    public final mqp n;
    public final mrp o;
    public final jqp p;
    public final bpn0 q;
    public final bpn0 r;
    public boolean s;
    public VkOnboardingCampaign t;
    public final Object u;

    public mxq0(FragmentImpl fragmentImpl, RecyclerPaginatedView recyclerPaginatedView, WallGetMode wallGetMode, boolean z) {
        this.b = fragmentImpl;
        this.c = recyclerPaginatedView;
        this.d = wallGetMode;
        this.e = z;
        yqd0 yqd0Var = new yqd0(this, 12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a = msy.a(lazyThreadSafetyMode, yqd0Var);
        this.f = a;
        this.g = msy.a(lazyThreadSafetyMode, new nm60(this, 26));
        this.h = msy.a(lazyThreadSafetyMode, new dac0(this, 23));
        this.i = msy.a(lazyThreadSafetyMode, new hri0(this, 9));
        fragmentImpl.D.a(this);
        this.j = new bpn0(new tfm0(this, 11));
        this.m = new io.reactivex.rxjava3.disposables.b();
        t98 t98Var = new t98(this);
        mqp mqpVar = new mqp(p(), this, fragmentImpl, null);
        mqpVar.E = t98Var;
        mqpVar.O.N0((q530) a.getValue());
        this.n = mqpVar;
        this.o = new mrp(new bpn0(new ye80(this, 28)), new bpn0(new akd0(this, 16)), new bpn0(new stg0(this, 17)));
        this.p = new jqp(mqpVar);
        this.q = new bpn0(new yei0(this, 12));
        this.r = new bpn0(new mwm0(this, 6));
        this.u = msy.a(lazyThreadSafetyMode, new jz70(this, 29));
    }

    @Override // xsna.fqp
    public final void Aa(gzs<s3q0> gzsVar) {
        this.n.y.d(gzsVar);
    }

    @Override // xsna.fqp
    public final void Ak() {
        this.p.e();
    }

    @Override // xsna.pxq0
    public final void C3(int i, int i2) {
        foq0 foq0Var = this.k;
        if (foq0Var != null) {
            foq0Var.x6(new dxq0.a.g(i, i2));
        }
    }

    @Override // xsna.s980
    @ozl
    public final boolean E8(Attachment attachment, NewsEntry newsEntry) {
        return true;
    }

    @Override // xsna.pxq0
    @ozl
    public final void Ej(final String str, final z6f0 z6f0Var, final lb6 lb6Var) {
        final RecyclerView recyclerView = this.n.y.c;
        if (recyclerView == null || this.s) {
            return;
        }
        this.s = true;
        recyclerView.post(new Runnable() { // from class: xsna.jxq0
            @Override // java.lang.Runnable
            public final void run() {
                Integer o;
                mxq0 mxq0Var = this;
                RecyclerView.e0 findViewHolderForLayoutPosition = RecyclerView.this.findViewHolderForLayoutPosition(mxq0Var.n.y.f());
                w3c0 w3c0Var = findViewHolderForLayoutPosition instanceof w3c0 ? (w3c0) findViewHolderForLayoutPosition : null;
                if (w3c0Var == null) {
                    mxq0Var.s = false;
                    return;
                }
                View findViewById = w3c0Var.itemView.findViewById(R.id.post_header_options);
                FragmentImpl fragmentImpl = mxq0Var.b;
                if (findViewById == null || (o = mxq0Var.o()) == null) {
                    return;
                }
                if (bwt0.F(findViewById).bottom <= o.intValue()) {
                    z6f0Var.invoke(findViewById);
                    fragmentImpl.requireView().dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                    int i = m8v0.M;
                    String str2 = str;
                    if (str2 == null) {
                        str2 = fragmentImpl.requireContext().getString(R.string.community_main_wall_post_options_onboarding);
                    }
                    m8v0.a.a(findViewById, str2, null, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new kvm0(findViewById, 8), null, null, null, null, null, null, 0, false, null, null, false, null, !dhr0.M(), 8388100);
                    lb6Var.invoke();
                }
            }
        });
    }

    @Override // xsna.nxq0
    public final void F1() {
        boolean z = p().l() == null;
        Boolean l = p().l();
        Boolean bool = Boolean.TRUE;
        if (epx.f(l, bool)) {
            return;
        }
        p().b(bool);
        p().f(!z);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    @Override // xsna.fqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G5(View view, final NewsEntry newsEntry, final NewsEntry newsEntry2, final int i) {
        boolean z;
        boolean z2;
        boolean z3;
        VideoAttachment Nb;
        VideoAttachment Nb2;
        boolean z4 = false;
        boolean z5 = M0().v || M0().w;
        mqp mqpVar = this.n;
        boolean s0 = mqpVar.b.s0();
        boolean z6 = newsEntry2 instanceof DiscoverMediaBlock;
        boolean z7 = !(newsEntry instanceof DiscoverMediaBlock) && z6;
        boolean z8 = M0().o;
        boolean z9 = M0().D;
        UserId c = n().c();
        boolean z10 = this.e && n().a(p().getUid());
        ComFeatures comFeatures = ComFeatures.COM_EASY_PROMOTE;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures) && n().a(p().getUid())) {
            Boolean g = p().g();
            if (g != null ? g.booleanValue() : false) {
                z = true;
                z2 = newsEntry instanceof Videos;
                bpn0 bpn0Var = this.q;
                if (z2) {
                    Videos videos = (Videos) newsEntry;
                    if (videos.Ea() && (Nb2 = videos.Nb()) != null) {
                        z3 = ((xlc) bpn0Var.getValue()).d(Nb2.k);
                        if (z2) {
                            Videos videos2 = (Videos) newsEntry;
                            if (videos2.Ea() && (Nb = videos2.Nb()) != null) {
                                z4 = ((xlc) bpn0Var.getValue()).c(Nb.k);
                            }
                        }
                        xm60 xm60Var = new xm60(newsEntry, newsEntry2, null, s0, z6, z7, z8, c, z5, z10, false, z9, z, z3, z4, 4292);
                        final boolean z11 = z5;
                        mqpVar.s = this.p.n(view, xm60Var, new z960() { // from class: xsna.ixq0
                            @Override // xsna.z960
                            public final void g(VkContextMenu vkContextMenu, int i2) {
                                mxq0 mxq0Var = this;
                                jc60 jc60Var = new jc60(i2, NewsEntry.this, newsEntry2, i, z11, mxq0Var.p().getUid());
                                mqp mqpVar2 = mxq0Var.n;
                                mqpVar2.b.w0(mqpVar2.d.requireContext(), jc60Var);
                                mqpVar2.s = null;
                            }
                        }, new icn0(this, 4), null);
                    }
                }
                z3 = false;
                if (z2) {
                }
                xm60 xm60Var2 = new xm60(newsEntry, newsEntry2, null, s0, z6, z7, z8, c, z5, z10, false, z9, z, z3, z4, 4292);
                final boolean z112 = z5;
                mqpVar.s = this.p.n(view, xm60Var2, new z960() { // from class: xsna.ixq0
                    @Override // xsna.z960
                    public final void g(VkContextMenu vkContextMenu, int i2) {
                        mxq0 mxq0Var = this;
                        jc60 jc60Var = new jc60(i2, NewsEntry.this, newsEntry2, i, z112, mxq0Var.p().getUid());
                        mqp mqpVar2 = mxq0Var.n;
                        mqpVar2.b.w0(mqpVar2.d.requireContext(), jc60Var);
                        mqpVar2.s = null;
                    }
                }, new icn0(this, 4), null);
            }
        }
        z = false;
        z2 = newsEntry instanceof Videos;
        bpn0 bpn0Var2 = this.q;
        if (z2) {
        }
        z3 = false;
        if (z2) {
        }
        xm60 xm60Var22 = new xm60(newsEntry, newsEntry2, null, s0, z6, z7, z8, c, z5, z10, false, z9, z, z3, z4, 4292);
        final boolean z1122 = z5;
        mqpVar.s = this.p.n(view, xm60Var22, new z960() { // from class: xsna.ixq0
            @Override // xsna.z960
            public final void g(VkContextMenu vkContextMenu, int i2) {
                mxq0 mxq0Var = this;
                jc60 jc60Var = new jc60(i2, NewsEntry.this, newsEntry2, i, z1122, mxq0Var.p().getUid());
                mqp mqpVar2 = mxq0Var.n;
                mqpVar2.b.w0(mqpVar2.d.requireContext(), jc60Var);
                mqpVar2.s = null;
            }
        }, new icn0(this, 4), null);
    }

    @Override // xsna.fqp
    public final void Gl(Html5Entry html5Entry) {
        this.n.b().a(html5Entry);
    }

    @Override // xsna.pxq0
    public final void H1() {
        foq0 foq0Var = this.k;
        if (foq0Var != null) {
            foq0Var.x6(new dxq0.a.b(false));
        }
    }

    @Override // xsna.fqp
    public final void H3(u1c0 u1c0Var, int i) {
        this.p.k(u1c0Var, i);
    }

    @Override // xsna.s980
    public final void Hh(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        this.n.i.Hh(view, u1c0Var, newsEntry, attachment);
    }

    @Override // xsna.fqp, xsna.pds
    public final void J0() {
        this.p.h();
    }

    @Override // xsna.pxq0
    public final void Jk() {
        foq0 foq0Var = this.k;
        if (foq0Var != null) {
            foq0Var.t6();
        }
    }

    @Override // xsna.fqp
    public final void Ke() {
        qt3 qt3Var = this.n.q;
        if (qt3Var != null) {
            qt3Var.g();
        }
    }

    @Override // xsna.fqp
    public final s1c0 M0() {
        return (s1c0) this.r.getValue();
    }

    @Override // xsna.s980
    public final void Mg(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        this.n.i.Mg(view, u1c0Var, newsEntry, attachment);
    }

    @Override // xsna.fqp
    public final void Nc() {
        ehv ehvVar = this.n.m;
        if (ehvVar != null) {
            ehvVar.m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pxq0
    public final void Ne() {
        mqp mqpVar = this.n;
        RecyclerView recyclerView = mqpVar.y.c;
        RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        a920 a920Var = pd90Var != null ? pd90Var.c : null;
        a920 a920Var2 = a920Var instanceof a920 ? a920Var : null;
        if (a920Var2 == null) {
            return;
        }
        mqpVar.y.i(new jzd(this, a920Var2.O0(mqpVar.O), 2));
    }

    @Override // xsna.fqp
    public final void Ok(UxPollsEntry uxPollsEntry) {
        mqp mqpVar = this.n;
        Context mo2getContext = mqpVar.d.mo2getContext();
        if (mo2getContext != null) {
            w5r0 e = mqpVar.e();
            String str = uxPollsEntry.i;
            e.b(mo2getContext, str);
            e.b.add(str);
        }
    }

    @Override // xsna.fqp
    public final void Q9(boolean z) {
        qt3 qt3Var = this.n.q;
        if (qt3Var != null) {
            qt3Var.c(z);
        }
    }

    @Override // xsna.fqp
    public final void R1() {
        this.p.o();
    }

    @Override // xsna.pxq0
    public final void Rj(int i) {
        foq0 foq0Var = this.k;
        if (foq0Var != null) {
            foq0Var.x6(new dxq0.a.h(i));
        }
    }

    @Override // xsna.fqp
    public final void S7(int i, int i2) {
        RecyclerView recyclerView = this.n.y.c;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.K(i, 0);
    }

    @Override // xsna.fqp
    public final boolean Si() {
        return false;
    }

    @Override // xsna.s980
    public final void U5(NewsEntry newsEntry, boolean z, int i) {
        if (z && jjc.b()) {
            return;
        }
        mqp mqpVar = this.n;
        FragmentImpl fragmentImpl = mqpVar.d;
        dqp dqpVar = mqpVar.b;
        Context mo2getContext = fragmentImpl.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        this.o.b(mo2getContext, newsEntry, dqpVar.getRef(), dqpVar.a(), i);
    }

    @Override // xsna.pxq0
    public final void U9(boolean z, boolean z2) {
        foq0 foq0Var = this.k;
        if (foq0Var != null) {
            foq0Var.x6(new dxq0.a.d(z, z2));
        }
    }

    @Override // xsna.pxq0
    public final void V1() {
        foq0 foq0Var = this.k;
        if (foq0Var != null) {
            foq0Var.x6(dxq0.a.C2768a.a);
        }
    }

    @Override // xsna.fqp
    public final void Xm(gzs gzsVar) {
        this.p.e.postDelayed(new d4m(1, gzsVar), 0L);
    }

    @Override // xsna.fqp
    public final void Y1(final int i, final int i2) {
        RecyclerView c;
        FragmentActivity activity = this.b.getActivity();
        if ((activity == null || !p90.f(activity)) && (c = this.n.c()) != null) {
            c.post(new Runnable() { // from class: xsna.kxq0
                @Override // java.lang.Runnable
                public final void run() {
                    mxq0.this.n.y.j(i, i2, null);
                }
            });
        }
    }

    @Override // xsna.fqp
    public final boolean Y7() {
        return false;
    }

    @Override // xsna.fqp, xsna.sjg
    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        this.m.b(cVar);
    }

    @Override // xsna.pxq0
    public final void a8(int i) {
        foq0 foq0Var = this.k;
        if (foq0Var != null) {
            foq0Var.x6(new dxq0.a.e(i));
        }
    }

    @Override // xsna.obs
    public final void b() {
        MarketAttachment.g = CommonMarketStat$TypeRefSource.POST;
    }

    @Override // xsna.fqp
    public final void cn() {
        this.n.b().c();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nxq0
    public final void d() {
        RecyclerView.u rruVar;
        RecyclerView recyclerView;
        n().N();
        RecyclerPaginatedView recyclerPaginatedView = this.c;
        mqp mqpVar = this.n;
        mqpVar.h = recyclerPaginatedView;
        a4r a4rVar = mqpVar.y;
        RecyclerView c = mqpVar.c();
        if (c != null) {
            a4rVar.h(c);
        }
        FragmentImpl fragmentImpl = mqpVar.d;
        EntriesListFragment.FocusableLinearLayoutManager focusableLinearLayoutManager = new EntriesListFragment.FocusableLinearLayoutManager(fragmentImpl.kn(), fragmentImpl, (com.vk.stat.recycler.d) mqpVar.z.getValue());
        focusableLinearLayoutManager.setOrientation(1);
        RecyclerView recyclerView2 = a4rVar.c;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(focusableLinearLayoutManager);
        }
        FragmentImpl fragmentImpl2 = this.b;
        FragmentActivity activity = fragmentImpl2.getActivity();
        FeedFeatures feedFeatures = FeedFeatures.SHARED_VIEW_POOL;
        feedFeatures.getClass();
        if (!com.vk.toggle.b.A.a(feedFeatures)) {
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
        RecyclerView recyclerView3 = a4rVar.c;
        if (recyclerView3 != null) {
            recyclerView3.setRecycledViewPool(rruVar);
        }
        RecyclerView recyclerView4 = a4rVar.c;
        if (recyclerView4 != null) {
            recyclerView4.setHasFixedSize(true);
        }
        RecyclerPaginatedView recyclerPaginatedView2 = mqpVar.h;
        if (recyclerPaginatedView2 != null) {
            RecyclerView recyclerView5 = recyclerPaginatedView2.getRecyclerView();
            a4rVar.f = new ghl(recyclerView5, recyclerPaginatedView2, new fhl(recyclerView5, recyclerPaginatedView2));
            if (recyclerView5 instanceof FeedRecyclerView) {
                if (fkq0.b(p().getUid())) {
                    a4rVar.g(hux.c.C3024c.a);
                } else {
                    a4rVar.g(hux.c.d.a);
                }
            } else if (recyclerView5 instanceof UsableRecyclerView) {
                ((UsableRecyclerView) recyclerView5).setSelectorBoundsProvider(new elg0(recyclerView5));
            }
        }
        q();
        hjf0 hjf0Var = mqpVar.H;
        ouv ouvVar = new ouv(this, 1);
        RecyclerPaginatedView recyclerPaginatedView3 = ((mqp) hjf0Var.a.c).h;
        if (recyclerPaginatedView3 != null) {
            recyclerPaginatedView3.addOnLayoutChangeListener(ouvVar);
        }
        a4rVar.g.l(mqpVar.B);
        mqpVar.A.c(a4rVar);
        mqpVar.f(fragmentImpl2.kn());
        mqpVar.h(fragmentImpl2.kn());
        RecyclerPaginatedView recyclerPaginatedView4 = mqpVar.h;
        if (recyclerPaginatedView4 != null && (recyclerView = recyclerPaginatedView4.getRecyclerView()) != null && !mqpVar.j()) {
            mqpVar.q = new qt3(recyclerView, p(), (NativeAdUserLevelAnalyticsSender) this.h.getValue(), p().r0(), p().c(), new lxq0(p()), false, false);
            mqpVar.g();
        }
        mqpVar.i();
        p().D0(fragmentImpl2.getArguments());
        mqpVar.l();
        mqpVar.k(M0());
        mqpVar.O.p.R = mqpVar.R;
    }

    @Override // xsna.s980
    public final void d9(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
        jc60 jc60Var = new jc60(i, newsEntry, newsEntry2, i2, true, null);
        mqp mqpVar = this.n;
        Context mo2getContext = mqpVar.d.mo2getContext();
        if (mo2getContext != null) {
            mqpVar.b.w0(mo2getContext, jc60Var);
        }
    }

    @Override // xsna.nxq0
    public final void e(WallGetMode wallGetMode) {
        p().e(wallGetMode);
    }

    @Override // xsna.nxq0
    public final void f(boolean z) {
        p().f(z);
    }

    @Override // xsna.o2u0
    public final void fg(NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        this.p.f(newsEntry, newsEntry2, i);
    }

    @Override // xsna.fqp
    public final com.vk.lists.c fn(c.h hVar) {
        com.vk.lists.c a = com.vk.lists.f.a(hVar, this.n.h);
        this.p.a(a);
        return a;
    }

    @Override // xsna.nxq0
    public final void g(foq0 foq0Var) {
        this.l = foq0Var;
    }

    @Override // xsna.pxq0
    public final void g3() {
        foq0 foq0Var = this.k;
        if (foq0Var != null) {
            foq0Var.x6(new dxq0.a.f());
        }
    }

    @Override // xsna.fqp
    public final void g6() {
        this.n.y.e(true);
    }

    @Override // xsna.nxq0
    public final RecyclerView.Adapter getAdapter() {
        return this.n.O;
    }

    @Override // xsna.fqp, xsna.sjg
    public final String getRef() {
        return p().a();
    }

    @Override // xsna.nxq0
    public final void h(Pair pair, boolean z) {
        p().m(Boolean.valueOf(z));
        p().i(pair);
    }

    @Override // xsna.pxq0
    public final void hf() {
        foq0 foq0Var = this.k;
        if (foq0Var != null) {
            foq0Var.x6(new dxq0.a.b(true));
        }
    }

    @Override // xsna.enq0
    public final void i() {
        foq0 foq0Var = this.l;
        if (foq0Var != null) {
            foq0Var.v6(wnq0.a.C3945a.a);
        }
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        this.p.l(gzsVar);
    }

    @Override // xsna.enq0
    public final void j() {
        foq0 foq0Var = this.l;
        if (foq0Var != null) {
            foq0Var.v6(wnq0.a.b.a);
        }
    }

    @Override // xsna.nxq0
    public final void j3(boolean z) {
        jqp jqpVar = this.p;
        if (!z) {
            jqpVar.g();
        } else {
            jqpVar.i();
            wjf0.d(this.c.getRecyclerView());
        }
    }

    @Override // xsna.nxq0
    public final void k(UserId userId) {
        UserId uid = p().getUid();
        p().k(userId);
        if (epx.f(uid, userId)) {
            return;
        }
        q();
    }

    @Override // xsna.fqp
    public final void ka() {
        this.n.e().a();
    }

    @Override // xsna.nxq0
    public final void l(int i) {
        mqp mqpVar = this.n;
        hbt0 hbt0Var = mqpVar.p;
        if (hbt0Var != null) {
            hbt0Var.onScrollStateChanged(this.c.getRecyclerView(), i);
        }
        a4r a4rVar = mqpVar.y;
        RecyclerView recyclerView = a4rVar.c;
        if (recyclerView != null) {
            a4rVar.g.onScrollStateChanged(recyclerView, i);
        }
        if (i == 0) {
            VkOnboardingCampaign vkOnboardingCampaign = this.t;
            if (vkOnboardingCampaign != null) {
                x6(vkOnboardingCampaign);
                return;
            }
            return;
        }
        VkContextMenu vkContextMenu = mqpVar.s;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
    }

    @Override // xsna.nxq0
    public final void m(foq0 foq0Var) {
        this.k = foq0Var;
    }

    @Override // xsna.fqp
    public final int me() {
        return this.n.O.getItemCount();
    }

    @Override // xsna.fqp
    public final void mk(NewsEntry newsEntry) {
        qt3 qt3Var = this.n.q;
        if (qt3Var != null) {
            qt3Var.h(newsEntry);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final b25 n() {
        return (b25) this.g.getValue();
    }

    public final Integer o() {
        View view;
        Resources resources;
        FragmentImpl fragmentImpl = this.b;
        if (!fragmentImpl.getViewLifecycleOwner().getLifecycle().getCurrentState().a(Lifecycle.State.STARTED) || (view = fragmentImpl.getView()) == null) {
            return null;
        }
        int i = bwt0.F(view).bottom;
        Context mo2getContext = fragmentImpl.mo2getContext();
        if (mo2getContext == null || (resources = mo2getContext.getResources()) == null) {
            return null;
        }
        return Integer.valueOf(i - resources.getDimensionPixelSize(R.dimen.vk_bottom_navigation_height));
    }

    @Override // xsna.fqp, xsna.pds
    public final void o1() {
        this.p.j();
    }

    @Override // xsna.obs
    public final void onConfigurationChanged(Configuration configuration) {
        q();
        FragmentActivity activity = this.b.getActivity();
        if (activity != null) {
            mhy.b(activity);
        }
    }

    @Override // xsna.obs
    public final void onCreate(Bundle bundle) {
        this.m = new io.reactivex.rxjava3.disposables.b();
        boolean z = bundle != null;
        mqp mqpVar = this.n;
        mqpVar.t = z;
        otq0 p = p();
        this.b.getArguments();
        p.u0(mqpVar.t);
    }

    @Override // xsna.obs
    public final void onDestroy() {
        this.m.dispose();
        this.p.c();
    }

    @Override // xsna.obs
    public final void onDestroyView() {
        this.p.d();
    }

    @Override // xsna.obs
    public final void onPause() {
        this.p.g();
    }

    @Override // xsna.obs
    public final void onResume() {
        this.p.i();
    }

    @Override // xsna.obs
    public final void onStop() {
        irp.a(this.n.c());
    }

    public final otq0 p() {
        return (otq0) this.j.getValue();
    }

    public final void q() {
        mqp mqpVar = this.n;
        a4r a4rVar = mqpVar.y;
        a4r a4rVar2 = mqpVar.y;
        a4rVar.g(hux.f.b.a);
        Context requireContext = this.b.requireContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(requireContext)) {
            RecyclerPaginatedView recyclerPaginatedView = mqpVar.h;
            if (recyclerPaginatedView != null) {
                gjf0.g(recyclerPaginatedView, 0, 5);
            }
            RecyclerView recyclerView = a4rVar2.c;
            if (recyclerView != null) {
                recyclerView.setPadding(0, 0, 0, recyclerView.getPaddingBottom());
            }
        }
        mqpVar.a().d(a4rVar2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xsna.fqp] */
    @Override // xsna.s980
    public final void r8(NewsEntry newsEntry) {
        if (newsEntry == null) {
            return;
        }
        this.o.c(this.b.requireContext(), newsEntry, this.n.c.getRef());
    }

    @Override // xsna.fqp
    public final boolean s1() {
        FragmentImpl fragmentImpl = this.b;
        return (fragmentImpl.isHidden() || fragmentImpl.Mn()) ? false : true;
    }

    @Override // xsna.fqp
    public final int s9() {
        return this.p.b();
    }

    @Override // xsna.hi60
    public final void sa(NewsfeedExternalAction newsfeedExternalAction) {
        mqp mqpVar = this.n;
        Context mo2getContext = mqpVar.d.mo2getContext();
        if (mo2getContext != null) {
            mqpVar.b.F0(mo2getContext, newsfeedExternalAction);
        }
    }

    @Override // xsna.fqp
    public final void u1(com.vk.lists.c cVar) {
        this.p.a(cVar);
        mqp mqpVar = this.n;
        cVar.b(mqpVar.h, mqpVar.t, false, 0L, null);
    }

    @Override // xsna.s980
    @ozl
    public final boolean u9(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        return false;
    }

    @Override // xsna.pxq0
    public final void v0(int i) {
        foq0 foq0Var = this.k;
        if (foq0Var != null) {
            foq0Var.x6(new dxq0.a.i(i));
        }
    }

    @Override // xsna.fqp
    public final void va() {
        rwc0<? extends pwc0> rwc0Var = this.n.r;
        if (rwc0Var != null) {
            rwc0Var.c();
        }
    }

    @Override // xsna.pxq0
    public final void w2() {
        foq0 foq0Var = this.k;
        if (foq0Var != null) {
            foq0Var.x6(dxq0.a.c.a);
        }
    }

    @Override // xsna.pxq0
    public final void x6(VkOnboardingCampaign vkOnboardingCampaign) {
        RecyclerView recyclerView = this.n.y.c;
        if (recyclerView == null || this.s) {
            return;
        }
        this.s = true;
        this.t = null;
        recyclerView.post(new pxz(this, recyclerView, vkOnboardingCampaign, 1));
    }

    @Override // xsna.fqp
    public final int zh(int i) {
        return s9() + i;
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.o2u0
    public final void F2(String str) {
    }

    @Override // xsna.fqp
    public final <T> bd70<T> F8(bd70<T> bd70Var) {
        return bd70Var;
    }

    @Override // xsna.obs
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
