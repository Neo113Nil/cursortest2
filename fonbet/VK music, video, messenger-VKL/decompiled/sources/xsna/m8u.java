package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: GoodTextDescriptionItemHolder.kt */
/* loaded from: classes18.dex */
public final class m8u extends vif0<n8u> {
    public final VkCell n;

    public m8u(ViewGroup viewGroup) {
        super(viewGroup, R.layout.goods_text_descrtiption_item_holder, 0);
        this.n = (VkCell) this.itemView.findViewById(R.id.goods_text_description);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(n8u n8uVar) {
        n8u n8uVar2 = n8uVar;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this.n.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, n8uVar2.a), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.h(n8uVar2.b), (gzs) objArr2, 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
    }
}
