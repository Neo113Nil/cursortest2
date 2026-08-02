package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: RtmpVideoSource.kt */
/* loaded from: classes8.dex */
public final class sqg0 extends mnz {
    public sqg0(Uri uri) {
        super(VideoContentType.RTMP, uri, null);
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        return new sqg0(sht0.c(this.b, str));
    }
}
