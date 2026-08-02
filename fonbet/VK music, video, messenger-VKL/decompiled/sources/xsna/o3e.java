package xsna;

import android.view.ViewGroup;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vkontakte.android.R;

/* compiled from: ClipsFavoriteFoldersListErrorViewHolder.kt */
/* loaded from: classes16.dex */
public final class o3e extends vfz<w3e> {
    public final izs<com.vk.clips.favorites.impl.ui.folders.list.a, s3q0> l;

    public o3e(ViewGroup viewGroup, ClipsFavoriteFoldersListFragment.b bVar) {
        super(R.layout.clips_favorites_folders_picker_footer_error, viewGroup);
        this.l = bVar;
        jjc.g(this.itemView.findViewById(R.id.clips_favorites_footer_error_retry), new sz(this, 21));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final /* bridge */ /* synthetic */ void i6(w3e w3eVar) {
    }
}
