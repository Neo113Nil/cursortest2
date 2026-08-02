package xsna;

import com.vk.dto.music.MusicTrack;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class taa implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ taa(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(((MusicTrack) obj).d, ((MusicTrack) obj2).d);
            default:
                return jw5.b(((h6y0) obj).a, ((h6y0) obj2).a);
        }
    }
}
