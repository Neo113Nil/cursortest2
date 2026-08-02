package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.vkontakte.android.R;
import java.util.WeakHashMap;

/* compiled from: CameraRepostOnboardingDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class kl9 {
    public final v76 a;
    public final h7v b;
    public LottieAnimationView c;
    public TextView d;
    public View e;
    public final pu f = new pu(this, 14);

    public kl9(v76 v76Var, h7v h7vVar) {
        this.a = v76Var;
        this.b = h7vVar;
    }

    public static final void a(kl9 kl9Var, nov novVar) {
        kl9Var.getClass();
        v76 v76Var = kl9Var.a;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(v76Var.b().getContext());
        int a = iah0.a(100);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        float f = a / 2;
        layoutParams.setMargins((int) (novVar.getCenterX() - f), (int) (novVar.getCenterY() - f), 0, 0);
        lottieAnimationView.setLayoutParams(layoutParams);
        lottieAnimationView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.setAnimation("tap_fill.json");
        lottieAnimationView.m0();
        kl9Var.c = lottieAnimationView;
        lottieAnimationView.U(new hl9(kl9Var, 0));
        ((y440) v76Var).addView(kl9Var.c);
    }

    public static final void b(kl9 kl9Var) {
        kl9Var.getClass();
        v76 v76Var = kl9Var.a;
        TextView textView = new TextView(v76Var.getRequireContext());
        textView.setId(View.generateViewId());
        textView.setText(v76Var.getRequireContext().getString(R.string.repost_redesign_onboarding));
        float f = 16;
        float f2 = 8;
        textView.setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
        textView.setBackgroundColor(dhr0.Y(R.attr.vk_ui_overlay_primary, bwt0.u(textView.getContext())));
        textView.setTextAppearance(R.style.VkUiTypography_Caption2);
        textView.setTextColor(krv0.l(R.attr.vk_ui_text_contrast));
        textView.setOutlineProvider(new t0w0(6, cn70.c(10), false, false));
        textView.setClipToOutline(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        textView.setTextAlignment(4);
        textView.setLayoutParams(layoutParams);
        kl9Var.d = textView;
        LottieAnimationView lottieAnimationView = kl9Var.c;
        if (lottieAnimationView != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (lottieAnimationView.isLaidOut()) {
                TextView textView2 = kl9Var.d;
                if (textView2 != null) {
                    textView2.setTranslationY(lottieAnimationView.getBottom());
                }
            } else {
                lottieAnimationView.addOnLayoutChangeListener(new il9(kl9Var, lottieAnimationView));
            }
        }
        ((ViewGroup) v76Var.b()).addView(kl9Var.d);
    }

    public static final void c(final kl9 kl9Var) {
        kl9Var.getClass();
        v76 v76Var = kl9Var.a;
        View view = new View(v76Var.getRequireContext());
        kl9Var.e = view;
        u11.h(-1, -1, view);
        View view2 = kl9Var.e;
        if (view2 != null) {
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.gl9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    kl9 kl9Var2 = kl9.this;
                    v76 v76Var2 = kl9Var2.a;
                    View view4 = kl9Var2.e;
                    if (view4 != null) {
                        view4.setOnTouchListener(null);
                    }
                    ((ViewGroup) v76Var2.b()).removeView(kl9Var2.e);
                    kl9Var2.e = null;
                    LottieAnimationView lottieAnimationView = kl9Var2.c;
                    if (lottieAnimationView != null) {
                        lottieAnimationView.o0();
                    }
                    y440 y440Var = (y440) v76Var2;
                    y440Var.removeView(kl9Var2.c);
                    kl9Var2.c = null;
                    y440Var.removeView(kl9Var2.d);
                    kl9Var2.d = null;
                    return false;
                }
            });
        }
        ((ViewGroup) v76Var.b()).addView(kl9Var.e);
    }
}
