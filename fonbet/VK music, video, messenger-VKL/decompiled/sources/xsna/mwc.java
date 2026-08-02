package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;

/* compiled from: ClipFeedItemDislikesStateMapper.kt */
/* loaded from: classes17.dex */
public final class mwc {
    public static ybn a(ybn ybnVar, xbn xbnVar, VideoFile videoFile) {
        boolean z = false;
        boolean z2 = videoFile == null ? ybnVar.b : (o25.a().a(videoFile.I0()) || egd.c(videoFile)) ? false : true;
        boolean z3 = xbnVar.a.h() && z2;
        if (videoFile == null) {
            z = ybnVar.c;
        } else if ((videoFile instanceof ClipVideoFile) && ((ClipVideoFile) videoFile).X1) {
            z = true;
        }
        return (ybnVar.a == z3 && ybnVar.b == z2 && ybnVar.c == z) ? ybnVar : new ybn(z3, z2, z);
    }
}
