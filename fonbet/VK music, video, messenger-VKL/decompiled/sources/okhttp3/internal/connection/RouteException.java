package okhttp3.internal.connection;

import java.io.IOException;
import xsna.mnh0;

/* compiled from: RouteException.kt */
/* loaded from: classes11.dex */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void a(IOException iOException) {
        mnh0.d(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    public final IOException d() {
        return this.firstConnectException;
    }

    public final IOException g() {
        return this.lastConnectException;
    }
}
