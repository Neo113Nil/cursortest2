package xsna;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MsgListVc.kt */
/* loaded from: classes2.dex */
public final class um30 extends RecyclerView.y {
    public final /* synthetic */ vm30 b;

    public um30(vm30 vm30Var) {
        this.b = vm30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        vm30 vm30Var = this.b;
        if (vm30Var.V == null) {
            return false;
        }
        vm30Var.R.a();
        vm30Var.S.a();
        vm30Var.T.a();
        vm30Var.U.a();
        vm30Var.V = null;
        return false;
    }
}
