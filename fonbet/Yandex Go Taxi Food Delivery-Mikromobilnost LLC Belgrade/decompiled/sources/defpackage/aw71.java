package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes7.dex */
public final class aw71 implements us71 {
    @Override // defpackage.us71
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.us71
    public final MediaCodecInfo b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.us71
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.us71
    public final boolean b() {
        return false;
    }

    @Override // defpackage.us71
    public final int a() {
        return MediaCodecList.getCodecCount();
    }
}
