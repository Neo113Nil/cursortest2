package sg.bigo.ads.ad.interstitial;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.h;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ad.interstitial.v;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.IconAdsLoader;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.as.a;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.o;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.YandexWarningTextView;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.d.c;
import sg.bigo.ads.n.c;
import sg.bigo.ads.q.c;
import xsna.ho8;
import xsna.sqe0;

/* loaded from: classes9.dex */
public abstract class a extends r implements c.a, c.b {
    private final List<Integer> I;

    @NonNull
    private final l J;
    private final WeakHashMap<Object, Integer> K;
    private final Map<Integer, WeakHashMap<Object, Runnable>> L;
    private final a.AbstractC2430a M;
    private boolean R;
    private Runnable S;
    private int T;
    private int U;
    private final Runnable V;

    @Nullable
    protected View a;

    @NonNull
    public sg.bigo.ads.ai.o b;

    @Nullable
    protected sg.bigo.ads.ai.o c;

    @Nullable
    protected sg.bigo.ads.ai.o d;
    public boolean e;
    public boolean f;
    protected boolean g;
    protected boolean h;
    public x i;

    @Nullable
    protected sg.bigo.ads.r.b j;
    protected f k;
    protected final Handler l;
    protected String m;
    protected int n;
    protected int o;
    protected int p;
    protected AtomicBoolean q;
    protected boolean r;

    @Nullable
    public q s;

    @Nullable
    protected p t;

    @Nullable
    protected sg.bigo.ads.n.c u;

    @Nullable
    protected sg.bigo.ads.u.a v;
    protected sg.bigo.ads.common.utils.o w;
    protected sg.bigo.ads.common.utils.o x;
    protected sg.bigo.ads.common.utils.o y;
    protected sg.bigo.ads.common.utils.o z;

    /* renamed from: sg.bigo.ads.ad.interstitial.a$2, reason: invalid class name */
    public class AnonymousClass2 extends sg.bigo.ads.common.utils.o {
        public AnonymousClass2(long j) {
            super(j, 1000L);
        }

        @Override // sg.bigo.ads.common.utils.o
        public final void a() {
            a aVar = a.this;
            aVar.a(aVar.x, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroup viewGroup = a.this.F;
                    if (viewGroup != null) {
                        Context context = viewGroup.getContext();
                        int i = R.layout.bigo_ad_view_slide_gesture;
                        ViewGroup viewGroup2 = a.this.F;
                        sg.bigo.ads.common.utils.a.a(context, i, viewGroup2, viewGroup2 != null);
                        View findViewById = a.this.F.findViewById(R.id.inter_slide_gesture_contain);
                        a aVar2 = a.this;
                        aVar2.a = aVar2.F.findViewById(R.id.inter_slide_gesture);
                        View view = a.this.a;
                        if (view == null) {
                            return;
                        }
                        view.setTag(16);
                        u an = a.this.an();
                        a aVar3 = a.this;
                        an.a(aVar3.F, findViewById, aVar3.am(), 8, 0, a.this.a);
                        a.this.C();
                        final View view2 = a.this.a;
                        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        alphaAnimation.setDuration(300L);
                        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        alphaAnimation2.setDuration(200L);
                        alphaAnimation2.setStartOffset(200L);
                        TranslateAnimation translateAnimation = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 160.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        translateAnimation.setDuration(300L);
                        final AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(translateAnimation);
                        animationSet.addAnimation(alphaAnimation);
                        animationSet.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.9
                            final /* synthetic */ View a;
                            final /* synthetic */ AlphaAnimation b;

                            public AnonymousClass9(final View view22, final AlphaAnimation alphaAnimation22) {
                                r1 = view22;
                                r2 = alphaAnimation22;
                            }

                            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                r1.startAnimation(r2);
                            }
                        });
                        alphaAnimation22.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.10
                            final /* synthetic */ AnimationSet a;
                            final /* synthetic */ View b;

