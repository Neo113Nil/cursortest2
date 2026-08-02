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
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.util.NewsEntryWatcherMode;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.hux;
import xsna.m8v0;
import xsna.nvh;

/* compiled from: CommunityProfileWallView.kt */
/* loaded from: classes4.dex */
public final class vvh implements awh, zvh, w8i, pds {
    public final UserId b;
    public final FragmentImpl c;
    public final RecyclerPaginatedView d;
    public final WallGetMode e;
    public ExtendedCommunityProfile f;
    public final io.reactivex.rxjava3.core.q<?> g;
    public final Object h;
    public final Object i;
    public final bpn0 j;
    public boolean k;
    public boolean l;
    public final mqp m;
    public final jqp n;
    public final io.reactivex.rxjava3.disposables.b o;
    public final mrp p;
    public dmh q;
    public final Object r;
    public final Object s;
    public final bpn0 t;
    public io.reactivex.rxjava3.disposables.c u;
    public final bpn0 v;

    /* compiled from: CommunityProfileWallView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WallGetMode.values().length];
            try {
                iArr[WallGetMode.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WallGetMode.DONUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vvh(UserId userId, FragmentImpl fragmentImpl, RecyclerPaginatedView recyclerPaginatedView, WallGetMode wallGetMode, ExtendedCommunityProfile extendedCommunityProfile, io.reactivex.rxjava3.core.q<?> qVar) {
        this.b = userId;
        this.c = fragmentImpl;
        this.d = recyclerPaginatedView;
        this.e = wallGetMode;
        this.f = extendedCommunityProfile;
        this.g = qVar;
        fragmentImpl.D.a(new a());
        jcg jcgVar = new jcg(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, jcgVar);
        this.h = a2;
        this.i = msy.a(lazyThreadSafetyMode, new g4g(this, 5));
        this.j = new bpn0(new z0h(this, 1));
        c cVar = new c();
        mqp mqpVar = new mqp(b(), this, fragmentImpl, null);
        mqpVar.E = cVar;
        mqpVar.O.N0((q530) a2.getValue());
        this.m = mqpVar;
        this.n = new jqp(mqpVar);
        this.o = new io.reactivex.rxjava3.disposables.b();
        this.p = new mrp(new bpn0(new drg(this, 2)), new bpn0(new wqf(this, 5)), new bpn0(new trf(this, 5)));
        this.r = msy.a(lazyThreadSafetyMode, new pce(this, 10));
        this.s = msy.a(lazyThreadSafetyMode, new ra(this, 25));
        this.t = new bpn0(new h20(this, 21));
        this.v = new bpn0(new pvh(this, 0));
    }

    @Override // xsna.fqp
    public final void Aa(gzs<s3q0> gzsVar) {
        this.m.y.d(gzsVar);
    }

    @Override // xsna.fqp
    public final void Ak() {
        this.n.e();
    }

    @Override // xsna.s980
    public final boolean E8(Attachment attachment, NewsEntry newsEntry) {
        return this.m.i.E8(attachment, newsEntry);
    }

    @Override // xsna.awh
    public final void Ea(int i) {
        Iterator<u1c0> it = b().r0().d.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (di60.n(it.next().b) == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            S7(i2, 0);
        }
    }

    @Override // xsna.zvh
    public final void F1() {
        b().b(Boolean.TRUE);
    }

    @Override // xsna.o2u0
    public final void F2(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        z1h0 parentFragment = this.c.getParentFragment();
        if (parentFragment instanceof hnv) {
            ((hnv) parentFragment).F2(str);
        }
    }

    @Override // xsna.fqp
    public final <T> bd70<T> F8(bd70<T> bd70Var) {
        return new peh0(bd70Var, new rvh(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G5(View view, final NewsEntry newsEntry, final NewsEntry newsEntry2, final int i) {
        boolean z;
        boolean z2;
        ComFeatures comFeatures;
        boolean z3;
        boolean z4;
        boolean z5;
        VideoAttachment Nb;
        VideoAttachment Nb2;
        boolean s0 = b().s0();
        boolean z6 = newsEntry2 instanceof DiscoverMediaBlock;
        boolean z7 = false;
        if ((newsEntry instanceof DiscoverMediaBlock) || !z6) {
            z = false;
        } else {
            z = false;
            z7 = true;
        }
        boolean z8 = M0().o;
        boolean z9 = M0().D;
        UserId c2 = ((b25) this.r.getValue()).c();
        ComFeatures comFeatures2 = ComFeatures.COM_MAIN_TAB;
        comFeatures2.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(comFeatures2)) {
            ExtendedCommunityProfile extendedCommunityProfile = this.f;
            if (extendedCommunityProfile != null ? w2h.b(extendedCommunityProfile) : z) {
                z2 = true;
                comFeatures = ComFeatures.COM_EASY_PROMOTE;
                comFeatures.getClass();
                if (bVar.a(comFeatures)) {
                    ExtendedCommunityProfile extendedCommunityProfile2 = this.f;
                    if (extendedCommunityProfile2 != null ? w2h.b(extendedCommunityProfile2) : z) {
                        z3 = true;
                        z4 = newsEntry instanceof Videos;
                        bpn0 bpn0Var = this.t;
                        if (z4) {
                            Videos videos = (Videos) newsEntry;
                            if (videos.Ea() && (Nb2 = videos.Nb()) != null) {
                                z5 = ((xlc) bpn0Var.getValue()).d(Nb2.k);
                                if (z4) {
                                    Videos videos2 = (Videos) newsEntry;
                                    if (videos2.Ea() && (Nb = videos2.Nb()) != null) {
                                        z = ((xlc) bpn0Var.getValue()).c(Nb.k);
                                    }
                                }
                                this.m.s = this.n.n(view, new xm60(newsEntry, newsEntry2, null, s0, z6, z7, z8, c2, true, z2, false, z9, z3, z5, z, 4292), new z960() { // from class: xsna.ovh
                                    @Override // xsna.z960
                                    public final void g(VkContextMenu vkContextMenu, int i2) {
                                        vvh vvhVar = this;
                                        jc60 jc60Var = new jc60(i2, NewsEntry.this, newsEntry2, i, true, vvhVar.b);
                                        mqp mqpVar = vvhVar.m;
                                        mqpVar.b.w0(mqpVar.d.requireContext(), jc60Var);
                                        mqpVar.s = null;
                                    }
                                }, new tbh(this, 2), null);
                            }
                        }
                        z5 = z;
                        if (z4) {
                        }
                        this.m.s = this.n.n(view, new xm60(newsEntry, newsEntry2, null, s0, z6, z7, z8, c2, true, z2, false, z9, z3, z5, z, 4292), new z960() { // from class: xsna.ovh
                            @Override // xsna.z960
                            public final void g(VkContextMenu vkContextMenu, int i2) {
                                vvh vvhVar = this;
                                jc60 jc60Var = new jc60(i2, NewsEntry.this, newsEntry2, i, true, vvhVar.b);
                                mqp mqpVar = vvhVar.m;
                                mqpVar.b.w0(mqpVar.d.requireContext(), jc60Var);
                                mqpVar.s = null;
                            }
                        }, new tbh(this, 2), null);
                    }
                }
                z3 = z;
                z4 = newsEntry instanceof Videos;
                bpn0 bpn0Var2 = this.t;
                if (z4) {
                }
                z5 = z;
                if (z4) {
                }
                this.m.s = this.n.n(view, new xm60(newsEntry, newsEntry2, null, s0, z6, z7, z8, c2, true, z2, false, z9, z3, z5, z, 4292), new z960() { // from class: xsna.ovh
                    @Override // xsna.z960
                    public final void g(VkContextMenu vkContextMenu, int i2) {
                        vvh vvhVar = this;
                        jc60 jc60Var = new jc60(i2, NewsEntry.this, newsEntry2, i, true, vvhVar.b);
                        mqp mqpVar = vvhVar.m;
                        mqpVar.b.w0(mqpVar.d.requireContext(), jc60Var);
                        mqpVar.s = null;
                    }
                }, new tbh(this, 2), null);
            }
        }
        z2 = z;
        comFeatures = ComFeatures.COM_EASY_PROMOTE;
        comFeatures.getClass();
        if (bVar.a(comFeatures)) {
        }
        z3 = z;
        z4 = newsEntry instanceof Videos;
        bpn0 bpn0Var22 = this.t;
        if (z4) {
        }
        z5 = z;
        if (z4) {
        }
        this.m.s = this.n.n(view, new xm60(newsEntry, newsEntry2, null, s0, z6, z7, z8, c2, true, z2, false, z9, z3, z5, z, 4292), new z960() { // from class: xsna.ovh
            @Override // xsna.z960
            public final void g(VkContextMenu vkContextMenu, int i2) {
                vvh vvhVar = this;
                jc60 jc60Var = new jc60(i2, NewsEntry.this, newsEntry2, i, true, vvhVar.b);
                mqp mqpVar = vvhVar.m;
                mqpVar.b.w0(mqpVar.d.requireContext(), jc60Var);
                mqpVar.s = null;
            }
        }, new tbh(this, 2), null);
    }

    @Override // xsna.fqp
    public final void Gl(Html5Entry html5Entry) {
        this.m.b().a(html5Entry);
    }

    @Override // xsna.awh
    public final void H1() {
        dmh dmhVar = this.q;
        if (dmhVar != null) {
            dmhVar.t6(nvh.a.b.a);
        }
    }

    @Override // xsna.fqp
    public final void H3(u1c0 u1c0Var, int i) {
        this.n.k(u1c0Var, i);
    }

    @Override // xsna.s980
    public final void Hh(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        this.m.i.Hh(view, u1c0Var, newsEntry, attachment);
    }

    @Override // xsna.awh
    public final void Ij() {
        dmh dmhVar = this.q;
        if (dmhVar != null) {
            dmhVar.t6(nvh.a.f.a);
        }
    }

    @Override // xsna.fqp, xsna.pds
    public final void J0() {
        this.n.h();
    }

    @Override // xsna.zvh
    public final void Jj(io.reactivex.rxjava3.core.q<jvh> qVar) {
        this.o.b(qVar.subscribe(new pp3(new i4e(this, 13), 14)));
    }

    @Override // xsna.fqp
    public final void Ke() {
        qt3 qt3Var = this.m.q;
        if (qt3Var != null) {
            qt3Var.g();
        }
    }

    @Override // xsna.fqp
    public final s1c0 M0() {
        return (s1c0) this.v.getValue();
    }

    @Override // xsna.s980
    public final void Mg(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        this.m.i.Mg(view, u1c0Var, newsEntry, attachment);
    }

    @Override // xsna.fqp
    public final void Nc() {
        ehv ehvVar = this.m.m;
        if (ehvVar != null) {
            ehvVar.m();
        }
    }

    @Override // xsna.fqp
    public final void Ok(UxPollsEntry uxPollsEntry) {
        mqp mqpVar = this.m;
        w5r0 e = mqpVar.e();
        Context requireContext = mqpVar.d.requireContext();
        String str = uxPollsEntry.i;
        e.b(requireContext, str);
        e.b.add(str);
    }

    @Override // xsna.fqp
    public final void Q9(boolean z) {
        qt3 qt3Var = this.m.q;
        if (qt3Var != null) {
            qt3Var.c(z);
        }
    }

    @Override // xsna.fqp
    public final void R1() {
        this.n.o();
    }

    @Override // xsna.fqp
    public final void S7(int i, int i2) {
        RecyclerView recyclerView = this.m.y.c;
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
        return true;
    }

    @Override // xsna.awh
    public final void T7(ExtendedCommunityProfile extendedCommunityProfile) {
        this.f = extendedCommunityProfile;
    }

    @Override // xsna.s980
    public final void U5(NewsEntry newsEntry, boolean z, int i) {
        Context mo2getContext;
        if ((z && jjc.b()) || (mo2getContext = this.m.d.mo2getContext()) == null) {
            return;
        }
        this.p.b(mo2getContext, newsEntry, b().getRef(), b().a(), i);
    }

    @Override // xsna.awh
    public final void V1() {
        dmh dmhVar = this.q;
        if (dmhVar != null) {
            dmhVar.t6(nvh.a.C3419a.a);
        }
    }

    @Override // xsna.awh
    public final void W3(int i, int i2, int i3) {
        dmh dmhVar = this.q;
        if (dmhVar != null) {
            dmhVar.t6(new nvh.a.h(i, i2, i3));
        }
    }

    @Override // xsna.awh
    public final void Wb(Post post) {
        dmh dmhVar = this.q;
        if (dmhVar != null) {
            dmhVar.t6(new nvh.a.d(post));
        }
    }

    @Override // xsna.fqp
    public final void Xm(gzs gzsVar) {
        this.n.e.postDelayed(new d4m(1, gzsVar), 0L);
    }

    @Override // xsna.fqp
    public final void Y1(final int i, final int i2) {
        RecyclerView c2;
        FragmentActivity activity = this.c.getActivity();
        if ((activity == null || !p90.f(activity)) && (c2 = this.m.c()) != null) {
            c2.post(new Runnable() { // from class: xsna.qvh
                @Override // java.lang.Runnable
                public final void run() {
                    vvh.this.m.y.j(i, i2, null);
                }
            });
        }
    }

    @Override // xsna.fqp
    public final boolean Y7() {
        return true;
    }

    @Override // xsna.awh
    public final void Y9(String str, com.vk.movika.sdk.base.observable.o oVar, mh3 mh3Var) {
        RecyclerView recyclerView = this.m.y.c;
        if (recyclerView == null || this.l) {
            return;
        }
        this.l = true;
        recyclerView.post(new svh(recyclerView, this, str, oVar, mh3Var, 0));
    }

    @Override // xsna.fqp, xsna.sjg
    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        this.o.b(cVar);
    }

    public final kvh b() {
        return (kvh) this.j.getValue();
    }

    @Override // xsna.awh
    public final void bg(String str) {
        mqp mqpVar = this.m;
        mqpVar.v.a(new k0h(mqpVar.y, new wja(3, this, str)), NewsEntryWatcherMode.NORMAL);
    }

    public final void c() {
        this.n.i();
    }

    @Override // xsna.fqp
    public final void cn() {
        this.m.b().c();
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zvh
    public final void d() {
        RecyclerView.u rruVar;
        RecyclerView recyclerView;
        if (this.k) {
            return;
        }
        MarketAttachment.g = CommonMarketStat$TypeRefSource.POST;
        this.k = true;
        RecyclerPaginatedView recyclerPaginatedView = this.d;
        mqp mqpVar = this.m;
        mqpVar.h = recyclerPaginatedView;
        a4r a4rVar = mqpVar.y;
        RecyclerView c2 = mqpVar.c();
        if (c2 != null) {
            a4rVar.h(c2);
        }
        FragmentImpl fragmentImpl = mqpVar.d;
        EntriesListFragment.FocusableGridLayoutManager focusableGridLayoutManager = new EntriesListFragment.FocusableGridLayoutManager(fragmentImpl.kn(), fragmentImpl, (com.vk.stat.recycler.d) mqpVar.z.getValue());
        focusableGridLayoutManager.setOrientation(1);
        focusableGridLayoutManager.x = new xvh();
        RecyclerView recyclerView2 = a4rVar.c;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(focusableGridLayoutManager);
        }
        FragmentImpl fragmentImpl2 = this.c;
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
                a4rVar.g(hux.c.C3024c.a);
            } else if (recyclerView5 instanceof UsableRecyclerView) {
                ((UsableRecyclerView) recyclerView5).setSelectorBoundsProvider(new elg0(recyclerView5));
                a4rVar.g(hux.c.a.a);
            }
        }
        a4rVar.g(hux.f.b.a);
        Context requireContext = fragmentImpl2.requireContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(requireContext)) {
            RecyclerPaginatedView recyclerPaginatedView3 = mqpVar.h;
            if (recyclerPaginatedView3 != null) {
                gjf0.g(recyclerPaginatedView3, 0, 5);
            }
            RecyclerView recyclerView6 = a4rVar.c;
            if (recyclerView6 != null) {
                recyclerView6.setPadding(0, 0, 0, recyclerView6.getPaddingBottom());
            }
        }
        mqpVar.a().d(a4rVar);
        hjf0 hjf0Var = mqpVar.H;
        uvh uvhVar = new uvh(this, 0);
        RecyclerPaginatedView recyclerPaginatedView4 = ((mqp) hjf0Var.a.c).h;
        if (recyclerPaginatedView4 != null) {
            recyclerPaginatedView4.addOnLayoutChangeListener(uvhVar);
        }
        a4rVar.g.l(mqpVar.B);
        mqpVar.A.c(a4rVar);
        mqpVar.f(fragmentImpl2.kn());
        mqpVar.h(fragmentImpl2.kn());
        RecyclerPaginatedView recyclerPaginatedView5 = mqpVar.h;
        if (recyclerPaginatedView5 != null && (recyclerView = recyclerPaginatedView5.getRecyclerView()) != null && !mqpVar.j()) {
            mqpVar.q = new qt3(recyclerView, b(), (NativeAdUserLevelAnalyticsSender) this.s.getValue(), b().r0(), b().c(), new wvh(b()), true, true);
            mqpVar.g();
        }
        mqpVar.i();
        b().D0(fragmentImpl2.getArguments());
        mqpVar.l();
        mqpVar.k(M0());
        mqpVar.O.p.R = mqpVar.R;
        c();
    }

    @Override // xsna.s980
    public final void d9(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
        Context mo2getContext = this.c.mo2getContext();
        if (mo2getContext != null) {
            this.m.b.w0(mo2getContext, new jc60(i, newsEntry, newsEntry2, i2, true, null));
        }
    }

    public final boolean e(View view, String str, com.vk.movika.sdk.base.observable.o oVar, gzs gzsVar) {
        View view2;
        Resources resources;
        if (view == null) {
            return false;
        }
        FragmentImpl fragmentImpl = this.c;
        Integer num = null;
        if (fragmentImpl.getViewLifecycleOwner().getLifecycle().getCurrentState().a(Lifecycle.State.STARTED) && (view2 = fragmentImpl.getView()) != null) {
            int i = bwt0.F(view2).bottom;
            Context mo2getContext = fragmentImpl.mo2getContext();
            if (mo2getContext != null && (resources = mo2getContext.getResources()) != null) {
                num = Integer.valueOf(i - resources.getDimensionPixelSize(R.dimen.vk_bottom_navigation_height));
            }
        }
        if (num == null) {
            return false;
        }
        if (bwt0.F(view).bottom > num.intValue()) {
            return false;
        }
        oVar.invoke(view);
        fragmentImpl.requireView().dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
        int i2 = m8v0.M;
        m8v0.a.a(view, str == null ? fragmentImpl.requireContext().getString(R.string.community_main_wall_post_options_onboarding) : str, null, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new oce(view, 7), null, null, null, null, null, null, 0, false, null, null, false, null, !dhr0.M(), 8388100);
        gzsVar.invoke();
        return true;
    }

    @Override // xsna.zvh
    public final void f(boolean z) {
        b().f(z);
    }

    @Override // xsna.o2u0
    public final void fg(NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        this.n.f(newsEntry, newsEntry2, i);
    }

    @Override // xsna.fqp
    public final com.vk.lists.c fn(c.h hVar) {
        com.vk.lists.c a2 = com.vk.lists.f.a(hVar, this.m.h);
        this.n.a(a2);
        return a2;
    }

    @Override // xsna.awh
    public final void g3() {
        dmh dmhVar = this.q;
        if (dmhVar != null) {
            dmhVar.t6(new nvh.a.g());
        }
    }

    @Override // xsna.fqp
    public final void g6() {
        this.m.y.e(true);
    }

    @Override // xsna.zvh
    public final b2c0 getAdapter() {
        return this.m.O;
    }

    @Override // xsna.fqp, xsna.sjg
    public final String getRef() {
        return b().a();
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        this.n.l(gzsVar);
    }

    @Override // xsna.zvh
    public final void j3(boolean z) {
        jqp jqpVar = this.n;
        if (!z) {
            jqpVar.g();
        } else {
            jqpVar.i();
            wjf0.d(this.d.getRecyclerView());
        }
    }

    @Override // xsna.fqp
    public final void ka() {
        this.m.e().a();
    }

    @Override // xsna.zvh
    public final void l(int i) {
        VkContextMenu vkContextMenu;
        mqp mqpVar = this.m;
        hbt0 hbt0Var = mqpVar.p;
        if (hbt0Var != null) {
            hbt0Var.onScrollStateChanged(this.d.getRecyclerView(), i);
        }
        a4r a4rVar = mqpVar.y;
        RecyclerView recyclerView = a4rVar.c;
        if (recyclerView != null) {
            a4rVar.g.onScrollStateChanged(recyclerView, i);
        }
        if (i == 0 || (vkContextMenu = mqpVar.s) == null) {
            return;
        }
        vkContextMenu.b();
    }

    @Override // xsna.zvh
    public final void ma() {
        qt3 qt3Var = this.m.q;
        if (qt3Var != null) {
            qt3Var.b();
        }
    }

    @Override // xsna.fqp
    public final int me() {
        return this.m.O.getItemCount();
    }

    @Override // xsna.fqp
    public final void mk(NewsEntry newsEntry) {
        qt3 qt3Var = this.m.q;
        if (qt3Var != null) {
            qt3Var.h(newsEntry);
        }
    }

    @Override // xsna.fqp, xsna.pds
    public final void o1() {
        this.n.j();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xsna.fqp] */
    @Override // xsna.s980
    public final void r8(NewsEntry newsEntry) {
        Context mo2getContext;
        if (newsEntry == null || (mo2getContext = this.c.mo2getContext()) == null) {
            return;
        }
        this.p.c(mo2getContext, newsEntry, this.m.c.getRef());
    }

