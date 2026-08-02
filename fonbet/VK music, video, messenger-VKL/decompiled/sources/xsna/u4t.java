package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;

/* compiled from: GalleryPickerPreviewAdapter.kt */
/* loaded from: classes5.dex */
public final class u4t extends androidx.recyclerview.widget.x<MediaStoreEntry, RecyclerView.e0> {
    public final nu0 c;

    public u4t(nu0 nu0Var) {
        super(v4t.a);
        this.c = nu0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof u4d0) {
            ((u4d0) e0Var).V5(getItem(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new u4d0(tf3.b(viewGroup, R.layout.gallery_picker_preview_item, viewGroup, false), this.c);
    }
}
