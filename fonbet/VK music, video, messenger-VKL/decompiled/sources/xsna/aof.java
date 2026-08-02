package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ClipsViewedTimeChecker.kt */
/* loaded from: classes17.dex */
public final class aof extends jm6<lde> {
    public final oce k;

    public aof(RecyclerView recyclerView, oce oceVar) {
        super(recyclerView, new ynf(), new q5u0(0.8f, 0.8f));
        this.k = oceVar;
        recyclerView.addOnScrollListener(new znf(this));
    }

    @Override // xsna.jm6
    public final lde c(RecyclerView.e0 e0Var) {
        return (lde) this.k.invoke(e0Var);
    }
}
