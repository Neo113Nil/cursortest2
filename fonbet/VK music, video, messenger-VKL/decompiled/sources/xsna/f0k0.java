package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SlideDownItemAnimator.kt */
/* loaded from: classes2.dex */
public final class f0k0 extends androidx.recyclerview.widget.g {
    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    public final boolean w(RecyclerView.e0 e0Var) {
        if (e0Var.getAdapterPosition() == 0) {
            return y(e0Var, (int) e0Var.itemView.getX(), (int) (e0Var.itemView.getY() - e0Var.itemView.getMeasuredHeight()), (int) e0Var.itemView.getX(), (int) e0Var.itemView.getY());
        }
        super.w(e0Var);
        return true;
    }
}
