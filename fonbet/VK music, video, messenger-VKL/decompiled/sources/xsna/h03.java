package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.R;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* compiled from: ApiThrowableExt.kt */
/* loaded from: classes15.dex */
public final class h03 {
    public static final boolean a(Throwable th) {
        rfc a = fpf0.a(th.getClass());
        if (!a.equals(fpf0.a(ConnectException.class)) && !a.equals(fpf0.a(SocketException.class)) && !a.equals(fpf0.a(SocketTimeoutException.class)) && !a.equals(fpf0.a(UnknownHostException.class)) && !a.equals(fpf0.a(ProtocolException.class))) {
            if (!(th instanceof VKApiExecutionException)) {
                return false;
            }
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            if (vKApiExecutionException.s() != -1 && vKApiExecutionException.s() != 1) {
                return false;
            }
        }
        return true;
    }

    public static final void b(Throwable th) {
        if (th == null) {
            return;
        }
        if (th instanceof VKApiExecutionException) {
            rte0.z(vx2.d.getContext(), (VKApiExecutionException) th);
            s3q0 s3q0Var = s3q0.a;
        } else if (a(th)) {
            enj.q(R.string.default_network_error, 0, vx2.d.getContext());
        } else {
            enj.q(R.string.error, 0, vx2.d.getContext());
        }
    }
}
