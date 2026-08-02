package xsna;

import kotlinx.coroutines.DispatchException;
import xsna.pvj;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes11.dex */
public final class rvj {
    public static final void a(kotlin.coroutines.d dVar, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            pvj pvjVar = (pvj) dVar.get(pvj.a.b);
            if (pvjVar != null) {
                pvjVar.handleException(dVar, th);
            } else {
                pq3.f(dVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                mnh0.d(runtimeException, th);
                th = runtimeException;
            }
            pq3.f(dVar, th);
        }
    }
}
