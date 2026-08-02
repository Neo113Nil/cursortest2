package androidx.media3.datasource;

import defpackage.f0b1;
import defpackage.npg;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes10.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final npg dataSpec;
    public final int type;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpDataSource$HttpDataSourceException(IOException iOException, npg npgVar, int i, int i2) {
        super(i, iOException);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.dataSpec = npgVar;
        this.type = i2;
    }

    public static HttpDataSource$HttpDataSourceException a(IOException iOException, npg npgVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !f0b1.g(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new HttpDataSource$CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, npgVar, 2007) : new HttpDataSource$HttpDataSourceException(iOException, npgVar, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, npg npgVar, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.dataSpec = npgVar;
        this.type = 1;
    }

    public HttpDataSource$HttpDataSourceException(npg npgVar, int i) {
        super(i == 2000 ? 2001 : i);
        this.dataSpec = npgVar;
        this.type = 1;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, npg npgVar, int i) {
        super(i == 2000 ? 2001 : i, iOException, str);
        this.dataSpec = npgVar;
        this.type = 1;
    }
}