    @Override // xsna.fqp
    public final boolean s1() {
        FragmentImpl fragmentImpl = this.c;
        return (fragmentImpl.isHidden() || fragmentImpl.Mn()) ? false : true;
    }

    @Override // xsna.zvh
    public final void s6(dmh dmhVar) {
        this.q = dmhVar;
    }

    @Override // xsna.fqp
    public final int s9() {
        return 0;
    }

    @Override // xsna.hi60
    public final void sa(NewsfeedExternalAction newsfeedExternalAction) {
        Context mo2getContext = this.c.mo2getContext();
        if (mo2getContext != null) {
            b().F0(mo2getContext, newsfeedExternalAction);
        }
    }

    @Override // xsna.fqp
    public final void u1(com.vk.lists.c cVar) {
        this.n.a(cVar);
        mqp mqpVar = this.m;
        cVar.b(mqpVar.h, mqpVar.t, false, 0L, null);
    }

    @Override // xsna.s980
    public final boolean u9(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        return this.m.i.u9(view, u1c0Var, newsEntry, attachment);
    }

    @Override // xsna.awh
    public final void v0(int i) {
        dmh dmhVar = this.q;
        if (dmhVar != null) {
            dmhVar.t6(new nvh.a.i(i));
        }
    }

    @Override // xsna.fqp
    public final void va() {
        rwc0<? extends pwc0> rwc0Var = this.m.r;
        if (rwc0Var != null) {
            rwc0Var.c();
        }
    }

