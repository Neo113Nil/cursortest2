package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.TimeUnit;

/* compiled from: LyricsScrollListener.kt */
/* loaded from: classes3.dex */
public final class mb00 extends RecyclerView.t {
    public final mb40 b;
    public boolean c;
    public boolean d;
    public io.reactivex.rxjava3.disposables.c e;

    public mb00(mb40 mb40Var) {
        this.b = mb40Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i != 1 || this.c) {
            if (this.e == null) {
                this.d = false;
                this.e = io.reactivex.rxjava3.core.q.B0(5L, TimeUnit.SECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new c2y(new rlh(this, 19), 3));
                return;
            }
            return;
        }
        this.d = true;
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.e = null;
        this.b.L2(new jz6(true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (!this.d || Math.abs(i2) <= 35) {
            return;
        }
        this.b.L2(new mz6(i2 > 0));
    }
}
