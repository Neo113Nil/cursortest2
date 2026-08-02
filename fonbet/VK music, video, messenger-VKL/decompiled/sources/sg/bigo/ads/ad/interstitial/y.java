package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.e;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* loaded from: classes9.dex */
public class y extends a {
    protected boolean I;
    public boolean J;
    private boolean K;
    private final AtomicBoolean L;
    private sg.bigo.ads.j.a M;

    /* renamed from: sg.bigo.ads.ad.interstitial.y$1, reason: invalid class name */
    public class AnonymousClass1 extends sg.bigo.ads.common.utils.o {
        final /* synthetic */ View a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, View view) {
            super(j, 1000L);
            this.a = view;
        }

        @Override // sg.bigo.ads.common.utils.o
        public final void a() {
            y yVar = y.this;
            yVar.a(yVar.w, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass1.this.a.setVisibility(0);
                    c.a(AnonymousClass1.this.a, new b.d() { // from class: sg.bigo.ads.ad.interstitial.y.1.1.1
                        @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (y.this.G == null || anonymousClass1.a.getTop() <= 0 || y.this.G.getBottom() <= AnonymousClass1.this.a.getTop() || !(y.this.G.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                                return;
                            }
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) y.this.G.getLayoutParams();
                            layoutParams.addRule(8, 0);
                            layoutParams.addRule(2, R.id.inter_ad_info);
                            y.this.G.setLayoutParams(layoutParams);
                        }
                    });
                    y.this.K();
                    y.this.av();
                }
            });
        }

        @Override // sg.bigo.ads.common.utils.o
        public final void a(long j) {
        }
    }

    public y(@NonNull Activity activity) {
        super(activity);
        this.K = false;
        this.I = true;
        this.L = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void av() {
        final View findViewById;
        sg.bigo.ads.ai.o oVar;
        if ((an() instanceof sg.bigo.ads.k.a) || (findViewById = this.F.findViewById(R.id.inter_btn_cta_layout)) == null) {
            return;
        }
        boolean z = this.e;
        if (!z || (oVar = ((a) this).c) == null) {
            if (z) {
                return;
            }
            this.l.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) y.this.A)) {
                        return;
                    }
                    c.e(findViewById);
                }
            }, ((a) this).b.a("interstitial_image_style.main_page.cta_impression") * 1000);
        } else if (oVar.c("video_play_page.is_cta_show_animation")) {
            c.e(findViewById);
        }
    }

    private boolean aw() {
        boolean G = G();
        if (G) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) ((t) this.A).f(), 9, 2);
        }
        return G;
    }

    private void ax() {
        an().a();
        sg.bigo.ads.common.utils.o oVar = this.w;
        if (oVar != null) {
            oVar.b();
        }
        if (this.L.get()) {
            c(this.w, an());
        }
    }

    private void ay() {
        if (this.F == null) {
            return;
        }
        an().f();
        View findViewById = this.F.findViewById(R.id.inter_media_container);
        if (findViewById != null) {
            c.c(findViewById);
            MediaView mediaView = (MediaView) findViewById.findViewById(R.id.inter_media);
            if (mediaView != null) {
                mediaView.c();
            }
        }
    }

    private void b(final ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.4
            @Override // java.lang.Runnable
            public final void run() {
                y yVar = y.this;
                if (!yVar.e || ((a) yVar).c == null || sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) yVar.A) || !((a) y.this).c.c("video_play_page.img_animation")) {
                    return;
                }
                y.a(y.this, viewGroup);
            }
        }, 100L);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public void D() {
        super.D();
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
            this.C.setTakeoverTickEvent(false);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public void E() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.C.setVisibility(0);
            c.b((View) this.C);
        }
        if (d() == 0) {
            this.C.a(this.i.c, new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.interstitial.y.6
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                public final void a() {
                    q qVar = y.this.s;
                    if (qVar != null) {
                        qVar.y.a(null);
                    }
                    y.b(y.this);
                }
            });
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void I() {
        this.f = true;
        super.I();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public void N() {
        long a;
        int i = this.i.k;
        sg.bigo.ads.ai.o oVar = ((a) this).c;
        int a2 = oVar != null ? oVar.a("video_play_page.auto_click_sec") : 0;
        if (i == 2) {
            a = sg.bigo.ads.common.utils.s.a.a(5);
        } else if (i == 4) {
            a = sg.bigo.ads.common.utils.s.a.a(a2);
        } else if (i != 5) {
            return;
        } else {
            a = sg.bigo.ads.common.utils.s.a.a(Math.max(this.i.c - a2, 0));
        }
        if (a >= 0) {
            if (a == 0) {
                a = 500;
            }
            sg.bigo.ads.common.utils.o oVar2 = new sg.bigo.ads.common.utils.o(a) { // from class: sg.bigo.ads.ad.interstitial.y.3
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    y yVar = y.this;
                    if (yVar.J || yVar.f) {
                        return;
                    }
                    yVar.f = true;
                    ((t) yVar.A).K().a((sg.bigo.ads.an.i) null, 8, 22);
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j) {
                }
            };
            this.y = oVar2;
            oVar2.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.q.c.b
    public final void a_(int i) {
        super.a_(i);
        this.J = true;
        sg.bigo.ads.common.utils.o oVar = this.y;
        if (oVar != null) {
            oVar.b();
            this.y = null;
        }
        if (d() == 0 && i == 0 && k() && !l()) {
            an().b = new e.a() { // from class: sg.bigo.ads.ad.interstitial.y.7
                @Override // sg.bigo.ads.ad.interstitial.e.a
                public final boolean a(Runnable runnable) {
                    y yVar = y.this;
                    return yVar.a(yVar.an(), runnable);
                }
            };
            q qVar = this.s;
            if (qVar != null) {
                qVar.C = new q.c() { // from class: sg.bigo.ads.ad.interstitial.y.8
                    @Override // sg.bigo.ads.ad.interstitial.q.c
                    public final boolean a(Runnable runnable) {
                        y yVar = y.this;
                        return yVar.a(yVar.s, runnable);
                    }
                };
            }
            this.L.set(true);
            a(this.w, an(), this.s);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public int ac() {
        if (!this.e) {
            int a = ((a) this).b.a("interstitial_image_style.image_format");
            return a == 1 ? R.layout.bigo_ad_activity_interstitial_native_top : a == 2 ? R.layout.bigo_ad_activity_interstitial_bottom_card : R.layout.bigo_ad_activity_interstitial_native_center;
        }
        int o = o();
        if (aN()) {
            return o != 1 ? o != 3 ? o != 4 ? o != 5 ? R.layout.bigo_ad_activity_interstitial_style_landscape_2 : R.layout.bigo_ad_activity_interstitial_percent_warning_landscape : R.layout.bigo_ad_activity_interstitial_style_landscape_4 : R.layout.bigo_ad_activity_interstitial_style_landscape_3 : R.layout.bigo_ad_activity_interstitial_style_landscape_1;
        }
        switch (o) {
            case 2:
                return R.layout.bigo_ad_activity_interstitial_rich_video_2;
            case 3:
                return R.layout.bigo_ad_activity_interstitial_rich_video_3;
            case 4:
                return R.layout.bigo_ad_activity_interstitial_rich_video_4;
            case 5:
                return R.layout.bigo_ad_activity_interstitial_rich_video_5;
            case 6:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_6;
            case 7:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_7;
            case 8:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_8;
            case 9:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_9;
            case 10:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_10;
            case 11:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_11;
            case 12:
                return R.layout.bigo_ad_activity_interstitial_rich_video_download_12;
            case 13:
            case 18:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_13;
            case 14:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_14;
            case 15:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_15;
            case 16:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_16;
            case 17:
                return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_17;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return R.layout.bigo_ad_activity_interstitial_rich_video_19_29;
            case 30:
                return R.layout.bigo_ad_activity_interstitial_percent_warning;
            case 31:
            case 32:
                return s.a(s.a(this.E), o);
            default:
                return R.layout.bigo_ad_activity_interstitial_rich_video;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean ad() {
        return this.e;
    }

    public void as() {
        MediaView mediaView;
        ViewGroup viewGroup = this.F;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        if (!this.I) {
            mediaView.setMediaAreaClickable(false);
        }
        if (mediaView instanceof MaximumHeightMediaView) {
            ((MaximumHeightMediaView) mediaView).setMaxHeight(sg.bigo.ads.common.utils.f.c(this.N) - sg.bigo.ads.common.utils.f.a(this.N, 292));
        }
        O();
    }

    public final boolean at() {
        if (this.M == null || this.F == null) {
            return false;
        }
        ay();
        this.M.a(this, this.F, am());
        f(11);
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) ((t) this.A).f(), 11, 2);
        return true;
    }

    public boolean au() {
        return this.i.k == 3;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    @NonNull
    public x c() {
        x xVar = new x();
        sg.bigo.ads.ai.o oVar = ((a) this).c;
        if (oVar == null) {
            this.e = false;
            xVar.a = ((a) this).b.c("interstitial_image_style.main_page.is_global_click");
            xVar.b = ((a) this).b.a("interstitial_image_style.main_page.impression_close_seconds");
            xVar.c = ((a) this).b.a("interstitial_image_style.main_page.close_click_seconds");
            xVar.d = ((a) this).b.c("interstitial_image_style.main_page.is_jump_layer");
            xVar.e = ((a) this).b.a("interstitial_image_style.layer.impression_layer_close_seconds");
            xVar.k = 1;
            xVar.l = -1;
            return xVar;
        }
        this.e = true;
        boolean c = oVar.c("video_play_page.media_view_clickable_switch");
        xVar.f = c;
        this.I = c;
        xVar.h = ((a) this).c.c("video_play_page.ad_component_clickable_switch");
        xVar.g = ((a) this).c.c("video_play_page.other_space_clickable_switch");
        xVar.i = ((a) this).c.a("video_play_page.click_type");
        xVar.m = ((a) this).c.c("layer.other_space_clickable_switch");
        xVar.n = ((a) this).c.a("layer.click_type");
        xVar.a = false;
        xVar.b = 0;
        xVar.c = ((a) this).c.a("video_play_page.force_staying_time");
        xVar.d = ((a) this).c.c("layer.is_show_layer");
        xVar.e = ((a) this).c.a("layer.force_staying_time");
        xVar.k = ((a) this).c.a("video_play_page.auto_click");
        xVar.l = ((a) this).c.a("video_play_page.auto_click_new", -1);
        if ((this instanceof sg.bigo.ads.s.b) && P() && this.E != null && !Q()) {
            this.M = sg.bigo.ads.j.a.a(this.E, ((a) this).c, ((t) this.A).J(), this.u, aN());
        }
        return xVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.q.c.b
    public final void d(int i) {
        super.d(i);
        if (d() != 0) {
            ax();
        }
        if (this.L.compareAndSet(true, false)) {
            b(this.w, an(), this.s);
            f();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public boolean f(boolean z) {
        q qVar;
        int d = d();
        if (d != 0 && d != 10) {
            return d == 11 ? !aw() : z;
        }
        B();
        b(true);
        if (d != 10 && (qVar = this.s) != null && (qVar.y.a() || this.s.D)) {
            f(10);
            return false;
        }
        if (at()) {
            return false;
        }
        return z && !aw();
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void g(int i) {
        super.g(i);
        if (this.F == null) {
            return;
        }
        sg.bigo.ads.common.utils.o oVar = this.x;
        if (oVar != null) {
            oVar.c();
        }
        a(false);
        u an = an();
        if (!(an instanceof sg.bigo.ads.k.a)) {
            as();
            l(i);
        } else {
            if (!(an instanceof sg.bigo.ads.k.n)) {
                b(((sg.bigo.ads.k.a) an).k());
                return;
            }
            sg.bigo.ads.k.n nVar = (sg.bigo.ads.k.n) an;
            if (nVar.C()) {
                b(nVar.k());
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void h() {
        super.h();
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.c();
        }
        sg.bigo.ads.common.utils.o oVar = this.w;
        if (oVar != null && oVar.e()) {
            this.w.c();
        }
        sg.bigo.ads.common.utils.o oVar2 = this.y;
        if (oVar2 != null && oVar2.e()) {
            this.y.c();
        }
        q qVar = this.s;
        if (qVar != null) {
            qVar.b();
        }
        sg.bigo.ads.j.a aVar = this.M;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void j() {
        super.j();
        sg.bigo.ads.common.utils.o oVar = this.w;
        if (oVar != null) {
            oVar.d();
        }
        sg.bigo.ads.common.utils.o oVar2 = this.y;
        if (oVar2 != null) {
            oVar2.d();
        }
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        q qVar = this.s;
        if (qVar != null) {
            qVar.c();
        }
        sg.bigo.ads.j.a aVar = this.M;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void l(int i) {
        sg.bigo.ads.y.b bVar;
        b.d popPage;
        sg.bigo.ads.ai.o oVar;
        String str;
        RoundedFrameLayout roundedFrameLayout;
        if (z() || T()) {
            ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.inter_media_layout);
            TextView textView = (TextView) this.F.findViewById(R.id.inter_company);
            if (!(an() instanceof sg.bigo.ads.k.a) && this.h && textView != null && (bVar = this.E) != null && (popPage = bVar.getPopPage()) != null && sg.bigo.ads.common.utils.r.a((CharSequence) popPage.f())) {
                String title = this.E.getTitle();
                if (sg.bigo.ads.common.utils.r.a((CharSequence) title)) {
                    textView.setText(R.string.bigo_ad_title_default);
                } else {
                    textView.setText(title);
                }
                textView.setVisibility(0);
            }
            if (viewGroup != null) {
                O();
                if (this.g) {
                    int a = this.N.getResources().getDisplayMetrics().widthPixels - sg.bigo.ads.common.utils.f.a(this.N, 80);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.width = a;
                    layoutParams.height = a;
                    viewGroup.setLayoutParams(layoutParams);
                }
                b(viewGroup);
            }
        }
        e(i);
        View findViewById = this.F.findViewById(R.id.inter_ad_info);
        if (findViewById != null) {
            int i2 = t().a;
            if (i2 > 0) {
                Context context = findViewById.getContext();
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = sg.bigo.ads.common.utils.f.a(context, 10);
                    marginLayoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(context, 10);
                    marginLayoutParams.bottomMargin = sg.bigo.ads.common.utils.f.a(context, i2);
                }
                View findViewById2 = this.F.findViewById(R.id.inter_ad_info_background);
                if (findViewById2 != null) {
                    if (findViewById2 instanceof RoundedFrameLayout) {
                        roundedFrameLayout = (RoundedFrameLayout) findViewById2;
                        roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 16));
                    }
                } else if (findViewById instanceof RoundedFrameLayout) {
                    roundedFrameLayout = (RoundedFrameLayout) findViewById;
                    roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 16));
                }
            }
            if (z() || T()) {
                av();
                return;
            }
            if (this.e) {
                oVar = ((a) this).c;
                str = "video_play_page.ad_component_show_time";
            } else {
                oVar = ((a) this).b;
                str = "interstitial_video_style.video_play_page.impression_ad_seconds";
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(oVar.a(str) * 1000, findViewById);
            this.w = anonymousClass1;
            anonymousClass1.c();
        }
    }

    public static /* synthetic */ void a(y yVar, ViewGroup viewGroup) {
        final MediaView mediaView;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.y.5
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) y.this.A)) {
                    return;
                }
                final MediaView mediaView2 = mediaView;
                View image = mediaView2.getImage();
                final float b = mediaView2.b(mediaView2.getHeight(), mediaView2.getWidth());
                AnimationSet animationSet = new AnimationSet(true);
                float f = b * 1.5f;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f, 1.0f, f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(500L);
                scaleAnimation.setStartOffset(300L);
                scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(3));
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
                alphaAnimation.setDuration(500L);
                alphaAnimation.setStartOffset(300L);
                animationSet.setFillAfter(true);
                animationSet.addAnimation(scaleAnimation);
                animationSet.addAnimation(alphaAnimation);
                animationSet.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.13
                    final /* synthetic */ float b;

                    public AnonymousClass13(final float b2) {
                        r2 = b2;
                    }

                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        MediaView mediaView3 = MediaView.this;
                        float f2 = r2;
                        View image2 = mediaView3.getImage();
                        AnimationSet animationSet2 = new AnimationSet(true);
                        float f3 = f2 * 1.5f;
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation(f3, 1.0f, f3, 1.0f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation2.setDuration(1500L);
                        scaleAnimation2.setInterpolator(sg.bigo.ads.common.utils.b.a(3));
                        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.5f, 1.0f);
                        alphaAnimation2.setDuration(1500L);
                        animationSet2.addAnimation(scaleAnimation2);
                        animationSet2.addAnimation(alphaAnimation2);
                        if (image2 != null) {
                            image2.startAnimation(animationSet2);
                        }
                    }
                });
                if (image != null) {
                    image.startAnimation(animationSet);
                }
            }
        }, 100L);
    }

    public static /* synthetic */ void b(y yVar) {
        if (!yVar.au() || yVar.J || yVar.f) {
            return;
        }
        yVar.f = true;
        ((t) yVar.A).K().a((sg.bigo.ads.an.i) null, 8, 22);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void b(boolean z) {
        super.b(z);
        ax();
    }
}
