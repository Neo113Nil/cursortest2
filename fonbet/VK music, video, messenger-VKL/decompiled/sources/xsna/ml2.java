package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.sidecontrols.api.AnimatedSharingController;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ml2;

/* compiled from: AnimatedSharingControlView.kt */
/* loaded from: classes5.dex */
public final class ml2 extends FrameLayout implements AnimatedSharingController.a, tl2 {
    public final AnimatedSharingController b;
    public final Handler c;
    public final LottieAnimationView d;
    public final LottieAnimationView e;
    public final AppCompatImageView f;
    public final TextView g;
    public a h;
    public e6 i;
    public kl2 j;
    public List<Bitmap> k;
    public boolean l;
    public boolean m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;

    /* compiled from: AnimatedSharingControlView.kt */
    public static abstract class a {

        /* compiled from: AnimatedSharingControlView.kt */
        /* renamed from: xsna.ml2$a$a, reason: collision with other inner class name */
        public static final class C3349a extends a {
            public static final C3349a a = new C3349a();
        }

        /* compiled from: AnimatedSharingControlView.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: AnimatedSharingControlView.kt */
        public static final class c extends a {
            public static final c a = new c();
        }

        /* compiled from: AnimatedSharingControlView.kt */
        public static final class d extends a {
            public static final d a = new d();
        }
    }

