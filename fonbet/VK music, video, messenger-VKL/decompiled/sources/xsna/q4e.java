package xsna;

import android.content.Context;
import android.view.View;
import com.vk.clips.design.view.favorites.folder.ClipsFoldersCoverView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipsFavoritesFoldersPickerContentView.kt */
/* loaded from: classes16.dex */
public final class q4e implements VkCell.d {
    public final ClipsFoldersCoverView a;

    public q4e(Context context) {
        this.a = new ClipsFoldersCoverView(context, null, 6);
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        r4e r4eVar = fVar instanceof r4e ? (r4e) fVar : null;
        if (r4eVar == null) {
            return;
        }
        ClipsFoldersCoverView.Size size = ClipsFoldersCoverView.Size.SMALL;
        ClipsFoldersCoverView clipsFoldersCoverView = this.a;
        clipsFoldersCoverView.setSize(size);
        clipsFoldersCoverView.setEmptyIconResId(R.drawable.vk_icon_folder_simple_outline_28);
        clipsFoldersCoverView.setImageControllerFactory(new t0v0());
        List<Image> list = r4eVar.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new cmw((Image) it.next()));
        }
        clipsFoldersCoverView.setCoverImages(arrayList);
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
