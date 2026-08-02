package xsna;

import android.text.TextUtils;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: MusicActionViewHolder.kt */
/* loaded from: classes3.dex */
public final class q840 extends n840 {
    public final izs<lc50, s3q0> l;
    public final VkCell m;
    public tc50 n;

    /* JADX WARN: Multi-variable type inference failed */
    public q840(View view, izs<? super lc50, s3q0> izsVar) {
        super(view);
        this.l = izsVar;
        VkCell vkCell = (VkCell) view;
        this.m = vkCell;
        jjc.g(vkCell, new kn20(this, 5));
    }

    @Override // xsna.n840
    public final void V5(tc50 tc50Var) {
        int i = tc50Var.e;
        this.n = tc50Var;
        int i2 = tc50Var.c;
        boolean z = i2 != 0;
        int i3 = tc50Var.a;
        VkCell vkCell = this.m;
        vkCell.setId(i3);
        vkCell.setContentDescription(vkCell.getContext().getString(i));
        VkCell.Left.b bVar = null;
        if (z) {
            VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
            k1u0.a aVar = new k1u0.a(new x7g(tc50Var.f));
            tlo0.a aVar2 = tlo0.Companion;
            String string = vkCell.getContext().getString(i);
            aVar2.getClass();
            bVar = new VkCell.Left.b(new VkCell.Left.Main.c(i2, size, aVar, new tlo0.h(string)), null);
        }
        vkCell.setLeft(bVar);
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, vkCell.getContext().getString(tc50Var.d)), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14));
    }
}
