package xsna;

import com.vk.dto.music.Playlist;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class saa<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b(Boolean.valueOf(((Playlist) t2).f == null), Boolean.valueOf(((Playlist) t).f == null));
    }
}
