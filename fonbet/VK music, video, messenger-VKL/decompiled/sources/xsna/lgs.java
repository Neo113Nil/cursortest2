package xsna;

import android.os.Build;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: FrameworkMuxer.java */
/* loaded from: classes12.dex */
public final class lgs implements dj50 {
    public static final String b;

    static {
        StringBuilder sb = new StringBuilder("android.media:");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        b = sb.toString();
        ImmutableList.a aVar = new ImmutableList.a();
        aVar.d("video/avc", MimeTypes.VIDEO_H263, MimeTypes.VIDEO_MP4V);
        aVar.c("video/hevc");
        if (i >= 33) {
            aVar.c("video/dolby-vision");
        }
        if (i >= 34) {
            aVar.c(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1);
        }
        if (i >= 36) {
            aVar.c("video/apv");
        }
        aVar.g();
        Object[] objArr = {"audio/mp4a-latm", MimeTypes.AUDIO_AMR_NB, MimeTypes.AUDIO_AMR_WB};
        ne7.l(objArr);
        ImmutableList.l(3, objArr);
    }
}
