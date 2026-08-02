package xsna;

import android.view.ViewGroup;
import com.vk.clips.design.view.favorites.folder.ClipsFoldersCoverView;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.tlo0;

/* compiled from: ClipsFavoriteFoldersListFolderViewHolder.kt */
/* loaded from: classes16.dex */
public final class p3e extends vfz<v3e> {
    public final izs<com.vk.clips.favorites.impl.ui.folders.list.a, s3q0> l;
    public final ClipsFoldersCoverView m;
    public final VkText n;
    public final VkText o;

    public p3e(ViewGroup viewGroup, ClipsFavoriteFoldersListFragment.b bVar) {
        super(R.layout.clips_favorite_folders_list_folder_item, viewGroup);
        this.l = bVar;
        ClipsFoldersCoverView clipsFoldersCoverView = (ClipsFoldersCoverView) this.itemView.findViewById(R.id.favorite_folder_cover);
        this.m = clipsFoldersCoverView;
        this.n = (VkText) this.itemView.findViewById(R.id.favorite_folder_title);
        this.o = (VkText) this.itemView.findViewById(R.id.favorite_folder_description);
        clipsFoldersCoverView.setImageControllerFactory(new t0v0());
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(v3e v3eVar) {
        v3e v3eVar2 = v3eVar;
        CharSequence a = tlo0.b.a(v3eVar2.e, this.itemView.getContext());
        String obj = a != null ? a.toString() : null;
        if (obj == null) {
            obj = "";
        }
        bwt0.i0(this.itemView, new eo3(this, v3eVar2, obj, 3));
        List<Image> list = v3eVar2.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new cmw((Image) it.next()));
        }
        this.m.setCoverImages(arrayList);
        this.n.setText(obj);
        this.o.setText(v3eVar2.f.a(this.itemView.getContext()));
    }
}
