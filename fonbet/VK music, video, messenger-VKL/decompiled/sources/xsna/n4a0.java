package xsna;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;

/* compiled from: PhotoAdapter.kt */
/* loaded from: classes16.dex */
public final class n4a0 extends androidx.recyclerview.widget.x<MediaStoreEntry, a> {

    /* compiled from: PhotoAdapter.kt */
    public final class a extends RecyclerView.e0 {
        public final VkPicture l;

        public a(View view) {
            super(view);
            this.l = (VkPicture) view.findViewById(R.id.clips_entry_point_photo_preview);
        }
    }

    public n4a0() {
        super(r4a0.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).l.m0(getItem(i).f(), new Size(cn70.b(48), cn70.b(48)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(bwt0.I(R.layout.clips_entry_point_photo_item, viewGroup, false));
    }
}
