package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.big;

/* compiled from: DividerViewHolder.kt */
/* loaded from: classes7.dex */
public final class hsn extends mj8 {
    public final View m;

    public hsn(ViewGroup viewGroup) {
        super(viewGroup, R.layout.voip_item_divider, 1);
        this.m = this.itemView.findViewById(R.id.voip_call_list_divider);
    }

    @Override // xsna.mj8
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public final void i6(big.a aVar) {
        int i = aVar.b;
        bwt0.e0(this.m, aVar.c, i, aVar.d, 0);
        Integer num = aVar.e;
        if (num == null) {
            this.itemView.setBackground(null);
            return;
        }
        this.itemView.setBackgroundColor(dhr0.t.c(num.intValue()));
    }
}
