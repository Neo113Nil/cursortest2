package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: DashLiveVideoSource.kt */
/* loaded from: classes8.dex */
public final class qsk extends mnz {

    /* compiled from: DashLiveVideoSource.kt */
    public static final class a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qsk(Uri uri, fkz fkzVar) {
        super(r0, uri, r12);
        fkz fkzVar2;
        VideoContentType videoContentType = VideoContentType.DASH;
        if (wn80.d && uri.getQueryParameter("enabled-features") == null) {
            uri = uri.buildUpon().appendQueryParameter("enabled-features", "extended,compact").build();
        }
        if (!wn80.d || fkzVar == null) {
            fkzVar2 = fkzVar;
        } else {
            Uri uri2 = fkzVar.b;
            Uri uri3 = fkzVar.c;
            fkzVar2 = fkz.a(fkzVar, uri2, uri3.getQueryParameter("enabled-features") == null ? uri3.buildUpon().appendQueryParameter("enabled-features", "extended,compact").build() : uri3, 0L, 25);
        }
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        Uri c = sht0.c(this.b, str);
        fkz fkzVar = this.d;
        return new qsk(c, fkzVar != null ? fkz.a(fkzVar, c, sht0.c(fkzVar.c, str), 0L, 25) : null);
    }
}
