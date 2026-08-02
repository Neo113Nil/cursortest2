package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import xsna.bqx0;
import xsna.iut0;

/* compiled from: WindowInsetsAnimationCompat.java */
/* loaded from: classes11.dex */
public final class aqx0 {
    public e a;

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static class c extends e {
        public static final PathInterpolator e = new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        public static final hlq f = new hlq();
        public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
        public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

        /* compiled from: WindowInsetsAnimationCompat.java */
        public static class a implements View.OnApplyWindowInsetsListener {
            public final b a;
            public bqx0 b;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: xsna.aqx0$c$a$a, reason: collision with other inner class name */
            public class C2563a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ aqx0 b;
                public final /* synthetic */ bqx0 c;
                public final /* synthetic */ bqx0 d;
                public final /* synthetic */ int e;
                public final /* synthetic */ View f;

                public C2563a(aqx0 aqx0Var, bqx0 bqx0Var, bqx0 bqx0Var2, int i, View view) {
                    this.b = aqx0Var;
                    this.c = bqx0Var;
                    this.d = bqx0Var2;
                    this.e = i;
                    this.f = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    aqx0 aqx0Var = this.b;
                    aqx0Var.a.e(animatedFraction);
                    bqx0 bqx0Var = this.c;
                    bqx0.q qVar = bqx0Var.a;
                    float c = aqx0Var.a.c();
                    PathInterpolator pathInterpolator = c.e;
                    int i = Build.VERSION.SDK_INT;
                    bqx0.h gVar = i >= 36 ? new bqx0.g(bqx0Var) : i >= 35 ? new bqx0.f(bqx0Var) : i >= 34 ? new bqx0.e(bqx0Var) : i >= 31 ? new bqx0.d(bqx0Var) : i >= 30 ? new bqx0.c(bqx0Var) : i >= 29 ? new bqx0.b(bqx0Var) : new bqx0.a(bqx0Var);
                    for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                        if ((this.e & i2) == 0) {
                            gVar.d(i2, qVar.i(i2));
                        } else {
                            h4x i3 = qVar.i(i2);
                            h4x i4 = this.d.a.i(i2);
                            float f = 1.0f - c;
                            gVar.d(i2, bqx0.e(i3, (int) (((i3.a - i4.a) * f) + 0.5d), (int) (((i3.b - i4.b) * f) + 0.5d), (int) (((i3.c - i4.c) * f) + 0.5d), (int) (((i3.d - i4.d) * f) + 0.5d)));
                        }
                    }
                    c.h(this.f, gVar.b(), Collections.singletonList(aqx0Var));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ aqx0 b;
                public final /* synthetic */ View c;

                public b(View view, aqx0 aqx0Var) {
                    this.b = aqx0Var;
                    this.c = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    aqx0 aqx0Var = this.b;
                    aqx0Var.a.e(1.0f);
                    c.f(this.c, aqx0Var);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: xsna.aqx0$c$a$c, reason: collision with other inner class name */
            public class RunnableC2564c implements Runnable {
                public final /* synthetic */ View b;
                public final /* synthetic */ aqx0 c;
                public final /* synthetic */ a d;
                public final /* synthetic */ ValueAnimator e;

                public RunnableC2564c(View view, aqx0 aqx0Var, a aVar, ValueAnimator valueAnimator) {
                    this.b = view;
                    this.c = aqx0Var;
                    this.d = aVar;
                    this.e = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.i(this.b, this.c, this.d);
                    this.e.start();
                }
            }

            public a(View view, b bVar) {
                bqx0 bqx0Var;
                this.a = bVar;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                bqx0 a = iut0.e.a(view);
                if (a != null) {
                    int i = Build.VERSION.SDK_INT;
                    bqx0Var = (i >= 36 ? new bqx0.g(a) : i >= 35 ? new bqx0.f(a) : i >= 34 ? new bqx0.e(a) : i >= 31 ? new bqx0.d(a) : i >= 30 ? new bqx0.c(a) : i >= 29 ? new bqx0.b(a) : new bqx0.a(a)).b();
                } else {
                    bqx0Var = null;
                }
                this.b = bqx0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int[] iArr;
                boolean z;
                if (!view.isLaidOut()) {
                    this.b = bqx0.h(view, windowInsets);
                    return c.j(view, windowInsets);
                }
                bqx0 h = bqx0.h(view, windowInsets);
                bqx0.q qVar = h.a;
                if (this.b == null) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    this.b = iut0.e.a(view);
                }
                if (this.b == null) {
                    this.b = h;
                    return c.j(view, windowInsets);
                }
                b k = c.k(view);
                if (k != null && Objects.equals(k.b, h)) {
                    return c.j(view, windowInsets);
                }
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                bqx0 bqx0Var = this.b;
                int i = 1;
                while (i <= 512) {
                    h4x i2 = qVar.i(i);
                    h4x i3 = bqx0Var.a.i(i);
                    int i4 = i2.a;
                    int i5 = i2.d;
                    int i6 = i2.c;
                    int i7 = i2.b;
                    int i8 = i3.a;
                    int i9 = i3.d;
                    int i10 = i3.c;
                    int i11 = i3.b;
                    if (i4 > i8 || i7 > i11 || i6 > i10 || i5 > i9) {
                        iArr = iArr2;
                        z = true;
                    } else {
                        iArr = iArr2;
                        z = false;
                    }
                    if (z != (i4 < i8 || i7 < i11 || i6 < i10 || i5 < i9)) {
                        if (z) {
                            iArr[0] = iArr[0] | i;
                        } else {
                            iArr3[0] = iArr3[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr2 = iArr;
                }
                int i12 = iArr2[0];
                int i13 = iArr3[0];
                int i14 = i12 | i13;
                if (i14 == 0) {
                    this.b = h;
                    return c.j(view, windowInsets);
                }
                bqx0 bqx0Var2 = this.b;
                aqx0 aqx0Var = new aqx0(i14, (i12 & 8) != 0 ? c.e : (i13 & 8) != 0 ? c.f : (i12 & 519) != 0 ? c.g : (i13 & 519) != 0 ? c.h : null, (i14 & 8) != 0 ? 160L : 250L);
                aqx0Var.a.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(aqx0Var.a.b());
                h4x i15 = qVar.i(i14);
                h4x i16 = bqx0Var2.a.i(i14);
                int min = Math.min(i15.a, i16.a);
                int i17 = i15.b;
                int i18 = i16.b;
                int min2 = Math.min(i17, i18);
                int i19 = i15.c;
                int i20 = i16.c;
                int min3 = Math.min(i19, i20);
                int i21 = i15.d;
                int i22 = i16.d;
                a aVar = new a(h4x.c(min, min2, min3, Math.min(i21, i22)), h4x.c(Math.max(i15.a, i16.a), Math.max(i17, i18), Math.max(i19, i20), Math.max(i21, i22)));
                c.g(view, aqx0Var, h, false);
                duration.addUpdateListener(new C2563a(aqx0Var, h, bqx0Var2, i14, view));
                duration.addListener(new b(view, aqx0Var));
                qj80.a(view, new RunnableC2564c(view, aqx0Var, aVar, duration));
                this.b = h;
                return c.j(view, windowInsets);
            }
        }

        public static void f(View view, aqx0 aqx0Var) {
            b k = k(view);
            if (k != null) {
                k.a(aqx0Var);
                if (k.c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), aqx0Var);
                }
            }
        }

        public static void g(View view, aqx0 aqx0Var, bqx0 bqx0Var, boolean z) {
            b k = k(view);
            if (k != null) {
                k.b = bqx0Var;
                if (!z) {
                    k.c(aqx0Var);
                    z = k.c == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), aqx0Var, bqx0Var, z);
                }
            }
        }

