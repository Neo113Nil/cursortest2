package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.stories.design.view.sticker.TemplateButton;
import com.vk.stories.design.view.viewer.AnimatedSubtitleView;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.Collections;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: StoryStickersGuidesDrawer.kt */
/* loaded from: classes16.dex */
public class pim0 extends zh {
    public String A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ValueAnimator E;
    public ValueAnimator F;
    public Bitmap G;
    public Bitmap H;
    public final Paint I;
    public final Paint J;
    public final boolean K;
    public x0n0 L;
    public final r7z M;
    public final Paint N;
    public final xn4 O;
    public vn00 P;
    public final float y;
    public Bitmap z;

    /* compiled from: StoryStickersGuidesDrawer.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            gzs<s3q0> gzsVar = this.b;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public pim0(View view, cng0 cng0Var) {
        super(view, cng0Var);
        this.y = y8g0.b(R.dimen.guidelines_story_warning_space);
        this.A = "default name";
        Paint paint = new Paint(2);
        paint.setAlpha(0);
        this.I = paint;
        Paint paint2 = new Paint(2);
        paint2.setAlpha(0);
        this.J = paint2;
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        this.K = true;
        this.M = r7z.e;
        Paint paint3 = new Paint(this.e);
        paint3.setColor(e43.a.getColor(R.color.vk_white));
        this.N = paint3;
        xn4 xn4Var = new xn4();
        xn4Var.a = null;
        xn4Var.b = null;
        xn4Var.c = null;
        xn4Var.d = null;
        this.O = xn4Var;
        this.P = new vn00(Math.max(y8g0.b(R.dimen.guidelines_story_bot_space), zwt0.b(view.getContext())), y8g0.b(R.dimen.guidelines_story_left_right_space), y8g0.b(R.dimen.guidelines_story_top_space), y8g0.b(R.dimen.guidelines_story_left_right_space));
    }

    public static int C(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return view.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
    }

    public void B(Canvas canvas) {
        float f = this.P.c;
        this.M.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.i.a, f);
        E(canvas, o());
    }

    public final void D() {
        int i = this.i.a;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        View view = this.a;
        View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.stub_story_view_header, (ViewGroup) null);
        ((StoryProgressView) inflate.findViewById(R.id.stub_story_view_progress)).setProgress(0.5f);
        ((TextView) inflate.findViewById(R.id.stub_story_view_name_text)).setText(this.A);
        AnimatedSubtitleView animatedSubtitleView = (AnimatedSubtitleView) inflate.findViewById(R.id.animated_subtitle);
        x0n0 x0n0Var = this.L;
        if (x0n0Var != null) {
            animatedSubtitleView.setVisibility(0);
            animatedSubtitleView.setItems(Collections.singletonList(x0n0Var));
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.stub_story_view_avatar_image);
        Bitmap bitmap = this.z;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        inflate.measure(makeMeasureSpec, makeMeasureSpec2);
        inflate.layout(0, 0, i, inflate.getMeasuredHeight());
        int measuredHeight = inflate.getMeasuredHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.G = Bitmap.createBitmap(i, measuredHeight, config);
        Bitmap bitmap2 = this.G;
        if (bitmap2 == null) {
            bitmap2 = null;
        }
        inflate.draw(new Canvas(bitmap2));
        View inflate2 = LayoutInflater.from(view.getContext()).inflate(this.K ? R.layout.stub_story_view_footer_like_at_top : R.layout.stub_story_view_footer, (ViewGroup) null);
        TemplateButton templateButton = (TemplateButton) inflate2.findViewById(R.id.template_button_new);
        View findViewById = inflate2.findViewById(R.id.tv_action);
        View findViewById2 = inflate2.findViewById(R.id.iv_reaction_menu_button);
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_NEW_REACTIONS;
        storiesFeatures.getClass();
        bwt0.p0(findViewById2, com.vk.toggle.b.A.a(storiesFeatures));
        bwt0.p0(templateButton, this.L != null);
        inflate2.measure(makeMeasureSpec, makeMeasureSpec2);
        inflate2.layout(0, 0, i, inflate2.getMeasuredHeight());
        vn00 vn00Var = this.P;
        this.P = new vn00(C(templateButton) + C(findViewById), vn00Var.b, inflate.getMeasuredHeight(), vn00Var.d);
        this.H = Bitmap.createBitmap(i, inflate2.getMeasuredHeight(), config);
        Bitmap bitmap3 = this.H;
        inflate2.draw(new Canvas(bitmap3 != null ? bitmap3 : null));
    }

    public final void E(Canvas canvas, emv emvVar) {
        if (emvVar.d()) {
            zh.j(canvas, this.M, this.e);
        }
    }

    public final void F(boolean z, Paint paint, int i, gzs<s3q0> gzsVar) {
        ValueAnimator valueAnimator = z ? this.E : this.F;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(paint.getAlpha(), i);
        ofInt.addUpdateListener(new y7q(2, paint, this));
        ofInt.setDuration((long) Math.abs(((i - paint.getAlpha()) / 127) * 200));
        ofInt.addListener(new a(gzsVar));
        ofInt.start();
        if (z) {
            this.E = ofInt;
        } else {
            this.F = ofInt;
        }
    }

    @Override // xsna.zh, xsna.ial0
    public final void b() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.F;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        t();
        xn4 xn4Var = this.O;
        xn4Var.a = null;
        xn4Var.b = null;
        xn4Var.c = null;
        xn4Var.d = null;
        this.I.setAlpha(0);
        this.J.setAlpha(0);
        this.a.invalidate();
    }

    @Override // xsna.ial0
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.c) {
            Paint paint = this.I;
            if (paint.getAlpha() > 0 && (bitmap2 = this.G) != null) {
                canvas.drawBitmap(bitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
            }
        }
        if (this.c) {
            Paint paint2 = this.J;
            if (paint2.getAlpha() > 0 && (bitmap = this.H) != null) {
                canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.i.b - bitmap.getHeight(), paint2);
            }
        }
        B(canvas);
        x(canvas);
        y(canvas);
        z(canvas);
        i(canvas);
        A(canvas);
    }

    @Override // xsna.zh, xsna.ial0
    public final void g(int i, int i2, int i3, int i4) {
        super.g(i, i2, i3, i4);
        if (this.B) {
            return;
        }
        D();
        this.B = true;
    }

    @Override // xsna.ial0
    public final void h(nov novVar, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        double d;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        x5l0 x5l0Var = this.j;
        x5l0Var.b.set(novVar.getLeft(), novVar.getTop(), novVar.getRight(), novVar.getBottom());
        boolean z4 = this.C;
        RectF rectF = x5l0Var.b;
        boolean z5 = rectF.top <= this.P.c && rectF.bottom > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z4 != z5) {
            F(true, this.I, z5 ? 127 : 0, new dqc0(this, z5, 1));
        }
        wah0 wah0Var = this.i;
        boolean z6 = this.D;
        RectF rectF2 = x5l0Var.b;
        float f6 = rectF2.bottom;
        float f7 = wah0Var.b;
        boolean z7 = f6 >= f7 - this.P.a && rectF2.top < f7;
        if (z6 != z7) {
            F(false, this.J, z7 ? 127 : 0, new wl30(this, z7, 1));
        }
        VelocityTracker velocityTracker = this.d;
        velocityTracker.addMovement(motionEvent);
        velocityTracker.computeCurrentVelocity(1);
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        double d3 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        double d4 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        while (i2 < pointerCount) {
            double xVelocity = velocityTracker.getXVelocity(i2);
            double yVelocity = velocityTracker.getYVelocity(i2);
            d2 += xVelocity;
            d3 += yVelocity;
            d4 += StrictMath.sqrt(StrictMath.pow(yVelocity, 2.0d) + StrictMath.pow(xVelocity, 2.0d));
            i2++;
            velocityTracker = velocityTracker;
        }
        vru vruVar = this.b;
        float f8 = vruVar.e;
        int i3 = vruVar.d;
        boolean z8 = d4 < ((double) f8);
        boolean z9 = (r() && s()) ? false : true;
        int pointerCount2 = motionEvent.getPointerCount();
        cov covVar = this.p;
        boolean z10 = pointerCount2 == 2 && (d4 < ((double) vruVar.e) || covVar.b());
        if (z8) {
            RectF rectF3 = x5l0Var.b;
            RectF rectF4 = x5l0Var.a;
            PointF a2 = x5l0.a(rectF3);
            boolean r = r();
            float f9 = this.y;
            z = z10;
            xn4 xn4Var = this.O;
            z2 = z8;
            if (r) {
                float f10 = a2.x;
                i = i3;
                int pointerCount3 = motionEvent.getPointerCount();
                z3 = z9;
                wah0 wah0Var2 = this.i;
                f = f9;
                float f11 = wah0Var2.a - this.P.d;
                float f12 = wah0Var2.c;
                d = d2;
                boolean z11 = pointerCount3 >= novVar.getMovePointersCount() && zh.p(this, f10, this.i.c, x5l0.a(rectF4).x);
                boolean canStickToSafeZoneGuideLines = novVar.getCanStickToSafeZoneGuideLines();
                if (z11) {
                    this.s = f12;
                    l().b(true);
                    f4 = f10 - f12;
                    u(false);
                    w();
                } else {
                    f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                if (canStickToSafeZoneGuideLines && zh.p(this, rectF3.left, this.P.b, rectF4.left)) {
                    this.s = this.P.b;
                    m().b(true);
                    f4 = rectF3.left - this.P.b;
                    u(false);
                    w();
                }
                if (canStickToSafeZoneGuideLines && zh.p(this, rectF3.right, f11, rectF4.right)) {
                    this.s = f11;
                    n().b(true);
                    f4 = rectF3.right - f11;
                    u(false);
                    w();
                }
                if (novVar.getCanStickToSafeZoneGuideLines()) {
                    vn00 vn00Var = this.P;
                    float f13 = vn00Var.b;
                    float f14 = this.i.a - vn00Var.d;
                    float f15 = f / 2;
                    boolean q = zh.q(rectF3.left, f13 + f15, f15);
                    f5 = f4;
                    boolean q2 = zh.q(rectF3.right, f14 - f15, f15);
                    if (!q || m().d()) {
                        m().c(false);
                        xn4Var.c = null;
                    } else {
                        m().c(true);
                        xn4Var.c = Float.valueOf(1 - ((rectF3.left - f13) / f));
                    }
                    if (!q2 || n().d()) {
                        n().c(false);
                        xn4Var.d = null;
                    } else {
                        n().c(true);
                        xn4Var.d = Float.valueOf(1 - ((f14 - rectF3.right) / f));
                    }
                } else {
                    f5 = f4;
                }
                f2 = f5;
            } else {
                i = i3;
                z3 = z9;
                f = f9;
                d = d2;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (s()) {
                float f16 = a2.y;
                int pointerCount4 = motionEvent.getPointerCount();
                wah0 wah0Var3 = this.i;
                float f17 = wah0Var3.b - this.P.a;
                float f18 = wah0Var3.d;
                boolean z12 = pointerCount4 >= novVar.getMovePointersCount() && zh.p(this, f16, this.i.d, x5l0.a(rectF4).y);
                boolean canStickToSafeZoneGuideLines2 = novVar.getCanStickToSafeZoneGuideLines();
                if (z12) {
                    this.t = f18;
                    l().c(true);
                    f3 = f16 - f18;
                    v(false);
                    w();
                } else {
                    f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                if (canStickToSafeZoneGuideLines2 && zh.p(this, rectF3.top, this.P.c, rectF4.top)) {
                    this.t = this.P.c;
                    o().b(true);
                    f3 = novVar.getTop() - this.P.c;
                    v(false);
                    w();
                }
                if (canStickToSafeZoneGuideLines2 && zh.p(this, rectF3.bottom, f17, rectF4.bottom)) {
                    this.t = f17;
                    k().b(true);
                    float bottom = novVar.getBottom() - f17;
                    v(false);
                    w();
                    f3 = bottom;
                }
                if (novVar.getCanStickToSafeZoneGuideLines()) {
                    vn00 vn00Var2 = this.P;
                    float f19 = vn00Var2.c;
                    float f20 = this.i.b - vn00Var2.a;
                    float f21 = f / 2;
                    boolean q3 = zh.q(rectF3.top, f19 + f21, f21);
                    boolean q4 = zh.q(rectF3.bottom, f20 - f21, f21);
                    if (!q3 || o().d()) {
                        o().c(false);
                        xn4Var.a = null;
                    } else {
                        o().c(true);
                        xn4Var.a = Float.valueOf(1 - ((rectF3.top - f19) / f));
                    }
                    if (!q4 || k().d()) {
                        k().c(false);
                        xn4Var.b = null;
                    } else {
                        k().c(true);
                        xn4Var.b = Float.valueOf(1 - ((f20 - rectF3.bottom) / f));
                    }
                }
            } else {
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            novVar.e(-f2, -f3);
        } else {
            z = z10;
            z2 = z8;
            i = i3;
            z3 = z9;
            d = d2;
        }
        if (z3) {
            int pointerCount5 = motionEvent.getPointerCount();
            boolean r2 = r();
            kmr0 kmr0Var = this.h;
            if (!r2) {
                double d5 = kmr0Var.a + d;
                kmr0Var.a = d5;
                if (Math.abs(d5) > i * pointerCount5) {
                    kmr0Var.a = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                    u(true);
                    l().b(false);
                    m().a();
                    n().a();
                }
            }
            if (!s()) {
                double d6 = kmr0Var.b + d3;
                kmr0Var.b = d6;
                if (Math.abs(d6) > pointerCount5 * i) {
                    kmr0Var.b = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                    v(true);
                    l().c(false);
                    o().a();
                    k().a();
                }
            }
        }
        if (z) {
            covVar.a(novVar);
        } else {
            covVar.reset();
        }
        if (!z2 && !z3 && !z) {
            t();
        }
        x5l0Var.a.set(x5l0Var.b);
    }

    public void x(Canvas canvas) {
        wah0 wah0Var = this.i;
        float f = wah0Var.b - this.P.a;
        this.M.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, wah0Var.a, f);
        E(canvas, k());
    }

    public void y(Canvas canvas) {
        float f = this.P.b;
        this.M.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.i.b);
        E(canvas, m());
    }

    public void z(Canvas canvas) {
        wah0 wah0Var = this.i;
        float f = wah0Var.a - this.P.d;
        this.M.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, wah0Var.b);
        E(canvas, n());
    }

    public void A(Canvas canvas) {
    }
}
