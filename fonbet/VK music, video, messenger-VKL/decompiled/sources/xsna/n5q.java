package xsna;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import one.video.player.OneVideoPlayer;

/* compiled from: ExoMediaSourceAnalyticsListener.java */
/* loaded from: classes3.dex */
public class n5q implements one.video.player.e {
    public boolean a = true;

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void d(@NonNull OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, IOException iOException) {
        dst0 dst0Var = bps0.a;
        if (!this.a || dst0Var == null) {
            return;
        }
        Uri uri = lk80Var.a;
        if (uri != null) {
            uri.toString();
        }
        if (iOException instanceof HttpDataSource$InvalidResponseCodeException) {
            int i = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode;
        }
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public void f(@NonNull OneVideoPlayer oneVideoPlayer, lk80 lk80Var, long j, long j2, OneVideoPlayer.DataType dataType) {
        Uri uri;
        dst0 dst0Var = bps0.a;
        if (!this.a || dst0Var == null || (uri = lk80Var.a) == null) {
            return;
        }
        uri.toString();
    }
}
