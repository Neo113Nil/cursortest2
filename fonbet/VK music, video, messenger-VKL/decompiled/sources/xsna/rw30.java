package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.AppBarLayoutWithDrawingOrderCallback;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.components.msg_search.domain.model.a;
import com.vk.im.ui.components.msg_search.vc.HideReason;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipImportContactsClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.utils.Logger;
import xsna.cwb0;
import xsna.ify;
import xsna.ox30;
import xsna.rw30;
import xsna.ux30;

/* compiled from: MsgSearchComponent.kt */
/* loaded from: classes2.dex */
public final class rw30 extends j8i implements mkr0 {
    public static final /* synthetic */ qcy<Object>[] D;
    public final jx30 A;
    public final Object B;
    public final Object C;
    public final a1w i;
    public final szv j;
    public final Context k;
    public final ox30 l;
    public final b25 m;
    public final boolean n;
    public final g9e0 o;
    public hy30 p;
    public b q;
    public final Handler r;
    public io.reactivex.rxjava3.disposables.c s;
    public io.reactivex.rxjava3.disposables.c t;
    public final io.reactivex.rxjava3.disposables.b u;
    public final bpn0 v;
    public a w;
    public final LinkedHashMap x;
    public final p9k y;
    public final ow30 z;

    /* compiled from: MsgSearchComponent.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchMode.values().length];
            try {
                iArr[SearchMode.PEERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchMode.MESSAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchMode.CHANNELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MsgSearchComponent.kt */
    public static final /* synthetic */ class d extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.E(th, new Object[0]);
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(rw30.class, "vc", "getVc()Lcom/vk/im/ui/components/msg_search/vc/MsgSearchVc;", 0);
        fpf0.a.getClass();
        D = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.ow30, xsna.tb0] */
    public rw30(a1w a1wVar, szv szvVar, Context context, ox30 ox30Var, g6o0 g6o0Var, int i) {
        b25 a2 = o25.a();
        g6o0 g6o0Var2 = (i & 32) != 0 ? null : g6o0Var;
        boolean booleanValue = a1wVar.r().v0.invoke().booleanValue();
        this.i = a1wVar;
        this.j = szvVar;
        this.k = context;
        this.l = ox30Var;
        this.m = a2;
        this.n = booleanValue;
        this.o = new g9e0(new uh3(18, this, g6o0Var2));
        SearchMode searchMode = ox30Var.a;
        boolean z = ox30Var instanceof ox30.b;
        ox30.b bVar = z ? (ox30.b) ox30Var : null;
        Long valueOf = bVar != null ? Long.valueOf(bVar.b) : null;
        ox30.b bVar2 = z ? (ox30.b) ox30Var : null;
        this.p = new hy30("", valueOf, bVar2 != null ? bVar2.c : null, false, false, searchMode, null, null, null, 16071);
        this.r = new Handler(Looper.getMainLooper());
        this.u = new io.reactivex.rxjava3.disposables.b();
        this.v = new bpn0(new jw30(this, 0));
        this.x = new LinkedHashMap();
        this.y = new p9k(a1wVar, szvVar, com.vk.contacts.b.a);
        ?? r2 = new tb0() { // from class: xsna.ow30
            @Override // xsna.tb0
            public final void onActivityResult(int i2, int i3, Intent intent) {
                rw30 rw30Var = rw30.this;
                Activity h = e3m.h(rw30Var.k);
                if (h != null) {
                    rw30Var.y.b(h, i2, i3, intent);
                }
            }
        };
        this.z = r2;
        this.A = new jx30(a1wVar, a2, new sw30(this));
        foi foiVar = new foi(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.B = msy.a(lazyThreadSafetyMode, foiVar);
        this.C = msy.a(lazyThreadSafetyMode, new qfj(this, 20));
        ComponentCallbacks2 h = e3m.h(context);
        aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : 0;
        if (aeg0Var != 0) {
            aeg0Var.Li(r2);
        }
    }

    public static void i1(rw30 rw30Var, SearchMode searchMode, int i) {
        if ((i & 1) != 0) {
            searchMode = SearchMode.PEERS;
        }
        rw30Var.V0();
        if (rw30Var.l instanceof ox30.b) {
            rw30Var.b1().c(searchMode);
        } else {
            rw30Var.g1(rw30Var, "", SearchMode.PEERS, new w76(new Ref$BooleanRef(), rw30Var, searchMode, 3));
        }
    }

    @Override // xsna.mkr0
    public final void A() {
        this.j.e(xa4.L(this.k), null);
    }

    @Override // xsna.mkr0
    public final void B(final long j, final boolean z) {
        f1(new gzs() { // from class: xsna.nw30
            @Override // xsna.gzs
            public final Object invoke() {
                rw30.a aVar = rw30.this.w;
                if (aVar != null) {
                    aVar.h(j, z);
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.mkr0
    public final void B0(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
        f1(new bx5(this, dialog, profilesSimpleInfo, imSearchItemLoggingInfo, 3));
    }

    @Override // xsna.mkr0
    public final void C(ux30.b bVar, SearchMode searchMode, int i) {
        d1(bVar, searchMode, i, null);
    }

    @Override // xsna.mkr0
    public final boolean D() {
        mib mibVar = this.p.k;
        return mibVar.a.size() < mibVar.d;
    }

    @Override // xsna.mkr0
    public final boolean E() {
        return !this.p.g;
    }

    @Override // xsna.mkr0
    public final void F(boolean z) {
        if (this.e) {
            mhy.b(this.k);
        }
        io.reactivex.rxjava3.disposables.c cVar = this.s;
        if (cVar != null) {
            cVar.dispose();
        }
        this.s = null;
        this.p = new hy30(null, null, null, false, false, null, null, null, null, 16383);
        b1().h(SearchMode.PEERS);
        b1().e(this.p);
        if (!z) {
            UiTracker.i.j(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.IM), false);
        }
        a aVar = this.w;
        if (aVar != null) {
            aVar.i();
        }
    }

    @Override // xsna.mkr0
    public final boolean G() {
        return !this.p.f;
    }

    @Override // xsna.mkr0
    public final void H() {
        this.p.h = SearchMode.PEERS;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        io.reactivex.rxjava3.internal.operators.observable.m1 a2 = this.i.l.a();
        asu0.a.getClass();
        I0(a2.a0(asu0.m()).subscribe(new st0(new yr00(this, 5), 28), new oo20(new d(1, L.a, L.class, Logger.METHOD_W, "w(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 1)));
        iy30 b1 = b1();
        b1.getClass();
        viewStub.setLayoutResource(R.layout.vkim_msg_search_content_view);
        View inflate = viewStub.inflate();
        b1.i = inflate;
        AppBarLayoutWithDrawingOrderCallback appBarLayoutWithDrawingOrderCallback = (AppBarLayoutWithDrawingOrderCallback) inflate.findViewById(R.id.vkim_search_app_bar);
        b1.j = appBarLayoutWithDrawingOrderCallback;
        appBarLayoutWithDrawingOrderCallback.setDrawingOrderCallback(AppBarLayoutWithDrawingOrderCallback.a.C0783a.b);
        View view = b1.i;
        if (view == null) {
            view = null;
        }
        View view2 = b1.i;
        if (view2 == null) {
            view2 = null;
        }
        VkSearchView vkSearchView = (VkSearchView) view2.findViewById(R.id.vkim_search_view);
        b1.k = vkSearchView;
        vkSearchView.setHint(R.string.search);
        VkSearchView vkSearchView2 = b1.k;
        if (vkSearchView2 == null) {
            vkSearchView2 = null;
        }
        orl.a(vkSearchView2);
        View view3 = b1.i;
        if (view3 == null) {
            view3 = null;
        }
        b1.l = view3.findViewById(R.id.shadow);
        View view4 = b1.i;
        if (view4 == null) {
            view4 = null;
        }
        ViewPager viewPager = (ViewPager) view4.findViewById(R.id.vkim_viewpager);
        viewPager.setOffscreenPageLimit(2);
        b1.n = viewPager;
        View view5 = b1.i;
        if (view5 == null) {
            view5 = null;
        }
        VKTabLayout vKTabLayout = (VKTabLayout) view5.findViewById(R.id.vkim_tabs);
        b1.m = vKTabLayout;
        usn0.a(vKTabLayout);
        VKTabLayout vKTabLayout2 = b1.m;
        if (vKTabLayout2 == null) {
            vKTabLayout2 = null;
        }
        vKTabLayout2.setSelectedTabIndicatorColor(dhr0.t.c(R.attr.vk_ui_accent_blue));
        if (b1.a() instanceof com.vk.im.ui.components.msg_search.vc.b) {
            VKTabLayout vKTabLayout3 = b1.m;
            if (vKTabLayout3 == null) {
                vKTabLayout3 = null;
            }
            ViewPager viewPager2 = b1.n;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            vKTabLayout3.setupWithViewPager(viewPager2);
        } else {
            AppBarLayoutWithDrawingOrderCallback appBarLayoutWithDrawingOrderCallback2 = b1.j;
            if (appBarLayoutWithDrawingOrderCallback2 == null) {
                appBarLayoutWithDrawingOrderCallback2 = null;
            }
            appBarLayoutWithDrawingOrderCallback2.k();
            VKTabLayout vKTabLayout4 = b1.m;
            if (vKTabLayout4 == null) {
                vKTabLayout4 = null;
            }
            vKTabLayout4.setVisibility(8);
        }
        View view6 = b1.i;
        if (view6 == null) {
            view6 = null;
        }
        b1.o = new cw30(view6, b1.q);
        VkSearchView vkSearchView3 = b1.k;
        if (vkSearchView3 == null) {
            vkSearchView3 = null;
        }
        vkSearchView3.setOnBackClickListener(new cvs(b1, 21));
        VkSearchView vkSearchView4 = b1.k;
        if (vkSearchView4 == null) {
            vkSearchView4 = null;
        }
        vkSearchView4.setOnVoiceInputListener(new kpr(b1, 11));
        VKTabLayout vKTabLayout5 = b1.m;
        if (vKTabLayout5 == null) {
            vKTabLayout5 = null;
        }
        List<rwh0> list = b1.a().b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rwh0) it.next()).d);
        }
        vKTabLayout5.f(new jy30(b1, arrayList));
        View view7 = b1.i;
        if (view7 == null) {
            return null;
        }
        return view7;
    }

    @Override // xsna.j8i
    public final void M0() {
        ComponentCallbacks2 h = e3m.h(this.k);
        aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this.z);
        }
        this.u.dispose();
        p9k p9kVar = this.y;
        if (p9kVar.e.N0()) {
            return;
        }
        p9kVar.e.onError(new IllegalStateException("CreatePhonebookContactDelegate destroyed before got result"));
    }

    @Override // xsna.j8i
    public final void N0() {
        this.r.removeCallbacksAndMessages(null);
        b bVar = this.q;
        if (bVar != null) {
            int i = ify.a;
            ify.g(bVar);
        }
        io.reactivex.rxjava3.disposables.c cVar = this.s;
        if (cVar != null) {
            cVar.dispose();
        }
        this.s = null;
        cw30 cw30Var = b1().o;
        cw30 cw30Var2 = cw30Var != null ? cw30Var : null;
        cw30Var2.d = false;
        cw30Var2.a(false);
        View view = cw30Var2.b;
        d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        view.setVisibility(4);
        rvv.f.remove(cw30Var2);
        this.o.a();
    }

    @Override // xsna.j8i
    public final void O0(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("is_contact_creation_started", false)) {
            return;
        }
        this.u.b(io.reactivex.rxjava3.kotlin.c.e(this.y.e.m0().m(io.reactivex.rxjava3.android.schedulers.a.b()), new e2s(this, 13), new wi3(1, this, rw30.class, "onContactCreated", "onContactCreated(Lcom/vk/im/engine/models/PhoneBookProfile;)V", 0, 10)));
    }

    @Override // xsna.j8i
    public final void P0(Bundle bundle) {
        bundle.putBoolean("is_contact_creation_started", !this.y.e.N0());
    }

    @Override // xsna.mkr0
    public final void Q(qtd0 qtd0Var, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
        if (qtd0Var.t8() != Peer.Type.UNKNOWN) {
            f1(new s9j(this, qtd0Var, imSearchItemLoggingInfo, 2));
            return;
        }
        q2a0 q2a0Var = qtd0Var instanceof q2a0 ? (q2a0) qtd0Var : null;
        if (q2a0Var != null) {
            this.j.g(this.k, q2a0Var);
        }
    }

    @Override // xsna.j8i
    public final void R0() {
        ((bzb0) this.v.getValue()).a();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j8i
    public final void S0(View view) {
        if (epx.f(this.l, ox30.a.b)) {
            lbb lbbVar = (lbb) this.C.getValue();
            io.reactivex.rxjava3.internal.operators.single.c C = lbbVar.a.C(lbbVar, new ofb(Source.ACTUAL, "messenger"));
            asu0 asu0Var = asu0.a;
            int i = 6;
            io.reactivex.rxjava3.internal.operators.single.b0 m = C.q(asu0Var.c()).l(new b9(new qm(i), i)).m(asu0Var.d());
            j720 j720Var = new j720(new w7u(this, 15), 2);
            int i2 = kwg0.a;
            I0(m.subscribe(j720Var, new jwg0("MsgSearchComponent")));
        }
    }

    @Override // xsna.mkr0
    public final void U(CharSequence charSequence, SearchMode searchMode) {
        io.reactivex.rxjava3.disposables.c cVar = this.s;
        if (cVar != null) {
            cVar.dispose();
        }
        this.s = null;
        this.p.a(searchMode);
        this.p.d = charSequence.toString();
        hy30 hy30Var = this.p;
        r6m.a.getClass();
        hy30Var.i = r6m.j() ? Source.NETWORK : Source.CACHE;
        b1().f(true);
        d1("ImMsgSearch", searchMode, 0, null);
    }

    public final boolean X0(HideReason hideReason, boolean z) {
        if (!this.e) {
            return false;
        }
        W0();
        return b1().b(hideReason, z);
    }

    @Override // xsna.mkr0
    public final void Y(final Dialog dialog, final int i) {
        f1(new gzs() { // from class: xsna.pw30
            @Override // xsna.gzs
            public final Object invoke() {
                rw30 rw30Var = rw30.this;
                rw30.a aVar = rw30Var.w;
                if (aVar != null) {
                    String str = rw30Var.p.d;
                    aVar.d(dialog, i);
                }
                return s3q0.a;
            }
        });
    }

    public final SearchMode Z0() {
        return this.p.h;
    }

    @Override // xsna.mkr0
    public final void a0() {
        b1().h(SearchMode.MESSAGES);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, xsna.eu90] */
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a1(Object obj) {
        SearchEntrypoint searchEntrypoint;
        ArrayList arrayList;
        String uuid = UUID.randomUUID().toString();
        a aVar = this.w;
        if (aVar == null || (searchEntrypoint = aVar.g()) == null) {
            searchEntrypoint = SearchEntrypoint.UNKNOWN;
        }
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = new ImSearchLocalRequestLoggingInfo(null, uuid, 0L, 0, searchEntrypoint, null, 0, false, 237, null);
        xx30 xx30Var = (xx30) this.B.getValue();
        hy30 hy30Var = this.p;
        String str = hy30Var.d;
        Long l = hy30Var.e;
        xx30Var.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int i = 0;
        ref$ObjectRef.element = new eu90(0);
        List I = rl3.I(new fcy[]{new ay30(4, xx30Var, xx30.class, "searchDialogsLocal", "searchDialogsLocal(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Object;Lcom/vk/im/ui/components/msg_search/analytics/ImSearchLocalRequestLoggingInfo;)Lio/reactivex/rxjava3/core/Single;", 0), new by30(4, xx30Var, xx30.class, "searchDialogsRemote", "searchDialogsRemote(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Object;Lcom/vk/im/ui/components/msg_search/analytics/ImSearchLocalRequestLoggingInfo;)Lio/reactivex/rxjava3/core/Single;", 0), this.n ? new cy30(4, xx30Var, xx30.class, "searchGlobalUsers", "searchGlobalUsers(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Object;Lcom/vk/im/ui/components/msg_search/analytics/ImSearchLocalRequestLoggingInfo;)Lio/reactivex/rxjava3/core/Single;", 0) : null});
        List l2 = e43.l(new yx30(2, xx30Var, xx30.class, "recommendationsLocal", "recommendationsLocal(Ljava/lang/Object;Lcom/vk/im/ui/components/msg_search/analytics/ImSearchLocalRequestLoggingInfo;)Lio/reactivex/rxjava3/core/Single;", 0), new zx30(2, xx30Var, xx30.class, "recommendationsRemote", "recommendationsRemote(Ljava/lang/Object;Lcom/vk/im/ui/components/msg_search/analytics/ImSearchLocalRequestLoggingInfo;)Lio/reactivex/rxjava3/core/Single;", 0));
        boolean N = drm0.N(str);
        if (N) {
            List list = l2;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((io.reactivex.rxjava3.core.x) ((wzs) ((fcy) it.next())).invoke(obj, imSearchLocalRequestLoggingInfo));
            }
        } else {
            ArrayList arrayList2 = new ArrayList(c5g.u(I, 10));
            Iterator it2 = I.iterator();
            while (it2.hasNext()) {
                arrayList2.add((io.reactivex.rxjava3.core.x) ((zzs) ((fcy) it2.next())).invoke(str, l, obj, imSearchLocalRequestLoggingInfo));
            }
            arrayList = arrayList2;
        }
        int i2 = io.reactivex.rxjava3.core.g.b;
        int i3 = 28;
        return new io.reactivex.rxjava3.internal.operators.observable.v0(new io.reactivex.rxjava3.internal.operators.flowable.c0(new io.reactivex.rxjava3.internal.operators.flowable.y(arrayList).d(false), new vj0(new vx30(xx30Var, N, ref$ObjectRef, i), i3))).U(new adz(new gmj(this, i3), 3));
    }

    public final iy30 b1() {
        qcy<Object> qcyVar = D[0];
        return (iy30) this.o.b();
    }

    public final boolean c1() {
        View view;
        return this.o.c() && (view = b1().i) != null && bwt0.K(view);
    }

    @Override // xsna.mkr0
    public final void d() {
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsCallsStat$TypeVoipImportContactsClick(MobileOfficialAppsCallsStat$TypeVoipImportContactsClick.EventType.IMPORT_CONTACTS_CLICK, MobileOfficialAppsCallsStat$TypeVoipImportContactsClick.Source.CALLS_SERVICES), 2);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_CHATS;
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, b2, uzp0Var.a).q();
        szv.a(this.j, this.k, null, new vt30(this, 1), null, new com.vk.movika.sdk.base.ui.g0(29), 10);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void d1(Object obj, SearchMode searchMode, int i, gzs<s3q0> gzsVar) {
        io.reactivex.rxjava3.core.q a1;
        Source source;
        if (this.s != null) {
            return;
        }
        boolean z = i == 0;
        int i2 = c.$EnumSwitchMapping$0[searchMode.ordinal()];
        if (i2 == 1) {
            a1 = a1(obj);
        } else if (i2 == 2) {
            r0 = i == 0 ? 1 : 0;
            if (r0 != 0) {
                r6m.a.getClass();
                source = r6m.j() ? Source.NETWORK : Source.CACHE;
            } else {
                source = this.p.i;
            }
            Source source2 = source;
            hy30 hy30Var = this.p;
            sx30 sx30Var = new sx30(hy30Var.d, SearchMode.MESSAGES, source2, hy30Var.a.size(), null, this.p.e, true, 808);
            io.reactivex.rxjava3.core.q w = this.i.E(obj, sx30Var).w();
            a1 = r0 == 1 ? w.y0(5L, TimeUnit.SECONDS).a0(asu0.a.d()).F(new lw30(new rxz(this, 6), 0)).a0(asu0.r()).c0(new io.reactivex.rxjava3.internal.operators.observable.q(new mw30(this, obj, sx30Var))) : w;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int size = this.p.k.a.size();
            hy30 hy30Var2 = this.p;
            String str = hy30Var2.d;
            Long l = hy30Var2.e;
            Source source3 = hy30Var2.i;
            lbb lbbVar = (lbb) this.C.getValue();
            lbbVar.getClass();
            a1 = (str.length() == 0 ? io.reactivex.rxjava3.core.x.k(new mib(r0)) : lbbVar.a.C(lbbVar, new kib(str, size)).l(new d9(new sm(6), 6))).l(new mj1(new kw30(str, l, searchMode, source3), 29)).w();
        }
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.internal.operators.observable.a0 a0Var = new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(a1.r0(asu0.r()).a0(asu0Var.d()), new om1(new xvx(z, this, 1), 28), io.reactivex.rxjava3.internal.functions.a.c), new dx3(this, 7));
        int i3 = 29;
        this.s = a0Var.subscribe(new defpackage.i0(new defpackage.h0(18, this, gzsVar), i3), new g600(new iie(this, i3), 5));
    }

    public final void e1(hy30 hy30Var) {
        hy30 hy30Var2 = this.p;
        if (!epx.f(hy30Var2.d, hy30Var.d)) {
            hy30Var2.a(hy30Var.h);
        }
        hy30Var2.h = hy30Var.h;
        hy30Var2.i = hy30Var.i;
        ProfilesSimpleInfo profilesSimpleInfo = hy30Var.c;
        LinkedHashMap linkedHashMap = hy30Var.b;
        hy30Var2.c.Hb(profilesSimpleInfo);
        hy30Var2.b.putAll(linkedHashMap);
        ArrayList arrayList = hy30Var.a;
        LinkedHashMap linkedHashMap2 = hy30Var.n;
        LinkedHashMap linkedHashMap3 = hy30Var.o;
        hy30Var2.a.addAll(arrayList);
        hy30Var2.n.putAll(linkedHashMap2);
        hy30Var2.o.putAll(linkedHashMap3);
        if (hy30Var.h == SearchMode.CHANNELS) {
            mib mibVar = hy30Var.k;
            LinkedHashMap n = pn00.n(hy30Var2.k.a, mibVar.a);
            ProfilesSimpleInfo profilesSimpleInfo2 = hy30Var2.k.c;
            profilesSimpleInfo2.Hb(mibVar.c);
            hy30Var2.k = new mib(n, pn00.n(hy30Var2.k.b, mibVar.b), profilesSimpleInfo2, mibVar.d);
        }
        List<dcf0> list = hy30Var.l;
        if (list != null) {
            hy30Var2.l = list;
        }
        SearchMode searchMode = hy30Var.h;
        hy30Var2.f = searchMode == SearchMode.MESSAGES ? hy30Var.f : hy30Var2.f;
        hy30Var2.g = searchMode == SearchMode.PEERS ? hy30Var.g : hy30Var2.g;
        hy30Var2.d = hy30Var.d;
        hy30Var2.p = hy30Var.p;
        hy30Var2.q = hy30Var.q;
        hy30Var2.j = hy30Var.j;
        this.p.i = hy30Var.i;
        if (this.o.c()) {
            b1().e(this.p);
        }
    }

    @Override // xsna.mkr0
    public final void f0() {
        this.p.h = SearchMode.MESSAGES;
    }

    public final void f1(gzs<s3q0> gzsVar) {
        int i = ify.a;
        if (!ify.e(ify.c)) {
            gzsVar.invoke();
            return;
        }
        b bVar = this.q;
        if (bVar != null) {
            ify.g(bVar);
        }
        b bVar2 = new b(gzsVar);
        this.q = bVar2;
        ify.a(bVar2);
        mhy.d(this.g);
    }

    public final void g1(Object obj, CharSequence charSequence, SearchMode searchMode, w76 w76Var) {
        boolean f = epx.f(this.p.d, charSequence);
        boolean z = this.p.h == searchMode;
        if (f && z && this.s != null) {
            if (w76Var != null) {
                w76Var.invoke();
                return;
            }
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.s;
        if (cVar != null) {
            cVar.dispose();
        }
        this.s = null;
        if (!f) {
            this.p.a(searchMode);
            this.p.d = charSequence.toString();
        }
        d1(obj, searchMode, 0, w76Var);
    }

    public final void h1(a aVar) {
        this.w = aVar;
    }

    @Override // xsna.mkr0
    public final void j0(long j, boolean z) {
        a aVar = this.w;
        if (aVar != null) {
            aVar.c(j, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c4  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1(Dialog dialog) {
        a.d dVar;
        gyh0<Dialog> gyh0Var;
        ImSearchItemLoggingInfo imSearchItemLoggingInfo;
        ImSearchLocalItemLoggingInfo imSearchLocalItemLoggingInfo;
        ImSearchLocalItemLoggingInfo imSearchLocalItemLoggingInfo2;
        Iterator it;
        ey30 ey30Var;
        Iterator it2;
        ey30 ey30Var2;
        Iterator it3;
        ImSearchLocalItemLoggingInfo imSearchLocalItemLoggingInfo3;
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo;
        gyh0<Dialog> gyh0Var2;
        io.reactivex.rxjava3.internal.operators.single.b0 E = this.i.E(this, new gl0(dialog.Zb()));
        int i = kwg0.a;
        I0(E.subscribe(new iwg0(), new jwg0("MsgSearchComponent")));
        if (!this.o.c() || dialog.Jc()) {
            return;
        }
        if (drm0.N(this.p.d)) {
            hy30 hy30Var = this.p;
            xx30 xx30Var = (xx30) this.B.getValue();
            eu90 eu90Var = this.p.j;
            ey30 ey30Var3 = xx30Var.f;
            ey30Var3.getClass();
            List list = eu90Var.a;
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    if (((PeersSearchBlock) it4.next()) instanceof PeersSearchBlock.c) {
                        break;
                    }
                }
            }
            list = j5g.v0(new PeersSearchBlock.c(EmptyList.b), list);
            PeersSearchBlock peersSearchBlock = (PeersSearchBlock) j5g.a0(list);
            if (peersSearchBlock instanceof PeersSearchBlock.c) {
                a.b.C1154b c1154b = (a.b.C1154b) j5g.a0(((PeersSearchBlock.c) peersSearchBlock).b);
                if (c1154b != null && (gyh0Var2 = c1154b.a) != null) {
                    imSearchItemLoggingInfo = gyh0Var2.b;
                    imSearchLocalItemLoggingInfo = !(imSearchItemLoggingInfo instanceof ImSearchLocalItemLoggingInfo) ? (ImSearchLocalItemLoggingInfo) imSearchItemLoggingInfo : null;
                    int i2 = 0;
                    if (imSearchLocalItemLoggingInfo != null || (imSearchLocalRequestLoggingInfo = imSearchLocalItemLoggingInfo.b) == null) {
                        imSearchLocalItemLoggingInfo2 = null;
                    } else {
                        ImSearchLocalRequestLoggingInfo a2 = ImSearchLocalRequestLoggingInfo.a(imSearchLocalRequestLoggingInfo, 0, imSearchLocalRequestLoggingInfo.i ? ImSearchLocalRequestLoggingInfo.SearchBlock.CACHE_RECOMMENDATIONS_RECENT : ImSearchLocalRequestLoggingInfo.SearchBlock.CACHE_RECOMMENDATIONS_RECENT, 2, 159);
                        long longValue = dialog.Sb().longValue();
                        gzs<s3q0> gzsVar = fkq0.a;
                        imSearchLocalItemLoggingInfo2 = new ImSearchLocalItemLoggingInfo(a2, 1, new UserId(longValue), ImSearchItemLoggingInfo.ClickDocType.DIALOG);
                    }
                    List list3 = list;
                    int i3 = 10;
                    ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        Object obj = (PeersSearchBlock) it.next();
                        if (obj instanceof PeersSearchBlock.c) {
                            List singletonList = Collections.singletonList(new a.b.C1154b(new gyh0(dialog, imSearchLocalItemLoggingInfo2), ey30Var3.a.b(dialog)));
                            List<a.b.C1154b> list4 = ((PeersSearchBlock.c) obj).b;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list4) {
                                if (!epx.f(((a.b.C1154b) obj2).a.a, dialog)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, i3));
                            Iterator it5 = arrayList2.iterator();
                            int i4 = i2;
                            while (it5.hasNext()) {
                                Object next = it5.next();
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                a.b.C1154b c1154b2 = (a.b.C1154b) next;
                                gyh0<Dialog> gyh0Var3 = c1154b2.a;
                                ImSearchItemLoggingInfo imSearchItemLoggingInfo2 = gyh0Var3.b;
                                ImSearchLocalItemLoggingInfo imSearchLocalItemLoggingInfo4 = imSearchItemLoggingInfo2 instanceof ImSearchLocalItemLoggingInfo ? (ImSearchLocalItemLoggingInfo) imSearchItemLoggingInfo2 : null;
                                if (imSearchLocalItemLoggingInfo4 != null) {
                                    ey30Var2 = ey30Var3;
                                    it3 = it;
                                    imSearchLocalItemLoggingInfo3 = new ImSearchLocalItemLoggingInfo(imSearchLocalItemLoggingInfo4.b, i4 + 2, imSearchLocalItemLoggingInfo4.d, imSearchLocalItemLoggingInfo4.e);
                                } else {
                                    ey30Var2 = ey30Var3;
                                    it3 = it;
                                    imSearchLocalItemLoggingInfo3 = null;
                                }
                                arrayList3.add(a.b.C1154b.a(c1154b2, gyh0.a(gyh0Var3, imSearchLocalItemLoggingInfo3)));
                                i4 = i5;
                                ey30Var3 = ey30Var2;
                                it = it3;
                            }
                            ey30Var = ey30Var3;
                            it2 = it;
                            obj = new PeersSearchBlock.c(j5g.u0(arrayList3, singletonList));
                        } else {
                            ey30Var = ey30Var3;
                            it2 = it;
                        }
                        arrayList.add(obj);
                        ey30Var3 = ey30Var;
                        it = it2;
                        i2 = 0;
                        i3 = 10;
                    }
                    hy30Var.j = eu90.a(eu90Var, arrayList);
                }
                imSearchItemLoggingInfo = null;
                if (!(imSearchItemLoggingInfo instanceof ImSearchLocalItemLoggingInfo)) {
                }
                int i22 = 0;
                if (imSearchLocalItemLoggingInfo != null) {
                }
                imSearchLocalItemLoggingInfo2 = null;
                List list32 = list;
                int i32 = 10;
                ArrayList arrayList4 = new ArrayList(c5g.u(list32, 10));
                it = list32.iterator();
                while (it.hasNext()) {
                }
                hy30Var.j = eu90.a(eu90Var, arrayList4);
            } else {
                if ((peersSearchBlock instanceof PeersSearchBlock.b) && (dVar = (a.d) j5g.a0(((PeersSearchBlock.b) peersSearchBlock).b)) != null && (gyh0Var = dVar.a) != null) {
                    imSearchItemLoggingInfo = gyh0Var.b;
                    if (!(imSearchItemLoggingInfo instanceof ImSearchLocalItemLoggingInfo)) {
                    }
                    int i222 = 0;
                    if (imSearchLocalItemLoggingInfo != null) {
                    }
                    imSearchLocalItemLoggingInfo2 = null;
                    List list322 = list;
                    int i322 = 10;
                    ArrayList arrayList42 = new ArrayList(c5g.u(list322, 10));
                    it = list322.iterator();
                    while (it.hasNext()) {
                    }
                    hy30Var.j = eu90.a(eu90Var, arrayList42);
                }
                imSearchItemLoggingInfo = null;
                if (!(imSearchItemLoggingInfo instanceof ImSearchLocalItemLoggingInfo)) {
                }
                int i2222 = 0;
                if (imSearchLocalItemLoggingInfo != null) {
                }
                imSearchLocalItemLoggingInfo2 = null;
                List list3222 = list;
                int i3222 = 10;
                ArrayList arrayList422 = new ArrayList(c5g.u(list3222, 10));
                it = list3222.iterator();
                while (it.hasNext()) {
                }
                hy30Var.j = eu90.a(eu90Var, arrayList422);
            }
        } else {
            hy30 hy30Var2 = this.p;
            List singletonList2 = Collections.singletonList(dialog);
            ArrayList arrayList5 = new ArrayList(this.p.q);
            arrayList5.remove(dialog);
            s3q0 s3q0Var = s3q0.a;
            hy30Var2.q = j5g.u0(arrayList5, singletonList2);
        }
        b1().e(this.p);
    }

    @Override // xsna.mkr0
    public final void m0(String str) {
        qtd0 qtd0Var = (qtd0) this.x.get(str);
        if (qtd0Var != null) {
            Q(qtd0Var, null);
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.b0 m = this.i.C(this, new s8j(str, this.m.L())).q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b());
        b0y b0yVar = new b0y(new v74(19, this, str), 8);
        int i = kwg0.a;
        I0(m.subscribe(b0yVar, new jwg0("MsgSearchComponent")));
    }

    @Override // xsna.mkr0
    public final void o0(CharSequence charSequence, SearchMode searchMode) {
        g1("ImMsgSearch", charSequence, searchMode, null);
    }

    @Override // xsna.mkr0
    public final void p0() {
        this.p.h = SearchMode.CHANNELS;
    }

    @Override // xsna.mkr0
    public final void t0(ImSearchAnalytics.ClickAction clickAction, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
        ImSearchAnalytics.d(clickAction, imSearchItemLoggingInfo);
    }

    @Override // xsna.mkr0
    public final void v0(String str) {
        Activity h = e3m.h(this.k);
        if (h != null) {
            this.u.b(io.reactivex.rxjava3.kotlin.c.e(this.y.a(h, str).m(io.reactivex.rxjava3.android.schedulers.a.b()), new e2s(this, 13), new wi3(1, this, rw30.class, "onContactCreated", "onContactCreated(Lcom/vk/im/engine/models/PhoneBookProfile;)V", 0, 10)));
        }
    }

    @Override // xsna.mkr0
    public final void y0(long j, boolean z) {
        a aVar = this.w;
        if (aVar != null) {
            aVar.f(j, z);
        }
    }

    @Override // xsna.mkr0
    public final void z0() {
        bzb0.d((bzb0) this.v.getValue(), cwb0.w0.l, new wzh(this, 26), null, null, 28);
    }

    /* compiled from: MsgSearchComponent.kt */
    public final class b implements ify.a {
        public final gzs<s3q0> b;

        public b(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.ify.a
        public final void Y0() {
            int i = ify.a;
            ify.g(this);
            rw30.this.r.postDelayed(new hv2(this, 8), 32L);
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
        }
    }

    /* compiled from: MsgSearchComponent.kt */
    public interface a {
        default boolean a(Dialog dialog) {
            return true;
        }

        default boolean b(Dialog dialog) {
            return true;
        }

        void d(Dialog dialog, int i);

        void e(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, ImSearchItemLoggingInfo imSearchItemLoggingInfo);

        SearchEntrypoint g();

        void i();

        default void c(long j, boolean z) {
        }

        default void f(long j, boolean z) {
        }

        default void h(long j, boolean z) {
        }
    }
}