        public static void h(View view, bqx0 bqx0Var, List<aqx0> list) {
            b k = k(view);
            if (k != null) {
                bqx0Var = k.d(bqx0Var, list);
                if (k.c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    h(viewGroup.getChildAt(i), bqx0Var, list);
                }
            }
        }

        public static void i(View view, aqx0 aqx0Var, a aVar) {
            b k = k(view);
            if (k != null) {
                k.e(aqx0Var, aVar);
                if (k.c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    i(viewGroup.getChildAt(i), aqx0Var, aVar);
                }
            }
        }

        public static WindowInsets j(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b k(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static class d extends e {
        public final WindowInsetsAnimation e;

        /* compiled from: WindowInsetsAnimationCompat.java */
        public static class a extends WindowInsetsAnimation$Callback {
            public final b a;
            public List<aqx0> b;
            public ArrayList<aqx0> c;
            public final HashMap<WindowInsetsAnimation, aqx0> d;

            public a(b bVar) {
                super(bVar.c);
                this.d = new HashMap<>();
                this.a = bVar;
            }

            public final aqx0 a(WindowInsetsAnimation windowInsetsAnimation) {
                aqx0 aqx0Var = this.d.get(windowInsetsAnimation);
                if (aqx0Var != null) {
                    return aqx0Var;
                }
                aqx0 aqx0Var2 = new aqx0(0, null, 0L);
                aqx0Var2.a = new d(windowInsetsAnimation);
                this.d.put(windowInsetsAnimation, aqx0Var2);
                return aqx0Var2;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.a(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<aqx0> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<aqx0> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a = mw10.a(list.get(size));
                    aqx0 a2 = a(a);
                    fraction = a.getFraction();
                    a2.a.e(fraction);
                    this.c.add(a2);
                }
                return this.a.d(bqx0.h(null, windowInsets), this.b).g();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                a e = this.a.e(a(windowInsetsAnimation), new a(bounds));
                e.getClass();
                dw10.b();
                return za0.b(e.a.f(), e.b.f());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        @Override // xsna.aqx0.e
        public final float a() {
            float alpha;
            alpha = this.e.getAlpha();
            return alpha;
        }

        @Override // xsna.aqx0.e
        public final long b() {
            long durationMillis;
            durationMillis = this.e.getDurationMillis();
            return durationMillis;
        }

        @Override // xsna.aqx0.e
        public final float c() {
            float interpolatedFraction;
            interpolatedFraction = this.e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // xsna.aqx0.e
        public final int d() {
            int typeMask;
            typeMask = this.e.getTypeMask();
            return typeMask;
        }

        @Override // xsna.aqx0.e
        public final void e(float f) {
            this.e.setFraction(f);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static class e {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;

        public e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public float a() {
            return 1.0f;
        }

        public long b() {
            return this.d;
        }

        public float c() {
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
        }

        public int d() {
            return this.a;
        }

        public void e(float f) {
            this.b = f;
        }
    }

    public aqx0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(tc9.a(i, interpolator, j));
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    public static void a(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new d.a(bVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = c.e;
        View.OnApplyWindowInsetsListener aVar = bVar != null ? new c.a(view, bVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, aVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(aVar);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static final class a {
        public final h4x a;
        public final h4x b;

        public a(h4x h4xVar, h4x h4xVar2) {
            this.a = h4xVar;
            this.b = h4xVar2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            Insets upperBound;
            lowerBound = bounds.getLowerBound();
            this.a = h4x.e(lowerBound);
            upperBound = bounds.getUpperBound();
            this.b = h4x.e(upperBound);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static abstract class b {
        public bqx0 b;
        public final int c;

        public b(int i) {
            this.c = i;
        }

        public abstract bqx0 d(bqx0 bqx0Var, List<aqx0> list);

        public void a(aqx0 aqx0Var) {
        }

        public void c(aqx0 aqx0Var) {
        }

        public a e(aqx0 aqx0Var, a aVar) {
            return aVar;
        }
    }
}
