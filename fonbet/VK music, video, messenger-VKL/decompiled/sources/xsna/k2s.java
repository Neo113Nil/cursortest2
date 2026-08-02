package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.IconSize;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vkontakte.android.R;
import xsna.j2s;
import xsna.r2s;

/* compiled from: FoldersShowListButtonVh.kt */
/* loaded from: classes18.dex */
public final class k2s extends o2s<j2s> {
    public final j2s.b l;
    public final VkCellButton m;

    public k2s(ViewGroup viewGroup, r2s.a aVar) {
        super(R.layout.vkim_folder_cell_button, viewGroup);
        this.l = aVar;
        VkCellButton vkCellButton = (VkCellButton) this.itemView.findViewById(R.id.vkim_cell_button);
        this.m = vkCellButton;
        vkCellButton.setIconSize(IconSize.Small);
    }

    @Override // xsna.vfz
    public final void W5(Object obj) {
        j2s j2sVar = (j2s) obj;
        j2sVar.getClass();
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_add_outline_28);
        int i = VkCellButton.l;
        VkCellButton vkCellButton = this.m;
        vkCellButton.a(true, valueOf);
        vkCellButton.setTitle(R.string.vkim_folder_add_button_text);
        vkCellButton.setOnClickListener(new nt9(2, this, j2sVar));
    }
}