    public ml2(Context context, AnimatedSharingController animatedSharingController) {
        super(context, null);
        this.b = animatedSharingController;
        this.c = new Handler(Looper.getMainLooper());
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.d = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = new LottieAnimationView(context);
        this.e = lottieAnimationView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.f = appCompatImageView;
        TextView textView = new TextView(context);
        this.g = textView;
        this.h = a.c.a;
        this.k = EmptyList.b;
        this.n = pn00.k(new Pair(1, Integer.valueOf(R.raw.sharing_control_1_avatar_animation_in)), new Pair(2, Integer.valueOf(R.raw.sharing_control_2_avatar_animation_in)), new Pair(3, Integer.valueOf(R.raw.sharing_control_3_avatar_animation_in)));
        this.o = pn00.k(new Pair(1, Integer.valueOf(R.raw.sharing_control_1_avatar_animation_out)), new Pair(2, Integer.valueOf(R.raw.sharing_control_2_avatar_animation_out)), new Pair(3, Integer.valueOf(R.raw.sharing_control_3_avatar_animation_out)));
        this.p = pn00.k(new Pair(2, Integer.valueOf(R.raw.sharing_control_2_avatar_animation_in_without_border)), new Pair(3, Integer.valueOf(R.raw.sharing_control_3_avatar_animation_in_without_border)));
        this.q = pn00.k(new Pair(2, Integer.valueOf(R.raw.sharing_control_2_avatar_animation_out_without_border)), new Pair(3, Integer.valueOf(R.raw.sharing_control_3_avatar_animation_out_without_border)));
        setId(R.id.fullscreen_clip_overlay_animated_share_container);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = iah0.a(4);
        setLayoutParams(marginLayoutParams);
        setBackground(m33.a(R.drawable.highlight_radius_8_black, getContext()));
        setClickable(true);
        setFocusable(true);
        setContentDescription(getContext().getString(R.string.clips_accessibility_side_share));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.clips_controls_icon_size);
        for (LottieAnimationView lottieAnimationView3 : e43.l(lottieAnimationView, lottieAnimationView2)) {
            lottieAnimationView3.setRepeatCount(0);
            lottieAnimationView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 49;
            lottieAnimationView3.setLayoutParams(layoutParams);
            lottieAnimationView3.setCacheComposition(false);
            lottieAnimationView3.setVisibility(8);
        }
        appCompatImageView.setImageDrawable(m33.a(R.drawable.vk_icon_share_alt_shadow_medium_48, appCompatImageView.getContext()));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams2.gravity = 49;
        appCompatImageView.setLayoutParams(layoutParams2);
        appCompatImageView.setVisibility(0);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, textView.getResources().getDimensionPixelSize(R.dimen.clips_controls_btn_container_height));
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextAppearance(R.style.VkUiTypography_FootnoteCapsMedium);
        TypedValue typedValue = new TypedValue();
        textView.getContext().getTheme().resolveAttribute(R.attr.vk_ui_text_contrast, typedValue, true);
        textView.setTextColor(typedValue.data);
        textView.setShadowLayer(4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, textView.getContext().getColor(R.color.vk_black_alpha12));
        textView.setGravity(80);
        textView.setVisibility(8);
        addView(lottieAnimationView2);
        addView(lottieAnimationView);
        addView(appCompatImageView);
        addView(textView);
    }

    @Override // xsna.tl2
    public final void a(String str, boolean z) {
        int i = z ? 0 : 8;
        TextView textView = this.g;
        textView.setVisibility(i);
        if (z) {
            textView.setText(str);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    @Override // com.vk.sidecontrols.api.AnimatedSharingController.a
    public final void b(ArrayList arrayList, final long j, final AnimatedSharingController.Strategy strategy) {
        int intValue;
        if (isAttachedToWindow() && !arrayList.isEmpty() && getGlobalVisibleRect(new Rect())) {
            d();
            this.l = false;
            this.m = false;
            this.k = arrayList;
            AnimatedSharingController.Strategy strategy2 = AnimatedSharingController.Strategy.LIKE_AND_REWATCH_ONCE_WITH_STOP_FRAME;
            final boolean z = strategy != strategy2;
            this.h = a.C3349a.a;
            this.l = false;
            LottieAnimationView lottieAnimationView = this.d;
            lottieAnimationView.W();
            lottieAnimationView.o0();
            lottieAnimationView.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            e();
            int size = arrayList.size();
            if (strategy == strategy2) {
                if (size > 3) {
                    size = 3;
                }
                Integer num = (Integer) this.p.get(Integer.valueOf(size));
                intValue = num != null ? num.intValue() : R.raw.sharing_control_2_avatar_animation_in_without_border;
            } else {
                if (size > 3) {
                    size = 3;
                }
                Integer num2 = (Integer) this.n.get(Integer.valueOf(size));
                intValue = num2 != null ? num2.intValue() : R.raw.sharing_control_1_avatar_animation_in;
            }
            lottieAnimationView.setImageAssetDelegate(new ll2(strategy, arrayList, this));
            lottieAnimationView.setAnimation(intValue);
            lottieAnimationView.U(new nl2(new gzs() { // from class: xsna.jl2
                @Override // xsna.gzs
                public final Object invoke() {
                    ml2 ml2Var = ml2.this;
                    if (!ml2Var.l && epx.f(ml2Var.h, ml2.a.C3349a.a) && !ml2Var.l) {
                        ml2Var.h = ml2.a.d.a;
                        ml2Var.b.e();
                        if (z) {
                            long j2 = j;
                            if (j2 > 0) {
                                e6 e6Var = new e6(1, ml2Var, strategy);
                                ml2Var.i = e6Var;
                                ml2Var.c.postDelayed(e6Var, j2);
                            }
                        }
                    }
                    return s3q0.a;
                }
            }, new l1(this, 3)));
            kl2 kl2Var = this.j;
            if (kl2Var != null) {
                lottieAnimationView.removeCallbacks(kl2Var);
            }
            kl2 kl2Var2 = new kl2(this, 0);
            this.j = kl2Var2;
            lottieAnimationView.postDelayed(kl2Var2, 300L);
        }
    }

    @Override // com.vk.sidecontrols.api.AnimatedSharingController.a
    public final void c() {
        if (isAttachedToWindow()) {
            d();
            g(false);
        }
    }

    public final void d() {
        e();
        kl2 kl2Var = this.j;
        if (kl2Var != null) {
            this.d.removeCallbacks(kl2Var);
        }
        this.j = null;
        f();
        this.l = true;
        this.m = true;
        this.f.setVisibility(0);
        this.h = a.c.a;
    }

    public final void e() {
        e6 e6Var = this.i;
        if (e6Var != null) {
            this.c.removeCallbacks(e6Var);
        }
        this.i = null;
    }

    public final void f() {
        for (LottieAnimationView lottieAnimationView : e43.l(this.d, this.e)) {
            lottieAnimationView.o0();
            lottieAnimationView.W();
            lottieAnimationView.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            lottieAnimationView.setVisibility(8);
            lottieAnimationView.setAlpha(1.0f);
        }
    }

    public final void g(boolean z) {
        this.h = a.c.a;
        this.k = EmptyList.b;
        e();
        f();
        this.f.setVisibility(0);
        if (z && !this.l && !this.m) {
            this.b.b();
        }
        this.l = false;
        this.m = false;
    }

    public final TextView getLabelView() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatedSharingController animatedSharingController = this.b;
        animatedSharingController.c();
        animatedSharingController.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.b.a(this);
        e();
        super.onDetachedFromWindow();
    }

    @Override // xsna.tl2
    public void setControlOnClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    @Override // xsna.tl2
    public void setControlOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        setOnLongClickListener(onLongClickListener);
    }

    @Override // xsna.tl2
    public View getAnimatedSharingView() {
        return this;
    }

    @Override // xsna.tl2
    public void setVisibility(boolean z) {
    }
}
