package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: AdPopupMenuActionHolder.kt */
/* loaded from: classes18.dex */
public final class eh0 extends RecyclerView.e0 {
    public final VkText l;
    public final VkImage m;
    public ip6 n;
    public WeakReference<VkContextMenu> o;

    public eh0(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.popup_menu_item_ad, viewGroup, false));
        this.l = (VkText) this.itemView.findViewById(android.R.id.text1);
        this.m = (VkImage) this.itemView.findViewById(android.R.id.icon);
    }
}
