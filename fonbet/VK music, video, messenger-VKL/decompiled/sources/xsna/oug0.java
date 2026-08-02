package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;

/* compiled from: RxJavaInitializer.kt */
/* loaded from: classes11.dex */
public final class oug0 {
    public static final oug0 a = new oug0();

    /* compiled from: RxJavaInitializer.kt */
    public static final class a implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable cause;
            Throwable cause2;
            Throwable th2 = th;
            if ((th2 instanceof UndeliverableException) && (cause2 = th2.getCause()) != null) {
                th2 = cause2;
            }
            boolean z = (th2 instanceof RuntimeException) && (cause = th2.getCause()) != null && ((cause instanceof IOException) || (cause instanceof InterruptedException));
            if ((th2 instanceof IOException) || (th2 instanceof InterruptedException) || z) {
                if (BuildInfo.h() && !sv1.t(th2)) {
                    cvk.w("There was an error " + fpf0.a(th2.getClass()).l() + " please look in logs!", false);
                }
                String localizedMessage = th2.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "Empty " + fpf0.a(th2.getClass()).l() + " error.";
                }
                L.l(localizedMessage);
            } else if ((th2 instanceof ConnectException) || (th2 instanceof UnknownHostException)) {
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    if (BuildInfo.h()) {
                        cvk.w("There was an error " + fpf0.a(th2.getClass()).l() + " but network is available please look in logs!", false);
                    }
                    String localizedMessage2 = ((IOException) th2).getLocalizedMessage();
                    if (localizedMessage2 == null) {
                        localizedMessage2 = "Empty " + fpf0.a(th2.getClass()).l() + " error.";
                    }
                    L.l(localizedMessage2);
                }
            } else {
                com.vk.metrics.eventtracking.b.a.a(th2);
            }
            return s3q0.a;
        }
    }
}
