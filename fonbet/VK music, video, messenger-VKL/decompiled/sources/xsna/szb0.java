package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Positioner.kt */
/* loaded from: classes16.dex */
public final class szb0 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    /* compiled from: Positioner.kt */
    public static final class a {
        public float a;
        public float b;
        public float c;
        public float d;
        public int e;
        public long f;
        public boolean g;

        public a() {
            this(0, 0L, 127);
        }

        public static a a(a aVar, float f, float f2, float f3, float f4, int i) {
            if ((i & 1) != 0) {
                f = aVar.a;
            }
            float f5 = f;
            if ((i & 2) != 0) {
                f2 = aVar.b;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = aVar.c;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                f4 = aVar.d;
            }
            int i2 = aVar.e;
            long j = aVar.f;
            boolean z = aVar.g;
            aVar.getClass();
            return new a(f5, f6, f7, f4, i2, j, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class.equals(obj.getClass())) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && this.d == aVar.d && this.f == aVar.f && this.c == aVar.c && this.e == aVar.e) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + bh10.a(shy.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Position(translateX=");
            sb.append(this.a);
            sb.append(", translateY=");
            sb.append(this.b);
            sb.append(", scale=");
            sb.append(this.c);
            sb.append(", alpha=");
            sb.append(this.d);
            sb.append(", visibility=");
            sb.append(this.e);
            sb.append(", duration=");
            sb.append(this.f);
            sb.append(", delete=");
            return defpackage.q0.a(sb, this.g, ')');
        }

        public a(float f, float f2, float f3, float f4, int i, long j, boolean z) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = i;
            this.f = j;
            this.g = z;
        }

        public /* synthetic */ a(int i, long j, int i2) {
            this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, (i2 & 8) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? 300L : j, false);
        }
    }

    /* compiled from: Positioner.kt */
    public static final class b extends AnimatorListenerAdapter {
        public final /* synthetic */ View b;
        public final /* synthetic */ a c;
        public final /* synthetic */ szb0 d;
        public final /* synthetic */ gzs<s3q0> e;

        public b(View view, a aVar, szb0 szb0Var, gzs<s3q0> gzsVar) {
            this.b = view;
            this.c = aVar;
            this.d = szb0Var;
            this.e = gzsVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a aVar = this.c;
            int i = aVar.e;
            View view = this.b;
            view.setVisibility(i);
            this.d.a(view, aVar);
            gzs<s3q0> gzsVar = this.e;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public final void a(View view, a aVar) {
        if (aVar.g) {
            this.a.remove(view);
            this.b.remove(view);
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public final void b(View view, a aVar, a aVar2, float f) {
        int i;
        if (view == null) {
            return;
        }
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = aVar != null ? aVar.a : 0.0f;
        float f4 = aVar != null ? aVar.b : 0.0f;
        float f5 = aVar != null ? aVar.d : 0.0f;
        if (aVar != null) {
            f2 = aVar.c;
        }
        Integer valueOf = aVar != null ? Integer.valueOf(aVar.e) : null;
        if (aVar2 != null) {
            float f6 = aVar2.a;
            float f7 = aVar2.b;
            f5 += (aVar2.d - f5) * f;
            f2 += (aVar2.c - f2) * f;
            f3 += (f6 - f3) * f;
            f4 += (f7 - f4) * f;
            i = aVar2.e;
        } else {
            i = 8;
        }
        view.setTranslationX(f3);
        view.setTranslationY(f4);
        view.setAlpha(f5);
        view.setScaleX(f2);
        view.setScaleY(f2);
        if ((valueOf != null && valueOf.intValue() == 0) || i == 0) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
            }
        } else if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
        if (aVar != null) {
            this.a.put(view, a.a(aVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 127));
        }
    }

    public final void c(View view, a aVar) {
        if (aVar != null) {
            e(view, aVar, true, null);
        }
    }

    public final void d(View view, a aVar, long j, j70 j70Var) {
        HashMap hashMap = this.b;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) hashMap.get(view);
        if (cVar != null) {
            cVar.dispose();
        }
        hashMap.remove(view);
        hashMap.put(view, io.reactivex.rxjava3.core.q.B0(j, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new skz(new lty(this, view, aVar, j70Var, 1), 16)));
    }

    public final void e(View view, a aVar, boolean z, gzs<s3q0> gzsVar) {
        a aVar2;
        if (view == null) {
            return;
        }
        HashMap hashMap = this.b;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) hashMap.get(view);
        if (cVar != null) {
            cVar.dispose();
        }
        hashMap.remove(view);
        HashMap hashMap2 = this.a;
        a aVar3 = hashMap2.get(view) != null ? (a) hashMap2.get(view) : null;
        if (aVar3 == null || !aVar3.equals(aVar)) {
            view.animate().setListener(null).cancel();
            if (aVar != null) {
                aVar2 = aVar;
                hashMap2.put(view, a.a(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 127));
            } else {
                aVar2 = aVar;
            }
            if (z) {
                if (aVar2.e == 0 && view.getVisibility() != 0) {
                    view.setVisibility(0);
                }
                ViewPropertyAnimator animate = view.animate();
                float alpha = view.getAlpha();
                float f = aVar2.d;
                if (alpha != f) {
                    animate.alpha(f);
                }
                float translationX = view.getTranslationX();
                float f2 = aVar2.a;
                if (translationX != f2) {
                    animate.translationX(f2);
                }
                float translationY = view.getTranslationY();
                float f3 = aVar2.b;
                if (translationY != f3) {
                    animate.translationY(f3);
                }
                if (view.getScaleX() != aVar2.c || view.getScaleY() != aVar2.c) {
                    animate.scaleX(aVar2.c);
                    animate.scaleY(aVar2.c);
                }
                animate.setDuration(aVar2.f);
                animate.setListener(new b(view, aVar2, this, gzsVar)).start();
                return;
            }
            float alpha2 = view.getAlpha();
            float f4 = aVar2.d;
            if (alpha2 != f4) {
                view.setAlpha(f4);
            }
            float translationX2 = view.getTranslationX();
            float f5 = aVar2.a;
            if (translationX2 != f5) {
                view.setTranslationX(f5);
            }
            float translationY2 = view.getTranslationY();
            float f6 = aVar2.b;
            if (translationY2 != f6) {
                view.setTranslationY(f6);
            }
            if (view.getScaleX() != aVar2.c || view.getScaleY() != aVar2.c) {
                view.setScaleX(aVar2.c);
                view.setScaleY(aVar2.c);
            }
            int visibility = view.getVisibility();
            int i = aVar2.e;
            if (visibility != i) {
                view.setVisibility(i);
            }
            a(view, aVar2);
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }
}
