package com.vungle.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.c1;
import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.f1;
import com.vungle.ads.internal.h;
import com.vungle.ads.internal.i0;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.omsdk.d;
import com.vungle.ads.internal.omsdk.e;
import com.vungle.ads.internal.presenter.a;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.presenter.r;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.ui.a0;
import com.vungle.ads.internal.ui.view.f;
import com.vungle.ads.internal.ui.view.k;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.w;
import com.vungle.ads.internal.util.y;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.bpn0;
import xsna.epx;
import xsna.gzs;
import xsna.msy;
import xsna.s3q0;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class VungleBannerView extends RelativeLayout implements VungleAdType {
    public static final Companion Companion = new Companion(null);
    public final String a;
    public final VungleAdSize b;
    public final w c;
    public BannerAdListener d;
    public final i0 e;
    public int f;
    public int g;
    public k h;
    public r i;
    public a0 j;
    public boolean k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final Lazy q;
    public boolean r;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public Companion() {
        }
    }

    public VungleBannerView(final Context context, String str, VungleAdSize vungleAdSize) {
        super(context);
        this.a = str;
        this.b = vungleAdSize;
        this.c = new w();
        i0 i0Var = new i0(context, str, vungleAdSize, new AdConfig());
        this.e = i0Var;
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
        this.p = new AtomicBoolean(false);
        this.q = new bpn0(new gzs<f1>() { // from class: com.vungle.ads.VungleBannerView$impressionTracker$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final f1 invoke() {
                return new f1(context);
            }
        });
        i0Var.setAdListener(new BannerAdListener() { // from class: com.vungle.ads.VungleBannerView.1
            @Override // com.vungle.ads.BaseAdListener
            public void onAdClicked(BaseAd baseAd) {
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdClicked(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdEnd(BaseAd baseAd) {
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdEnd(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(baseAd, vungleError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToPlay(baseAd, vungleError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdImpression(BaseAd baseAd) {
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdImpression(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLeftApplication(BaseAd baseAd) {
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdLeftApplication(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLoaded(BaseAd baseAd) {
                VungleBannerView.access$onBannerAdLoaded(VungleBannerView.this, baseAd);
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdStart(BaseAd baseAd) {
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdStart(baseAd);
                }
            }
        });
    }

    public static final void access$checkHardwareAcceleration(VungleBannerView vungleBannerView) {
        vungleBannerView.getClass();
        boolean z = u.a;
        StringBuilder a = l.a("hardwareAccelerated = ");
        a.append(vungleBannerView.isHardwareAccelerated());
        t.c("VungleBannerView", a.toString());
        if (vungleBannerView.isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, vungleBannerView.e.getLogEntry$vungle_ads_release(), null, 10);
    }

    public static final void access$finishAdInternal(VungleBannerView vungleBannerView, boolean z) {
        if (vungleBannerView.l.get()) {
            return;
        }
        vungleBannerView.l.set(true);
        int i = (z ? 4 : 0) | 2;
        r rVar = vungleBannerView.i;
        if (rVar != null) {
            boolean z2 = u.a;
            t.a("MRAIDPresenter", "stop()");
            rVar.a.b();
            rVar.d.b(false);
        }
        r rVar2 = vungleBannerView.i;
        if (rVar2 != null) {
            rVar2.a(i);
        }
        vungleBannerView.getImpressionTracker().a();
        try {
            ViewParent parent = vungleBannerView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(vungleBannerView);
            }
            vungleBannerView.removeAllViews();
        } catch (Exception e) {
            boolean z3 = u.a;
            t.a("VungleBannerView", "Removing webView error: " + e);
        }
    }

    public static final void access$logViewInvisibleOnPlay(VungleBannerView vungleBannerView) {
        if (vungleBannerView.p.getAndSet(true)) {
            return;
        }
        boolean z = u.a;
        StringBuilder a = l.a("ImpressionTracker checked the banner view invisible on play, log AD_VISIBILITY_INVISIBLE. ");
        a.append(vungleBannerView.hashCode());
        t.a("VungleBannerView", a.toString());
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.c = 1L;
        AnalyticsClient.a(analyticsClient, m2Var, vungleBannerView.e.getLogEntry$vungle_ads_release(), 4);
    }

    public static final void access$logViewVisibleOnPlay(VungleBannerView vungleBannerView) {
        long j = vungleBannerView.p.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.c = Long.valueOf(j);
        AnalyticsClient.a(analyticsClient, m2Var, vungleBannerView.e.getLogEntry$vungle_ads_release(), 4);
        boolean z = u.a;
        t.a("VungleBannerView", "Log metric AD_VISIBILITY: " + j);
    }

    public static final void access$onBannerAdLoaded(VungleBannerView vungleBannerView, BaseAd baseAd) {
        vungleBannerView.getClass();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new m2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), vungleBannerView.e.getLogEntry$vungle_ads_release(), 4);
        vungleBannerView.e.getResponseToShowMetric$vungle_ads_release().d();
        t1 responseToShowMetric$vungle_ads_release = vungleBannerView.e.getResponseToShowMetric$vungle_ads_release();
        analyticsClient.a(responseToShowMetric$vungle_ads_release, vungleBannerView.e.getLogEntry$vungle_ads_release(), responseToShowMetric$vungle_ads_release.b);
        vungleBannerView.e.getAdInternal$vungle_ads_release().k.e();
        vungleBannerView.e.getShowToCloseMetric$vungle_ads_release().e();
        vungleBannerView.e.getShowToFailMetric$vungle_ads_release().e();
        VungleError a = vungleBannerView.e.getAdInternal$vungle_ads_release().a(true);
        if (a != null) {
            if (vungleBannerView.e.getAdInternal$vungle_ads_release().a(a.getCode())) {
                vungleBannerView.e.getAdInternal$vungle_ads_release().a(h.g);
            }
            BannerAdListener bannerAdListener = vungleBannerView.d;
            if (bannerAdListener != null) {
                bannerAdListener.onAdFailedToPlay(baseAd, a);
                return;
            }
            return;
        }
        h0 h0Var = vungleBannerView.e.getAdInternal$vungle_ads_release().c;
        i3 i3Var = vungleBannerView.e.getAdInternal$vungle_ads_release().d;
        if (h0Var == null || i3Var == null) {
            BannerAdListener bannerAdListener2 = vungleBannerView.d;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onAdFailedToPlay(baseAd, new AdNotLoadedCantPlay("Ad or Placement is null").setLogEntry$vungle_ads_release(vungleBannerView.e.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            return;
        }
        vungleBannerView.e.getAdInternal$vungle_ads_release().a();
        vungleBannerView.e.getAdInternal$vungle_ads_release().k.d();
        t1 t1Var = vungleBannerView.e.getAdInternal$vungle_ads_release().k;
        analyticsClient.a(t1Var, vungleBannerView.e.getLogEntry$vungle_ads_release(), t1Var.b);
        vungleBannerView.e.getAdInternal$vungle_ads_release().l.e();
        try {
            vungleBannerView.a(h0Var, i3Var, vungleBannerView.getAdViewSize());
            vungleBannerView.n.set(true);
            BannerAdListener bannerAdListener3 = vungleBannerView.d;
            if (bannerAdListener3 != null) {
                bannerAdListener3.onAdLoaded(baseAd);
            }
            vungleBannerView.a();
        } catch (InstantiationException unused) {
        }
    }

    private final f1 getImpressionTracker() {
        return (f1) this.q.getValue();
    }

    public static /* synthetic */ void load$default(VungleBannerView vungleBannerView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        vungleBannerView.load(str);
    }

    private final void setAdVisibility(boolean z) {
        r rVar;
        if (!this.k || this.l.get() || (rVar = this.i) == null) {
            return;
        }
        rVar.d.b(z);
    }

    public final void a() {
        if (this.l.get()) {
            boolean z = u.a;
            t.c("VungleBannerView", "renderAd() - destroyed");
            return;
        }
        if (!this.n.get()) {
            boolean z2 = u.a;
            t.a("VungleBannerView", "renderAd() - not ready: not downloaded.");
            return;
        }
        if (!this.o.get()) {
            boolean z3 = u.a;
            t.a("VungleBannerView", "renderAd() - not ready: not attached.");
            return;
        }
        if (!this.m.getAndSet(true)) {
            r rVar = this.i;
            if (rVar != null) {
                rVar.g();
            }
            getImpressionTracker().a(this, new c1() { // from class: com.vungle.ads.VungleBannerView$renderAd$1
                @Override // com.vungle.ads.internal.c1
                public void onImpression(View view) {
                    r rVar2;
                    boolean z4 = u.a;
                    t.a("VungleBannerView", "ImpressionTracker checked the banner view become visible.");
                    VungleBannerView.this.k = true;
                    VungleBannerView.access$logViewVisibleOnPlay(VungleBannerView.this);
                    VungleBannerView.access$checkHardwareAcceleration(VungleBannerView.this);
                    rVar2 = VungleBannerView.this.i;
                    if (rVar2 != null) {
                        t.a("MRAIDPresenter", "start()");
                        rVar2.a.d();
                        rVar2.d.b(true);
                    }
                }

                @Override // com.vungle.ads.internal.c1
                public void onViewInvisible(View view) {
                    VungleBannerView.access$logViewInvisibleOnPlay(VungleBannerView.this);
                }
            });
        }
        k kVar = this.h;
        if (kVar != null && !epx.f(kVar.getParent(), this)) {
            ViewParent parent = kVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(kVar);
            }
            addView(kVar, this.f, this.g);
        }
        a0 a0Var = this.j;
        if (a0Var != null && !epx.f(a0Var.getParent(), this)) {
            ViewParent parent2 = a0Var.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(a0Var);
            }
            addView(a0Var, this.f, this.g);
            a0Var.bringToFront();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.g;
            layoutParams.width = this.f;
            requestLayout();
        }
    }

    public final void finishAd() {
        Handler handler = y.a;
        y.a(new gzs<s3q0>() { // from class: com.vungle.ads.VungleBannerView$finishAd$1
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                VungleBannerView.access$finishAdInternal(VungleBannerView.this, true);
            }
        });
    }

    public final AdConfig getAdConfig() {
        return this.e.getAdConfig();
    }

    public final BannerAdListener getAdListener() {
        return this.d;
    }

    public final VungleAdSize getAdSize() {
        return this.b;
    }

    public final VungleAdSize getAdViewSize() {
        return this.e.getAdViewSize();
    }

    @Override // com.vungle.ads.VungleAdType
    public String getAdapterAdFormat() {
        return this.e.getAdapterAdFormat();
    }

    public final String getCreativeId() {
        return this.e.getCreativeId();
    }

    public final String getEventId() {
        return this.e.getEventId();
    }

    public final s getLogEntry$vungle_ads_release() {
        return this.e.getLogEntry$vungle_ads_release();
    }

    public final String getPlacementId() {
        return this.a;
    }

    public final void load() {
        this.e.load();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = u.a;
        StringBuilder a = l.a("onAttachedToWindow(): ");
        a.append(hashCode());
        t.a("VungleBannerView", a.toString());
        this.o.set(true);
        if (this.e.getAdInternal$vungle_ads_release().d != null) {
            try {
                if (!this.r) {
                    getContext().registerReceiver(this.c, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                    this.r = true;
                    t.a("VungleBannerView", "registerReceiver(): " + this.c.hashCode());
                }
            } catch (Exception e) {
                boolean z2 = u.a;
                StringBuilder a2 = l.a("registerReceiver error: ");
                a2.append(e.getLocalizedMessage());
                t.b("VungleBannerView", a2.toString());
            }
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        boolean z = u.a;
        StringBuilder a = l.a("onDetachedFromWindow(): ");
        a.append(hashCode());
        t.a("VungleBannerView", a.toString());
        this.o.set(false);
        if (this.e.getAdInternal$vungle_ads_release().d != null) {
            try {
                if (this.r) {
                    getContext().unregisterReceiver(this.c);
                    this.r = false;
                }
            } catch (Exception e) {
                boolean z2 = u.a;
                StringBuilder a2 = l.a("unregisterReceiver error: ");
                a2.append(e.getLocalizedMessage());
                t.b("VungleBannerView", a2.toString());
            }
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        setAdVisibility(i == 0);
    }

    public final void setAdListener(BannerAdListener bannerAdListener) {
        this.d = bannerAdListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(String str) {
        this.e.setAdapterAdFormat(str);
    }

    public final void load(String str) {
        this.e.load(str);
    }

    public final void load(VungleCSBData vungleCSBData) {
        this.e.load(vungleCSBData);
    }

    public final void a(h0 h0Var, i3 i3Var, VungleAdSize vungleAdSize) {
        this.g = com.vungle.ads.internal.util.a0.a(getContext(), vungleAdSize.getHeight());
        this.f = com.vungle.ads.internal.util.a0.a(getContext(), vungleAdSize.getWidth());
        a aVar = new a(this.e.a(), this.e.getAdInternal$vungle_ads_release().f());
        try {
            k kVar = new k(getContext(), h0Var.h());
            this.h = kVar;
            kVar.setCloseDelegate(new f() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$1
                @Override // com.vungle.ads.internal.ui.view.f
                public void close() {
                    VungleBannerView.access$finishAdInternal(VungleBannerView.this, false);
                }
            });
            kVar.setOnViewTouchListener(new com.vungle.ads.internal.ui.view.h() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$2
                @Override // com.vungle.ads.internal.ui.view.h
                public boolean onTouch(MotionEvent motionEvent) {
                    r rVar;
                    rVar = VungleBannerView.this.i;
                    if (rVar == null) {
                        return false;
                    }
                    rVar.a(motionEvent);
                    return false;
                }
            });
            final Context context = getContext();
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            Lazy a = msy.a(lazyThreadSafetyMode, new gzs<com.vungle.ads.internal.executor.a>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
                @Override // xsna.gzs
                public final com.vungle.ads.internal.executor.a invoke() {
                    return ServiceLocator.d.a(context).getService(com.vungle.ads.internal.executor.a.class);
                }
            });
            final Context context2 = getContext();
            d dVar = (d) msy.a(lazyThreadSafetyMode, new gzs<d>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.d, java.lang.Object] */
                @Override // xsna.gzs
                public final d invoke() {
                    return ServiceLocator.d.a(context2).getService(d.class);
                }
            }).getValue();
            boolean C = h0Var.C();
            dVar.getClass();
            e a2 = d.a(C);
            final Context context3 = getContext();
            Lazy a3 = msy.a(lazyThreadSafetyMode, new gzs<com.vungle.ads.internal.platform.f>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.f, java.lang.Object] */
                @Override // xsna.gzs
                public final com.vungle.ads.internal.platform.f invoke() {
                    return ServiceLocator.d.a(context3).getService(com.vungle.ads.internal.platform.f.class);
                }
            });
            j f = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) a.getValue())).f();
            ReentrantLock reentrantLock = e0.a;
            z a4 = e0.a(h0Var, i3Var, f, (com.vungle.ads.internal.platform.f) a3.getValue());
            this.c.a(a4);
            a4.a(a2);
            r rVar = new r(kVar, h0Var, i3Var, a4, ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) a.getValue())).d(), a2, (com.vungle.ads.internal.platform.f) a3.getValue());
            rVar.a(aVar);
            this.i = rVar;
            String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                this.j = new a0(getContext(), watermark$vungle_ads_release);
            }
        } catch (InstantiationException e) {
            aVar.a(new AdCantPlayWithoutWebView(e.getMessage()).setLogEntry$vungle_ads_release(this.e.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), this.a);
            throw e;
        }
    }
}
