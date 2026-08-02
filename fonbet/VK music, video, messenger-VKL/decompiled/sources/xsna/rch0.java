package xsna;

import android.view.Choreographer;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.agh0;

/* compiled from: ScreenScrollPerformanceChecker.kt */
/* loaded from: classes3.dex */
public final class rch0 {
    public static final Pair<Long, Integer> c = new Pair<>(0L, 0);
    public final dx90 a;
    public final agh0 b;

    public rch0(Choreographer choreographer, dx90 dx90Var) {
        this.a = dx90Var;
        this.b = new agh0(choreographer);
    }

    public final void a(ScrollScreenType scrollScreenType, RecyclerView recyclerView) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        gfs gfsVar = new gfs(this.b.a, new sch0(this, scrollScreenType, new p1d0(ref$BooleanRef, 7)));
        agh0.a aVar = new agh0.a(gfsVar);
        View.OnAttachStateChangeListener bgh0Var = new bgh0(gfsVar, recyclerView, aVar);
        recyclerView.addOnScrollListener(aVar);
        recyclerView.addOnAttachStateChangeListener(bgh0Var);
        recyclerView.addOnAttachStateChangeListener(new a(ref$BooleanRef, recyclerView));
    }

    public final void b(ScrollScreenType scrollScreenType, long j, int i, long j2, int i2, boolean z) {
        dx90 dx90Var = this.a;
        dx90Var.getClass();
        Pair<Long, Integer> j3 = dx90.j(scrollScreenType, z);
        Pair<Long, Integer> pair = c;
        if (j3 == null) {
            j3 = pair;
        }
        Pair<Long, Integer> k = dx90.k(scrollScreenType, z);
        if (k != null) {
            pair = k;
        }
        long longValue = j + j3.i().longValue();
        int intValue = i + j3.j().intValue();
        long longValue2 = j2 + pair.i().longValue();
        int intValue2 = i2 + pair.j().intValue();
        dx90Var.getClass();
        dx90.v(scrollScreenType, longValue, intValue, longValue2, intValue2, z);
    }

    /* compiled from: ScreenScrollPerformanceChecker.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final io.reactivex.rxjava3.disposables.c b;
        public final /* synthetic */ RecyclerView c;

        public a(Ref$BooleanRef ref$BooleanRef, RecyclerView recyclerView) {
            this.c = recyclerView;
            this.b = io.reactivex.rxjava3.core.a.r(dx90.V, TimeUnit.MILLISECONDS).subscribe(new oua(ref$BooleanRef, 5));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.dispose();
            this.c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
