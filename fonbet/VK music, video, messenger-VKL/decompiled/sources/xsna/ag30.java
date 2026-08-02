package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: Mp4VideoSource.kt */
/* loaded from: classes8.dex */
public final class ag30 extends sht0 {
    public ag30(Uri uri) {
        super(VideoContentType.MP4, uri, false);
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        return new ag30(sht0.c(this.b, str));
    }
}