                            public AnonymousClass10(final AnimationSet animationSet2, final View view22) {
                                r1 = animationSet2;
                                r2 = view22;
                            }

                            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                r1.setStartOffset(200L);
                                r2.startAnimation(r1);
                            }
                        });
                        view22.startAnimation(animationSet2);
                        a.this.a.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.2.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) a.this.A)) {
                                    return;
                                }
                                a.this.B();
                            }
                        }, 5000L);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.utils.o
        public final void a(long j) {
        }
    }

    public a(@NonNull Activity activity) {
        super(activity);
        this.I = new ArrayList();
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.l = new Handler(Looper.getMainLooper());
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = new AtomicBoolean(false);
        this.r = true;
        this.J = new l();
        this.K = new WeakHashMap<>();
        this.L = new HashMap();
        this.M = new a.AbstractC2430a() { // from class: sg.bigo.ads.ad.interstitial.a.1
            @Override // sg.bigo.ads.as.a.AbstractC2430a
            public final void a(boolean z) {
                a.this.c(z);
            }
        };
        this.R = false;
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.E();
            }
        };
        sg.bigo.ads.q.c.a = new WeakReference<>(this);
    }

    private boolean as() {
        if (!this.R) {
            return true;
        }
        if (d() == 0) {
            return !k() || l();
        }
        return false;
    }

    private void at() {
        u an = an();
        if (an instanceof sg.bigo.ads.k.a) {
            if (an instanceof sg.bigo.ads.k.n) {
                ((sg.bigo.ads.k.n) an).a(this, this.F, this.i, this.j, this.k);
            } else {
                ((sg.bigo.ads.k.a) an).a(this, this.F, this.i, this.c, this.k);
            }
            t();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void au() {
        ViewGroup viewGroup;
        final View findViewById;
        Bitmap a;
        if (!aN() || (viewGroup = this.F) == null || (findViewById = viewGroup.findViewById(R.id.inter_ad_info_card_right_bottom)) == null) {
            return;
        }
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.inter_star);
        View findViewById2 = findViewById.findViewById(R.id.bigo_ad_info_card_background);
        if (imageView != null && findViewById2 != 0) {
            f fVar = this.k;
            String str = fVar != null ? fVar.c : "";
            if (this.E != null && sg.bigo.ads.common.utils.r.a((CharSequence) str)) {
                str = this.E.getCreativeId();
            }
            float a2 = (sg.bigo.ads.y.e.a(str, 4) * 0.5f) + 3.5f;
            d dVar = new d();
            TextView textView = (TextView) findViewById.findViewById(R.id.inter_title);
            TextView textView2 = (TextView) findViewById.findViewById(R.id.inter_description);
            if (textView != null) {
                dVar.b(textView);
            }
            if (textView2 != null) {
                dVar.b(textView2);
            }
            sg.bigo.ads.ai.o oVar = this.c;
            int a3 = oVar != null ? oVar.a("video_play_page.card_background_colour") : -1;
            if (a3 == 1) {
                a = sg.bigo.ads.common.utils.e.a(this.F.getContext(), a2, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half);
                findViewById2.setBackgroundColor(-1);
                dVar.a(-1);
            } else {
                if (a3 == 2) {
                    findViewById2.setBackgroundColor(-16777216);
                    dVar.a(-16777216);
                } else {
                    sg.bigo.ads.n.b bVar = new sg.bigo.ads.n.b(sg.bigo.ads.common.utils.f.a(imageView.getContext(), 12), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new sg.bigo.ads.o.b() { // from class: sg.bigo.ads.ad.interstitial.a.13
                    }.c());
                    Drawable a4 = bVar.a();
                    if (a4 != null) {
                        findViewById2.setBackground(a4);
                    } else if (findViewById2 instanceof sg.bigo.ads.cb.c) {
                        ((sg.bigo.ads.cb.c) findViewById2).setBlurStyle(bVar);
                    }
                }
                a = sg.bigo.ads.common.utils.e.a(this.F.getContext(), a2, R.drawable.bigo_ad_ic_star_white, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half_white);
            }
            if (a != null) {
                imageView.setImageBitmap(a);
                imageView.setVisibility(0);
            }
        }
        findViewById.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.14
            @Override // java.lang.Runnable
            public final void run() {
                AnimationSet animationSet = new AnimationSet(true);
                Interpolator a5 = sg.bigo.ads.common.utils.b.a(2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setInterpolator(a5);
                animationSet.addAnimation(alphaAnimation);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 1.0f, 1, 1.0f);
                scaleAnimation.setDuration(300L);
                alphaAnimation.setInterpolator(a5);
                animationSet.addAnimation(scaleAnimation);
                findViewById.startAnimation(animationSet);
            }
        });
    }

    private void av() {
        ViewGroup viewGroup;
        sg.bigo.ads.ai.o oVar;
        if ((an() instanceof sg.bigo.ads.k.a) || (viewGroup = this.F) == null) {
            return;
        }
        View findViewById = viewGroup.findViewById(R.id.inter_download_msg);
        if (findViewById != null) {
            f fVar = this.k;
            if (fVar == null || !fVar.d) {
                findViewById.setVisibility(8);
                return;
            }
            Button button = (Button) viewGroup.findViewById(R.id.inter_btn_cta);
            if (button != null) {
                button.setText(R.string.bigo_ad_cta_download_default);
            }
            an().a(viewGroup, findViewById, am(), 8, this.i.i, new View[0]);
        }
        if (aN()) {
            IconListView iconListView = (IconListView) viewGroup.findViewById(R.id.inter_iconlist_download_msg_list);
            if (this.k == null || iconListView == null) {
                return;
            }
            boolean z = true;
            if (aN() && T() && (oVar = this.c) != null) {
                int a = oVar.a("video_play_page.background_colour");
                if (!aN() ? a == 1 : a == 1) {
                    z = false;
                }
            }
            iconListView.setThemeWhite(z);
            iconListView.a(this.k);
            iconListView.setVisibility(0);
        }
    }

    private void aw() {
        ViewGroup viewGroup = this.F;
        if (viewGroup == null) {
            return;
        }
        Button button = (Button) viewGroup.findViewById(R.id.inter_btn_cta);
        TextView textView = (TextView) this.F.findViewById(R.id.inter_company);
        sg.bigo.ads.ai.o oVar = this.c;
        if (oVar != null) {
            int a = oVar.a("video_play_page.cta_color");
            int a2 = this.c.a("endpage.cta_color");
            int a3 = this.c.a("layer.cta_color");
            this.n = s.a(((t) this.A).K(), a, null);
            this.o = s.a(((t) this.A).K(), a2, null);
            this.p = s.a(((t) this.A).K(), a3, null);
            if (!(an() instanceof sg.bigo.ads.k.a)) {
                if (button != null) {
                    button.setBackgroundColor(this.n);
                }
                if (textView != null) {
                    textView.setTextColor(this.n);
                }
            }
        }
        if (!T() || this.c == null) {
            return;
        }
        View findViewById = this.F.findViewById(R.id.inter_media_container);
        int a4 = this.c.a("video_play_page.background_colour");
        if (aN()) {
            if (a4 != 4 && a4 != 5) {
                return;
            }
        } else if (a4 != 3 && a4 != 4) {
            return;
        }
        if (findViewById != null) {
            findViewById.setBackgroundColor(sg.bigo.ads.common.utils.r.b("#66000000", -7829368));
            TextView textView2 = (TextView) this.F.findViewById(R.id.inter_warning);
            if (textView2 != null) {
                textView2.setTextColor(sg.bigo.ads.common.utils.r.b("#66FFFFFF", -1));
            }
        }
    }

    @NonNull
    private LandingPageStyleConfig ax() {
        sg.bigo.ads.ai.o oVar = this.c;
        if (oVar == null || !this.e) {
            oVar = null;
        }
        int a = sg.bigo.ads.u.a.a(oVar);
        int b = sg.bigo.ads.u.a.b(oVar);
        sg.bigo.ads.u.a aVar = this.v;
        int i = (aVar == null || !aVar.d()) ? 0 : an().j;
        if (i == 0) {
            i = s.a(this.E, 0);
        }
        int i2 = i;
        int i3 = 0;
        Class<? extends sg.bigo.ads.controller.landing.c> i4 = i(a);
        ViewGroup viewGroup = this.F;
        if (viewGroup != null) {
            i3 = viewGroup.getMeasuredHeight();
        }
        return new LandingPageStyleConfig(i4, 9, a, b, i3, i2, 0.8f);
    }

    private boolean ay() {
        sg.bigo.ads.ai.o oVar = this.c;
        return oVar != null && oVar.c("layer.is_show_layer");
    }

    private void az() {
        ViewGroup viewGroup;
        if (!T() || (viewGroup = this.F) == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_title);
        TextView textView2 = (TextView) this.F.findViewById(R.id.inter_description);
        sg.bigo.ads.ai.o oVar = this.c;
        int i = (oVar != null ? oVar.a("video_play_page.background_colour") : -1) == 1 ? -16777216 : -1;
        if (textView != null) {
            textView.setTextColor(i);
        }
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
    }

    public static /* synthetic */ double b(int i, int i2, int i3, int i4) {
        return Math.max(Math.abs(i - i3), Math.abs(i2 - i4));
    }

    public static Class<? extends sg.bigo.ads.controller.landing.c> i(int i) {
        return i == 0 ? sg.bigo.ads.q.e.class : (7 == i || 8 == i) ? sg.bigo.ads.q.b.class : sg.bigo.ads.q.f.class;
    }

    private void l(int i) {
        sg.bigo.ads.r.b J;
        if (i != 0) {
            if (i == 1 && (J = ((t) this.A).J()) != null) {
                J.a(2, 2);
                return;
            }
            return;
        }
        sg.bigo.ads.r.b bVar = this.j;
        if (bVar != null) {
            bVar.a(1, 2);
        }
    }

    public void A() {
        sg.bigo.ads.ai.o oVar;
        if (this.e && (oVar = this.c) != null) {
            long a = oVar.a("video_play_page.guided_click_gesture_show_time") * 1000;
            if (a == 0) {
                return;
            }
            this.x = new AnonymousClass2(a);
        }
    }

    public final void B() {
        final View findViewById;
        ViewGroup viewGroup = this.F;
        if (viewGroup == null || (findViewById = viewGroup.findViewById(R.id.inter_slide_gesture_contain)) == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.11
            final /* synthetic */ View a;

            public AnonymousClass11(final View findViewById2) {
                r1 = findViewById2;
            }

            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                sg.bigo.ads.common.utils.v.b(r1);
            }
        });
        findViewById2.startAnimation(alphaAnimation);
        findViewById2.setVisibility(8);
    }

    public final void C() {
        View findViewById = this.F.findViewById(R.id.inter_slide_gesture_contain);
        if (findViewById == null) {
            return;
        }
        findViewById.setTag(16);
        findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.a.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    a.this.T = (int) motionEvent.getX();
                    a.this.U = (int) motionEvent.getY();
                } else if (action == 1 && a.b(a.this.T, a.this.U, (int) motionEvent.getX(), (int) motionEvent.getY()) > 10.0d) {
                    a.this.B();
                    ((t) a.this.A).K().a((int) motionEvent.getX(), (int) motionEvent.getY(), a.this.T, a.this.U, 8, ((Integer) view.getTag()).intValue());
                }
                return true;
            }
        });
    }

    public void D() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null) {
            return;
        }
        sg.bigo.ads.as.a.a(adCountDownButton, this.M);
    }

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
            int i = this.i.c;
            int i2 = (i >= 0 || ((t) this.A).f().y() == 4) ? i : 0;
            if (((t) this.A).E()) {
                sg.bigo.ads.cp.a f = ((t) this.A).f();
                if (this.q.get() && f.bq() == null) {
                    i2 = x.b(this.i.p);
                }
            }
            this.C.a(i2, (AdCountDownButton.b) null);
        }
    }

    public final void F() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || adCountDownButton.getVisibility() != 0) {
            return;
        }
        this.C.clearAnimation();
        this.C.setVisibility(4);
    }

    public boolean G() {
        View findViewById;
        View findViewById2;
        View findViewById3;
        sg.bigo.ads.ai.o oVar;
        int i = R.layout.bigo_ad_view_click_guide;
        if (aN()) {
            sg.bigo.ads.ai.o oVar2 = this.c;
            r6 = oVar2 != null ? oVar2.a("layer.guided_click") : -1;
            if (r6 == 1) {
                i = R.layout.bigo_ad_view_click_guide_landscape_1;
            } else if (r6 == 3) {
                i = R.layout.bigo_ad_view_click_guide_landscape_3;
            } else {
                i = R.layout.bigo_ad_view_click_guide_landscape_2;
                r6 = 2;
            }
        }
        if (this.F == null || d() == 2 || d() == 8 || !this.i.d) {
            return false;
        }
        sg.bigo.ads.u.a aVar = this.v;
        if (aVar != null) {
            findViewById = aVar.a(this, this.F, am(), new v.a() { // from class: sg.bigo.ads.ad.interstitial.a.4
                @Override // sg.bigo.ads.ad.interstitial.v.a
                public final void a(View view) {
                    a.this.a(view);
                }
            });
        } else {
            Context context = this.F.getContext();
            ViewGroup viewGroup = this.F;
            sg.bigo.ads.common.utils.a.a(context, i, viewGroup, viewGroup != null);
            View findViewById4 = this.F.findViewById(R.id.inter_click_guide_container);
            if (findViewById4 != null) {
                an().a(this.F, findViewById4, am(), 10, this.i.n, findViewById4);
                findViewById4.setTag(12);
                Button button = (Button) findViewById4.findViewById(R.id.inter_btn_cta);
                if (button != null) {
                    button.setTag(17);
                }
                findViewById4.findViewById(R.id.inter_icon).setTag(17);
                if (this.e) {
                    if (button != null) {
                        button.setBackgroundColor(this.p);
                    }
                    if (this.i.m) {
                        a(findViewById4, 10, ((t) this.A).K(), this.i.n);
                    } else {
                        a(findViewById4, 10, r.H, 0);
                    }
                } else {
                    a(findViewById4, 5, ((t) this.A).K(), this.i.n);
                }
                c.b(findViewById4);
                View findViewById5 = findViewById4.findViewById(R.id.inter_click_guide);
                View findViewById6 = findViewById4.findViewById(R.id.inter_click_ripple);
                if (findViewById5 != null && findViewById6 != null) {
                    c.a(findViewById5, findViewById6);
                }
                if (r6 == 1 && (findViewById3 = findViewById4.findViewById(R.id.inter_btn_cta_layout)) != null) {
                    c.e(findViewById3);
                } else if (r6 == 3 && (findViewById2 = findViewById4.findViewById(R.id.inter_click_guide)) != null) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    alphaAnimation.setDuration(600L);
                    alphaAnimation.setStartOffset(1000L);
                    alphaAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(1));
                    TranslateAnimation translateAnimation = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -sg.bigo.ads.common.utils.f.a(findViewById2.getContext(), 160));
                    translateAnimation.setDuration(600L);
                    translateAnimation.setStartOffset(1000L);
                    translateAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                    AnimationSet animationSet = new AnimationSet(false);
                    animationSet.addAnimation(alphaAnimation);
                    animationSet.addAnimation(translateAnimation);
                    alphaAnimation.setRepeatCount(Integer.MAX_VALUE);
                    alphaAnimation.setRepeatMode(1);
                    translateAnimation.setRepeatCount(Integer.MAX_VALUE);
                    translateAnimation.setRepeatMode(1);
                    findViewById2.startAnimation(animationSet);
                }
            }
            findViewById = this.F.findViewById(R.id.bigo_ad_layout_click_guide);
            a(findViewById);
            if (findViewById == null) {
                findViewById = findViewById4;
            }
        }
        if (findViewById != null && (oVar = this.c) != null) {
            a(findViewById, this.e ? oVar.a("layer.below_area_dp") : 0, this.e && this.c.a("layer.below_area_clickable") == 1, this.e ? this.c.a("layer.up_area_dp") : 0, this.e && this.c.a("layer.up_area_clickable") == 1, 10, this.i.n);
        }
        f(9);
        a(this.i.e * 1000);
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int H() {
        int d = d();
        int e = e();
        if (d != 1) {
            if (d != 2) {
                if (d == 3) {
                    return 3;
                }
                if (d == 14) {
                    return 6;
                }
                switch (d) {
                    case 5:
                    case 6:
                        return 4;
                    case 7:
                    case 8:
                        return 5;
                    case 9:
                        return 9;
                    default:
                        return 1;
                }
            }
            if (e == 5) {
                return 4;
            }
        }
        return 2;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void I() {
        if (M()) {
            ax();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void J() {
        super.J();
        this.l.removeCallbacksAndMessages(null);
        sg.bigo.ads.n.c cVar = this.u;
        if (cVar != null) {
            IconAds iconAds = cVar.e;
            if (iconAds != null) {
                iconAds.destroy();
            }
            sg.bigo.ads.common.utils.o oVar = cVar.l;
            if (oVar != null) {
                oVar.b();
                cVar.l = null;
            }
            sg.bigo.ads.common.utils.o oVar2 = cVar.m;
            if (oVar2 != null) {
                oVar2.b();
                cVar.m = null;
            }
            cVar.q.clear();
            cVar.r.clear();
            cVar.s.clear();
            cVar.t.clear();
            cVar.n = true;
            cVar.b();
            cVar.c();
        }
        sg.bigo.ads.as.a.b(this.C, this.M);
    }

    public final void K() {
        TextView textView = (TextView) this.F.findViewById(R.id.inter_advertiser);
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(this.m)) {
            textView.setVisibility(8);
            return;
        }
        if (!aN() && (textView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(2, R.id.inter_ad_info);
            layoutParams.addRule(12, 0);
            layoutParams.leftMargin = 18;
            layoutParams.setMarginStart(18);
            layoutParams.bottomMargin = 15;
            textView.setLayoutParams(layoutParams);
            textView.setText(this.m);
        }
    }

    public final boolean L() {
        ax();
        return false;
    }

    public final boolean M() {
        int d = d();
        return d == 2 || d == 6 || d == 8 || d == 9;
    }

    public abstract void N();

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        r2 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r0 == 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void O() {
        Integer a;
        if (this.F != null) {
            int i = -16777216;
            if (this.c != null && T()) {
                int a2 = this.c.a("video_play_page.background_colour");
                if (a2 == 1) {
                    i = -1;
                } else if (a2 != 2) {
                    if (aN()) {
                        if (a2 == 4) {
                            a = s.a((NativeAd) this.E);
                        }
                        i = sg.bigo.ads.common.utils.r.b("#262E33", -7829368);
                    } else {
                        if (a2 == 3) {
                            a = s.a((NativeAd) this.E);
                        }
                        i = -100;
                    }
                }
                u an = an();
                ViewGroup viewGroup = this.F;
                if (i != -100) {
                    an.a(viewGroup, i);
                    return;
                } else {
                    an.a(viewGroup);
                    return;
                }
            }
            if (!aN()) {
                an().a(this.F);
                return;
            }
            sg.bigo.ads.ai.o oVar = this.c;
            if (oVar != null) {
                int a3 = oVar.a("video_play_page.background_colour");
                if (a3 == 1) {
                    an().a(this.F, -1);
                    return;
                }
                if (a3 == 2) {
                    an().a(this.F, -16777216);
                    return;
                }
                if (a3 == 4) {
                    an().a(this.F, this.n);
                } else if (a3 == 5) {
                    an().a(this.F);
                } else {
                    an().a(this.F, sg.bigo.ads.common.utils.r.b("#262E33", -7829368));
                }
            }
        }
    }

    public final boolean P() {
        sg.bigo.ads.ai.o oVar = this.c;
        return oVar != null && 1 == oVar.a("endpage.is_endpage", 1);
    }

    public final boolean Q() {
        sg.bigo.ads.ai.o oVar;
        return (this instanceof sg.bigo.ads.s.b) && (oVar = this.c) != null && 1 == oVar.a("endpage.ep_sprt", 0);
    }

    public final boolean R() {
        sg.bigo.ads.ai.o oVar = this.c;
        return (oVar == null || oVar.a("mid_page.show_time") != 0 || P() || ay() || this.q.get()) ? false : true;
    }

    public final boolean S() {
        sg.bigo.ads.ai.o oVar = this.c;
        return (oVar == null || oVar.a("mid_page.show_time") <= 0 || P() || ay() || this.q.get()) ? false : true;
    }

    public final boolean T() {
        int ac = ac();
        return ac == R.layout.bigo_ad_activity_interstitial_percent_warning || ac == R.layout.bigo_ad_activity_interstitial_percent_warning_landscape;
    }

    @Override // sg.bigo.ads.q.c.b
    public void a_(int i) {
        this.R = true;
    }

    @Override // sg.bigo.ads.q.c.b
    public final void b_(int i) {
        if (d() == 0 && i == 0 && k() && !l() && this.R && this.D.get()) {
            h();
        }
    }

    @NonNull
    public abstract x c();

    @Override // sg.bigo.ads.q.c.b
    public final void c(int i) {
        if (d() == 0 && i == 0 && k() && !l() && this.R && !this.D.get()) {
            j();
        }
    }

    public final int d() {
        synchronized (this.I) {
            try {
                if (this.I.isEmpty()) {
                    return -1;
                }
                return this.I.get(0).intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int e() {
        synchronized (this.I) {
            try {
                if (this.I.size() < 2) {
                    return -1;
                }
                return this.I.get(1).intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.L) {
            try {
                WeakHashMap<Object, Runnable> remove = this.L.remove(1);
                if (!sg.bigo.ads.common.utils.l.a(remove)) {
                    Iterator<Map.Entry<Object, Runnable>> it = remove.entrySet().iterator();
                    while (it.hasNext()) {
                        Runnable value = it.next().getValue();
                        if (value != null) {
                            sg.bigo.ads.bh.d.a(2, value);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean f(boolean z);

    @Override // sg.bigo.ads.d.c.a
    public final LandingPageStyleConfig f_() {
        sg.bigo.ads.ai.o e;
        if (this.E == null) {
            return null;
        }
        sg.bigo.ads.ai.o oVar = this.d;
        if ((oVar != null ? oVar.a("clk_flow_attr.auto_clk_out_mode", 0) : 0) != 1 || (e = ((sg.bigo.ads.cp.a) this.E.f()).e()) == null) {
            return null;
        }
        int a = sg.bigo.ads.k.a.a(e, i(false), i(true));
        int d = d();
        ViewGroup viewGroup = this.F;
        LandingPageStyleConfig landingPageStyleConfig = new LandingPageStyleConfig(sg.bigo.ads.q.a.class, d, 5, a, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, 0, 0.67f);
        sg.bigo.ads.q.c.a(landingPageStyleConfig);
        return landingPageStyleConfig;
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void g(int i) {
        super.g(i);
        if (this.F == null) {
            return;
        }
        ((t) this.A).F = this.J;
        at();
        u();
        w();
        aw();
        av();
        x();
        A();
        f(0);
        N();
        ((t) this.A).f().a(this.e);
        a(this.F);
        D();
        a(this.i.b * 1000);
        au();
        az();
        p();
    }

    @Override // sg.bigo.ads.d.c.a
    public final boolean g_() {
        return this.R;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h() {
        l lVar;
        sg.bigo.ads.cp.a f;
        int i;
        sg.bigo.ads.n.c cVar;
        sg.bigo.ads.u.a aVar;
        sg.bigo.ads.common.utils.o oVar;
        super.h();
        int d = d();
        q qVar = this.s;
        if (qVar != null) {
            qVar.b();
        }
        p pVar = this.t;
        if (pVar != null && (oVar = pVar.q) != null && oVar.e()) {
            pVar.q.c();
        }
        if (d == 0) {
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.b;
        } else if (d == 10) {
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.c;
        } else if (d == 1) {
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.d;
        } else if (d == 2 || d == 8 || d == 9) {
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.e;
        } else if (d == 5) {
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.f;
        } else {
            if (d != 4) {
                if (d == 7) {
                    lVar = this.J;
                    f = ((t) this.A).f();
                    i = lVar.h;
                }
                cVar = this.u;
                if (cVar != null) {
                    cVar.n = false;
                    sg.bigo.ads.n.c.b(cVar.k, cVar.i);
                    sg.bigo.ads.n.c.b(cVar.j, cVar.h);
                    sg.bigo.ads.common.utils.o oVar2 = cVar.l;
                    if (oVar2 != null && oVar2.e()) {
                        cVar.l.c();
                    }
                    sg.bigo.ads.common.utils.o oVar3 = cVar.m;
                    if (oVar3 != null && oVar3.e()) {
                        cVar.m.c();
                    }
                }
                aVar = this.v;
                if (aVar == null) {
                    aVar.b();
                    return;
                }
                return;
            }
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.g;
        }
        lVar.b(f, i);
        cVar = this.u;
        if (cVar != null) {
        }
        aVar = this.v;
        if (aVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j() {
        l lVar;
        sg.bigo.ads.cp.a f;
        int i;
        sg.bigo.ads.n.c cVar;
        sg.bigo.ads.u.a aVar;
        sg.bigo.ads.common.utils.o oVar;
        super.j();
        int d = d();
        q qVar = this.s;
        if (qVar != null) {
            qVar.c();
        }
        p pVar = this.t;
        if (pVar != null && (oVar = pVar.q) != null) {
            oVar.d();
        }
        if (d == 0) {
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.b;
        } else if (d == 10) {
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.c;
        } else if (d == 1) {
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.d;
        } else if (d == 2 || d == 8 || d == 9) {
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.e;
        } else if (d == 5) {
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.f;
        } else {
            if (d != 4) {
                if (d == 7) {
                    lVar = this.J;
                    f = ((t) this.A).f();
                    i = lVar.h;
                }
                cVar = this.u;
                if (cVar != null) {
                    cVar.n = true;
                    sg.bigo.ads.n.c.a(cVar.k, cVar.i);
                    sg.bigo.ads.n.c.a(cVar.j, cVar.h);
                    sg.bigo.ads.common.utils.o oVar2 = cVar.l;
                    if (oVar2 != null) {
                        oVar2.d();
                    }
                    sg.bigo.ads.common.utils.o oVar3 = cVar.m;
                    if (oVar3 != null) {
                        oVar3.d();
                    }
                }
                aVar = this.v;
                if (aVar == null) {
                    aVar.c();
                    return;
                }
                return;
            }
            lVar = this.J;
            f = ((t) this.A).f();
            i = lVar.g;
        }
        lVar.a(f, i);
        cVar = this.u;
        if (cVar != null) {
        }
        aVar = this.v;
        if (aVar == null) {
        }
    }

    public final boolean k() {
        Object an = an();
        if (an instanceof sg.bigo.ads.q.d) {
            return ((sg.bigo.ads.q.d) an).K();
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void m() {
        super.m();
        this.m = ((t) this.A).f().j();
        this.c = ((t) this.A).f().e();
        this.d = ((t) this.A).f().f();
        if (this.c != null) {
            this.e = true;
        }
        this.b = ((t) this.A).f().d().q();
        this.i = c();
        n();
    }

    public void n() {
        sg.bigo.ads.ai.o oVar = this.c;
        if (oVar == null || !this.e) {
            sg.bigo.ads.ai.o oVar2 = this.b;
            if (oVar2 != null) {
                a(oVar2);
                return;
            }
            return;
        }
        sg.bigo.ads.u.a a = sg.bigo.ads.u.a.a(this.N, this.E, oVar, aN());
        this.v = a;
        if (a != null) {
            a.h = this.P;
        }
        this.u = new sg.bigo.ads.n.c((t) this.A, this.c, a);
        a(this.c);
        this.E.w = new WeakReference<>(this);
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final int o() {
        sg.bigo.ads.ai.o oVar = this.c;
        if (oVar == null) {
            return 0;
        }
        if (this.e) {
            return oVar.a("video_play_page.ad_component_layout");
        }
        return 1;
    }

    public void p() {
        this.s = new q(this.N, ((t) this.A).K(), ((t) this.A).f(), this.c, aN(), this.k, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.9
            @Override // java.lang.Runnable
            public final void run() {
                a.this.q();
            }
        }, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.10
            @Override // java.lang.Runnable
            public final void run() {
                a.this.r();
            }
        }, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.11
            @Override // java.lang.Runnable
            public final void run() {
                a.this.s();
            }
        });
        sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.12
            /* JADX WARN: Code restructure failed: missing block: B:52:0x013a, code lost:
            
                if (r14 == 9) goto L31;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                final q qVar = a.this.s;
                sg.bigo.ads.ai.o oVar = qVar.d;
                Context context = qVar.a;
                if (oVar == null || context == null) {
                    return;
                }
                int a = oVar.a("mid_page.show_time");
                if (a < 0) {
                    a = -1;
                }
                qVar.E = a;
                if (a == 0) {
                    qVar.i = false;
                    return;
                }
                q.d dVar = qVar.A;
                dVar.b = oVar.a("mid_page.pop_layout");
                dVar.a = oVar.a("mid_page.pop_method");
                dVar.c = oVar.a("mid_page.cta_color");
                q.a aVar = qVar.z;
                aVar.p = qVar;
                aVar.e = oVar.c("mid_page.is_cta_show_animation");
                aVar.a = oVar.a("mid_page.click_type");
                aVar.b = oVar.c("mid_page.ad_component_clickable_switch");
                aVar.c = oVar.c("mid_page.media_view_clickable_switch");
                aVar.d = oVar.c("mid_page.other_space_clickable_switch");
                int a2 = oVar.a("mid_page.below_area_dp");
                if (a2 > 0) {
                    aVar.f = sg.bigo.ads.common.utils.f.a(context, a2);
                }
                aVar.g = oVar.a("mid_page.below_area_clickable") == 1;
                int a3 = oVar.a("mid_page.up_area_dp");
                if (a3 > 0) {
                    aVar.h = sg.bigo.ads.common.utils.f.a(context, a3);
                }
                aVar.i = oVar.a("mid_page.up_area_clickable") == 1;
                aVar.j = sg.bigo.ads.common.utils.f.c(context);
                aVar.n = new View(context);
                aVar.o = new View(context);
                final Context context2 = qVar.a;
                final sg.bigo.ads.y.b bVar = qVar.b;
                final sg.bigo.ads.api.core.b bVar2 = qVar.c;
                if (qVar.a(context2, bVar, bVar2, qVar.d)) {
                    int i = qVar.A.a;
                    ArrayList arrayList = new ArrayList();
                    if (qVar.o) {
                        arrayList.add(2);
                    } else {
                        if (i == 1) {
                            arrayList.add(1);
                        }
                        if (i == 2) {
                            arrayList.add(1);
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(4);
                        }
                        if (i == 3) {
                            arrayList.add(2);
                        }
                        if (i == 4) {
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(1);
                            arrayList.add(4);
                        }
                        if (i == 5) {
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(4);
                        }
                        if (i == 6) {
                            arrayList.add(3);
                        }
                        if (i == 7) {
                            arrayList.add(3);
                            arrayList.add(2);
                            arrayList.add(1);
                            arrayList.add(4);
                        }
                        if (i == 8) {
                            arrayList.add(3);
                            arrayList.add(2);
                            arrayList.add(4);
                        }
                    }
                    arrayList.add(4);
                    qVar.t = arrayList;
                    sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.3
                        final /* synthetic */ Context a;
                        final /* synthetic */ sg.bigo.ads.y.b b;
                        final /* synthetic */ sg.bigo.ads.api.core.b c;

                        public AnonymousClass3(final Context context22, final sg.bigo.ads.y.b bVar3, final sg.bigo.ads.api.core.b bVar22) {
                            r2 = context22;
                            r3 = bVar3;
                            r4 = bVar22;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            q.a(q.this, r2, r3, r4);
                        }
                    });
                }
                Runnable anonymousClass1 = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!q.a(q.this)) {
                            Runnable runnable = q.this.x;
                            if (runnable != null) {
                                runnable.run();
                                q.this.x = null;
                            }
                            q.this.f();
                        }
                        q.b(q.this);
                    }
                };
                int i2 = qVar.E;
                if (i2 > 0) {
                    long j = i2 * 1000;
                    qVar.u = j;
                    qVar.v = anonymousClass1;
                    qVar.a(j);
                } else if (i2 != -1) {
                    return;
                } else {
                    qVar.w = anonymousClass1;
                }
                qVar.a();
            }
        });
    }

    public void q() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        f(10);
    }

    public void r() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.setAlpha(1.0f);
        }
        f(e());
        aL();
        if (d() == 0) {
            h();
        }
    }

    public final void s() {
        d(false);
    }

    @NonNull
    public final h.a t() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        sg.bigo.ads.ai.o oVar = this.c;
        boolean z3 = false;
        if (oVar != null) {
            int a = this.e ? oVar.a("video_play_page.below_area_dp") : 0;
            boolean z4 = this.e && this.c.a("video_play_page.below_area_clickable") == 1;
            int a2 = this.e ? this.c.a("video_play_page.up_area_dp") : 0;
            if (this.e && this.c.a("video_play_page.up_area_clickable") == 1) {
                z3 = true;
            }
            int a3 = this.c.a("video_play_page.click_type");
            int i4 = a2;
            boolean z5 = z3;
            int i5 = a;
            a(this.F, i5, z4, i4, z5, 8, a3);
            i = i5;
            z = z4;
            i2 = i4;
            z2 = z5;
            i3 = a3;
        } else {
            i = 0;
            z = false;
            i2 = 0;
            z2 = false;
            i3 = 0;
        }
        return new h.a(i, z, i2, z2, i3);
    }

    public void u() {
        sg.bigo.ads.ai.o oVar = this.c;
        if (oVar == null || !this.e) {
            return;
        }
        int a = oVar.a("video_play_page.close_button_style");
        k(a != 2 ? a != 3 ? a != 4 ? a != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4 : R.drawable.bigo_ad_ic_close3 : R.drawable.bigo_ad_ic_close2);
    }

    public int v() {
        x xVar = this.i;
        if (xVar == null) {
            return 0;
        }
        return x.b(xVar.p);
    }

    public void w() {
        int v;
        p pVar = this.t;
        if ((pVar == null || !pVar.a()) && ((t) this.A).f() != null && ((t) this.A).E()) {
            final sg.bigo.ads.cp.a f = ((t) this.A).f();
            this.q.set(!f.bh());
            if (this.q.get() && f.bq() == null && (v = v()) > 0) {
                sg.bigo.ads.common.utils.o oVar = new sg.bigo.ads.common.utils.o(v * 1000) { // from class: sg.bigo.ads.ad.interstitial.a.15
                    @Override // sg.bigo.ads.common.utils.o
                    public final void a() {
                        f.bk();
                        a aVar = a.this;
                        aVar.a(aVar.z, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.15.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.this.y();
                            }
                        });
                    }

                    @Override // sg.bigo.ads.common.utils.o
                    public final void a(long j) {
                    }
                };
                this.z = oVar;
                oVar.c();
            }
        }
    }

    public void x() {
        MediaView mediaView;
        final YandexWarningTextView yandexWarningTextView;
        final YandexWarningTextView yandexWarningTextView2;
        ViewGroup viewGroup = this.F;
        sg.bigo.ads.y.b bVar = this.E;
        if (viewGroup == null || bVar == null) {
            return;
        }
        sg.bigo.ads.ak.b.a(aN());
        if (z() && ((t) this.A).f().x() == 2) {
            sg.bigo.ads.ak.b.a();
        }
        ViewGroup viewGroup2 = this.F;
        if (viewGroup2 != null && (mediaView = (MediaView) viewGroup2.findViewById(R.id.inter_media)) != null && T()) {
            mediaView.setImageBlurBorder(false);
            final ViewGroup viewGroup3 = this.F;
            final sg.bigo.ads.y.b bVar2 = this.E;
            if (viewGroup3 != null && (yandexWarningTextView = (YandexWarningTextView) viewGroup3.findViewById(R.id.inter_warning)) != null) {
                if (bVar2 == null || ((sg.bigo.ads.cp.a) bVar2.f()).C() == null || ((sg.bigo.ads.cp.a) bVar2.f()).C().f() < 0) {
                    yandexWarningTextView2 = yandexWarningTextView;
                } else {
                    final int f = ((sg.bigo.ads.cp.a) bVar2.f()).C().f();
                    final View findViewById = viewGroup3.findViewById(R.id.inter_ad_info_exclude_warning);
                    final MediaView mediaView2 = (MediaView) viewGroup3.findViewById(R.id.inter_media);
                    final RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) viewGroup3.findViewById(R.id.inter_media_layout);
                    float f2 = f * 0.01f;
                    if (f2 > 0.15f) {
                        f2 = 0.15f;
                    }
                    if (findViewById != null) {
                        yandexWarningTextView.setIsHorizontal(false);
                        final float f3 = f2;
                        sg.bigo.ads.common.utils.v.a(findViewById, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.s.1
                            final /* synthetic */ View a;
                            final /* synthetic */ YandexWarningTextView b;
                            final /* synthetic */ RoundedFrameLayout c;
                            final /* synthetic */ float d;
                            final /* synthetic */ ViewGroup e;
                            final /* synthetic */ sg.bigo.ads.y.b f;
                            final /* synthetic */ MediaView g;
                            final /* synthetic */ int h;

                            public AnonymousClass1(final View findViewById2, final YandexWarningTextView yandexWarningTextView3, final RoundedFrameLayout roundedFrameLayout2, final float f32, final ViewGroup viewGroup32, final sg.bigo.ads.y.b bVar22, final MediaView mediaView22, final int f4) {
                                r1 = findViewById2;
                                r2 = yandexWarningTextView3;
                                r3 = roundedFrameLayout2;
                                r4 = f32;
                                r5 = viewGroup32;
                                r6 = bVar22;
                                r7 = mediaView22;
                                r8 = f4;
                            }

                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                int measuredHeight = r1.getMeasuredHeight();
                                int c = sg.bigo.ads.common.utils.f.c(r1.getContext());
                                if (measuredHeight <= 0) {
                                    measuredHeight = sg.bigo.ads.common.utils.f.a(r1.getContext(), 130);
                                }
                                int paddingTop = r2.getPaddingTop();
                                int paddingBottom = r2.getPaddingBottom();
                                int a = sg.bigo.ads.common.utils.f.a(r2.getContext(), 16);
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r2.getLayoutParams();
                                int i = marginLayoutParams.topMargin;
                                if (c < 2000) {
                                    a *= 2;
                                }
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r3.getLayoutParams();
                                int i2 = marginLayoutParams2.topMargin;
                                int i3 = marginLayoutParams2.bottomMargin;
                                int i4 = marginLayoutParams2.leftMargin;
                                int i5 = marginLayoutParams2.rightMargin;
                                int round = Math.round(r4 * c) + paddingBottom + paddingTop;
                                int i6 = (((((c - measuredHeight) - round) - i) - a) - i2) - i3;
                                if (c <= 1000) {
                                    i6 = c / 2;
                                    TextView textView = (TextView) r5.findViewById(R.id.inter_description);
                                    if (textView != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                                        marginLayoutParams3.topMargin = 0;
                                        textView.setLayoutParams(marginLayoutParams3);
                                    }
                                    ViewGroup viewGroup4 = (ViewGroup) r5.findViewById(R.id.bigo_ad_btn_class);
                                    if (viewGroup4 != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) viewGroup4.getLayoutParams();
                                        marginLayoutParams4.topMargin = 0;
                                        viewGroup4.setLayoutParams(marginLayoutParams4);
                                    }
                                    TextView textView2 = (TextView) r5.findViewById(R.id.inter_title);
                                    if (textView2 != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                                        marginLayoutParams5.topMargin = 0;
                                        textView2.setLayoutParams(marginLayoutParams5);
                                    }
                                }
                                int i7 = (sqe0.b(r1).widthPixels - i4) - i5;
                                sg.bigo.ads.an.p a2 = s.a(r6);
                                sg.bigo.ads.an.p a3 = sg.bigo.ads.an.p.a(a2.b, a2.c, i7, i6);
                                r3.setCornerRadius(sg.bigo.ads.common.utils.f.a(r1.getContext(), 8));
                                marginLayoutParams2.setMargins(i4, i2, i5, i3);
                                marginLayoutParams2.height = a3.c;
                                marginLayoutParams2.width = a3.b;
                                sg.bigo.ads.common.utils.v.c(r7, -1, -1);
                                r3.setLayoutParams(marginLayoutParams2);
                                if (r8 == 0) {
                                    r2.setVisibility(8);
                                    return;
                                }
                                marginLayoutParams.height = round;
                                marginLayoutParams.bottomMargin = a;
                                r2.setLayoutParams(marginLayoutParams);
                            }
                        });
                    } else {
                        final float f4 = f2;
                        yandexWarningTextView2 = yandexWarningTextView3;
                        if (f4 != 0) {
                            yandexWarningTextView2.setIsHorizontal(true);
                            yandexWarningTextView2.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.s.2
                                final /* synthetic */ float b;
                                final /* synthetic */ sg.bigo.ads.y.b c;
                                final /* synthetic */ RoundedFrameLayout d;
                                final /* synthetic */ MediaView e;

                                public AnonymousClass2(final float f42, final sg.bigo.ads.y.b bVar22, final RoundedFrameLayout roundedFrameLayout2, final MediaView mediaView22) {
                                    r2 = f42;
                                    r3 = bVar22;
                                    r4 = roundedFrameLayout2;
                                    r5 = mediaView22;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int c = sg.bigo.ads.common.utils.f.c(YandexWarningTextView.this.getContext());
                                    int i = YandexWarningTextView.this.getContext().getResources().getDisplayMetrics().widthPixels;
                                    int round = Math.round(r2 * c) + YandexWarningTextView.this.getPaddingBottom() + YandexWarningTextView.this.getPaddingTop();
                                    ViewGroup.LayoutParams layoutParams = YandexWarningTextView.this.getLayoutParams();
                                    int a = sg.bigo.ads.common.utils.f.a(YandexWarningTextView.this.getContext(), 20);
                                    int i2 = (i / 2) - (a * 3);
                                    sg.bigo.ads.an.p a2 = s.a(r3);
                                    r4.setCornerRadius(sg.bigo.ads.common.utils.f.a(r5.getContext(), 8));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r4.getLayoutParams();
                                    marginLayoutParams.setMargins(a, a, a, a);
                                    if (a2.getHeight() <= a2.getWidth()) {
                                        marginLayoutParams.width = i2;
                                        marginLayoutParams.height = (int) (((a2.getHeight() * 1.0f) * i2) / a2.getWidth());
                                        sg.bigo.ads.common.utils.v.c(r5, -1, -1);
                                    }
                                    r4.setLayoutParams(marginLayoutParams);
                                    layoutParams.height = round;
                                    YandexWarningTextView.this.setLayoutParams(layoutParams);
                                }
                            });
                        }
                    }
                }
                yandexWarningTextView2.setVisibility(8);
            }
        }
        an().a(viewGroup, viewGroup, am(), ad() ? 8 : 1, this.i.i, this.C);
    }

    public boolean z() {
        if (!this.e) {
            return false;
        }
        switch (o()) {
            case 6:
                this.h = false;
                this.g = false;
                if (!aN()) {
                }
                break;
            case 7:
            case 8:
            case 9:
                this.h = false;
                this.g = false;
                break;
            case 10:
                this.h = false;
                this.g = true;
                break;
            case 11:
            case 12:
                this.h = true;
                this.g = false;
                break;
            default:
                this.h = false;
                this.g = false;
                break;
        }
        return false;
    }

    private String i(boolean z) {
        int d = d();
        return d != 1 ? d != 9 ? z ? "video_play_page.webview_force_time_new" : "video_play_page.webview_force_time" : z ? "layer.webview_force_time_new" : "layer.webview_force_time" : z ? "endpage.webview_force_time_new" : "endpage.webview_force_time";
    }

    public static boolean j(int i) {
        return (i == 7 || i == 8 || i == 0) ? false : true;
    }

    public void c(boolean z) {
        if (z) {
            ag();
        } else {
            ai();
        }
    }

    @Override // sg.bigo.ads.q.c.b
    public void d(int i) {
        this.R = false;
        Runnable runnable = this.S;
        if (runnable != null) {
            sg.bigo.ads.bh.d.a(2, runnable);
            this.S = null;
        } else if (this.D.get()) {
            h();
        }
    }

    public final void e(int i) {
        ViewGroup viewGroup = this.F;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.F.findViewById(R.id.inter_ad_label);
        if (aN()) {
            if (TextUtils.isEmpty(this.m) || textView2 == null || textView2.getContext() == null) {
                return;
            }
            String a = sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]);
            if (T()) {
                StringBuilder b = ho8.b(a, " · ");
                b.append(this.m);
                textView2.setText(b.toString());
                return;
            } else {
                textView2.setText(this.m + " · " + a);
                return;
            }
        }
        if (textView == null || textView2 == null) {
            return;
        }
        if (TextUtils.isEmpty(this.m)) {
            textView.setVisibility(8);
            return;
        }
        if (!T()) {
            if (i != R.layout.bigo_ad_activity_interstitial_native_top) {
                textView.bringToFront();
            }
            textView.setText(this.m);
            textView.setPadding(sg.bigo.ads.common.utils.f.a(this.F.getContext(), 4), sg.bigo.ads.common.utils.f.a(textView.getContext(), 1), sg.bigo.ads.common.utils.f.a(textView.getContext(), 4), sg.bigo.ads.common.utils.f.a(textView.getContext(), 1));
            textView2.setText(R.string.bigo_ad_tag);
            return;
        }
        textView.setVisibility(8);
        textView2.setText(sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]) + " · " + this.m);
    }

    public void f(int i) {
        q qVar;
        sg.bigo.ads.y.b bVar;
        sg.bigo.ads.n.c cVar = this.u;
        if (cVar != null) {
            c.a aVar = cVar.g;
            if (i == 0) {
                aVar.a = 1;
            } else if (i == 1) {
                aVar.a = 3;
            } else if (i == 9) {
                aVar.a = 4;
            } else if (i == 10) {
                aVar.a = 2;
            }
        }
        synchronized (this.I) {
            synchronized (this.I) {
                this.I.remove(Integer.valueOf(i));
            }
            this.I.add(0, Integer.valueOf(i));
        }
        int e = e();
        int d = d();
        if (d != e) {
            l(e);
        }
        sg.bigo.ads.y.b bVar2 = this.E;
        if (bVar2 != null) {
            bVar2.d(i);
        }
        if (((i == 0) | (i == 1) | (i == 2) | (i == 4) | (i == 5) | (i == 6) | (i == 7) | (i == 8) | (i == 9) | (i == 14)) && (bVar = this.E) != null) {
            ((sg.bigo.ads.cp.a) bVar.f()).b(SystemClock.elapsedRealtime());
        }
        if (i != 0 && i != 10 && i != 3 && (qVar = this.s) != null) {
            qVar.i = false;
        }
        if (d == 0) {
            sg.bigo.ads.r.b bVar3 = this.j;
            if (bVar3 != null) {
                bVar3.a(1, 1);
            }
            l lVar = this.J;
            lVar.a(lVar.b);
            return;
        }
        if (d == 1) {
            sg.bigo.ads.r.b J = ((t) this.A).J();
            if (J != null) {
                J.a(2, 1);
            }
            l lVar2 = this.J;
            lVar2.a(lVar2.d);
            x xVar = this.i;
            if (xVar == null || !xVar.d) {
                k(R.drawable.bigo_ad_ic_close);
                return;
            }
            return;
        }
        if (d != 2) {
            if (d == 4) {
                l lVar3 = this.J;
                lVar3.a(lVar3.g);
                return;
            }
            if (d == 5) {
                l lVar4 = this.J;
                lVar4.a(lVar4.f);
                x xVar2 = this.i;
                if (xVar2 == null || !xVar2.d) {
                    k(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            }
            if (d == 14) {
                l lVar5 = this.J;
                lVar5.a(lVar5.i);
                x xVar3 = this.i;
                if (xVar3 == null || !xVar3.d) {
                    k(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            }
            switch (d) {
                case 7:
                    l lVar6 = this.J;
                    lVar6.a(lVar6.h);
                    x xVar4 = this.i;
                    if (xVar4 == null || !xVar4.d) {
                        k(R.drawable.bigo_ad_ic_close);
                        return;
                    }
                    return;
                case 8:
                case 9:
                    break;
                case 10:
                    l lVar7 = this.J;
                    lVar7.a(lVar7.c);
                    return;
                default:
                    return;
            }
        }
        k(R.drawable.bigo_ad_ic_close);
        l lVar8 = this.J;
        lVar8.a(lVar8.e);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean g() {
        return as();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public void h(int i) {
        super.g(i);
        if (this.F == null) {
            return;
        }
        ((t) this.A).F = this.J;
        at();
        w();
        aw();
        av();
        x();
        A();
        f(0);
        N();
        ((t) this.A).f().a(this.e);
        a(this.F);
        au();
        az();
    }

    public final boolean l() {
        if (d() != 0 || !this.R) {
            return false;
        }
        Object an = an();
        if (an instanceof sg.bigo.ads.q.d) {
            return ((sg.bigo.ads.q.d) an).L();
        }
        return false;
    }

    @Override // sg.bigo.ads.d.c.a
    public LandingPageStyleConfig a(Context context, String str, int i, boolean z) {
        LandingPageStyleConfig landingPageStyleConfig;
        q qVar;
        sg.bigo.ads.ai.o oVar = null;
        r0 = null;
        sg.bigo.ads.ai.o oVar2 = null;
        LandingPageStyleConfig landingPageStyleConfig2 = null;
        oVar = null;
        if (z) {
            int d = d();
            if (d == 0) {
                u an = an();
                sg.bigo.ads.ai.o oVar3 = this.c;
                if (oVar3 == null || !this.e) {
                    oVar3 = null;
                }
                int a = sg.bigo.ads.k.a.a(an, oVar3);
                if (j(a)) {
                    return null;
                }
                return new LandingPageStyleConfig(i(a), 0, a, sg.bigo.ads.k.a.b(an, oVar3), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (d == 9) {
                sg.bigo.ads.ai.o oVar4 = this.c;
                if (oVar4 == null || !this.e) {
                    oVar4 = null;
                }
                int a2 = sg.bigo.ads.u.a.a(oVar4);
                if (j(a2)) {
                    return null;
                }
                return new LandingPageStyleConfig(i(a2), 9, a2, sg.bigo.ads.u.a.b(oVar4), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (d != 10) {
                return null;
            }
            sg.bigo.ads.ai.o oVar5 = this.c;
            if (oVar5 == null || !this.e) {
                oVar5 = null;
            }
            int a3 = sg.bigo.ads.k.a.a(oVar5, "layer.webview_layout");
            if (j(a3)) {
                return null;
            }
            return new LandingPageStyleConfig(i(a3), 10, a3, q.a(oVar5), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        int d2 = d();
        if (d2 != 0) {
            if (d2 == 9) {
                landingPageStyleConfig2 = ax();
            } else if (d2 == 10) {
                sg.bigo.ads.ai.o oVar6 = this.c;
                if (oVar6 != null && this.e) {
                    oVar2 = oVar6;
                }
                int a4 = sg.bigo.ads.k.a.a(oVar2, "layer.webview_layout");
                int a5 = q.a(oVar2);
                Class<? extends sg.bigo.ads.controller.landing.c> i2 = i(a4);
                ViewGroup viewGroup = this.F;
                landingPageStyleConfig = new LandingPageStyleConfig(i2, 10, a4, a5, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, s.a(this.E, 0), 0.8f);
                if (!landingPageStyleConfig.b() && (qVar = this.s) != null) {
                    qVar.d();
                }
            }
            sg.bigo.ads.q.c.a(landingPageStyleConfig2);
            return landingPageStyleConfig2;
        }
        u an2 = an();
        sg.bigo.ads.ai.o oVar7 = this.c;
        if (oVar7 != null && this.e) {
            oVar = oVar7;
        }
        int a6 = sg.bigo.ads.k.a.a(an2, oVar);
        int b = sg.bigo.ads.k.a.b(an2, oVar);
        float f = sg.bigo.ads.k.a.a(an2) ? 0.67f : 0.8f;
        Class<? extends sg.bigo.ads.controller.landing.c> i3 = i(a6);
        ViewGroup viewGroup2 = this.F;
        landingPageStyleConfig = new LandingPageStyleConfig(i3, 0, a6, b, viewGroup2 != null ? viewGroup2.getMeasuredHeight() : 0, s.a(this.E, 0), f);
        landingPageStyleConfig2 = landingPageStyleConfig;
        sg.bigo.ads.q.c.a(landingPageStyleConfig2);
        return landingPageStyleConfig2;
    }

    public final void c(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.L) {
            try {
                WeakHashMap<Object, Runnable> weakHashMap = this.L.get(1);
                if (!sg.bigo.ads.common.utils.l.a(weakHashMap)) {
                    for (Object obj : objArr) {
                        if (obj != null) {
                            weakHashMap.remove(obj);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z) {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || (adCountDownButton.getVisibility() == 0 && this.C.c)) {
            e(z);
        } else if (this.C.getVisibility() == 0 && this.C.e) {
            e(z);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean i() {
        return as();
    }

    @Override // sg.bigo.ads.q.c.b
    public final void a(int i, int i2, int i3, int i4) {
        Object an = an();
        if (an instanceof sg.bigo.ads.q.d) {
            sg.bigo.ads.q.d dVar = (sg.bigo.ads.q.d) an;
            dVar.a(i, i2, i3, i4);
            if (dVar.L() && this.R && !this.D.get()) {
                j();
            }
        }
    }

    public void b(boolean z) {
        sg.bigo.ads.common.utils.o oVar;
        sg.bigo.ads.common.utils.o oVar2 = this.x;
        if (oVar2 != null) {
            oVar2.b();
            this.x = null;
        }
        sg.bigo.ads.common.utils.o oVar3 = this.w;
        if (oVar3 != null) {
            oVar3.b();
            this.w = null;
        }
        if (z && (oVar = this.y) != null) {
            oVar.b();
            this.y = null;
        }
        sg.bigo.ads.common.utils.o oVar4 = this.z;
        if (oVar4 != null) {
            oVar4.b();
            this.z = null;
        }
    }

    @Override // sg.bigo.ads.q.c.b
    public final void a(int i, int i2, int i3, int i4, int i5) {
        if (d() == d() && i5 == 0) {
            Object an = an();
            if (an instanceof sg.bigo.ads.q.d) {
                sg.bigo.ads.q.d dVar = (sg.bigo.ads.q.d) an;
                dVar.a(i, i2, i3, i4);
                if (dVar.L() && this.R && !this.D.get()) {
                    j();
                }
            }
        }
    }

    public final void b(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.K) {
            try {
                for (Object obj : objArr) {
                    if (obj != null) {
                        this.K.remove(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(long j) {
        if (j <= 0) {
            E();
            return;
        }
        F();
        this.l.removeCallbacks(this.V);
        this.l.postDelayed(this.V, j);
    }

    public final void a(View view) {
        sg.bigo.ads.n.c cVar = this.u;
        if (cVar == null || !(view instanceof ViewGroup)) {
            return;
        }
        sg.bigo.ads.n.c.a(cVar.j, cVar.h);
        final sg.bigo.ads.n.c cVar2 = this.u;
        final ViewGroup viewGroup = (ViewGroup) view;
        cVar2.p = false;
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) cVar2.a.f(), 2);
        if (viewGroup == null) {
            cVar2.a(cVar2.c, "layerView is null", 2);
            return;
        }
        if (sg.bigo.ads.o.b.b(cVar2.c)) {
            cVar2.a(cVar2.c, "config is invalid", 2);
            return;
        }
        if (!cVar2.a(2)) {
            cVar2.a(cVar2.c, "icon request hasScene return false", 2);
            return;
        }
        cVar2.c();
        sg.bigo.ads.n.a aVar = cVar2.k;
        if (aVar != null) {
            aVar.b.d();
            sg.bigo.ads.common.utils.v.b(cVar2.k.a);
        }
        cVar2.k = null;
        final sg.bigo.ads.o.c cVar3 = cVar2.c;
        c.b anonymousClass4 = new c.b(viewGroup, cVar3) { // from class: sg.bigo.ads.n.c.4
            final /* synthetic */ ViewGroup a;
            private boolean e = false;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(final ViewGroup viewGroup2, final sg.bigo.ads.o.b cVar32, final ViewGroup viewGroup22) {
                super(viewGroup22, cVar32, (byte) 0);
                r4 = viewGroup22;
                this.e = false;
            }

            @Override // sg.bigo.ads.n.c.b
            public final void a(sg.bigo.ads.n.a aVar2) {
                sg.bigo.ads.u.a aVar3;
                RealtimeBlurLinearLayout realtimeBlurLinearLayout;
                super.a(aVar2);
                if (!this.e || (aVar3 = c.this.d) == null || (realtimeBlurLinearLayout = aVar2.a) == null) {
                    return;
                }
                aVar3.a(realtimeBlurLinearLayout);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
            @Override // sg.bigo.ads.n.c.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean a() {
                AnonymousClass4 anonymousClass42;
                o oVar;
                sg.bigo.ads.o.c cVar4;
                String str;
                c cVar5 = c.this;
                if (cVar5.e == null) {
                    cVar4 = cVar5.c;
                    str = "icon ads is null";
                } else {
                    if (!cVar5.n) {
                        if (cVar5.a()) {
                            c.this.c();
                            c cVar6 = c.this;
                            cVar6.a(cVar6.c, "host ad is destroyed", 2);
                            return true;
                        }
                        List a = c.a(c.this.e);
                        if (l.a((Collection) a)) {
                            c.this.c();
                            c cVar7 = c.this;
                            cVar7.a(cVar7.c, "icon ads download failed", 2);
                            return true;
                        }
                        boolean a2 = c.this.c.a();
                        if (sg.bigo.ads.common.utils.v.c(this.c) && sg.bigo.ads.common.utils.v.d(this.c)) {
                            c.a(c.this, 2);
                            c cVar8 = c.this;
                            Context context = this.c.getContext();
                            c cVar9 = c.this;
                            cVar8.k = sg.bigo.ads.n.a.a(context, cVar9.c, a, cVar9.r);
                            c.a(c.this, a2);
                            RealtimeBlurLinearLayout realtimeBlurLinearLayout = c.this.k.a;
                            int e = this.d.e();
                            if (e == 5 || e == 6) {
                                View findViewById = r4.findViewById(R.id.inter_icons_bottom_anchor);
                                View findViewById2 = r4.findViewById(R.id.inter_icons_center_anchor);
                                if (findViewById != null) {
                                    ViewParent parent = findViewById.getParent();
                                    if (parent instanceof ViewGroup) {
                                        ((ViewGroup) parent).addView(realtimeBlurLinearLayout, findViewById.getLayoutParams());
                                    }
                                }
                                if (findViewById2 != null) {
                                    sg.bigo.ads.n.a aVar2 = c.this.k;
                                    ViewParent parent2 = findViewById2.getParent();
                                    if (parent2 instanceof ViewGroup) {
                                        ViewGroup viewGroup2 = (ViewGroup) parent2;
                                        anonymousClass42 = this;
                                        viewGroup2.post(new Runnable() { // from class: sg.bigo.ads.n.c.b.3
                                            final /* synthetic */ View a;
                                            final /* synthetic */ ViewGroup b;
                                            final /* synthetic */ View c;
                                            final /* synthetic */ Integer d;
                                            final /* synthetic */ sg.bigo.ads.n.a e;

                                            /* renamed from: sg.bigo.ads.n.c$b$3$1 */
                                            public class AnonymousClass1 extends sg.bigo.ads.an.h {
                                                final /* synthetic */ ValueAnimator a;

                                                public AnonymousClass1(ValueAnimator valueAnimator) {
                                                    r2 = valueAnimator;
                                                }

                                                @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                                                public final void onTransitionEnd(Transition transition) {
                                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                                    b.this.a(r6);
                                                }

                                                @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                                                public final void onTransitionStart(Transition transition) {
                                                    ValueAnimator valueAnimator = r2;
                                                    if (valueAnimator != null) {
                                                        valueAnimator.start();
                                                    }
                                                }
                                            }

                                            public AnonymousClass3(View realtimeBlurLinearLayout2, ViewGroup viewGroup22, View findViewById22, Integer num, sg.bigo.ads.n.a aVar22) {
                                                r2 = realtimeBlurLinearLayout2;
                                                r3 = viewGroup22;
                                                r4 = findViewById22;
                                                r5 = num;
                                                r6 = aVar22;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                sg.bigo.ads.common.utils.v.b(r2);
                                                r3.addView(r2, r4.getLayoutParams());
                                                ValueAnimator a3 = b.this.a(r5);
                                                TransitionSet transitionSet = new TransitionSet();
                                                transitionSet.addTransition(new ChangeBounds());
                                                transitionSet.setDuration(300L);
                                                transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.an.h() { // from class: sg.bigo.ads.n.c.b.3.1
                                                    final /* synthetic */ ValueAnimator a;

                                                    public AnonymousClass1(ValueAnimator a32) {
                                                        r2 = a32;
                                                    }

                                                    @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                                                    public final void onTransitionEnd(Transition transition) {
                                                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                                        b.this.a(r6);
                                                    }

                                                    @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                                                    public final void onTransitionStart(Transition transition) {
                                                        ValueAnimator valueAnimator = r2;
                                                        if (valueAnimator != null) {
                                                            valueAnimator.start();
                                                        }
                                                    }
                                                });
                                                TransitionManager.beginDelayedTransition(r3, transitionSet);
                                            }
                                        });
                                        c.a(c.this, anonymousClass42.d, 2, a);
                                        c cVar10 = c.this;
                                        cVar10.m = c.a(cVar10, cVar10.c, cVar10.r);
                                        oVar = c.this.m;
                                        if (oVar != null) {
                                            oVar.c();
                                        }
                                    }
                                }
                            } else {
                                this.e = true;
                                a(r4, realtimeBlurLinearLayout2, -234881024, c.this.k);
                            }
                            anonymousClass42 = this;
                            c.a(c.this, anonymousClass42.d, 2, a);
                            c cVar102 = c.this;
                            cVar102.m = c.a(cVar102, cVar102.c, cVar102.r);
                            oVar = c.this.m;
                            if (oVar != null) {
                            }
                        } else {
                            anonymousClass42 = this;
                        }
                        c.this.c();
                        return true;
                    }
                    cVar4 = cVar5.c;
                    str = "page is Paused";
                }
                cVar5.a(cVar4, str, 2);
                return false;
            }
        };
        cVar2.i = anonymousClass4;
        anonymousClass4.d();
    }

    public final void a(@NonNull View view, int i, @Nullable sg.bigo.ads.core.adview.h hVar, int i2) {
        ViewGroup viewGroup = this.F;
        if (viewGroup == null) {
            sg.bigo.ads.bn.a.a(0, "InterstitialNativeActivityImpl", "Failed to set ad click due to native ad view is null.");
        } else {
            sg.bigo.ads.y.a.a(viewGroup, view, i, hVar, i2);
        }
    }

    public final void e(boolean z) {
        if (f(z)) {
            l(d());
            super.d(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final View view, int i, boolean z, int i2, boolean z2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (!(view instanceof FrameLayout) && !(view instanceof RelativeLayout)) {
            sg.bigo.ads.bn.a.a(0, "InterstitialNativeActivityImpl", "Failed to update up or below area click due to unsupported view.");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        if (i > 0) {
            View view2 = new View(context);
            view2.setId(R.id.bigo_ad_interstitial_below_area_click);
            view2.setTag(25);
            if (viewGroup instanceof FrameLayout) {
                layoutParams2 = new FrameLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(context, i), 80);
            } else {
                if (viewGroup instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(context, i));
                    layoutParams3.addRule(12);
                    layoutParams2 = layoutParams3;
                }
                ViewGroup viewGroup2 = this.F;
                if (z) {
                    if (viewGroup2 != null) {
                        sg.bigo.ads.y.a.a(viewGroup2, view2, i3, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.a.6
                            @Override // sg.bigo.ads.core.adview.h
                            public final void a(int i5, int i6, int i7, int i8, int i9, int i10) {
                                Objects.toString(view);
                            }

                            @Override // sg.bigo.ads.core.adview.h
                            public final void a(sg.bigo.ads.an.i iVar, int i5, int i6) {
                                Objects.toString(view);
                            }
                        }, i4);
                    }
                } else if (viewGroup2 != null) {
                    a(view2, i3, ((t) this.A).K(), i4);
                }
            }
            viewGroup.addView(view2, layoutParams2);
            ViewGroup viewGroup22 = this.F;
            if (z) {
            }
        }
        if (i2 <= 0) {
            return;
        }
        View view3 = new View(context);
        view3.setTag(24);
        if (!(viewGroup instanceof FrameLayout)) {
            if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(context, i2));
            }
            if (z2) {
                if (this.E != null) {
                    sg.bigo.ads.y.a.a(this.F, view3, i3, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.a.7
                        @Override // sg.bigo.ads.core.adview.h
                        public final void a(int i5, int i6, int i7, int i8, int i9, int i10) {
                            Objects.toString(view);
                        }

                        @Override // sg.bigo.ads.core.adview.h
                        public final void a(sg.bigo.ads.an.i iVar, int i5, int i6) {
                            Objects.toString(view);
                        }
                    }, i4);
                    return;
                }
                return;
            } else {
                if (this.F != null) {
                    a(view3, i3, ((t) this.A).K(), i4);
                    return;
                }
                return;
            }
        }
        layoutParams = new FrameLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(context, i2));
        viewGroup.addView(view3, layoutParams);
        if (z2) {
        }
    }

    public void a(@NonNull ViewGroup viewGroup) {
        MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setTag(5);
        }
        if (this.i.a) {
            viewGroup.setTag(11);
            a(viewGroup, 1, ((t) this.A).K(), this.i.i);
            if (mediaView != null) {
                mediaView.b().a(false);
                return;
            }
            return;
        }
        if (!this.e) {
            a(viewGroup, 8, (sg.bigo.ads.core.adview.h) null, 0);
            return;
        }
        if (!(an() instanceof sg.bigo.ads.k.a) && mediaView != null) {
            a(mediaView, 8, ((t) this.A).K(), this.i.i);
            if (this.i.f) {
                mediaView.setMediaAreaClickable(true);
                mediaView.b().a(false);
            } else {
                mediaView.setMediaAreaClickable(false);
                mediaView.b().a(true);
            }
        }
        if (!(an() instanceof sg.bigo.ads.k.a)) {
            View findViewById = viewGroup.findViewById(R.id.inter_media_container);
            if (z()) {
                findViewById = viewGroup.findViewById(R.id.inter_media_layout);
            }
            if (findViewById != null) {
                findViewById.setTag(9);
                if (this.i.g) {
                    if (mediaView != null) {
                        mediaView.setOtherClickAreaClick(true);
                    }
                    a(findViewById, 8, ((t) this.A).K(), this.i.i);
                } else {
                    if (mediaView != null) {
                        mediaView.setOtherClickAreaClick(false);
                    }
                    a(findViewById, 8, r.H, 0);
                }
            }
        }
        if (an() instanceof sg.bigo.ads.k.a) {
            return;
        }
        View findViewById2 = viewGroup.findViewById(R.id.inter_ad_info);
        if (T() && aN()) {
            findViewById2 = viewGroup.findViewById(R.id.inter_ad_info_inner);
        }
        if (findViewById2 != null) {
            findViewById2.setTag(18);
            if (z()) {
                findViewById2 = viewGroup.findViewById(R.id.inter_media_container);
                findViewById2.setTag(18);
            }
            if (this.i.h) {
                a(findViewById2, 8, ((t) this.A).K(), this.i.i);
            } else {
                a(findViewById2, 8, r.H, 0);
            }
        }
    }

    private void a(sg.bigo.ads.ai.o oVar) {
        if (oVar == null) {
            return;
        }
        this.j = ((t) this.A).I();
        sg.bigo.ads.cp.a f = ((t) this.A).f();
        this.k = new f(oVar.a("video_play_page.gp_element"), oVar.a("video_play_page.gp_force_time"), f != null ? f.o() : "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r11 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ac, code lost:
    
        if (r11 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (r8 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(boolean z) {
        int i;
        sg.bigo.ads.ci.g gVar;
        boolean z2;
        boolean z3;
        int i2;
        if (this.u == null) {
            return;
        }
        if (!P() && !ay() && !this.q.get()) {
            return;
        }
        final sg.bigo.ads.n.c cVar = this.u;
        cVar.f = 0;
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) cVar.a.K().f();
        if (cVar.c.d() == 1) {
            i = cVar.c.i();
            cVar.f |= 2;
        } else {
            i = 0;
        }
        if (aVar.aZ()) {
            int d = cVar.b.d();
            if (z) {
                t tVar = cVar.a;
                sg.bigo.ads.f.c cVar2 = tVar.D;
                z3 = cVar2 != null && cVar2.a;
                sg.bigo.ads.f.a aVar2 = tVar.E;
                z2 = aVar2 != null && aVar2.a;
            } else {
                z2 = false;
                z3 = false;
            }
            if (!cVar.b.a()) {
                if (d != 1) {
                    if (d != 2) {
                        if (d == 3) {
                            if (!z3) {
                            }
                            cVar.f = 0;
                        }
                    }
                }
                i += cVar.b.i();
                i2 = cVar.f | 1;
            } else if (d == 1) {
                i += cVar.b.i();
                i2 = cVar.f | 13;
            } else if (d == 2 && !z3) {
                i += cVar.b.i();
                i2 = cVar.f | 9;
            } else if (d == 3) {
                if (!z3) {
                }
            }
            cVar.f = i2;
        }
        if (cVar.f <= 0) {
            return;
        }
        sg.bigo.ads.ai.n d2 = aVar.d();
        int x = aVar.x();
        if (d2 != null) {
            int b = d2.b();
            if (b != 3) {
                if (b == 4) {
                    if (x == 1) {
                        gVar = new sg.bigo.ads.ci.g("10000-10003", "10000-10003-10001", 17, d2);
                    } else if (x == 2) {
                        gVar = new sg.bigo.ads.ci.g("10000-10004", "10000-10004-10001", 18, d2);
                    }
                }
            } else if (x == 1) {
                gVar = new sg.bigo.ads.ci.g("10000-10001", "10000-10001-10001", 15, d2);
            } else if (x == 2) {
                gVar = new sg.bigo.ads.ci.g("10000-10002", "10000-10002-10001", 16, d2);
            }
            if (gVar == null) {
                cVar.o = gVar.l();
                IconAdsRequest.a aVar3 = new IconAdsRequest.a();
                aVar3.a = gVar;
                IconAdsRequest.a withSlotId = aVar3.withSlotId(gVar.l());
                withSlotId.e = i;
                withSlotId.c = cVar.f;
                withSlotId.b = aVar;
                withSlotId.f = cVar.g;
                withSlotId.d = 1;
                sg.bigo.ads.api.b T = cVar.a.T();
                if (T != null) {
                    withSlotId.withAge(T.c).withActivatedTime(T.e).withGender(T.d);
                }
                IconAdsLoader.a aVar4 = new IconAdsLoader.a();
                aVar4.a = new AdLoadListener<IconAds>() { // from class: sg.bigo.ads.n.c.2
                    public AnonymousClass2() {
                    }

                    @Override // sg.bigo.ads.api.AdLoadListener
                    public final /* synthetic */ void onAdLoaded(@NonNull IconAds iconAds) {
                        IconAds iconAds2 = iconAds;
                        c cVar3 = c.this;
                        if (cVar3.a() || iconAds2 == null) {
                            return;
                        }
                        cVar3.e = iconAds2;
                        iconAds2.setAdInteractionListener(cVar3.w);
                        c.b(cVar3.k, cVar3.i);
                        c.b(cVar3.j, cVar3.h);
                        if (iconAds2 instanceof sg.bigo.ads.e.a) {
                            for (sg.bigo.ads.z.c cVar4 : ((sg.bigo.ads.e.a) iconAds2).a) {
                                sg.bigo.ads.cp.a aVar5 = (sg.bigo.ads.cp.a) cVar4.f();
                                if (aVar5 != null) {
                                    o.a aD = aVar5.aD();
                                    String c = aD != null ? aD.c() : null;
                                    if (URLUtil.isNetworkUrl(c)) {
                                        if (sg.bigo.ads.ai.k.a.n().a(9) && URLUtil.isHttpUrl(c)) {
                                            sg.bigo.ads.da.b.a(aVar5, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10220, "Invalid http url: ".concat(String.valueOf(c)));
                                        } else {
                                            sg.bigo.ads.bj.e.b(cVar4.b.e, sg.bigo.ads.bp.e.i(), c, aVar5.am(), cVar4);
                                        }
                                    }
                                }
                            }
                        }
                    }

                    @Override // sg.bigo.ads.api.AdLoadListener
                    public final void onError(@NonNull AdError adError) {
                        adError.getCode();
                        adError.getMessage();
                    }
                };
                aVar4.build().loadAd((IconAdsLoader) withSlotId.build());
                return;
            }
            return;
        }
        gVar = null;
        if (gVar == null) {
        }
    }

    public final void a(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.K) {
            try {
                for (Object obj : objArr) {
                    if (obj != null) {
                        this.K.put(obj, 1);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.q.c.b
    public boolean a(@NonNull MotionEvent motionEvent, @Nullable c.a aVar, int i) {
        boolean b;
        AdCountDownButton adCountDownButton = this.C;
        boolean z = false;
        if (adCountDownButton != null) {
            if (motionEvent == null || adCountDownButton.f == null) {
                b = false;
            } else {
                b = sg.bigo.ads.common.utils.v.b(adCountDownButton.f, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            }
            if (b) {
                if (motionEvent.getAction() == 1) {
                    if (aVar != null && aVar.a()) {
                        z = true;
                    }
                    if (z && this.S == null) {
                        if (this.R) {
                            this.S = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AdCountDownButton adCountDownButton2 = a.this.C;
                                    if (adCountDownButton2 != null) {
                                        adCountDownButton2.a();
                                    }
                                }
                            };
                        } else {
                            AdCountDownButton adCountDownButton2 = this.C;
                            if (adCountDownButton2 != null) {
                                adCountDownButton2.a();
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean a(Object obj, Runnable runnable) {
        Integer num;
        if (obj == null || runnable == null) {
            return false;
        }
        synchronized (this.K) {
            num = this.K.get(obj);
        }
        if (num == null) {
            runnable.run();
            return false;
        }
        synchronized (this.L) {
            try {
                WeakHashMap<Object, Runnable> weakHashMap = this.L.get(num);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap<>();
                    this.L.put(num, weakHashMap);
                }
                weakHashMap.put(obj, runnable);
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void y() {
    }
}
