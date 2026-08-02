package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: GoodArrowItemHolder.kt */
/* loaded from: classes18.dex */
public final class tl3 extends vif0<ul3> implements UsableRecyclerView.e {
    public final VkCell n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tl3(ViewGroup viewGroup) {
        super(r0);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.n = (VkCell) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(ul3 ul3Var) {
        ul3 ul3Var2 = ul3Var;
        String str = ul3Var2.c;
        VkCell.Middle.b bVar = new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, ul3Var2.b), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (str == null || str.length() == 0) ? null : new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12);
        VkCell vkCell = this.n;
        vkCell.setMiddle(bVar);
        vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, ul3Var2.d ? new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7) : null, 23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        gzs<s3q0> gzsVar;
        ul3 ul3Var = (ul3) this.m;
        if (ul3Var == null || (gzsVar = ul3Var.a) == null) {
            return;
        }
        gzsVar.invoke();
    }
}
