package com.vungle.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.c1;
import com.vungle.ads.internal.f1;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.omsdk.d;
import com.vungle.ads.internal.omsdk.e;
import com.vungle.ads.internal.presenter.a;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.presenter.r;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.a0;
import com.vungle.ads.internal.ui.view.f;
import com.vungle.ads.internal.ui.view.h;
import com.vungle.ads.internal.ui.view.k;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.bpn0;
import xsna.epx;
import xsna.gzs;
import xsna.msy;
import xsna.ozl;
import xsna.zcl;

@ozl
/* loaded from: classes7.dex */
public final class BannerView extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    public final i3 a;
    public final h0 b;
    public int c;
    public int d;
    public k e;
    public r f;
    public a0 g;
    public boolean h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;
    public final Lazy l;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public Companion() {
        }
    }

    public BannerView(final Context context, i3 i3Var, h0 h0Var, VungleAdSize vungleAdSize, AdConfig adConfig, b bVar) throws InstantiationException {
        super(context);
        this.a = i3Var;
        this.b = h0Var;
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.l = new bpn0(new gzs<f1>() { // from class: com.vungle.ads.BannerView$impressionTracker$2
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
        this.d = com.vungle.ads.internal.util.a0.a(context, vungleAdSize.getHeight());
        this.c = com.vungle.ads.internal.util.a0.a(context, vungleAdSize.getWidth());
        a aVar = new a(bVar, i3Var);
        try {
            k kVar = new k(context);
            this.e = kVar;
            kVar.setCloseDelegate(new f() { // from class: com.vungle.ads.BannerView.1
                @Override // com.vungle.ads.internal.ui.view.f
                public void close() {
                    BannerView.this.finishAdInternal(false);
                }
            });
            kVar.setOnViewTouchListener(new h() { // from class: com.vungle.ads.BannerView.2
                @Override // com.vungle.ads.internal.ui.view.h
                public boolean onTouch(MotionEvent motionEvent) {
                    r rVar = BannerView.this.f;
                    if (rVar == null) {
                        return false;
                    }
                    rVar.a(motionEvent);
                    return false;
                }
            });
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            Lazy a = msy.a(lazyThreadSafetyMode, new gzs<com.vungle.ads.internal.executor.a>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$1
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
            d b = b(msy.a(lazyThreadSafetyMode, new gzs<d>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.d, java.lang.Object] */
                @Override // xsna.gzs
                public final d invoke() {
                    return ServiceLocator.d.a(context).getService(d.class);
                }
            }));
            boolean C = h0Var.C();
            b.getClass();
            e a2 = d.a(C);
            Lazy a3 = msy.a(lazyThreadSafetyMode, new gzs<com.vungle.ads.internal.platform.f>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.f, java.lang.Object] */
                @Override // xsna.gzs
                public final com.vungle.ads.internal.platform.f invoke() {
                    return ServiceLocator.d.a(context).getService(com.vungle.ads.internal.platform.f.class);
                }
            });
            z zVar = new z(h0Var, i3Var, ((com.vungle.ads.internal.executor.d) a(a)).f(), c(a3));
            zVar.a(a2);
            r rVar = new r(kVar, h0Var, i3Var, zVar, ((com.vungle.ads.internal.executor.d) a(a)).d(), a2, c(a3));
            rVar.a(aVar);
            this.f = rVar;
            String watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                this.g = new a0(context, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e) {
            aVar.a(new AdCantPlayWithoutWebView(null, 1, null).setLogEntry$vungle_ads_release(this.b.q()).logError$vungle_ads_release(), this.a.b());
            throw e;
        }
    }

    public static final com.vungle.ads.internal.executor.a a(Lazy lazy) {
        return (com.vungle.ads.internal.executor.a) lazy.getValue();
    }

    public static final void access$checkHardwareAcceleration(BannerView bannerView) {
        bannerView.getClass();
        boolean z = u.a;
        StringBuilder a = l.a("hardwareAccelerated = ");
        a.append(bannerView.isHardwareAccelerated());
        t.c("BannerView", a.toString());
        if (bannerView.isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, bannerView.b.h, null, 10);
    }

    public static final void access$logViewVisibleOnPlay(BannerView bannerView) {
        long j = bannerView.k.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.c = Long.valueOf(j);
        AnalyticsClient.a(analyticsClient, m2Var, bannerView.b.h, 4);
        boolean z = u.a;
        t.a("BannerView", "Log metric AD_VISIBILITY: " + j);
    }

    public static final d b(Lazy lazy) {
        return (d) lazy.getValue();
    }

    public static final com.vungle.ads.internal.platform.f c(Lazy lazy) {
        return (com.vungle.ads.internal.platform.f) lazy.getValue();
    }

    private final f1 getImpressionTracker() {
        return (f1) this.l.getValue();
    }

    private final void setAdVisibility(boolean z) {
        r rVar;
        if (!this.h || this.i.get() || (rVar = this.f) == null) {
            return;
        }
        rVar.d.b(z);
    }

    public final void finishAdInternal(boolean z) {
        if (this.i.get()) {
            return;
        }
        this.i.set(true);
        int i = (z ? 4 : 0) | 2;
        r rVar = this.f;
        if (rVar != null) {
            boolean z2 = u.a;
            t.a("MRAIDPresenter", "stop()");
            rVar.a.b();
            rVar.d.b(false);
        }
        r rVar2 = this.f;
        if (rVar2 != null) {
            rVar2.a(i);
        }
        getImpressionTracker().a();
        try {
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this);
            }
            removeAllViews();
        } catch (Exception e) {
            boolean z3 = u.a;
            t.a("BannerView", "Removing webView error: " + e);
        }
    }

    public final h0 getAdvertisement() {
        return this.b;
    }

    public final i3 getPlacement() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = u.a;
        t.a("BannerView", "onAttachedToWindow()");
        if (!this.j.getAndSet(true)) {
            r rVar = this.f;
            if (rVar != null) {
                rVar.g();
            }
            getImpressionTracker().a(this, new c1() { // from class: com.vungle.ads.BannerView$onAttachedToWindow$1
                @Override // com.vungle.ads.internal.c1
                public void onImpression(View view) {
                    boolean z2 = u.a;
                    t.a("BannerView", "ImpressionTracker checked the banner view become visible.");
                    BannerView.this.h = true;
                    BannerView.access$logViewVisibleOnPlay(BannerView.this);
                    BannerView.access$checkHardwareAcceleration(BannerView.this);
                    r rVar2 = BannerView.this.f;
                    if (rVar2 != null) {
                        t.a("MRAIDPresenter", "start()");
                        rVar2.a.d();
                        rVar2.d.b(true);
                    }
                }

                @Override // com.vungle.ads.internal.c1
                public void onViewInvisible(View view) {
                    AtomicBoolean atomicBoolean;
                    atomicBoolean = BannerView.this.k;
                    if (atomicBoolean.getAndSet(true)) {
                        return;
                    }
                    boolean z2 = u.a;
                    t.a("BannerView", "ImpressionTracker checked the banner view invisible on play.");
                    AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                    m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                    m2Var.c = 1L;
                    AnalyticsClient.a(analyticsClient, m2Var, BannerView.this.getAdvertisement().h, 4);
                }
            });
        }
        k kVar = this.e;
        if (kVar != null && !epx.f(kVar.getParent(), this)) {
            addView(this.e, this.c, this.d);
            a0 a0Var = this.g;
            if (a0Var != null) {
                addView(a0Var, this.c, this.d);
                a0 a0Var2 = this.g;
                if (a0Var2 != null) {
                    a0Var2.bringToFront();
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.d;
            layoutParams.width = this.c;
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        setAdVisibility(i == 0);
    }
}
