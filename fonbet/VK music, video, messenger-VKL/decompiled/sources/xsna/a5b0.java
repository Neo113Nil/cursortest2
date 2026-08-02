package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.z4b0;

/* compiled from: PlayerSwipeGesturesDelegate.kt */
/* loaded from: classes3.dex */
public final class a5b0 {
    public final View a;
    public final b5b0 b;
    public final vex c;
    public final d410 d;
    public final da50 e;
    public final fot f;
    public z4b0 g;
    public a h = new a(0);
    public c i;
    public ViewPropertyAnimator j;
    public final float k;

    /* compiled from: PlayerSwipeGesturesDelegate.kt */
    public static final class a {
        public final float a;
        public final float b;

        public a() {
            this(0);
        }

        public final z4b0.b a() {
            float f = this.a;
            float abs = Math.abs(f);
            float f2 = this.b;
            return abs > Math.abs(f2) ? f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? z4b0.b.C4155b.a : z4b0.b.c.a : f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? z4b0.b.d.a : z4b0.b.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActiveGestureShift(dX=");
            sb.append(this.a);
            sb.append(", dY=");
            return xq.c(')', this.b, sb);
        }

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public /* synthetic */ a(int i) {
            this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: PlayerSwipeGesturesDelegate.kt */
    public final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r9v17, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Pair pair;
            Object obj;
            if (motionEvent2.getPointerCount() > 1) {
                return false;
            }
            a5b0 a5b0Var = a5b0.this;
            View view = a5b0Var.a;
            if (motionEvent != null && a5b0Var.j == null) {
                if (a5b0Var.i == null) {
                    a5b0Var.i = new c(view.getWidth(), view.getHeight(), view.getScaleX(), view.getScaleY(), view.getPivotX(), view.getPivotY(), view.getTranslationX(), view.getTranslationY(), ((Boolean) a5b0Var.c.invoke()).booleanValue());
                }
                float x = motionEvent2.getX() - motionEvent.getX();
                c cVar = a5b0Var.i;
                float f3 = swe0.f(x / (cVar != null ? cVar.a : 1.0f), -1.0f, 1.0f);
                float y = motionEvent.getY() - motionEvent2.getY();
                c cVar2 = a5b0Var.i;
                a aVar = new a(f3, swe0.f(y / (cVar2 != null ? cVar2.b : 1.0f), -1.0f, 1.0f));
                a5b0Var.h = aVar;
                if (a5b0Var.g == null) {
                    z4b0.b a = aVar.a();
                    Iterator<T> it = a5b0Var.b.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        z4b0 z4b0Var = (z4b0) obj;
                        if (epx.f(a, z4b0Var.a) && ((Boolean) z4b0Var.c.invoke()).booleanValue()) {
                            break;
                        }
                    }
                    z4b0 z4b0Var2 = (z4b0) obj;
                    view.getParent().requestDisallowInterceptTouchEvent(z4b0Var2 != null);
                    a5b0Var.g = z4b0Var2;
                }
                z4b0 z4b0Var3 = a5b0Var.g;
                if (z4b0Var3 != null) {
                    a5b0Var.d.invoke(Boolean.FALSE);
                    for (z4b0.a aVar2 : z4b0Var3.b) {
                        if (aVar2 instanceof z4b0.a.C4154a) {
                            z4b0.a.C4154a c4154a = (z4b0.a.C4154a) aVar2;
                            float b = u11.b(c4154a.d, 1, a5b0Var.a(z4b0Var3, c4154a), 1.0f);
                            z4b0.c.b bVar = z4b0.c.b.a;
                            z4b0.c cVar3 = c4154a.c;
                            int width = view.getWidth();
                            int height = view.getHeight();
                            bVar.getClass();
                            if (cVar3.equals(z4b0.c.a.a)) {
                                pair = new Pair(Float.valueOf(width / 2.0f), Float.valueOf(height / 2.0f));
                            } else {
                                if (!cVar3.equals(bVar)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pair = new Pair(Float.valueOf(width / 2.0f), Float.valueOf(height));
                            }
                            view.setPivotX(((Number) pair.i()).floatValue());
                            view.setPivotY(((Number) pair.j()).floatValue());
                            view.setScaleX(b);
                            view.setScaleY(b);
                        } else {
                            if (!(aVar2 instanceof z4b0.a.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            float a2 = a5b0Var.a(z4b0Var3, (z4b0.a.b) aVar2);
                            c cVar4 = a5b0Var.i;
                            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            float f5 = (cVar4 != null ? cVar4.a : 0.0f) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * a2;
                            float f6 = (cVar4 != null ? cVar4.b : 0.0f) * 0.25f * a2;
                            view.setTranslationX((cVar4 != null ? cVar4.g : 0.0f) + f5);
                            c cVar5 = a5b0Var.i;
                            if (cVar5 != null) {
                                f4 = cVar5.h;
                            }
                            view.setTranslationY(f4 + f6);
                        }
                    }
                    view.invalidate();
                }
            }
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            a5b0.this.e.invoke();
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* compiled from: PlayerSwipeGesturesDelegate.kt */
    public static final class c {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;
        public final boolean i;

        public c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            this.g = f7;
            this.h = f8;
            this.i = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.a, cVar.a) == 0 && Float.compare(this.b, cVar.b) == 0 && Float.compare(this.c, cVar.c) == 0 && Float.compare(this.d, cVar.d) == 0 && Float.compare(this.e, cVar.e) == 0 && Float.compare(this.f, cVar.f) == 0 && Float.compare(this.g, cVar.g) == 0 && Float.compare(this.h, cVar.h) == 0 && this.i == cVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayerViewAttributes(width=");
            sb.append(this.a);
            sb.append(", height=");
            sb.append(this.b);
            sb.append(", scaleX=");
            sb.append(this.c);
            sb.append(", scaleY=");
            sb.append(this.d);
            sb.append(", pivotX=");
            sb.append(this.e);
            sb.append(", pivotY=");
            sb.append(this.f);
            sb.append(", translationX=");
            sb.append(this.g);
            sb.append(", translationY=");
            sb.append(this.h);
            sb.append(", controlsWasVisible=");
            return defpackage.q0.a(sb, this.i, ')');
        }
    }

    public a5b0(Context context, FrameLayout frameLayout, b5b0 b5b0Var, vex vexVar, d410 d410Var, da50 da50Var) {
        this.a = frameLayout;
        this.b = b5b0Var;
        this.c = vexVar;
        this.d = d410Var;
        this.e = da50Var;
        this.f = new fot(context, new b(), null);
        HashSet hashSet = iah0.a;
        this.k = fnj.d(context) ? 0.5f : 0.9f;
    }

    public final float a(z4b0 z4b0Var, z4b0.a aVar) {
        float f;
        z4b0.b bVar = z4b0Var.a;
        if (epx.f(bVar, z4b0.b.d.a)) {
            f = swe0.f(this.h.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        } else if (epx.f(bVar, z4b0.b.a.a)) {
            f = swe0.f(this.h.b, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (epx.f(bVar, z4b0.b.C4155b.a)) {
            f = swe0.f(this.h.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        } else {
            if (!epx.f(bVar, z4b0.b.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f = swe0.f(this.h.a, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return swe0.f(Math.abs(f) / aVar.a(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    public final void b(MotionEvent motionEvent) {
        z4b0 z4b0Var;
        float f;
        Float valueOf;
        this.f.a(motionEvent);
        if (!mnh0.r(motionEvent) || (z4b0Var = this.g) == null) {
            return;
        }
        a aVar = this.h;
        z4b0.b a2 = aVar.a();
        if (epx.f(a2, z4b0.b.d.a) || epx.f(a2, z4b0.b.a.a)) {
            f = aVar.b;
        } else {
            if (!epx.f(a2, z4b0.b.C4155b.a) && !epx.f(a2, z4b0.b.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f = aVar.a;
        }
        boolean f2 = epx.f(this.h.a(), z4b0Var.a);
        float abs = Math.abs(f);
        Iterator<T> it = z4b0Var.b.iterator();
        if (it.hasNext()) {
            float a3 = ((z4b0.a) it.next()).a();
            while (it.hasNext()) {
                a3 = Math.max(a3, ((z4b0.a) it.next()).a());
            }
            valueOf = Float.valueOf(a3);
        } else {
            valueOf = null;
        }
        float floatValue = abs / (valueOf != null ? valueOf.floatValue() : 0.5f);
        int i = 0;
        boolean z = floatValue > this.k;
        if (f2 && z) {
            z4b0Var.d.invoke();
        }
        c cVar = this.i;
        this.d.invoke(Boolean.valueOf(cVar != null ? cVar.i : false));
        this.h = new a(i);
        View view = this.a;
        view.getParent().requestDisallowInterceptTouchEvent(false);
        this.g = null;
        c cVar2 = this.i;
        if (cVar2 != null) {
            float f3 = cVar2.h;
            float f4 = cVar2.g;
            float f5 = cVar2.d;
            float f6 = cVar2.c;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().scaleX(f6).scaleY(f5).translationX(f4).translationY(f3).withEndAction(new u970(view, cVar2, this, 1)).setDuration(300L);
                this.j = duration;
                if (duration != null) {
                    duration.start();
                }
                this.i = null;
            }
        }
    }
}
