package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.data.Subscription;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vk.music.ui.subscription.BuyMusicSubscriptionButton;
import com.vkontakte.android.R;
import java.util.Set;
import xsna.ys8;

/* compiled from: MusicSubscriptionDetailsAdapter.kt */
/* loaded from: classes3.dex */
public final class uzm0 extends se50<Subscription> {
    public final ltl n;
    public final VkText o;

    public uzm0(ViewGroup viewGroup, oge0 oge0Var, MusicSubscriptionControlFragment.c cVar) {
        super(R.layout.music_subscription_part_payment, viewGroup);
        this.n = new ltl(oge0Var);
        this.o = (VkText) this.itemView.findViewById(R.id.music_subscription_purchase_details);
        BuyMusicSubscriptionButton buyMusicSubscriptionButton = (BuyMusicSubscriptionButton) this.itemView.findViewById(R.id.music_subscription_purchase_btn);
        buyMusicSubscriptionButton.setModelFactory(new nm60(this, 24));
        buyMusicSubscriptionButton.setPriceResolver(new tzm0());
        buyMusicSubscriptionButton.setOnBuySubscriptionClickedListener(cVar);
    }

    @Override // xsna.se50
    public final void b6(Subscription subscription) {
        Subscription subscription2 = subscription;
        this.n.c = subscription2;
        boolean z = subscription2.t;
        VkText vkText = this.o;
        bwt0.p0(vkText, z);
        ys8.a.getClass();
        Set<String> set = ys8.a.b;
        String str = subscription2.b;
        vkText.setText(vkText.getContext().getString((set.contains(str) || ("combo_android_trial".equals(str) && 90 == subscription2.x)) ? R.string.music_subscription_purchase_trial_details_4_month : R.string.music_subscription_purchase_trial_details, subscription2.d));
    }
}
