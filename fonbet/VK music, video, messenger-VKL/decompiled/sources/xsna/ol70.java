package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.TimeUnit;

/* compiled from: NowView.kt */
/* loaded from: classes16.dex */
public final class ol70 extends RecyclerView.t {
    public final /* synthetic */ pl70 b;

    public ol70(pl70 pl70Var) {
        this.b = pl70Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            pl70 pl70Var = this.b;
            io.reactivex.rxjava3.disposables.c scrollToStartDisposable = pl70Var.getScrollToStartDisposable();
            if (scrollToStartDisposable != null) {
                scrollToStartDisposable.dispose();
            }
            io.reactivex.rxjava3.internal.operators.observable.w2 B0 = io.reactivex.rxjava3.core.q.B0(5000L, TimeUnit.MILLISECONDS);
            asu0 asu0Var = asu0.a;
            pl70Var.setScrollToStartDisposable(B0.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new pw40(new ap30(pl70Var, 5), 3)));
        }
    }
}
