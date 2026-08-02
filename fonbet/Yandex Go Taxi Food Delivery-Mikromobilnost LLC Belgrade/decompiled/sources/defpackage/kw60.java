package defpackage;

import com.yandex.plus.core.network.error.NetworkException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;

/* loaded from: classes8.dex */
public class kw60 implements zs50 {
    public final NetworkException a(jt50 jt50Var, Throwable th) {
        return th instanceof NetworkException ? (NetworkException) th : ((th instanceof URISyntaxException) || (th instanceof MalformedURLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException) || (th instanceof SocketException) || (th instanceof ProtocolException) || (th instanceof SocketTimeoutException)) ? new NetworkException(it50.a, th) : th instanceof SSLException ? new NetworkException(ht50.a, th) : ((th instanceof CancellationException) || (th instanceof InterruptedIOException)) ? new NetworkException(ct50.a, th) : th instanceof IOException ? new NetworkException(jt50Var, th) : new NetworkException(jt50Var, th);
    }
}
