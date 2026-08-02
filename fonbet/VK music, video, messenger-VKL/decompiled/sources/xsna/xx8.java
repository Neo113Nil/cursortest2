package xsna;

import com.vk.dto.geo.GeoLocation;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.OfflinePodcast;
import java.io.File;
import java.util.Comparator;

/* compiled from: CacheUtils.java */
/* loaded from: classes7.dex */
public final class xx8 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ xx8(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                File file = (File) obj;
                File file2 = (File) obj2;
                long lastModified = file == null ? 0L : file.lastModified();
                long lastModified2 = file2 != null ? file2.lastModified() : 0L;
                if (lastModified2 < lastModified) {
                    return -1;
                }
                return lastModified2 == lastModified ? 0 : 1;
            case 1:
                return jw5.b(((MusicTrack) obj).d, ((MusicTrack) obj2).d);
            case 2:
                return jw5.b(((OfflinePodcast) obj).b.d, ((OfflinePodcast) obj2).b.d);
            case 3:
                return jw5.b(Integer.valueOf(((ido) obj2).c), Integer.valueOf(((ido) obj).c));
            case 4:
                return jw5.b(Integer.valueOf(((GeoLocation) obj).f), Integer.valueOf(((GeoLocation) obj2).f));
            default:
                return jw5.b(((Thread) obj).getName(), ((Thread) obj2).getName());
        }
    }
}
