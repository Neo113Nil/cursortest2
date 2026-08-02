package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;

/* compiled from: MusicSubscriptionDetailsAdapter.kt */
/* loaded from: classes3.dex */
public final class rym0 extends se50<String> {
    public String n;
    public final VkCell o;

    public rym0(ViewGroup viewGroup) {
        super(R.layout.music_subscription_part_management, viewGroup);
        this.o = (VkCell) this.itemView.findViewById(R.id.music_subscription_payment_management_url_cell);
        this.itemView.setOnClickListener(new dd6(this, 9));
    }

    @Override // xsna.se50
    public final void b6(String str) {
        this.n = str;
        this.o.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.control_subscription), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
    }
}
