package xsna;

import com.vk.dto.music.Playlist;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class paa implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ paa(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(((Playlist) obj).h, ((Playlist) obj2).h);
            default:
                return jw5.b(Integer.valueOf(((cne) obj).a), Integer.valueOf(((cne) obj2).a));
        }
    }
}
