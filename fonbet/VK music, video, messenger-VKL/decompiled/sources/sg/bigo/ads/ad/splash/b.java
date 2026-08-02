package sg.bigo.ads.ad.splash;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ah.c;
import sg.bigo.ads.ah.d;
import sg.bigo.ads.ah.e;
import sg.bigo.ads.ah.f;
import sg.bigo.ads.ah.h;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.an.i;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes9.dex */
public final class b extends sg.bigo.ads.d.c<SplashAd, sg.bigo.ads.cp.a> implements SplashAd {
    boolean A;

    @NonNull
    final c B;

    @Nullable
    public final o C;
    public final g D;
    private h E;
    private sg.bigo.ads.ah.a F;
    private long G;

    @NonNull
    private final o H;
    private ViewGroup I;
    private AdCountDownButton J;
    private sg.bigo.ads.common.utils.o K;
    private Runnable L;
    private Runnable M;
    private Runnable N;
    private Runnable O;
    private sg.bigo.ads.common.utils.o P;
    private sg.bigo.ads.ax.b Q;
    private long R;
    private long S;
    public sg.bigo.ads.ah.g y;

    @NonNull
    public final sg.bigo.ads.y.b z;

    public b(@NonNull sg.bigo.ads.y.b bVar, g gVar, @NonNull o oVar, @Nullable o oVar2) {
        super(gVar);
        this.A = false;
        this.R = 0L;
        this.S = 0L;
        this.H = oVar;
        this.C = oVar2;
        this.D = gVar;
        a((sg.bigo.ads.aj.a) bVar);
        this.z = bVar;
        c cVar = new c() { // from class: sg.bigo.ads.ad.splash.b.1
            @Override // sg.bigo.ads.ad.splash.c, sg.bigo.ads.api.AdInteractionListener
            public final void onAdClicked() {
                super.onAdClicked();
                if (b.this.E != null) {
                    b.this.E.b();
                }
            }

            @Override // sg.bigo.ads.ad.splash.c, sg.bigo.ads.api.SplashAdInteractionListener
            public final void onAdFinished() {
                super.onAdFinished();
            }

            @Override // sg.bigo.ads.ad.splash.c, sg.bigo.ads.api.AdInteractionListener
            public final void onAdImpression() {
                super.onAdImpression();
                b.this.G = SystemClock.elapsedRealtime();
                if (b.this.E != null) {
                    b.this.E.a();
                }
                b.this.B();
            }
        };
        this.B = cVar;
        bVar.setAdInteractionListener(cVar);
        int at = gVar.a.at();
        int a = oVar2 != null ? oVar2.a("video_play_page.interactive_method", 0) : 0;
        if (1 == at && a != 0) {
            this.E = new d(gVar, oVar, oVar2, this);
            return;
        }
        if (oVar2 == null || a.b(oVar) || a.b()) {
            this.E = new sg.bigo.ads.ah.b(gVar, oVar, oVar2, this);
            return;
        }
        int a2 = oVar2.a("video_play_page.ad_component_layout");
        if (a2 == 3) {
            this.E = new e(gVar, oVar, oVar2, this);
        } else if (a2 == 4 || a2 == 5) {
            this.E = new f(a2, gVar, oVar, oVar2, this);
        } else {
            this.E = new sg.bigo.ads.ah.b(gVar, oVar, oVar2, this);
        }
    }

    private boolean J() {
        return f().ba() && P();
    }

