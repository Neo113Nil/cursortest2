package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class aaa implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ aaa(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = ((Playlist) obj).o;
                if (str == null) {
                    str = "";
                }
                String str2 = ((Playlist) obj2).o;
                return jw5.b(str, str2 != null ? str2 : "");
            default:
                return jw5.b(((MusicTrack) obj).h, ((MusicTrack) obj2).h);
        }
    }
}
