package xsna;

import com.vk.api.sdk.exceptions.VKLocalIOException;
import com.vk.instantjobs.exceptions.JobException;
import com.vk.log.L;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.channels.ClosedByInterruptException;
import javax.net.ssl.SSLException;

/* compiled from: CauseProducer.kt */
/* loaded from: classes.dex */
public final class pla {
    public static bpn0 a;

    public static final wvw e() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (wvw) bpn0Var.getValue();
    }

    public static boolean f(Throwable th) {
        return ((th instanceof InterruptedException) || (th instanceof InterruptedIOException) || (th instanceof ClosedByInterruptException) || (th instanceof UnknownHostException) || (th instanceof SSLException) || (th instanceof SocketException) || (th instanceof VKLocalIOException)) ? false : true;
    }

    public static final mla g(final int i, final Object obj) {
        String str;
        Class<?> cls = obj.getClass();
        String valueOf = String.valueOf(obj);
        int hashCode = (obj.hashCode() * 31) + (cls.hashCode() * 31) + valueOf.hashCode();
        final Throwable th = new Throwable(valueOf);
        bpn0 bpn0Var = new bpn0(new gzs() { // from class: xsna.ola
            @Override // xsna.gzs
            public final Object invoke() {
                Throwable th2 = th;
                int length = th2.getStackTrace().length;
                int i2 = i;
                int i3 = length - i2;
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[i3];
                System.arraycopy(th2.getStackTrace(), i2, stackTraceElementArr, 0, i3);
                th2.setStackTrace(stackTraceElementArr);
                Object obj2 = obj;
                isx0 isx0Var = obj2 instanceof isx0 ? (isx0) obj2 : null;
                mla b = isx0Var != null ? isx0Var.b() : null;
                nr2.L(th2, b != null ? b.b() : null);
                return th2;
            }
        });
        String name = Thread.currentThread().getName();
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        if (threadGroup == null || (str = threadGroup.getName()) == null) {
            str = "";
        }
        return new mla(bpn0Var, hashCode, name, str, obj);
    }

    public void a(String str) {
        L.e(str);
    }

    public void b(String str, Throwable th) {
        L.e(th, str);
    }

    public void c(String str) {
        com.vk.metrics.eventtracking.b.a.q(new JobException(str));
    }

    public void d(String str, Throwable th) {
        if (f(th)) {
            com.vk.metrics.eventtracking.b.a.q(new JobException(str, th));
        } else {
            L.i(new JobException(str, th));
        }
    }
}
