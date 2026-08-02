package com.vungle.ads.internal.ui;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.y0;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.b0u0;
import xsna.bqx0;
import xsna.h4x;
import xsna.iut0;
import xsna.lhg;
import xsna.msy;
import xsna.oek0;
import xsna.oqx0;
import xsna.ppx0;
import xsna.s3q0;
import xsna.ss9;
import xsna.sw5;
import xsna.t23;
import xsna.u080;
import xsna.zr;

/* loaded from: classes7.dex */
public abstract class l extends Activity {
    public static volatile y0 h;
    public static volatile com.vungle.ads.internal.presenter.a i;
    public com.vungle.ads.internal.presenter.r a;
    public r3 b;
    public Object c;
    public com.vungle.ads.internal.util.s e;
    public final com.vungle.ads.internal.util.w d = new com.vungle.ads.internal.util.w();
    public final b f = new b(this);
    public final AtomicBoolean g = new AtomicBoolean(false);

    static {
        new a();
    }

    public static final void b(l lVar) {
        com.vungle.ads.internal.presenter.r rVar = lVar.a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("AdActivity", new c(i2, i3, intent));
        if (i2 == 10001) {
            this.g.set(false);
            com.vungle.ads.internal.presenter.r rVar = this.a;
            if (rVar != null) {
                String a = lhg.a(i3, "onActivityResultCode=");
                m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
                m2Var.c = 1L;
                AnalyticsClient.INSTANCE.a(m2Var, rVar.b(), a);
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
            int i2 = configuration.orientation;
            if (i2 == 2) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AdActivity", X3.i.C);
            } else if (i2 == 1) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AdActivity", X3.i.D);
            }
            com.vungle.ads.internal.presenter.r rVar = this.a;
            if (rVar != null) {
                rVar.f();
            }
        } catch (Exception e) {
            boolean z3 = com.vungle.ads.internal.util.u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onConfigurationChanged: ");
            a.append(e.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("AdActivity", a.toString());
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String watermark$vungle_ads_release;
        View decorView;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(C.DEFAULT_MUXED_BUFFER_SIZE, C.DEFAULT_MUXED_BUFFER_SIZE);
        y0 y0Var = h;
        com.vungle.ads.internal.presenter.a aVar = i;
        if (y0Var == null) {
            String b = a.b(getIntent());
            if (b == null) {
                b = "";
            }
            if (aVar != null) {
                aVar.a(new AdNotLoadedCantPlay(zr.a("Can not play fullscreen ad. placement=", b, " pendingData is null")).setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release(), b);
            }
            finish();
            return;
        }
        h0 a = y0Var.a();
        i3 b2 = y0Var.b();
        com.vungle.ads.internal.presenter.z c = y0Var.c();
        this.e = a.q();
        try {
            com.vungle.ads.internal.ui.view.k kVar = new com.vungle.ads.internal.ui.view.k(this, a.h());
            ppx0.b(getWindow(), false);
            long j = getIntent().getBooleanExtra("ad_invisible_logged", false) ? 3L : 2L;
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            m2Var.a(Long.valueOf(j));
            AnalyticsClient.a(analyticsClient, m2Var, this.e, 4);
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AdActivity", "Log metric AD_VISIBILITY: " + j);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            Lazy a2 = msy.a(lazyThreadSafetyMode, new d(this));
            String a3 = a.a(getIntent());
            FrameLayout frameLayout = null;
            r3 r3Var = a3 != null ? new r3(a3) : null;
            this.b = r3Var;
            if (r3Var != null) {
                ((com.vungle.ads.internal.signals.j) a2.getValue()).a(r3Var);
            }
            kVar.setCloseDelegate(new h(this, a2));
            kVar.setOnViewTouchListener(new i(this));
            kVar.setOrientationDelegate(new j(this));
            Lazy a4 = msy.a(lazyThreadSafetyMode, new e(this));
            Lazy a5 = msy.a(lazyThreadSafetyMode, new f(this));
            com.vungle.ads.internal.executor.j f = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) a4.getValue())).f();
            ReentrantLock reentrantLock = e0.a;
            z a6 = e0.a(a, b2, f, (com.vungle.ads.internal.platform.f) a5.getValue());
            com.vungle.ads.internal.omsdk.d dVar = (com.vungle.ads.internal.omsdk.d) msy.a(lazyThreadSafetyMode, new g(this)).getValue();
            boolean C = a.C();
            dVar.getClass();
            com.vungle.ads.internal.omsdk.e a7 = com.vungle.ads.internal.omsdk.d.a(C);
            com.vungle.ads.internal.executor.j d = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) a4.getValue())).d();
            a6.a(a7);
            this.d.a(a6);
            com.vungle.ads.internal.presenter.r rVar = new com.vungle.ads.internal.presenter.r(kVar, a, b2, a6, d, a7, (com.vungle.ads.internal.platform.f) a5.getValue());
            rVar.a(aVar);
            rVar.a(c);
            rVar.a(new k(this));
            rVar.g();
            setContentView(kVar, kVar.getLayoutParams());
            try {
                getWindow().getDecorView().setBackgroundColor(-16777216);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
            u080 u080Var = new u080() { // from class: xsna.y3z0
                @Override // xsna.u080
                public final bqx0 b(View view, bqx0 bqx0Var) {
                    return com.vungle.ads.internal.ui.l.a(com.vungle.ads.internal.ui.l.this, view, bqx0Var);
                }
            };
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(kVar, u080Var);
            Window window = getWindow();
            oek0 oek0Var = new oek0(getWindow().getDecorView());
            int i2 = Build.VERSION.SDK_INT;
            oqx0.g fVar = i2 >= 35 ? new oqx0.f(window, oek0Var) : i2 >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
            fVar.g(2);
            fVar.b(519);
            AdConfig j2 = a.j();
            if (j2 != null && (watermark$vungle_ads_release = j2.getWatermark$vungle_ads_release()) != null) {
                Window window2 = getWindow();
                if (window2 != null && (decorView = window2.getDecorView()) != null) {
                    frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
                }
                if (frameLayout != null) {
                    a0 a0Var = new a0(this, watermark$vungle_ads_release);
                    frameLayout.addView(a0Var);
                    a0Var.bringToFront();
                }
            }
            this.a = rVar;
            if (Build.VERSION.SDK_INT >= 33) {
                a();
            }
            com.vungle.ads.internal.util.d dVar2 = com.vungle.ads.internal.util.d.f;
            com.vungle.ads.internal.util.a.a(this.f);
            try {
                registerReceiver(this.d, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
            } catch (Throwable unused2) {
            }
        } catch (InstantiationException e) {
            if (aVar != null) {
                aVar.a(new AdCantPlayWithoutWebView(e.getMessage()).setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release(), b2.b());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            Object obj = this.c;
            OnBackInvokedCallback a = sw5.f(obj) ? t23.a(obj) : null;
            if (a != null) {
                onBackInvokedDispatcher = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(a);
            }
            this.c = null;
        }
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            rVar.a((isChangingConfigurations() ? 1 : 0) | 2);
        }
        com.vungle.ads.internal.presenter.r rVar2 = this.a;
        if (rVar2 != null) {
            rVar2.a((k) null);
        }
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.b(this.f);
        try {
            unregisterReceiver(this.d);
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
        this.a = null;
        i = null;
        h = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Pair pair = new Pair(a.b(getIntent()), a.b(intent));
        String str = (String) pair.d();
        String str2 = (String) pair.g();
        Pair pair2 = new Pair(a.a(getIntent()), a.a(intent));
        String str3 = (String) pair2.d();
        String str4 = (String) pair2.g();
        if ((str == null || str2 == null || str.equals(str2)) && (str3 == null || str4 == null || str3.equals(str4))) {
            return;
        }
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("AdActivity", "Tried to play another placement " + str2 + " while playing " + str);
        VungleError logError$vungle_ads_release = new ConcurrentPlaybackUnsupported(ss9.a("Trying to show ", str2, " but ", str, " is already showing")).setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release();
        com.vungle.ads.internal.presenter.a aVar = i;
        if (aVar != null) {
            aVar.a(logError$vungle_ads_release, str2);
        }
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onConcurrentPlaybackError: ");
        a.append(logError$vungle_ads_release.getLocalizedMessage());
        com.vungle.ads.internal.util.t.b("AdActivity", a.toString());
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "stop()");
            rVar.a.b();
            rVar.d.b(false);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "start()");
            rVar.a.d();
            rVar.d.b(true);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            Window window = getWindow();
            oek0 oek0Var = new oek0(getWindow().getDecorView());
            int i2 = Build.VERSION.SDK_INT;
            oqx0.g fVar = i2 >= 35 ? new oqx0.f(window, oek0Var) : i2 >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
            fVar.g(2);
            fVar.b(519);
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i2) {
        super.setRequestedOrientation(i2);
    }

    public static final com.vungle.ads.internal.signals.j a(Lazy lazy) {
        return (com.vungle.ads.internal.signals.j) lazy.getValue();
    }

    public static final bqx0 a(l lVar, View view, bqx0 bqx0Var) {
        if (!lVar.g.get()) {
            h4x i2 = bqx0Var.a.i(647);
            view.setPadding(i2.a, i2.b, i2.c, i2.d);
        }
        return bqx0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.x3z0] */
    public final void a() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        ?? r0 = new OnBackInvokedCallback() { // from class: xsna.x3z0
            public final void onBackInvoked() {
                com.vungle.ads.internal.ui.l.b(com.vungle.ads.internal.ui.l.this);
            }
        };
        this.c = r0;
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.registerOnBackInvokedCallback(0, r0);
    }
}
