package xsna;

import com.vk.dto.common.Source;

/* compiled from: VideoMessageStencilSyncManager.kt */
/* loaded from: classes.dex */
public final class lts0 {
    public final w2w a;
    public fz3 b;

    public lts0(w2w w2wVar) {
        this.a = w2wVar;
    }

    public final synchronized void a() {
        if (this.b == null) {
            this.b = this.a.J0(this, new bxs0(Source.ACTUAL));
        }
    }

    public final String toString() {
        return "VideoMsgShapesSyncManager";
    }
}
