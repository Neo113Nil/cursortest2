package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import xsna.ugy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class wcz0 extends RecyclerView.Adapter {
    public List c = new ArrayList();
    public final ugy0.a d;

    public wcz0(ugy0.a aVar) {
        this.d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        dfz0 dfz0Var = (dfz0) e0Var;
        puy0 puy0Var = (puy0) this.c.get(i);
        if (puy0Var.a.t != null) {
            qgz0 qgz0Var = dfz0Var.l;
            qgz0Var.setOnClickListener(new q690(2, dfz0Var, puy0Var));
            kiw kiwVar = puy0Var.a.t;
            if (kiwVar != null) {
                qgz0Var.getAdImageView().setImageBitmap(kiwVar.a());
            }
            if (puy0Var.b) {
                qgz0Var.getSharedContainer().setVisibility(0);
            } else {
                qgz0Var.getSharedContainer().setVisibility(8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new dfz0(new qgz0(viewGroup.getContext()), this.d);
    }
}
