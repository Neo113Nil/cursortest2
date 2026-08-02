package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes10.dex */
public class beh implements twy {
    @Override // defpackage.twy
    public final rwy getFallbackSelectionFor(qwy qwyVar, swy swyVar) {
        IOException iOException = swyVar.a;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return null;
        }
        int i = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (qwyVar.a(1)) {
            return new rwy(1, MapiClientImpl.RETRIES_TIME_MILLIS);
        }
        if (qwyVar.a(2)) {
            return new rwy(2, 60000L);
        }
        return null;
    }

    @Override // defpackage.twy
    public final int getMinimumLoadableRetryCount(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // defpackage.twy
    public final long getRetryDelayMsFor(swy swyVar) {
        Throwable th = swyVar.a;
        if ((th instanceof ParserException) || (th instanceof FileNotFoundException) || (th instanceof HttpDataSource$CleartextNotPermittedException) || (th instanceof Loader$UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        while (th != null) {
            if ((th instanceof DataSourceException) && ((DataSourceException) th).reason == 2008) {
                return -9223372036854775807L;
            }
            th = th.getCause();
        }
        return Math.min((swyVar.b - 1) * 1000, 5000);
    }
}
