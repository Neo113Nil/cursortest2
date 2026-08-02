package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: DashVideoSource.kt */
/* loaded from: classes8.dex */
public final class ftk extends sht0 {
    public ftk(Uri uri) {
        super(VideoContentType.DASH, uri, false);
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        return new ftk(sht0.c(this.b, str));
    }
}
