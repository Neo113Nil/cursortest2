package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: ClipFeedItemFavoritesStateMapper.kt */
/* loaded from: classes17.dex */
public final class nwc {
    public static etq a(etq etqVar, dtq dtqVar, VideoFile videoFile) {
        boolean z = false;
        boolean z2 = videoFile != null ? !egd.c(videoFile) : etqVar.b;
        if (dtqVar.a.h() && z2) {
            z = true;
        }
        boolean X = videoFile != null ? videoFile.X() : etqVar.c;
        return (etqVar.a == z && etqVar.b == z2 && etqVar.c == X) ? etqVar : new etq(z, z2, X);
    }
}
