package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: DashExtendedURLsSource.kt */
/* loaded from: classes8.dex */
public final class psk extends sht0 {
    public psk(Uri uri) {
        super(VideoContentType.DASH, uri, false);
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        return new psk(sht0.c(this.b, str));
    }
}
