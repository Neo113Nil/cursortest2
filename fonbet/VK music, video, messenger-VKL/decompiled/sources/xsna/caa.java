package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class caa implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ caa(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(((MusicTrack) obj).h, ((MusicTrack) obj2).h);
            default:
                return jw5.b(((AudioBook) obj).c, ((AudioBook) obj2).c);
        }
    }
}
