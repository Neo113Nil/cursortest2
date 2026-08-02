package xsna;

import android.text.TextUtils;
import com.vk.core.view.components.cell.VkCell;
import xsna.k1u0;
import xsna.tlo0;
import xsna.zp0;

/* compiled from: CommonHolder.kt */
/* loaded from: classes5.dex */
public final class hkg extends yp0<zp0.a> {
    public final VkCell o;
    public final izs<zp0.a, s3q0> p;

    public hkg(VkCell vkCell, fd5 fd5Var) {
        super(vkCell);
        this.o = vkCell;
        this.p = fd5Var;
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        tlo0 h;
        zp0.a aVar = (zp0.a) obj;
        int i = aVar.d;
        ut6 ut6Var = new ut6(7, this, aVar);
        VkCell vkCell = this.o;
        bwt0.i0(vkCell, ut6Var);
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(aVar.c, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(aVar.f)), (tlo0.h) null, 8)));
        VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
        if (aVar instanceof zp0.a.f) {
            tlo0.a aVar3 = tlo0.Companion;
            Object[] objArr = {((zp0.a.f) aVar).g};
            aVar3.getClass();
            h = tlo0.a.c(i, objArr);
        } else if (aVar instanceof zp0.a.l) {
            tlo0.a aVar4 = tlo0.Companion;
            Object[] objArr2 = {((zp0.a.l) aVar).g};
            aVar4.getClass();
            h = tlo0.a.c(i, objArr2);
        } else {
            h = tq.h(tlo0.Companion, i);
        }
        vkCell.setMiddle(VkCell.Middle.a.a(aVar2, new VkCell.Middle.e(h, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
    }
}
