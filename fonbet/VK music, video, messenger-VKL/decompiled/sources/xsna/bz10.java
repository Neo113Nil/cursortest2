package xsna;

import com.vk.mediastore.system.MediaStoreEntry;
import java.util.Comparator;

/* compiled from: MediaStoreComparatorsFactory.kt */
/* loaded from: classes3.dex */
public final class bz10<T extends MediaStoreEntry> implements Comparator<T> {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return epx.h(((MediaStoreEntry) obj2).d(), ((MediaStoreEntry) obj).d());
    }
}
