package xsna;

import androidx.recyclerview.widget.m;
import com.vk.mediastore.system.MediaStoreEntry;

/* compiled from: MediaStoreItemCallback.kt */
/* loaded from: classes15.dex */
public final class fz10 extends m.e<Object> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        if ((obj instanceof MediaStoreEntry) && (obj2 instanceof MediaStoreEntry)) {
            return obj.equals(obj2);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        return ((obj instanceof MediaStoreEntry) && (obj2 instanceof MediaStoreEntry)) ? ((MediaStoreEntry) obj).getId() == ((MediaStoreEntry) obj2).getId() : obj == obj2;
    }
}
