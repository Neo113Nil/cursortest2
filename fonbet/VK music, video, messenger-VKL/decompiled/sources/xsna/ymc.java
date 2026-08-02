package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: ClipCheckerImpl.kt */
/* loaded from: classes16.dex */
public final class ymc implements xmc {
    public final zof a;

    public ymc(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.xmc
    public final boolean c(VideoFile videoFile) {
        return this.a.k() && videoFile.C2();
    }

    @Override // xsna.xmc
    public final boolean d(VideoFile videoFile) {
        if (c(videoFile)) {
            return true;
        }
        this.a.getClass();
        return false;
    }
}
