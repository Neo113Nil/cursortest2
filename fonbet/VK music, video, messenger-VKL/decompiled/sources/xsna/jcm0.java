package xsna;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.picture.VkImage;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;

/* compiled from: StorySelectedItemsAdapter.kt */
/* loaded from: classes6.dex */
public final class jcm0 extends androidx.recyclerview.widget.x<MediaStoreEntry, b> {
    public static final a d = new a();
    public static final int e = iah0.a(36);
    public static final int f = iah0.a(48);
    public final f6m0 c;

    /* compiled from: StorySelectedItemsAdapter.kt */
    public static final class a extends m.e<MediaStoreEntry> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(MediaStoreEntry mediaStoreEntry, MediaStoreEntry mediaStoreEntry2) {
            return mediaStoreEntry.equals(mediaStoreEntry2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(MediaStoreEntry mediaStoreEntry, MediaStoreEntry mediaStoreEntry2) {
            return mediaStoreEntry.getId() == mediaStoreEntry2.getId();
        }
    }

    /* compiled from: StorySelectedItemsAdapter.kt */
    public final class b extends RecyclerView.e0 {
        public final VkImage l;
        public MediaStoreEntry m;

        public b(jcm0 jcm0Var, View view) {
            super(view);
            this.l = (VkImage) view.findViewById(R.id.story_media_picker_photo_preview);
            bwt0.i0(view, new kp5(27, this, jcm0Var));
        }
    }

    public jcm0(f6m0 f6m0Var) {
        super(d);
        this.c = f6m0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        b bVar = (b) e0Var;
        MediaStoreEntry item = getItem(i);
        bVar.m = item;
        bVar.l.m0(item.f(), new Size(e, f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(this, bwt0.I(R.layout.story_media_picker_selected_photo_item, viewGroup, false));
    }
}
