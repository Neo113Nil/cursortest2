package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.lc50;
import xsna.tlo0;

/* compiled from: MusicActionWithSubtitleViewHolder.kt */
/* loaded from: classes3.dex */
public final class t840 extends n840 {
    public final izs<lc50, s3q0> l;
    public final VkCell m;
    public tc50 n;

    /* JADX WARN: Multi-variable type inference failed */
    public t840(View view, izs<? super lc50, s3q0> izsVar) {
        super(view);
        this.l = izsVar;
        VkCell vkCell = (VkCell) view;
        this.m = vkCell;
        jjc.g(vkCell, new j4x(this, 17));
    }

    @Override // xsna.n840
    public final void V5(tc50 tc50Var) {
        String str;
        int i = tc50Var.c;
        lc50.c cVar = tc50Var.b;
        if (cVar instanceof lc50.c.u) {
            this.n = tc50Var;
            String string = this.itemView.getContext().getString(tc50Var.e);
            int i2 = tc50Var.a;
            VkCell vkCell = this.m;
            vkCell.setId(i2);
            vkCell.setContentDescription(string);
            vkCell.setLeft(i != 0 ? new VkCell.Left.b(new VkCell.Left.Main.c(i, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(tc50Var.f)), oq.d(tlo0.Companion, string)), null) : null);
            tlo0.h d = oq.d(tlo0.Companion, vkCell.getContext().getString(tc50Var.d));
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            VkCell.Middle.e eVar = new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
            if (cVar instanceof lc50.c.u.a) {
                Context context = this.itemView.getContext();
                lc50.c.u.a aVar = (lc50.c.u.a) cVar;
                str = aVar.b ? context.getString(R.string.equalizer_turned_on, context.getString(bup.b(aVar.c))) : context.getString(R.string.equalizer_turned_off);
            } else {
                str = "";
            }
            vkCell.setMiddle(new VkCell.Middle.b(eVar, new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        }
    }
}
