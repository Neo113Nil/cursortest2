package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;

/* compiled from: RequestsHeaderHolder.kt */
/* loaded from: classes16.dex */
public final class p8g0 extends RecyclerView.e0 {
    public final VkGroupHeader l;

    public p8g0(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.requests_list_header, viewGroup, false));
        this.l = (VkGroupHeader) this.itemView;
    }

    public static void V5(p8g0 p8g0Var, int i) {
        VkGroupHeader vkGroupHeader = p8g0Var.l;
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, i), null, null, null, 0, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE));
    }
}
