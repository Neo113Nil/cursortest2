package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.sls;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Pair;
import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchModalView;

/* loaded from: classes11.dex */
public abstract class mga1 {
    public static final Long a(String str) {
        if (str != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                Date parse = simpleDateFormat.parse(str);
                Date parse2 = simpleDateFormat.parse("00:00:00");
                if (parse != null && parse2 != null) {
                    return Long.valueOf(parse.getTime() - parse2.getTime());
                }
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public static final Integer b(String str) {
        if (str != null) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static final int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4);
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final Bitmap.Config d(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public static final boolean e(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    public static void g(final ViewGroup viewGroup, final FullscreenDestinationSearchModalView fullscreenDestinationSearchModalView, final View view, final View view2, boolean z, final sls slsVar, final sls slsVar2) {
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        final FrameLayout frameLayout = new FrameLayout(fullscreenDestinationSearchModalView.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(Color.argb((int) (Color.alpha(ModalContentViewContainer.BASE_SHADOW_COLOR) * 0.4f), Color.red(ModalContentViewContainer.BASE_SHADOW_COLOR), Color.green(ModalContentViewContainer.BASE_SHADOW_COLOR), Color.blue(ModalContentViewContainer.BASE_SHADOW_COLOR)));
        viewGroup.addView(frameLayout, 0);
        final ImageView imageView = new ImageView(fullscreenDestinationSearchModalView.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(view2.getWidth(), view2.getHeight()));
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageBitmap(xw31.t(view2));
        viewGroup.addView(imageView);
        Point d = ltb1.d(viewGroup);
        Point d2 = ltb1.d(fullscreenDestinationSearchModalView);
        Point d3 = ltb1.d(view2);
        Point d4 = ltb1.d(view);
        int i = d3.x;
        int i2 = d2.x;
        final float f = (i - i2) - (d4.x - i2);
        int i3 = d3.y;
        int i4 = d2.y;
        final float f2 = (i3 - i4) - (d4.y - i4);
        final float width = fullscreenDestinationSearchModalView.getWidth() - (view.getWidth() - view2.getWidth());
        final float width2 = fullscreenDestinationSearchModalView.getWidth();
        final float f3 = d4.x - d2.x;
        final float f4 = d4.y - d2.y;
        final float width3 = view2.getWidth() + f3;
        final float width4 = fullscreenDestinationSearchModalView.getWidth();
        final float height = view2.getHeight() + f4;
        final float height2 = fullscreenDestinationSearchModalView.getHeight();
        int i5 = d3.x;
        int i6 = d.x;
        final float f5 = i5 - i6;
        final float f6 = d4.x - i6;
        int i7 = d3.y;
        int i8 = d.y;
        final float f7 = i7 - i8;
        final float f8 = d4.y - i8;
        final float width5 = view2.getWidth();
        final float width6 = view.getWidth();
        final float height3 = view2.getHeight();
        final float height4 = view.getHeight();
        final float height5 = view2.getHeight() / view.getHeight();
        Pair pair = z ? new Pair(valueOf2, valueOf) : new Pair(valueOf, valueOf2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Number) pair.c()).floatValue(), ((Number) pair.f()).floatValue());
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(new OvershootInterpolator(0.6f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xoo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                frameLayout.setAlpha(floatValue);
                float c = ltb1.c(floatValue, f, 0.0f);
                View view3 = fullscreenDestinationSearchModalView;
                view3.setTranslationX(c);
                view3.setTranslationY(ltb1.c(floatValue, f2, 0.0f));
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                if (layoutParams == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                }
                layoutParams.width = m810.b(ltb1.c(floatValue, width, width2));
                view3.setLayoutParams(layoutParams);
                float max = Math.max(0.0f, Math.min(1.0f, floatValue));
                view3.setClipBounds(new Rect(m810.b(ltb1.c(max, f3, 0.0f)), m810.b(ltb1.c(max, f4, 0.0f)), m810.b(ltb1.c(max, width3, width4)), m810.b(ltb1.c(max, height, height2))));
                View view4 = view;
                view4.setAlpha(floatValue);
                view4.setScaleY(ltb1.c(floatValue, height5, 1.0f));
                ImageView imageView2 = imageView;
                imageView2.setAlpha(1.0f - floatValue);
                imageView2.setX(ltb1.c(floatValue, f5, f6));
                imageView2.setY(ltb1.c(floatValue, f7, f8));
                ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                if (layoutParams2 == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                }
                layoutParams2.width = m810.b(ltb1.c(floatValue, width5, width6));
                layoutParams2.height = m810.b(ltb1.c(floatValue, height3, height4));
                imageView2.setLayoutParams(layoutParams2);
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.address.design.ExpandableTransitionAnimation$startTransition$lambda$2$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                sls.this.invoke();
                imageView.setVisibility(0);
                view2.setVisibility(4);
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.address.design.ExpandableTransitionAnimation$startTransition$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                viewGroup.removeView(imageView);
                viewGroup.removeView(frameLayout);
                view2.setVisibility(0);
                slsVar2.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
    }
}
