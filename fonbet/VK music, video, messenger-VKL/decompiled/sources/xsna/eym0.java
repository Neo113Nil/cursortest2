package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: MusicSubscriptionDetailsAdapter.kt */
/* loaded from: classes3.dex */
public final class eym0 extends se50<Pair<? extends String, ? extends String>> {
    public final VkText n;
    public final VkText o;

    public eym0(ViewGroup viewGroup) {
        super(R.layout.music_subscription_part_details, viewGroup);
        this.n = (VkText) this.itemView.findViewById(R.id.music_subscription_details_title);
        this.o = (VkText) this.itemView.findViewById(R.id.music_subscription_details_content);
    }

    @Override // xsna.se50
    public final void b6(Pair<? extends String, ? extends String> pair) {
        Pair<? extends String, ? extends String> pair2 = pair;
        this.n.setText(pair2.i());
        this.o.setText(pair2.j());
    }
}
