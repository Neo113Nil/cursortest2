package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: LocalVideoSource.kt */
/* loaded from: classes8.dex */
public final class hwz extends sht0 {
    public hwz(Uri uri) {
        super(VideoContentType.LOCAL, uri, false);
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        return new hwz(sht0.c(this.b, str));
    }
}
