package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;

/* compiled from: BirthdaysListSectionHeaderHolder.kt */
/* loaded from: classes15.dex */
public final class bb7 extends vfz<jb7> {
    public final VkGroupHeader l;

    public bb7(ViewGroup viewGroup) {
        super(R.layout.birthdays_list_section_header, viewGroup);
        this.l = (VkGroupHeader) this.itemView;
    }

    @Override // xsna.vfz
    public final void W5(jb7 jb7Var) {
        this.l.setTitle(new VkGroupHeader.d(jb7Var.b, null, null, null, 0, null, 510));
    }
}
