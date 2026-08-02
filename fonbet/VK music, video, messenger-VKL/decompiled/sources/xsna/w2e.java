package xsna;

import android.view.ViewGroup;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: ClipsFavoriteFolderContentListErrorViewHolder.kt */
/* loaded from: classes16.dex */
public final class w2e extends vfz<d3e> {
    public final izs<com.vk.clips.favorites.impl.ui.folders.content.a, s3q0> l;

    public w2e(ViewGroup viewGroup, ClipsFavoriteFolderContentListFragment.d dVar) {
        super(R.layout.clips_favorites_folders_picker_footer_error, viewGroup);
        this.l = dVar;
        ((VkText) this.itemView.findViewById(R.id.clips_favorites_footer_error_description)).setText(R.string.clips_favorites_folder_content_error);
        jjc.g(this.itemView.findViewById(R.id.clips_favorites_footer_error_retry), new r9(this, 20));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final /* bridge */ /* synthetic */ void h6(d3e d3eVar) {
    }
}
