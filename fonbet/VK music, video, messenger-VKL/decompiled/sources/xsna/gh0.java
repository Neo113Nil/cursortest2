package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: AdPopupMenuActionHolder.kt */
/* loaded from: classes18.dex */
public final class gh0 extends RecyclerView.e0 {
    public final VkText l;

    public gh0(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.popup_menu_text_item_ad, viewGroup, false));
        this.l = (VkText) this.itemView.findViewById(android.R.id.text1);
    }
}
