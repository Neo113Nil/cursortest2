package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: HlsVideoSource.kt */
/* loaded from: classes8.dex */
public final class x9v extends sht0 {
    public x9v(Uri uri) {
        super(VideoContentType.HLS, uri, false);
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        return new x9v(sht0.c(this.b, str));
    }
}
