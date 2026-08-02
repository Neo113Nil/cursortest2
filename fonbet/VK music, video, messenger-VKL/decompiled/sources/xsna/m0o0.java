package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vkontakte.android.R;

/* compiled from: TagHolderV2.kt */
/* loaded from: classes4.dex */
public final class m0o0 extends vif0<String> {
    public final VkContentBadge n;

    public m0o0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.discover_media_item_tag_v2, 0);
        this.n = (VkContentBadge) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(String str) {
        this.n.setText(str);
    }
}
