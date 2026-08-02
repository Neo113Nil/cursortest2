package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BaseHistoryAttachesVC.kt */
/* loaded from: classes2.dex */
public final class zd6 extends RecyclerView.t {
    public final /* synthetic */ ae6 b;

    public zd6(ae6 ae6Var) {
        this.b = ae6Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ae6 ae6Var = this.b;
        if (ae6Var.d(recyclerView) >= ae6Var.e().getItemCount() - 51) {
            c8v c8vVar = ae6Var.a;
            if (c8vVar.d1().getState().Bb().isEmpty() || c8vVar.r == null || c8vVar.d1().getState().Db()) {
                return;
            }
            c8vVar.I0(new io.reactivex.rxjava3.internal.operators.single.n(c8vVar.i1(c8vVar.n, c8vVar.r), new pp3(new e2s(c8vVar, 3), 24)).subscribe(new b60(new n3i(c8vVar, 27), 29), new a8v(new f2s(c8vVar, 10), 0)));
        }
    }
}
