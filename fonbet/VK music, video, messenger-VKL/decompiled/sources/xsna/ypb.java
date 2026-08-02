package xsna;

import android.text.TextUtils;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import xsna.iqb;
import xsna.k1u0;
import xsna.spb;
import xsna.tlo0;

/* compiled from: ChatControlsAdapter.kt */
/* loaded from: classes2.dex */
public final class ypb extends vfz<spb.b> {
    public static final /* synthetic */ int o = 0;
    public final View l;
    public final iqb.a m;
    public final VkCell n;

    public ypb(View view, iqb.a aVar) {
        super(view);
        this.l = view;
        this.m = aVar;
        this.n = (VkCell) view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(spb.b bVar) {
        spb.b bVar2 = bVar;
        bwt0.i0(this.itemView, new by5(4, this, bVar2));
        this.l.setId(bVar2.b);
        VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(bVar2.d, VkCell.Left.Main.Size.Medium, k1u0.c.a, (tlo0.h) null, 8));
        VkCell vkCell = this.n;
        vkCell.setLeft(a);
        Object[] objArr = 0 == true ? 1 : 0;
        VkCell.Middle.c cVar = null;
        Object[] objArr2 = 0 == true ? 1 : 0;
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, bVar2.e), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d((tlo0) new tlo0.f(bVar2.f), (gzs) null, 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), cVar, (VkCell.Middle.Size) objArr2, 12));
        VkCell.Right.c cVar2 = VkCell.Right.Companion;
        boolean z = bVar2.c;
        vkCell.setRight(VkCell.Right.c.a(cVar2, new VkCell.Right.a.f(4, new dy0(5, this, bVar2), z), null, null, null, 30));
    }
}
