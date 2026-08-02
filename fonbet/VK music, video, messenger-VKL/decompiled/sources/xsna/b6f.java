package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsSwipeClosableLayout.kt */
/* loaded from: classes17.dex */
public final class b6f extends FrameLayout {
    public final Object b;
    public final Object c;
    public a d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public AnimatorSet i;

    /* compiled from: ClipsSwipeClosableLayout.kt */
    public interface a {
        List<View> a();

        List<View> b();

        boolean c();

        void close();

        List<View> d();
    }

    /* compiled from: ClipsSwipeClosableLayout.kt */
    public static final class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            b6f b6fVar = b6f.this;
            b6fVar.f = false;
            b6fVar.getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    /* compiled from: ClipsSwipeClosableLayout.kt */
    public static final class c extends nqj0 {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float y = motionEvent2.getY();
            b6f b6fVar = b6f.this;
            if (Math.abs(y - b6fVar.h) <= b6fVar.getHeight() / 10 || Math.abs(f2) <= 1000.0f) {
                return false;
            }
            b6fVar.getParent().requestDisallowInterceptTouchEvent(false);
            b6fVar.d.close();
            b6fVar.e = false;
            return true;
        }
    }

    public b6f(Context context) {
        super(context);
        com.vk.movika.sdk.base.ui.s sVar = new com.vk.movika.sdk.base.ui.s(4, context, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, sVar);
        this.c = msy.a(lazyThreadSafetyMode, new z5f(context, 0));
        this.d = a6f.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getTouchSlop() {
        return ((Number) this.c.getValue()).intValue();
    }

    public final void a() {
        this.f = true;
        List<View> d = this.d.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (View view : d) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        List<View> a2 = this.d.a();
        ArrayList arrayList2 = new ArrayList(c5g.u(a2, 10));
        for (View view2 : a2) {
            arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, view2.getAlpha(), 1.0f));
        }
        ArrayList u0 = j5g.u0(arrayList2, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(u0);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(100L);
        AnimatorSet animatorSet2 = this.i;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet b2 = b(true);
        this.i = b2;
        List<Animator> I = rl3.I(new Animator[]{animatorSet, b2});
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(I);
        animatorSet3.addListener(new b());
        animatorSet3.start();
    }

    public final AnimatorSet b(boolean z) {
        float f = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        List<View> b2 = this.d.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b2) {
            if (((View) obj).getAlpha() != f) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List<View> b3 = this.d.b();
        ArrayList arrayList2 = new ArrayList(c5g.u(b3, 10));
        for (View view : b3) {
            arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), f));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(100L);
        return animatorSet;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.g = motionEvent.getX();
            this.h = motionEvent.getY();
            this.e = false;
        } else if (action == 2) {
            float x = motionEvent.getX() - this.g;
            float y = motionEvent.getY() - this.h;
            boolean z = y > ((float) getTouchSlop()) && Math.abs(x) / Math.abs(y) < 0.75f;
            if (!this.e && z && this.d.c()) {
                this.e = true;
                AnimatorSet animatorSet = this.i;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet b2 = b(false);
                this.i = b2;
                if (b2 != null) {
                    b2.start();
                }
            }
        }
        getParent().requestDisallowInterceptTouchEvent(this.e);
        return this.e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f) {
            if (!this.e) {
                return super.onTouchEvent(motionEvent);
            }
            if (!getGestureDetector().onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action == 1) {
                    if (Math.abs(motionEvent.getY() - this.h) > getHeight() / 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        this.d.close();
                    } else {
                        a();
                    }
                    this.e = false;
                    return true;
                }
                if (action == 2) {
                    float y = motionEvent.getY() - this.h;
                    float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - Math.abs((1.5f * y) / getHeight()));
                    Iterator<T> it = this.d.d().iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setTranslationY(y);
                    }
                    Iterator<T> it2 = this.d.a().iterator();
                    while (it2.hasNext()) {
                        ((View) it2.next()).setAlpha(max);
                    }
                } else if (action == 3) {
                    a();
                    this.e = false;
                    return true;
                }
            }
        }
        return true;
    }

    public final void setDelegate(a aVar) {
        this.d = aVar;
    }
}
