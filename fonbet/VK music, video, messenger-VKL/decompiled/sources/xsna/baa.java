package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class baa implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ baa(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Boolean.valueOf(((Playlist) obj2).f == null), Boolean.valueOf(((Playlist) obj).f == null));
            case 1:
                return jw5.b(Long.valueOf(((MusicTrack) obj2).z), Long.valueOf(((MusicTrack) obj).z));
            default:
                return jw5.b(((Thread) obj).getName(), ((Thread) obj2).getName());
        }
    }
}
