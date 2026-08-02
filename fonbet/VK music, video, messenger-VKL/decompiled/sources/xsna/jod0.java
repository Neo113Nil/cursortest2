package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.Image;
import com.vk.imageloader.view.VKImageView;

/* compiled from: ProductFilterDropdownItemsAdapter.kt */
/* loaded from: classes18.dex */
public final class jod0 extends zoj0<wqd0, RecyclerView.e0> {
    public final ea3 e;

    public jod0(ea3 ea3Var) {
        this.e = ea3Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((wqd0) this.c.c(i)).b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        wqd0 wqd0Var = (wqd0) this.c.c(i);
        if (e0Var instanceof iod0) {
            iod0 iod0Var = (iod0) e0Var;
            VKImageView vKImageView = iod0Var.n;
            iod0Var.m.setText(wqd0Var.c);
            Image image = wqd0Var.d;
            if (image == null) {
                f4m.j(vKImageView);
            } else {
                bwt0.L(vKImageView, image);
            }
            iod0Var.itemView.setOnClickListener(new ikc(2, iod0Var, wqd0Var));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 100 || i == 101) {
            return new iod0(viewGroup, this.e);
        }
        throw new IllegalArgumentException(lhg.a(i, "Unsupported view type "));
    }
}
