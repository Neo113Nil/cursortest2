package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: ProductFilterDropdownItemHolder.kt */
/* loaded from: classes18.dex */
public final class iod0 extends RecyclerView.e0 {
    public final izs<wqd0, s3q0> l;
    public final TextView m;
    public final VKImageView n;

    public iod0(ViewGroup viewGroup, ea3 ea3Var) {
        super(bwt0.I(R.layout.product_filter_dropdown_params_item, viewGroup, false));
        this.l = ea3Var;
        this.m = (TextView) this.itemView.findViewById(R.id.text);
        this.n = (VKImageView) this.itemView.findViewById(R.id.icon);
    }
}
