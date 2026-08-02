package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: HlsLiveVideoSource.kt */
/* loaded from: classes8.dex */
public final class f9v extends mnz {
    public f9v(Uri uri, fkz fkzVar) {
        super(VideoContentType.HLS, uri, fkzVar);
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        Uri c = sht0.c(this.b, str);
        fkz fkzVar = this.d;
        return new f9v(c, fkzVar != null ? fkz.a(fkzVar, c, sht0.c(fkzVar.c, str), 0L, 25) : null);
    }
}
