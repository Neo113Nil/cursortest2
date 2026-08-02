package xsna;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Set;

/* compiled from: MusicBuySubscriptionPageViewComboUpgradeFactory.kt */
/* loaded from: classes3.dex */
public final class tc40 extends b920 {
    public final bpn0 c = new bpn0(new xu0(23));

    @Override // xsna.b920
    public final ViewGroup i(LinearLayout linearLayout, int i, f950 f950Var, Set set) {
        if (i == 0) {
            return b920.g(linearLayout, R.string.music_buy_subscription_bottomsheet_combo_header, (List) this.c.getValue(), true, f950Var, set, R.string.music_buy_subscription_bottomsheet_combo_subtitle, R.string.music_buy_subscription_bottomsheet_combo_button_title, true);
        }
        throw new RuntimeException(tgw.b(i, "Something wrong! position:", " of 1"));
    }

    @Override // xsna.b920
    public final int m() {
        return 1;
    }
}
