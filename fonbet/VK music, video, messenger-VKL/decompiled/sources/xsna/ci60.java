package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: NewsfeedExecutorRecyclerObserver.kt */
/* loaded from: classes4.dex */
public final class ci60 implements zjf0<ol60> {
    public final Executor b;
    public final CopyOnWriteArrayList<zjf0<ol60>> c = new CopyOnWriteArrayList<>();

    public ci60(Executor executor) {
        this.b = executor;
    }

    @Override // xsna.zjf0
    public final void b(RecyclerView.e0 e0Var) {
        this.b.execute(new eo1(5, this, e0Var));
    }

    @Override // xsna.zjf0
    public final void d(RecyclerView.e0 e0Var, ol60 ol60Var) {
        this.b.execute(new pnz(this, e0Var, ol60Var, 1));
    }

    @Override // xsna.zjf0
    public final void e(RecyclerView.e0 e0Var) {
        this.b.execute(new ew4(4, this, e0Var));
    }
}
