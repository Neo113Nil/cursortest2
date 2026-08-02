package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.IconBackgroundStyle;
import com.vk.core.view.components.cell.button.IconSize;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.folders.impl.configure.h;
import com.vkontakte.android.R;

/* compiled from: PeerAddVh.kt */
/* loaded from: classes18.dex */
public final class zs90 extends vfz<xs90> {
    public final ys90 l;

    public zs90(ViewGroup viewGroup, h.b bVar) {
        super(R.layout.vkim_folder_cell_button, viewGroup);
        this.l = bVar;
        VkCellButton vkCellButton = (VkCellButton) this.itemView.findViewById(R.id.vkim_cell_button);
        vkCellButton.setIconBackgroundStyle(IconBackgroundStyle.Circle);
        vkCellButton.a(true, Integer.valueOf(R.drawable.vk_icon_add_outline_28));
        vkCellButton.setIconSize(IconSize.Medium);
        vkCellButton.setTitle(R.string.vkim_contacts_select_peers);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(xs90 xs90Var) {
        this.itemView.setOnClickListener(new yn3(this, xs90Var));
    }
}