    private void K() {
        ViewGroup viewGroup;
        if (this.C == null || !F()) {
            return;
        }
        if (this.F == null && (viewGroup = this.I) != null) {
            this.F = new sg.bigo.ads.ah.a(viewGroup, this, this.C, this.Q);
        }
        int a = this.C.a("endpage.endpage_timing", 0);
        if (a >= 3) {
            int i = a == 4 ? 5000 : a == 5 ? 10000 : IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
            if (this.P == null && !L()) {
                this.P = new sg.bigo.ads.common.utils.o(i) { // from class: sg.bigo.ads.ad.splash.b.13
                    @Override // sg.bigo.ads.common.utils.o
                    public final void a() {
                        b bVar = b.this;
                        if (bVar.i || bVar.L()) {
                            return;
                        }
                        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.13.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                b.this.a(8, 12);
                            }
                        });
                    }

                    @Override // sg.bigo.ads.common.utils.o
                    public final void a(long j) {
                    }
                };
            }
            this.P.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        sg.bigo.ads.ah.a aVar = this.F;
        return aVar != null && aVar.c == c.a.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        sg.bigo.ads.ah.g gVar = this.y;
        if (gVar != null) {
            gVar.a(this.O);
            sg.bigo.ads.bh.d.a(this.N);
            this.y.c();
            this.y = null;
            this.O = null;
            this.N = null;
        }
    }

    private void N() {
        int a;
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton == null) {
            return;
        }
        adCountDownButton.e();
        o oVar = this.C;
        if (oVar == null || (a = oVar.a("endpage.close_click_seconds", 0)) <= 0) {
            return;
        }
        this.J.clearAnimation();
        this.J.setVisibility(4);
        if (this.M == null) {
            this.M = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.E() || b.this.J.getVisibility() == 0) {
                        return;
                    }
                    b.this.J.setVisibility(0);
                    sg.bigo.ads.ad.interstitial.c.b((View) b.this.J);
                }
            };
        }
        sg.bigo.ads.bh.d.a(2, this.M, a * 1000);
    }

    private boolean O() {
        o oVar = this.C;
        return (oVar == null || 1 != oVar.a("video_play_page.is_auto_close", 0) || P()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P() {
        if (1 == f().ay()) {
            return true;
        }
        o oVar = this.C;
        return oVar != null && 6 == oVar.a("video_play_page.ad_component_layout", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U() {
        o oVar;
        return F() && (oVar = this.C) != null && 2 == oVar.a("endpage.ad_component_layout", 1);
    }

    public final void B() {
        o oVar;
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton == null) {
            this.A = true;
            this.B.onAdFinished();
            return;
        }
        adCountDownButton.setVisibility(0);
        o oVar2 = this.C;
        a.a(this.J, oVar2 == null ? 1 : oVar2.a("video_play_page.close_button_style"));
        int max = Math.max(0, this.H.a("splash_duration"));
        h hVar = this.E;
        if (hVar != null && hVar.i().get() && f().bq() == null && (oVar = this.C) != null) {
            max = x.b(oVar.a("video_play_page.time_for_show_backup", -1));
        }
        this.K = new sg.bigo.ads.common.utils.o(max * 1000) { // from class: sg.bigo.ads.ad.splash.b.8
            @Override // sg.bigo.ads.common.utils.o
            public final void a() {
                if (b.this.J.c) {
                    if (b.this.F() || !b.this.E()) {
                        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.8.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (b.this.E != null) {
                                    b.this.E.j();
                                }
                            }
                        });
                    }
                    b.this.J.e();
                }
                b bVar = b.this;
                bVar.A = true;
                bVar.B.onAdFinished();
            }

            @Override // sg.bigo.ads.common.utils.o
            public final void a(long j) {
                b.this.J.a(j);
            }
        };
        int max2 = Math.max(0, this.H.a("splash_close"));
        this.J.setWithUnit(true);
        this.J.setTakeoverTickEvent(true);
        this.J.setOnCloseListener(new AdCountDownButton.a() { // from class: sg.bigo.ads.ad.splash.b.9
            @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
            public final void a() {
                if (b.this.C == null) {
                    b.this.a(8);
                } else if (b.this.F()) {
                    b.this.a(b.this.U() ? 1 == ((sg.bigo.ads.cp.a) b.this.z.f()).ae() ? 4 : 5 : 2, 2);
                } else {
                    b.this.a(8);
                }
            }

            @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
            public final void a(Rect rect) {
            }
        });
        h hVar2 = this.E;
        if (hVar2 != null && hVar2.i().get() && f().bq() == null) {
            this.J.f();
        } else {
            this.J.a(max2, new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.splash.b.10
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                public final void a() {
                    b.this.A = true;
                    sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.10.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (b.this.E != null) {
                                b.this.E.j();
                            }
                        }
                    });
                }
            });
        }
        this.K.c();
        final ViewTreeObserver viewTreeObserver = this.J.getViewTreeObserver();
        final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: sg.bigo.ads.ad.splash.b.11
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                b bVar = b.this;
                if (bVar.z.i) {
                    return;
                }
                boolean isAttachedToWindow = bVar.J.isAttachedToWindow();
                if (z && isAttachedToWindow) {
                    b.a(b.this, true);
                    b.this.D();
                } else {
                    b.a(b.this, false);
                    b.this.C();
                }
            }
        };
        viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListener);
        this.L = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.12
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
                } catch (Throwable unused) {
                }
            }
        };
    }

    public final void C() {
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        sg.bigo.ads.common.utils.o oVar = this.K;
        if (oVar != null && !oVar.e()) {
            this.K.d();
            this.R = (SystemClock.elapsedRealtime() - this.S) + this.R;
        }
        if (this.z.getVideoController() == null || !this.z.getVideoController().isPlaying()) {
            return;
        }
        this.z.getVideoController().pause();
    }

    public final void D() {
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.c();
        }
        sg.bigo.ads.common.utils.o oVar = this.K;
        if (oVar != null && oVar.e()) {
            this.K.c();
        }
        if (this.z.getVideoController() != null && this.z.getVideoController().isPaused()) {
            this.z.getVideoController().play();
        }
        this.S = SystemClock.elapsedRealtime();
    }

    public final boolean E() {
        ViewGroup viewGroup;
        if (!O() || (viewGroup = this.I) == null || !(viewGroup.getContext() instanceof AdSplashActivity)) {
            return false;
        }
        a(9);
        return true;
    }

    public final boolean F() {
        o oVar;
        if (a.b() || (oVar = this.C) == null || oVar.a("endpage.endpage_timing", 0) <= 0) {
            return false;
        }
        return !O() || this.C.a("endpage.close_click_seconds", 0) > 0;
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.aj.a
    @NonNull
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final sg.bigo.ads.cp.a f() {
        return (sg.bigo.ads.cp.a) this.z.f();
    }

    public final void I() {
        sg.bigo.ads.f.c cVar;
        sg.bigo.ads.ah.g gVar = this.y;
        if (gVar == null || gVar.a != c.a.b) {
            this.z.a((i) null, 8, 22);
            return;
        }
        Context context = this.b.e;
        if (gVar.f && (cVar = gVar.b) != null) {
            cVar.o.a(context, null, null);
            return;
        }
        sg.bigo.ads.f.a aVar = gVar.c;
        if (aVar != null) {
            sg.bigo.ads.h.a aVar2 = aVar.b;
            if (aVar2 instanceof sg.bigo.ads.g.b) {
                ((sg.bigo.ads.g.b) aVar2).a(context, null, null);
            } else if (aVar2 instanceof sg.bigo.ads.g.c) {
                ((sg.bigo.ads.g.c) aVar2).a(context, (i) null);
            }
        }
    }

    @Override // sg.bigo.ads.d.c
    @NonNull
    public final <ValueType> ValueType b(String str, ValueType valuetype) {
        return (ValueType) this.z.b(str, (String) valuetype);
    }

    @Override // sg.bigo.ads.aj.a
    public final p b_() {
        sg.bigo.ads.y.b bVar = this.z;
        return bVar != null ? bVar.b_() : this.ac;
    }

    @Override // sg.bigo.ads.d.c
    public final void destroyInMainThread() {
        a.b = false;
        a.a = false;
        super.destroyInMainThread();
        this.z.destroy();
        sg.bigo.ads.common.utils.o oVar = this.P;
        if (oVar != null) {
            oVar.b();
            this.P = null;
        }
        Runnable runnable = this.L;
        if (runnable != null) {
            sg.bigo.ads.bh.d.b(runnable);
            this.L = null;
        }
        Runnable runnable2 = this.M;
        if (runnable2 != null) {
            sg.bigo.ads.bh.d.a(runnable2);
            this.M = null;
        }
        h hVar = this.E;
        if (hVar != null) {
            hVar.c();
            this.E = null;
        }
        sg.bigo.ads.ah.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
            this.F = null;
        }
        a.a();
        M();
        this.I = null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        return this.z.getCreativeId();
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.api.Ad
    @Nullable
    public final String getExtraInfo(String str) {
        return null;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final SplashAd.Style getStyle() {
        return a.c(this.H);
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        return false;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final boolean isSkippable() {
        return this.A || isExpired() || this.i;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void setAdInteractionListener(SplashAdInteractionListener splashAdInteractionListener) {
        super.setAdInteractionListener((AdInteractionListener) splashAdInteractionListener);
        this.B.b = splashAdInteractionListener;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void show() {
        a((Activity) null, true);
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void showInAdContainer(@NonNull ViewGroup viewGroup) {
        this.z.a(2);
        Context context = viewGroup.getContext();
        a(viewGroup, context instanceof Activity ? (Activity) context : null);
    }

    @Override // sg.bigo.ads.d.c
    public final sg.bigo.ads.api.core.d z() {
        sg.bigo.ads.y.b bVar = this.z;
        return bVar != null ? bVar.z() : super.z();
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void show(Activity activity) {
        a(activity, false);
    }

    @Override // sg.bigo.ads.aj.a
    public final void b(int i) {
        super.b(i);
        this.z.b(i);
    }

    private void b(Activity activity) {
        if (activity == null) {
            return;
        }
        this.Q = new sg.bigo.ads.ax.b(activity);
        final View decorView = activity.getWindow().getDecorView();
        if (decorView != null) {
            decorView.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.6
                @Override // java.lang.Runnable
                public final void run() {
                    WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
                    if (rootWindowInsets == null || b.this.Q == null) {
                        return;
                    }
                    b.this.Q.a(rootWindowInsets);
                }
            });
        }
    }

    public final void a(int i) {
        this.B.onAdSkipped();
        if (this.D != null) {
            this.R = (SystemClock.elapsedRealtime() - this.S) + this.R;
            sg.bigo.ads.da.b.a(this.D.a, i, this.G > 0 ? SystemClock.elapsedRealtime() - this.G : 0L, this.R, this);
        }
    }

    private void b(@NonNull final ViewGroup viewGroup) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setTag("adview_background_main_tag");
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        v.a(imageView, viewGroup, null, 0);
        o oVar = this.C;
        if (oVar != null && 5 != oVar.a("video_play_page.background_colour")) {
            a.a(this.C.a("video_play_page.background_colour"), this.z, viewGroup);
            return;
        }
        w wVar = new w() { // from class: sg.bigo.ads.ad.splash.b.4
            @Override // sg.bigo.ads.ad.interstitial.w
            public final void a() {
                final Bitmap bitmap = sg.bigo.ads.ah.b.j;
                if (b.this.i || bitmap == null) {
                    return;
                }
                sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ImageView imageView2;
                        View findViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                        if (findViewWithTag instanceof ImageView) {
                            imageView2 = (ImageView) findViewWithTag;
                        } else {
                            Context context = viewGroup.getContext();
                            if (context != null) {
                                ImageView imageView3 = new ImageView(context);
                                imageView3.setTag("adview_background_main_tag");
                                imageView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                v.a(imageView3, viewGroup, null, 0);
                                imageView2 = imageView3;
                            } else {
                                imageView2 = null;
                            }
                        }
                        if (imageView2 != null) {
                            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            sg.bigo.ads.common.utils.e.a(imageView2.getContext(), bitmap, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.b.4.1.1
                                @Override // android.webkit.ValueCallback
                                public final /* synthetic */ void onReceiveValue(Bitmap bitmap2) {
                                    Bitmap bitmap3 = bitmap2;
                                    if (bitmap3 != null) {
                                        imageView2.setImageBitmap(bitmap3);
                                    }
                                }
                            });
                        }
                    }
                });
            }
        };
        h hVar = this.E;
        if (hVar != null) {
            hVar.a(wVar);
        }
    }

    public final void a(int i, int i2) {
        sg.bigo.ads.ah.g gVar;
        sg.bigo.ads.ah.g gVar2;
        final ViewGroup viewGroup = this.I;
        h hVar = this.E;
        if (hVar == null || viewGroup == null) {
            return;
        }
        if (this.F != null && hVar.d() == c.a.b) {
            this.E.a(false, viewGroup, -1);
        }
        if (U() && (gVar2 = this.y) != null && gVar2.e()) {
            sg.bigo.ads.ah.g gVar3 = this.y;
            if (!gVar3.d) {
                gVar3.e = 2;
                gVar3.a(true, viewGroup, i2);
                N();
                return;
            }
        }
        sg.bigo.ads.ah.a aVar = this.F;
        if (aVar == null || aVar.c != c.a.c || ((gVar = this.y) != null && gVar.e == 2)) {
            a(i);
            return;
        }
        aVar.a(true, viewGroup, i2);
        N();
        if (this.y == null || !k.a.p().a()) {
            M();
            return;
        }
        sg.bigo.ads.ah.g gVar4 = this.y;
        Runnable runnable = this.O;
        if (runnable == null) {
            runnable = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.14
                @Override // java.lang.Runnable
                public final void run() {
                    b bVar = b.this;
                    if (bVar.i) {
                        return;
                    }
                    sg.bigo.ads.bh.d.a(bVar.N);
                    if (b.this.y != null) {
                        b.this.y.a(this);
                    }
                    sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.14.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass14 anonymousClass14 = AnonymousClass14.this;
                            b.a(b.this, viewGroup);
                        }
                    });
                }
            };
            this.O = runnable;
        }
        sg.bigo.ads.f.c cVar = gVar4.b;
        if (cVar != null) {
            cVar.d = runnable;
        }
        int b = k.a.p().b();
        if (b > 0) {
            Runnable runnable2 = this.N;
            if (runnable2 == null) {
                runnable2 = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar = b.this;
                        if (bVar.i) {
                            return;
                        }
                        bVar.M();
                        b.a(b.this, viewGroup);
                    }
                };
                this.N = runnable2;
            }
            sg.bigo.ads.bh.d.a(2, runnable2, b * 1000);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.app.Activity] */
    private void a(Activity activity, boolean z) {
        j jVar;
        if (J()) {
            this.E = new sg.bigo.ads.ah.j(this.D, this.H, this.C, this);
        }
        a(activity == 0, z);
        if (activity != 0) {
            this.z.b(activity);
        }
        this.z.a(1);
        this.z.a(true);
        sg.bigo.ads.da.b.a(f());
        if (isExpired()) {
            b(2000, 1, "The ad is expired.");
            return;
        }
        if (this.i) {
            b(2000, 1, "The ad is destroyed.");
            return;
        }
        if (p()) {
            a(2003, "This ad cannot be shown repeatedly");
            return;
        }
        if (activity != 0) {
            b(1);
        }
        if (activity == 0 && (jVar = k.a) != null && jVar.n().a(16)) {
            activity = sg.bigo.ads.at.b.b();
            b(2);
        }
        if (activity == 0) {
            activity = this.b.e;
        }
        if (activity != 0) {
            int a = this.Y.a();
            this.Z = a;
            sg.bigo.ads.aj.a aVar = this.aa;
            if (aVar != null) {
                aVar.g(a);
            }
            AdSplashActivity.a(activity, this);
        }
    }

    private void a(final ViewGroup viewGroup) {
        v.a(viewGroup, new v.a() { // from class: sg.bigo.ads.ad.splash.b.7
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view, @NonNull Rect rect) {
                ViewGroup viewGroup2;
                if (b.this.Q == null || (viewGroup2 = viewGroup) == null) {
                    return;
                }
                b.this.Q.a(viewGroup2.findViewById(R.id.bigo_ad_splash_options), 1);
                b.this.Q.a(viewGroup.findViewById(R.id.inter_layout_ad_tag), 1);
            }
        });
    }

    public final void a(@NonNull ViewGroup viewGroup, @Nullable Activity activity) {
        sg.bigo.ads.ah.g gVar;
        if (this.E != null) {
            g gVar2 = this.D;
            if (gVar2 != null) {
                sg.bigo.ads.da.b.a(gVar2.a, this);
            }
            b(activity);
            if (isExpired()) {
                b(2000, 1, "The ad is expired.");
                return;
            }
            if (this.i) {
                b(2000, 1, "The ad is destroyed.");
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_style_root, null, false);
            v.a(viewGroup2, viewGroup, new ViewGroup.LayoutParams(-1, -1), -1);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.bigo_ad_splash_ad_container);
            this.I = viewGroup3;
            this.J = (AdCountDownButton) viewGroup2.findViewById(R.id.bigo_ad_splash_btn_skip);
            b(viewGroup3);
            if (P() && (gVar = this.y) != null && gVar.e()) {
                sg.bigo.ads.ah.g gVar3 = this.y;
                gVar3.e = 1;
                gVar3.a(true, viewGroup3, 11);
            } else {
                this.E.a(true, viewGroup3, -1);
            }
            a(viewGroup2);
            K();
        }
    }

    public static /* synthetic */ void a(b bVar, ViewGroup viewGroup) {
        sg.bigo.ads.ah.g gVar;
        View findViewById;
        sg.bigo.ads.ah.a aVar = bVar.F;
        if (aVar != null && (findViewById = aVar.b.findViewById(R.id.layout_playable_loading)) != null && findViewById.getVisibility() == 0) {
            findViewById.setVisibility(4);
        }
        if (!bVar.U() || (gVar = bVar.y) == null || !gVar.e() || bVar.y.d) {
            return;
        }
        sg.bigo.ads.ah.a aVar2 = bVar.F;
        if (aVar2 != null) {
            aVar2.a(false, viewGroup, -1);
        }
        sg.bigo.ads.ah.g gVar2 = bVar.y;
        gVar2.e = 2;
        gVar2.a(true, viewGroup, 14);
    }

    public static /* synthetic */ void a(b bVar, boolean z) {
        h hVar = bVar.E;
        if (hVar != null) {
            hVar.a(z);
        }
        sg.bigo.ads.ah.a aVar = bVar.F;
        if (aVar != null) {
            aVar.a(z);
        }
        sg.bigo.ads.ah.g gVar = bVar.y;
        if (gVar != null) {
            gVar.a(z);
        }
        if (!z) {
            sg.bigo.ads.common.utils.o oVar = bVar.P;
            if (oVar != null) {
                oVar.d();
                return;
            }
            return;
        }
        sg.bigo.ads.common.utils.o oVar2 = bVar.P;
        if (oVar2 == null || !oVar2.e()) {
            return;
        }
        bVar.P.c();
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.aj.d
    public final void a(@NonNull final d.a<SplashAd> aVar) {
        super.a(aVar);
        o oVar = this.C;
        if (oVar != null && oVar.a("video_play_page.background_colour") == 4) {
            this.z.b(true);
        }
        this.z.a(new d.a<NativeAd>() { // from class: sg.bigo.ads.ad.splash.b.5
            @Override // sg.bigo.ads.aj.d.a
            public final /* synthetic */ void a(NativeAd nativeAd) {
                b bVar = b.this;
                if (bVar.e || bVar.f) {
                    return;
                }
                aVar.a(bVar);
                sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.splash.b.5.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if ((b.this.P() || b.this.U()) && b.this.y == null) {
                            b bVar2 = b.this;
                            o unused = bVar2.H;
                            o unused2 = b.this.C;
                            b bVar3 = b.this;
                            bVar2.y = new sg.bigo.ads.ah.g(bVar3, bVar3.D.b, b.this.D.a);
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* synthetic */ void a(NativeAd nativeAd, int i, int i2, String str) {
                b bVar = b.this;
                if (bVar.e || bVar.f) {
                    return;
                }
                if (i == 1006) {
                    sg.bigo.ads.cj.a.a(bVar.D == null ? "" : b.this.D.b.l());
                }
                aVar.a(b.this, i, i2, str);
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* synthetic */ void a(NativeAd nativeAd, boolean z, int i, int i2, String str, boolean z2) {
                NativeAd nativeAd2 = nativeAd;
                b bVar = b.this;
                if (bVar.e || bVar.f || !(nativeAd2 instanceof sg.bigo.ads.y.c)) {
                    return;
                }
                if (((sg.bigo.ads.cp.a) ((sg.bigo.ads.y.c) nativeAd2).f()).bq() != null || z) {
                    aVar.a(b.this);
                } else {
                    aVar.a(b.this, i, i2, str);
                }
            }
        });
    }

    @Override // sg.bigo.ads.d.c
    public final void a(sg.bigo.ads.api.core.d dVar) {
        super.a(dVar);
        sg.bigo.ads.y.b bVar = this.z;
        if (bVar != null) {
            bVar.a(dVar);
        }
    }

    @Override // sg.bigo.ads.aj.a
    public final void a(boolean z, boolean z2) {
        super.a(z, z2);
        this.z.a(z, z2);
    }
}
