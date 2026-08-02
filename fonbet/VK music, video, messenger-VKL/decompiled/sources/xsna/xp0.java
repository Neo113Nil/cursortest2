package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.zp0;

/* compiled from: AdditionalActionAdapter.kt */
/* loaded from: classes5.dex */
public final class xp0 extends zoj0<zp0, yp0<?>> {
    public final fd5 e;
    public final xwl f;
    public final tfm0 g;
    public final ArrayList h = new ArrayList();

    public xp0(fd5 fd5Var, xwl xwlVar, tfm0 tfm0Var) {
        this.e = fd5Var;
        this.f = xwlVar;
        this.g = tfm0Var;
    }

    public static VkCell K0(Context context) {
        VkCell vkCell = new VkCell(context, null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return vkCell;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((zp0) this.c.c(i)).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        yp0 yp0Var = (yp0) e0Var;
        boolean z = yp0Var instanceof q9d0;
        uuk uukVar = this.c;
        if (z) {
            ((q9d0) yp0Var).V5((zp0.b.a) uukVar.c(i));
        } else if (yp0Var instanceof v0i0) {
            ((v0i0) yp0Var).V5((zp0.b.C4193b) uukVar.c(i));
        } else if (yp0Var instanceof iqo0) {
            ((iqo0) yp0Var).V5((zp0.b.c) uukVar.c(i));
        } else if (yp0Var instanceof hkg) {
            ((hkg) yp0Var).V5((zp0.a) uukVar.c(i));
        }
        this.h.add(yp0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        xwl xwlVar = this.f;
        return i != 1 ? i != 2 ? i != 3 ? new hkg(K0(viewGroup.getContext()), this.e) : new iqo0(K0(viewGroup.getContext()), xwlVar) : new v0i0(K0(viewGroup.getContext()), xwlVar) : new q9d0(tf3.b(viewGroup, R.layout.item_additional_primary, viewGroup, false), xwlVar, this.g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        yp0 yp0Var = (yp0) e0Var;
        super.onViewRecycled(yp0Var);
        this.h.remove(yp0Var);
    }
}
