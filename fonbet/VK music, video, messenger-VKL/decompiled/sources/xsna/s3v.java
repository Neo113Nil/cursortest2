package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.folders.impl.configure.h;
import com.vkontakte.android.R;

/* compiled from: HideFolderVh.kt */
/* loaded from: classes18.dex */
public final class s3v extends vfz<q3v> {
    public final p3v l;

    public s3v(ViewGroup viewGroup, h.b bVar) {
        super(R.layout.vkim_folder_cell_button, viewGroup);
        this.l = bVar;
        VkCellButton vkCellButton = (VkCellButton) this.itemView.findViewById(R.id.vkim_cell_button);
        vkCellButton.setTitle(R.string.vkim_folder_hide_folder_button);
        vkCellButton.setAppearance(Appearance.Negative);
    }

    @Override // xsna.vfz
    public final void W5(q3v q3vVar) {
        this.itemView.setOnClickListener(new e9i(this, 3));
    }
}
