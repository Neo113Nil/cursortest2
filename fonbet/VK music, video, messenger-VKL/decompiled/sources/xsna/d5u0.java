package xsna;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.log.L;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: VisibilityTracker.kt */
/* loaded from: classes6.dex */
public final class d5u0 extends RecyclerView.t {
    public final RecyclerView b;
    public final b25 c;
    public final ae8 f;
    public final io.reactivex.rxjava3.processors.c<a> k;
    public final io.reactivex.rxjava3.disposables.c l;
    public final float d = 60.0f;
    public final long e = 300;
    public final LinkedHashMap g = new LinkedHashMap();
    public final Rect h = new Rect();
    public final Rect i = new Rect();
    public long j = System.currentTimeMillis();

    /* compiled from: VisibilityTracker.kt */
    public static abstract class a {

        /* compiled from: VisibilityTracker.kt */
        /* renamed from: xsna.d5u0$a$a, reason: collision with other inner class name */
        public static final class C2708a extends a {
            public static final C2708a a = new C2708a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2708a);
            }

            public final int hashCode() {
                return -840736230;
            }

            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: VisibilityTracker.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1068409289;
            }

            public final String toString() {
                return "Schedule";
            }
        }
    }

    public d5u0(RecyclerView recyclerView, b25 b25Var, ae8 ae8Var) {
        this.b = recyclerView;
        this.c = b25Var;
        this.f = ae8Var;
        io.reactivex.rxjava3.processors.c<a> cVar = new io.reactivex.rxjava3.processors.c<>();
        this.k = cVar;
        recyclerView.addOnScrollListener(this);
        bwt0.h(recyclerView, new oqh0(this, 23));
        io.reactivex.rxjava3.internal.operators.flowable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.flowable.i0(cVar);
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.flowable.r rVar = new io.reactivex.rxjava3.internal.operators.flowable.r(new io.reactivex.rxjava3.internal.operators.mixed.d(i0Var.j(asu0.i()), new ggj0(new mcl0(15), 7)), new adz(new fyo0(6), 17));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.l = new io.reactivex.rxjava3.internal.operators.flowable.k(rVar, Math.max(0L, 300L), timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null")).subscribe(new dfr0(new skj0(this, 16), 5), new nvm0(new n9b(L.a, 12), 8));
    }

    public final void l() {
        a.C2708a c2708a = a.C2708a.a;
        io.reactivex.rxjava3.processors.c<a> cVar = this.k;
        cVar.onNext(c2708a);
        cVar.onNext(a.b.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            l();
        } else if (i == 1 || i == 2) {
            this.k.onNext(a.C2708a.a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        l();
    }
}
