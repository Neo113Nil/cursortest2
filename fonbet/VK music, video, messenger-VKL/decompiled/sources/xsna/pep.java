package xsna;

import android.view.View;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;

/* compiled from: EmptyArchiveVc.kt */
/* loaded from: classes2.dex */
public final class pep extends eyy {
    @Override // xsna.eyy
    public final void b(View view) {
        VkPlaceholder vkPlaceholder = (VkPlaceholder) view.findViewById(R.id.empty);
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_archive_outline_56), new b8g(dhr0.Y(R.attr.vk_ui_icon_secondary, vkPlaceholder.getContext())), null, 12));
        int i = 2;
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(i, (tlo0) null), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.vkim_dialogs_list_empty_archive))));
    }

    public final void c(boolean z) {
        if (z) {
            a();
            View view = this.d;
            (view != null ? view : null).setVisibility(0);
        } else if (this.c) {
            View view2 = this.d;
            f4m.j(view2 != null ? view2 : null);
        }
    }
}
