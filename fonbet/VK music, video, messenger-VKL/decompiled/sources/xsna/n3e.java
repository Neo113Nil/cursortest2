package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vkontakte.android.R;

/* compiled from: ClipsFavoriteFoldersListCreateFolderViewHolder.kt */
/* loaded from: classes16.dex */
public final class n3e extends vfz<u3e> {
    public final izs<com.vk.clips.favorites.impl.ui.folders.list.a, s3q0> l;
    public final View m;

    public n3e(ViewGroup viewGroup, ClipsFavoriteFoldersListFragment.b bVar) {
        super(R.layout.clips_favorite_folders_list_create_folder_item, viewGroup);
        this.l = bVar;
        this.m = this.itemView.findViewById(R.id.clips_favorite_folders_new_folder_container);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(u3e u3eVar) {
        u3e u3eVar2 = u3eVar;
        bwt0.i0(this.itemView, new defpackage.o(12, this, u3eVar2));
        this.m.setEnabled(u3eVar2.c);
    }
}
