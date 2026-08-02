package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.group.footer.VkGroupFooter;
import com.vk.core.view.components.group.footer.VkGroupFooter$Content$Loader$Size;

/* compiled from: CommunitiesVerticalPaginationViewVkUi.kt */
/* loaded from: classes16.dex */
public final class xog extends x6s {
    @Override // xsna.x6s
    public final View a(Context context, ViewGroup viewGroup) {
        if (context == null) {
            return null;
        }
        VkGroupFooter vkGroupFooter = new VkGroupFooter(context, null, 6);
        vkGroupFooter.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkGroupFooter.setContent(new com.vk.core.view.components.group.footer.c(VkGroupFooter$Content$Loader$Size.M));
        return vkGroupFooter;
    }
}
