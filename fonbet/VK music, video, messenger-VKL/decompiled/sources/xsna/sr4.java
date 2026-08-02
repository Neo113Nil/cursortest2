package xsna;

import com.vk.audiomsg.player.Speed;
import com.vk.dto.music.MusicTrack;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class sr4 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ sr4(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Float.valueOf(((Speed) obj).i()), Float.valueOf(((Speed) obj2).i()));
            default:
                return jw5.b(Long.valueOf(((MusicTrack) obj2).z), Long.valueOf(((MusicTrack) obj).z));
        }
    }
}
