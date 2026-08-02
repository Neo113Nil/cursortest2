package xsna;

import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import ru.ok.android.commons.http.Http;

/* compiled from: MultipleBaseURLErrorHandlingPolicy.kt */
/* loaded from: classes8.dex */
public final class j740 extends androidx.media3.exoplayer.upstream.a {
    @Override // androidx.media3.exoplayer.upstream.a
    public final boolean d(IOException iOException) {
        if (!(iOException instanceof HttpDataSource$HttpDataSourceException)) {
            return false;
        }
        if (iOException instanceof HttpDataSource$InvalidResponseCodeException) {
            return e43.l(403, 404, 410, Integer.valueOf(Http.StatusCode.RANGE_NOT_SATISFIABLE), 500, 503).contains(Integer.valueOf(((HttpDataSource$InvalidResponseCodeException) iOException).responseCode));
        }
        HttpDataSource$HttpDataSourceException httpDataSource$HttpDataSourceException = (HttpDataSource$HttpDataSourceException) iOException;
        return e43.l(2001, 2002).contains(Integer.valueOf(httpDataSource$HttpDataSourceException.reason)) && e43.l(1, 2).contains(Integer.valueOf(httpDataSource$HttpDataSourceException.type));
    }
}
