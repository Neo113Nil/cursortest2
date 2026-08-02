package xsna;

import android.text.TextUtils;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import xsna.ec40;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: MusicActionViewHolder.kt */
/* loaded from: classes3.dex */
public final class r840<T> extends se50<ec40<T>> {
    public final ec40.a<T> n;
    public final VkCell o;

    public r840(View view, ec40.a<T> aVar) {
        super(view);
        this.n = aVar;
        VkCell vkCell = (VkCell) view;
        this.o = vkCell;
        jjc.g(vkCell, new v4w(this, 8));
    }

    @Override // xsna.se50
    public final void b6(Object obj) {
        ec40 ec40Var = (ec40) obj;
        int i = ec40Var.e;
        String a = ec40Var.a(this.itemView.getContext());
        int i2 = ec40Var.a;
        VkCell vkCell = this.o;
        vkCell.setId(i2);
        vkCell.setAlpha(!ec40Var.i ? 1.0f : 0.64f);
        vkCell.setContentDescription(a);
        vkCell.setLeft(i != -1 ? new VkCell.Left.b(new VkCell.Left.Main.c(i, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(ec40Var.f)), oq.d(tlo0.Companion, a)), null) : null);
        tlo0.a aVar = tlo0.Companion;
        String b = ec40Var.b(vkCell.getContext());
        aVar.getClass();
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.h(b), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14));
        jjc.g(vkCell, new hl1(23, ec40Var, this));
    }
}
