package xsna;

import androidx.recyclerview.widget.m;
import com.vk.mediastore.system.MediaStoreEntry;

/* compiled from: GalleryPickerPreviewAdapter.kt */
/* loaded from: classes5.dex */
public final class v4t {
    public static final a a = new a();

    /* compiled from: GalleryPickerPreviewAdapter.kt */
    public static final class a extends m.e<MediaStoreEntry> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(MediaStoreEntry mediaStoreEntry, MediaStoreEntry mediaStoreEntry2) {
            return mediaStoreEntry.equals(mediaStoreEntry2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(MediaStoreEntry mediaStoreEntry, MediaStoreEntry mediaStoreEntry2) {
            return mediaStoreEntry.getId() == mediaStoreEntry2.getId();
        }

        @Override // androidx.recyclerview.widget.m.e
        public final /* bridge */ /* synthetic */ Object getChangePayload(MediaStoreEntry mediaStoreEntry, MediaStoreEntry mediaStoreEntry2) {
            return s3q0.a;
        }
    }
}
