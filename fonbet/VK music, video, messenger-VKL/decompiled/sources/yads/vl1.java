package yads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes10.dex */
public final class vl1 implements tl1 {
    public final int a;
    public MediaCodecInfo[] b;

    public vl1(boolean z, boolean z2) {
        this.a = (z || z2) ? 1 : 0;
    }

    @Override // yads.tl1
    public final int a() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b.length;
    }

    @Override // yads.tl1
    public final boolean b() {
        return true;
    }

    @Override // yads.tl1
    public final MediaCodecInfo a(int i) {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b[i];
    }

    @Override // yads.tl1
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // yads.tl1
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
