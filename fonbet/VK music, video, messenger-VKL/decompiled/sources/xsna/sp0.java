package xsna;

import com.vk.clips.design.view.actionlinks.holders.tip.ItemTipView;
import com.vk.lists.RecyclerPaginatedView;

/* compiled from: AddWallView.kt */
/* loaded from: classes7.dex */
public final class sp0 implements qp0 {
    public final dz20 b;
    public ItemTipView c;
    public int d;
    public rp0 e;
    public RecyclerPaginatedView f;
    public dw20 g;

    public sp0(dz20 dz20Var) {
        this.b = dz20Var;
    }

    @Override // xsna.qp0
    public final ItemTipView Ni() {
        ItemTipView itemTipView = this.c;
        if (itemTipView == null) {
            itemTipView = null;
        }
        itemTipView.setVisibility(0);
        ItemTipView itemTipView2 = this.c;
        if (itemTipView2 != null) {
            return itemTipView2;
        }
        return null;
    }

    @Override // xsna.qp0
    public final void Pd() {
        ItemTipView itemTipView = this.c;
        if (itemTipView == null) {
            itemTipView = null;
        }
        f4m.j(itemTipView);
    }

    @Override // xsna.xpj
    public final void dismiss() {
        dw20 dw20Var = this.g;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        this.g = null;
    }
}
