package xsna;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.newsfeed.FaveTag;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: TagFilterHolder.kt */
/* loaded from: classes18.dex */
public final class j0o0 extends vif0<FaveTag> {
    public final izs<FaveTag, s3q0> n;
    public final defpackage.m0 o;
    public final VkCell p;

    public j0o0(ViewGroup viewGroup, p5e p5eVar, defpackage.m0 m0Var) {
        super(viewGroup, R.layout.tag_filter_holder, 0);
        this.n = p5eVar;
        this.o = m0Var;
        View view = this.itemView;
        this.p = (VkCell) view;
        bwt0.i0(view, new qjl0(this, 5));
    }

    @Override // xsna.vif0
    public final void i6(FaveTag faveTag) {
        String string;
        FaveTag faveTag2 = faveTag;
        boolean f = epx.f(this.o.get(), faveTag2);
        if (faveTag2 == null || (string = faveTag2.c) == null) {
            string = this.itemView.getContext().getString(R.string.fave_any_tag);
        }
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.a aVar2 = tlo0.Companion;
        ucp ucpVar = ucp.a;
        VkCell.Middle.b a = VkCell.Middle.a.a(aVar, new VkCell.Middle.e(u11.f(aVar2, ucp.i(string)), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14);
        VkCell vkCell = this.p;
        vkCell.setMiddle(a);
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.a(6, null, f), null, 27));
    }
}
