package xsna;

import android.content.Context;
import com.vk.core.view.components.search.VkSearchView;

/* compiled from: VkSearchViewFactory.kt */
/* loaded from: classes17.dex */
public final class kiv0 {
    public static VkSearchView a(Context context) {
        VkSearchView vkSearchView = new VkSearchView(context, null, 6, 0);
        vkSearchView.setVoiceActionDelegate(new nrl(context, new acw0(new xim0(vkSearchView, 15)), new o44(0)));
        return vkSearchView;
    }
}
