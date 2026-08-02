package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: FrameVideoSource.kt */
/* loaded from: classes8.dex */
public final class fgs extends sht0 {
    public final rva0 d;

    public fgs(rva0 rva0Var) {
        super(VideoContentType.FRAME, Uri.EMPTY, false);
        this.d = rva0Var;
    }

    @Override // xsna.sht0
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return epx.f(this.d, ((fgs) obj).d);
        }
        return false;
    }

    @Override // xsna.sht0
    public final int hashCode() {
        return this.d.hashCode() + (super.hashCode() * 31);
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        return this;
    }
}
