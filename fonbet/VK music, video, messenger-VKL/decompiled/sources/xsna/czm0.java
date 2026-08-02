package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: MusicSubscriptionDetailsAdapter.kt */
/* loaded from: classes3.dex */
public final class czm0 extends se50<Pair<? extends String, ? extends Boolean>> {
    public final VkCell n;
    public final View o;

    public czm0(ViewGroup viewGroup) {
        super(R.layout.music_subscription_part_info, viewGroup);
        this.n = (VkCell) this.itemView.findViewById(R.id.music_subscription_payment_info_cell);
        View findViewById = this.itemView.findViewById(R.id.music_subscription_payment_info_topic_divider);
        bwt0.p0(findViewById, true);
        this.o = findViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.se50
    public final void b6(Pair<? extends String, ? extends Boolean> pair) {
        Pair<? extends String, ? extends Boolean> pair2 = pair;
        VkCell.Middle.b a = VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.music_subscription_label_status), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d((tlo0) new tlo0.h(pair2.i()), (gzs) null, 0, (TextUtils.TruncateAt) (0 == true ? 1 : 0), (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12);
        VkCell vkCell = this.n;
        vkCell.setMiddle(a);
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, pair2.j().booleanValue() ? new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_error_circle_24), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_accent_red)), (Size) null, (tlo0) null, false, (gzs) null, 60) : null, null, null, 29));
    }
}
