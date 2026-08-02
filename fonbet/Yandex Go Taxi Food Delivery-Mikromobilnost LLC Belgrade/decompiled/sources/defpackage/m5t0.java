package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public final class m5t0 extends gb3 {
    public final Socket n;

    public m5t0(Socket socket) {
        this.n = socket;
    }

    @Override // defpackage.gb3
    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.gb3
    public final void l() {
        Logger logger;
        Logger logger2;
        Socket socket = this.n;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!xf61.b(e)) {
                throw e;
            }
            logger2 = xf61.a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            logger = xf61.a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