    @Override // xsna.awh
    public final void w2() {
        dmh dmhVar = this.q;
        if (dmhVar != null) {
            dmhVar.t6(nvh.a.e.a);
        }
    }

    /* compiled from: CommunityProfileWallView.kt */
    public static final class a implements obs {
        public a() {
        }

        @Override // xsna.obs
        public final void b() {
            vvh.this.getClass();
            MarketAttachment.g = CommonMarketStat$TypeRefSource.POST;
        }

        @Override // xsna.obs
        public final void onDestroy() {
            vvh vvhVar = vvh.this;
            vvhVar.o.e();
            vvhVar.n.c();
            vvhVar.m.O.N0(null);
        }

        @Override // xsna.obs
        public final void onDestroyView() {
            vvh vvhVar = vvh.this;
            vvhVar.n.d();
            vvhVar.b().onDestroyView();
        }

        @Override // xsna.obs
        public final void onPause() {
            vvh.this.n.g();
        }

        @Override // xsna.obs
        public final void onResume() {
            vvh.this.c();
        }

        @Override // xsna.obs
        public final void onStop() {
            irp.a(vvh.this.m.c());
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }

    /* compiled from: CommunityProfileWallView.kt */
    public static final class c implements d3f0 {
        @Override // xsna.d3f0
        public final void a(gii0 gii0Var) {
        }
    }

    @Override // xsna.fqp
    public final int zh(int i) {
        return i;
    }
}
