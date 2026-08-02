package yads;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import javax.net.ssl.SSLHandshakeException;
import xsna.epx;

/* loaded from: classes10.dex */
public final class p62 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mg3 a(Throwable th) {
        mg3 mg3Var;
        boolean z;
        if (!(th instanceof cf2)) {
            if (th instanceof h31) {
                return mg3.j;
            }
            if (th instanceof sl1) {
                return mg3.k;
            }
            if (th instanceof ml1) {
                return mg3.l;
            }
            if (th instanceof zo) {
                return mg3.n;
            }
            if (th instanceof MediaCodec.CryptoException) {
                return mg3.o;
            }
            if (th instanceof mk0) {
                Throwable cause = ((mk0) th).getCause();
                return cause == null ? mg3.q : ((cause instanceof MediaDrmResetException) || (cause instanceof ResourceBusyException)) ? mg3.p : ((cause instanceof MediaCodec.CryptoException) || (cause instanceof oe1)) ? mg3.o : mg3.q;
            }
            if (!(th instanceof u11)) {
                return th instanceof s11 ? ((s11) th).getCause() instanceof SSLHandshakeException ? mg3.w : mg3.x : th instanceof pc2 ? mg3.y : th instanceof fh1 ? mg3.z : ((th instanceof el) || (th instanceof fl) || (th instanceof tb0)) ? mg3.A : th instanceof x53 ? mg3.B : ((th instanceof kr) || (th instanceof or)) ? mg3.C : mg3.F;
            }
            int i = ((u11) th).e;
            return i == 401 ? mg3.s : i == 403 ? mg3.t : i == 404 ? mg3.u : mg3.v;
        }
        Throwable cause2 = th.getCause();
        if (cause2 != null && (((z = cause2 instanceof MediaCodec.CodecException)) || (cause2 instanceof IllegalStateException) || (cause2 instanceof IllegalArgumentException))) {
            StackTraceElement[] stackTrace = cause2.getStackTrace();
            if (!(stackTrace.length == 0) && stackTrace[0].isNativeMethod() && epx.f(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
                String methodName = stackTrace[0].getMethodName();
                if (methodName == null) {
                    methodName = "";
                }
                if (methodName.equals("native_dequeueOutputBuffer")) {
                    mg3Var = mg3.b;
                } else if (methodName.equals("native_dequeueInputBuffer")) {
                    mg3Var = mg3.c;
                } else if (methodName.equals("native_stop")) {
                    mg3Var = mg3.d;
                } else if (methodName.equals("native_setSurface")) {
                    mg3Var = mg3.e;
                } else if (methodName.equals("releaseOutputBuffer")) {
                    mg3Var = mg3.f;
                } else if (methodName.equals("native_queueSecureInputBuffer")) {
                    mg3Var = mg3.g;
                } else if (z) {
                    mg3Var = mg3.h;
                }
                if (mg3Var == null) {
                    return mg3Var;
                }
                Throwable cause3 = th.getCause();
                mg3 a = cause3 != null ? a(cause3) : null;
                return a == null ? mg3.E : a;
            }
        }
        mg3Var = null;
        if (mg3Var == null) {
        }
    }
}
