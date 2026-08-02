package one.video.exo.error;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import java.io.IOException;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoSourceException;
import one.video.player.error.ResponseInfo;
import xsna.emb;
import xsna.sjs0;
import xsna.xvk;

/* compiled from: OneVideoExoSourceException.kt */
/* loaded from: classes8.dex */
public final class OneVideoExoSourceException extends OneVideoSourceException {
    private final OneVideoPlayer.DataType dataType;
    private final OneVideoSourceException.a invalidResponseCodeInfo;
    private final boolean isHLSPlayListStuckException;

    public OneVideoExoSourceException(IOException iOException) {
        super(iOException);
        OneVideoSourceException.a aVar;
        ResponseInfo responseInfo;
        Throwable cause = getCause();
        HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = cause instanceof HttpDataSource$InvalidResponseCodeException ? (HttpDataSource$InvalidResponseCodeException) cause : null;
        if (httpDataSource$InvalidResponseCodeException != null) {
            String str = new String(httpDataSource$InvalidResponseCodeException.responseBody, emb.b);
            int i = httpDataSource$InvalidResponseCodeException.responseCode;
            String str2 = httpDataSource$InvalidResponseCodeException.responseMessage;
            try {
                responseInfo = (ResponseInfo) sjs0.a.get(Integer.valueOf(Integer.parseInt(str)));
            } catch (NumberFormatException unused) {
                responseInfo = null;
            }
            aVar = new OneVideoSourceException.a(i, str2, str, responseInfo);
        } else {
            aVar = null;
        }
        this.invalidResponseCodeInfo = aVar;
        this.isHLSPlayListStuckException = getCause() instanceof HlsPlaylistTracker.PlaylistStuckException;
        Throwable cause2 = getCause();
        ParserException parserException = cause2 instanceof ParserException ? (ParserException) cause2 : null;
        this.dataType = parserException != null ? xvk.a(parserException.dataType) : null;
    }

    @Override // one.video.player.error.OneVideoSourceException
    public final OneVideoPlayer.DataType d() {
        return this.dataType;
    }

    @Override // one.video.player.error.OneVideoSourceException
    public final OneVideoSourceException.a g() {
        return this.invalidResponseCodeInfo;
    }

    @Override // one.video.player.error.OneVideoSourceException
    public final boolean h() {
        return this.isHLSPlayListStuckException;
    }
}
