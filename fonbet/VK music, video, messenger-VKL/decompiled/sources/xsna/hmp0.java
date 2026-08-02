package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: TransitionDelegate.kt */
/* loaded from: classes5.dex */
public final class hmp0 {
    public final View a;
    public final gzs<View> b;
    public ImageView c;
    public com.vk.core.view.components.spinner.c d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final xq3 f = new xq3(this, 14);

    /* JADX WARN: Multi-variable type inference failed */
    public hmp0(View view, gzs<? extends View> gzsVar) {
        this.a = view;
        this.b = gzsVar;
    }

    public final void a() {
        this.e.removeCallbacks(this.f);
        com.vk.core.view.components.spinner.c cVar = this.d;
        if (cVar != null) {
            cVar.dismiss();
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            ((ViewGroup) this.a.getRootView()).removeView(imageView);
            this.c = null;
        }
    }

    public final void b() {
        this.e.removeCallbacks(this.f);
        com.vk.core.view.components.spinner.c cVar = this.d;
        if (cVar != null) {
            cVar.dismiss();
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            View invoke = this.b.invoke();
            View view = this.a;
            if (invoke == null) {
                ((ViewGroup) view.getRootView()).removeView(imageView);
            } else if (invoke instanceof qeh) {
                c(imageView, invoke);
            } else {
                c(imageView, invoke);
                ((ViewGroup) view.getRootView()).removeView(imageView);
            }
        }
    }

    public final void c(ImageView imageView, View view) {
        KeyEvent.Callback callback = this.a;
        qeh qehVar = callback instanceof qeh ? (qeh) callback : null;
        y3l0 y3l0Var = new y3l0(qehVar, 12);
        xsd xsdVar = new xsd(this, imageView, qehVar, 3);
        imageView.setOutlineProvider(new t0w0(6, cn70.a() * 20.0f, false, false));
        int i = 1;
        imageView.setClipToOutline(true);
        imageView.setLayerType(2, null);
        bwt0.p0(imageView, true);
        imageView.setAlpha(1.0f);
        view.getLocationOnScreen(new int[2]);
        Object parent = imageView.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 == null) {
            return;
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view2.getMeasuredHeight(), 1073741824));
        float min = Math.min(view.getWidth() / imageView.getMeasuredWidth(), view.getHeight() / imageView.getMeasuredHeight());
        float measuredWidth = (imageView.getMeasuredWidth() * min) + (r8[0] - (imageView.getMeasuredWidth() / 2));
        float measuredHeight = (imageView.getMeasuredHeight() * min) + (r8[1] - ((view.getHeight() + imageView.getMeasuredHeight()) / 2));
        Property property = View.TRANSLATION_Y;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) property, cn70.c(90)));
        ofPropertyValuesHolder.setDuration(100L);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(20L);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, measuredWidth), PropertyValuesHolder.ofFloat((Property<?, Float>) property, measuredHeight), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, min), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, min));
        ofPropertyValuesHolder2.setDuration(180L);
        ofPropertyValuesHolder2.addListener(new wjq(imageView));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat2.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofPropertyValuesHolder, ofFloat, ofPropertyValuesHolder2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.play(ofFloat2).after(180L);
        animatorSet.addListener(new rae(y3l0Var, imageView, xsdVar, i));
        animatorSet.start();
    }

    public final void d(Bitmap bitmap) {
        View invoke = this.b.invoke();
        if (invoke == null) {
            return;
        }
        int visibility = invoke.getVisibility();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (visibility == 0 && invoke.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && invoke.isAttachedToWindow()) {
            Rect F = bwt0.F(invoke);
            f = (F.height() * F.width()) / (invoke.getMeasuredWidth() * invoke.getMeasuredHeight());
        }
        if (f < 0.85f) {
            return;
        }
        View view = this.a;
        ImageView imageView = new ImageView(view.getContext());
        ((ViewGroup) view.getRootView()).addView(imageView);
        imageView.setBackgroundColor(-16777216);
        imageView.setScaleType(ImageView.ScaleType.FIT_END);
        imageView.setImageBitmap(bitmap);
        bwt0.p0(imageView, true);
        this.c = imageView;
        com.vk.core.view.components.spinner.c e = qv20.e(view.getContext(), Integer.valueOf(R.string.story_publishing_progress));
        e.setCancelable(false);
        e.setCanceledOnTouchOutside(false);
        e.setOnDismissListener(new ktj(this, 2));
        e.show();
        this.d = e;
        Handler handler = this.e;
        xq3 xq3Var = this.f;
        handler.removeCallbacks(xq3Var);
        handler.postDelayed(xq3Var, 5000L);
    }
}
