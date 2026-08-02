package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.im.engine.models.messages.Msg;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class nd3 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ nd3(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((Msg) obj).d), Integer.valueOf(((Msg) obj2).d));
            case 1:
                return jw5.b(Boolean.valueOf(((Playlist) obj).f == null), Boolean.valueOf(((Playlist) obj2).f == null));
            case 2:
                return jw5.b(Long.valueOf(((MusicTrack) obj2).z), Long.valueOf(((MusicTrack) obj).z));
            default:
                return jw5.b(Integer.valueOf(((lvi0) obj).a.a.getId()), Integer.valueOf(((lvi0) obj2).a.a.getId()));
        }
    }
}
