package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes10.dex */
public final class dd10 implements cd10, us71 {
    public final int a;
    public MediaCodecInfo[] b;

    public dd10(boolean z, boolean z2, boolean z3) {
        this.a = (z || z2 || z3) ? 1 : 0;
    }

    @Override // defpackage.us71
    public int a() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b.length;
    }

    @Override // defpackage.us71
    public MediaCodecInfo b(int i) {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b[i];
    }

    @Override // defpackage.us71
    public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // defpackage.cd10
    public boolean g(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // defpackage.cd10
    public MediaCodecInfo n(int i) {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b[i];
    }

    @Override // defpackage.cd10
    public boolean q(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.cd10
    public int t() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b.length;
    }

    @Override // defpackage.cd10
    public boolean y() {
        return true;
    }

    public dd10(boolean z, boolean z2) {
        this.a = (z || z2) ? 1 : 0;
    }

    @Override // defpackage.us71
    public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.us71
    public boolean b() {
        return true;
    }
}
