package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: MusicSubscriptionDetailsAdapter.kt */
/* loaded from: classes3.dex */
public final class dzm0 extends se50<String> {
    public final VkCell n;

    public dzm0(ViewGroup viewGroup) {
        super(R.layout.music_subscription_part_info, viewGroup);
        this.n = (VkCell) this.itemView.findViewById(R.id.music_subscription_payment_info_cell);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.se50
    public final void b6(String str) {
        Object[] objArr = 0 == true ? 1 : 0;
        this.n.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.music_subscription_label_payment_type), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d((tlo0) new tlo0.h(str), (gzs) null, 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
    }
}
