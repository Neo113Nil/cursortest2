package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.vk.dto.common.Attachment;
import java.util.ArrayList;

/* compiled from: AttachmentsTouchHelper.kt */
/* loaded from: classes4.dex */
public final class t84 extends r.d {
    public final pcc0 e;

    public t84(pcc0 pcc0Var) {
        this.e = pcc0Var;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void b(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        e0Var.itemView.setAlpha(1.0f);
        super.b(recyclerView, e0Var);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        return r.d.l(e0Var instanceof eh ? 0 : 3, 0);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean j() {
        return false;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean k() {
        return true;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        int adapterPosition = e0Var.getAdapterPosition();
        int adapterPosition2 = e0Var2.getAdapterPosition();
        val valVar = this.e.n;
        ArrayList arrayList = valVar.f;
        if (adapterPosition == 0 || adapterPosition2 == 0) {
            return false;
        }
        a4d0 a4d0Var = valVar.g;
        int q = a4d0Var != null ? a4d0Var.G.q() : 0;
        arrayList.add((q + adapterPosition2) - 1, (Attachment) arrayList.remove((adapterPosition + q) - 1));
        valVar.a.A0(adapterPosition, adapterPosition2);
        return true;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void o(RecyclerView.e0 e0Var, int i) {
        View view;
        if (e0Var == null || (view = e0Var.itemView) == null) {
            return;
        }
        view.performHapticFeedback(0);
        view.setAlpha(0.75f);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void p(RecyclerView.e0 e0Var) {
    }
}
