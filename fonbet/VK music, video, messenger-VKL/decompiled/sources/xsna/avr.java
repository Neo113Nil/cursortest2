package xsna;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* compiled from: FlyView.kt */
/* loaded from: classes17.dex */
public class avr extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public int b;
    public int c;
    public int d;
    public izs<? super View, ObjectAnimator> e;
    public final Random f;
    public final CopyOnWriteArrayList<ImageView> g;
    public final DecelerateInterpolator h;
    public final LinkedHashMap i;

    public avr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(float f, float f2, int i, Drawable drawable) {
        ImageView imageView;
        CopyOnWriteArrayList<ImageView> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList.size() == 0) {
            e(i);
        }
        Iterator<ImageView> it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                imageView = null;
                break;
            } else {
                imageView = it.next();
                if (!imageView.hasTransientState()) {
                    break;
                }
            }
        }
        ImageView imageView2 = imageView;
        if (imageView2 == null) {
            if (copyOnWriteArrayList.size() < this.c) {
                e(i);
                a(f, f2, i, drawable);
                return;
            }
            return;
        }
        imageView2.setImageDrawable(drawable);
        imageView2.setTranslationY(f2);
        imageView2.setTranslationX(f);
        imageView2.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView2.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c(imageView2);
    }

    public void c(final ImageView imageView) {
        Random random = this.f;
        int i = random.nextBoolean() ? -1 : 1;
        float nextFloat = random.nextFloat();
        int oneSectionWidth = ((((int) (getOneSectionWidth() * nextFloat)) - this.b) / 2) * i;
        int i2 = -((int) ((((nextFloat / 2) + 0.5f) * getHeight()) - this.b));
        int nextInt = random.nextInt(1000) + 2500;
        final int i3 = (int) (nextInt * 0.1f);
        izs<? super View, ObjectAnimator> izsVar = this.e;
        final ObjectAnimator invoke = izsVar != null ? izsVar.invoke(imageView) : null;
        ViewPropertyAnimator animate = imageView.animate();
        this.i.put(imageView, new Pair(animate, invoke));
        i();
        animate.setDuration(nextInt).translationXBy(oneSectionWidth).translationYBy(i2).setInterpolator(this.h).withStartAction(new Runnable() { // from class: xsna.yur
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = avr.j;
                imageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(i3).setInterpolator(this.h).withEndAction(new wc2(invoke, 5)).start();
            }
        }).withEndAction(new Runnable() { // from class: xsna.zur
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = avr.j;
                ImageView imageView2 = imageView;
                ViewPropertyAnimator duration = imageView2.animate().scaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(i3);
                avr avrVar = this;
                int i5 = 5;
                duration.setInterpolator(avrVar.h).withStartAction(new nx3(invoke, i5)).withEndAction(new at6(i5, avrVar, imageView2)).start();
            }
        }).start();
    }

    public final void d() {
        for (Map.Entry entry : this.i.entrySet()) {
            ObjectAnimator objectAnimator = (ObjectAnimator) ((Pair) entry.getValue()).j();
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ((ViewPropertyAnimator) ((Pair) entry.getValue()).i()).cancel();
            ((View) entry.getKey()).setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ((View) entry.getKey()).setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final void e(int i) {
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = this.b;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
            layoutParams.gravity = i;
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            addView(imageView);
            imageView.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            imageView.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.g.add(imageView);
        }
    }

    public void f(ImageView imageView) {
        this.i.remove(imageView);
    }

    public final Map<View, Pair<ViewPropertyAnimator, ObjectAnimator>> getAnimationMap() {
        return this.i;
    }

    public final int getCountSection() {
        return this.d;
    }

    public final izs<View, ObjectAnimator> getCustomAnimationWhileFlyingProvider() {
        return this.e;
    }

    public final CopyOnWriteArrayList<ImageView> getImageViewsPool() {
        return this.g;
    }

    public final DecelerateInterpolator getInterpolator() {
        return this.h;
    }

    public final int getMImageSizePx() {
        return this.b;
    }

    public final Random getMRandom() {
        return this.f;
    }

    public final int getMaxSizeViewPool() {
        return this.c;
    }

    public final int getOneSectionWidth() {
        return getWidth() / this.d;
    }

    public final void setCountSection(int i) {
        this.d = i;
    }

    public final void setCustomAnimationWhileFlyingProvider(izs<? super View, ObjectAnimator> izsVar) {
        this.e = izsVar;
    }

    public final void setMImageSizePx(int i) {
        this.b = i;
        Iterator<T> it = this.g.iterator();
        while (it.hasNext()) {
            ViewGroup.LayoutParams layoutParams = ((ImageView) it.next()).getLayoutParams();
            int i2 = this.b;
            layoutParams.width = i2;
            layoutParams.height = i2;
        }
        requestLayout();
    }

    public final void setMaxSizeViewPool(int i) {
        this.c = i;
    }

    public avr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = iah0.a(64.0f);
        this.c = 30;
        this.d = 1;
        this.f = new Random();
        this.g = new CopyOnWriteArrayList<>();
        this.h = new DecelerateInterpolator(0.8f);
        this.i = new LinkedHashMap();
    }

    public void i() {
    }
}
