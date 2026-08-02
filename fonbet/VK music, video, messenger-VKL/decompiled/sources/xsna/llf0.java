package xsna;

import com.vk.dto.music.MusicTrack;
import xsna.dz40;

/* compiled from: RedesignMusicRenderProvider.kt */
/* loaded from: classes3.dex */
public final class llf0 extends oyf0<dz40.t> {
    public static String b(MusicTrack musicTrack) {
        String str = musicTrack.d;
        if (str == null) {
            str = "";
        }
        String str2 = musicTrack.e;
        if (str2 == null || drm0.N(str2)) {
            return str;
        }
        return str + " (" + drm0.q0(str2, '(', ')') + ')';
    }
}
