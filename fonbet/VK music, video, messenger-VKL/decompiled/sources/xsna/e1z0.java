package xsna;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.my.target.nativeads.views.MediaAdView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class e1z0 {
    public final boolean a;
    public final List b;
    public final List c;
    public final k0z0 d;
    public long e;
    public final long f;
    public final xw1 g = new xw1(this, 22);
    public final sj1 h = new sj1(this, 17);
    public final d1z0 i = new ViewTreeObserver.OnScrollChangedListener() { // from class: xsna.d1z0
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            e1z0 e1z0Var = e1z0.this;
            k0z0 k0z0Var = e1z0Var.d;
            View view = (View) e1z0Var.k.get();
            if (view != null) {
                float floatValue = k0z0Var.a(view).floatValue();
                e1z0Var.l = floatValue;
                if (b920.b(floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                    e1z0Var.l = -1.0f;
                }
            }
            View view2 = (View) e1z0Var.m.get();
            if (view2 != null) {
                float floatValue2 = k0z0Var.a(view2).floatValue();
                e1z0Var.n = floatValue2;
                if (b920.b(floatValue2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                    e1z0Var.n = -1.0f;
                }
            }
            if (view != null) {
                Handler handler = o8z0.g;
                sj1 sj1Var = e1z0Var.h;
                handler.removeCallbacks(sj1Var);
                handler.postDelayed(sj1Var, 2L);
            }
        }
    };
    public WeakReference k = new WeakReference(null);
    public float l = -1.0f;
    public WeakReference m = new WeakReference(null);
    public float n = -1.0f;
    public boolean o = false;
    public final a j = new a();

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            e1z0 e1z0Var = e1z0.this;
            if (e1z0Var.o) {
                view.getViewTreeObserver().addOnScrollChangedListener(e1z0Var.i);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.getViewTreeObserver().removeOnScrollChangedListener(e1z0.this.i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [xsna.d1z0] */
    public e1z0(boolean z, long j, List list, List list2, k0z0 k0z0Var) {
        this.a = z;
        this.f = j;
        this.b = list;
        this.c = list2;
        this.d = k0z0Var;
    }

    public static void c(List list, long j, float f) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v3z0 v3z0Var = (v3z0) it.next();
            int i = v3z0Var.e;
            if (i == 0) {
                r5 = -1 != b920.b(f, v3z0Var.a);
                if (r5) {
                    v3z0Var.g = 0L;
                    v3z0Var.e = 1;
                }
            } else if (i == 1) {
                boolean z = -1 != b920.b(f, v3z0Var.c);
                if (z) {
                    v3z0Var.g = (j - v3z0Var.f) + v3z0Var.g;
                } else {
                    v3z0Var.g = 0L;
                    v3z0Var.e = 0;
                }
                r5 = z;
            }
            v3z0Var.f = j;
            if (r5 && v3z0Var.g >= v3z0Var.b) {
                v3z0Var.d.run();
                it.remove();
            }
        }
    }

    public final void a(long j) {
        if (this.b.isEmpty() && this.c.isEmpty()) {
            e();
            return;
        }
        long j2 = this.e + this.f;
        this.e = j2;
        long max = Math.max(5L, j2 - j);
        Handler handler = o8z0.g;
        xw1 xw1Var = this.g;
        handler.removeCallbacks(xw1Var);
        handler.postDelayed(xw1Var, max);
    }

    public final void b(ViewGroup viewGroup, MediaAdView mediaAdView) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.o) {
            gu8.e("ViewabilityTrackerV2: ", "second startTracking, restart tracking");
            e();
        }
        List<v3z0> list = this.b;
        boolean isEmpty = list.isEmpty();
        List<v3z0> list2 = this.c;
        if (isEmpty && list2.isEmpty()) {
            return;
        }
        if (this.a) {
            viewGroup.addOnAttachStateChangeListener(this.j);
            if (viewGroup.isAttachedToWindow()) {
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.i);
            }
        }
        this.k = new WeakReference(viewGroup);
        for (v3z0 v3z0Var : list) {
            v3z0Var.e = 0;
            v3z0Var.f = 0L;
            v3z0Var.g = 0L;
        }
        if (mediaAdView != null && !list2.isEmpty()) {
            this.m = new WeakReference(mediaAdView);
            for (v3z0 v3z0Var2 : list2) {
                v3z0Var2.e = 0;
                v3z0Var2.f = 0L;
                v3z0Var2.g = 0L;
            }
        }
        this.e = elapsedRealtime;
        this.o = true;
        if (d(elapsedRealtime) == 1) {
            a(elapsedRealtime);
        } else {
            e();
        }
    }

    public final int d(long j) {
        WeakReference weakReference = this.k;
        float f = this.l;
        View view = (View) weakReference.get();
        k0z0 k0z0Var = this.d;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (view == null) {
            f = 0.0f;
        } else if (f == -1.0f) {
            f = k0z0Var.a(view).floatValue();
        }
        List list = this.b;
        c(list, j, f);
        Object obj = this.m.get();
        List list2 = this.c;
        if (obj != null) {
            WeakReference weakReference2 = this.m;
            float f3 = this.n;
            View view2 = (View) weakReference2.get();
            if (view2 != null) {
                f2 = f3 != -1.0f ? f3 : k0z0Var.a(view2).floatValue();
            }
            c(list2, j, f2);
        }
        return (list.isEmpty() && list2.isEmpty()) ? 2 : 1;
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.o) {
            d(elapsedRealtime);
            this.o = false;
            Handler handler = o8z0.g;
            handler.removeCallbacks(this.g);
            handler.removeCallbacks(this.h);
            View view = (View) this.k.get();
            if (view != null && this.a) {
                view.removeOnAttachStateChangeListener(this.j);
                if (view.isAttachedToWindow()) {
                    view.getViewTreeObserver().removeOnScrollChangedListener(this.i);
                }
            }
            this.l = -1.0f;
            this.k.clear();
            this.n = -1.0f;
            this.m.clear();
        }
    }
}
