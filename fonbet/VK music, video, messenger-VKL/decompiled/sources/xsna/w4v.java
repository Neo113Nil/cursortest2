package xsna;

import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.e;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w4v implements e.d {
    @Override // com.vk.core.view.components.tabs.e.d
    public final void a(VkTabs.c cVar, int i) {
        com.vk.core.view.components.tabs.d dVar = cVar.a;
        int i2 = HighlightEditFragment.h0;
        if (i == 0) {
            dVar.setText(R.string.highlight_selected_stories);
        } else {
            if (i != 1) {
                return;
            }
            dVar.setText(R.string.highlight_all_stories);
        }
    }
}
