package yads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes10.dex */
public final class ul1 implements tl1 {
    @Override // yads.tl1
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // yads.tl1
    public final boolean b() {
        return false;
    }

    @Override // yads.tl1
    public final MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // yads.tl1
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // yads.tl1
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
