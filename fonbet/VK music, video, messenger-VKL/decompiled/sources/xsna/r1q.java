package xsna;

import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.IOException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ExceptionUtilsExt.kt */
/* loaded from: classes16.dex */
public final class r1q {

    /* compiled from: ExceptionUtilsExt.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, Boolean> {
        public static final a b = new a(1, r1q.class, "isNoSpaceThrowable", "isNoSpaceThrowable(Ljava/lang/Throwable;)Z", 1);

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        
            if ((r3 != null ? xsna.drm0.D(r3, "No space left on device", false) : false) != false) goto L13;
         */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Throwable th) {
            boolean z;
            Throwable th2 = th;
            if (!(th2 instanceof ErrnoException) || ((ErrnoException) th2).errno != OsConstants.ENOSPC) {
                z = false;
                if (th2 instanceof IOException) {
                    String message = th2.getMessage();
                }
                return Boolean.valueOf(z);
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    public static final boolean a(Throwable th) {
        a aVar = a.b;
        while (th != null) {
            if (aVar.invoke(th).booleanValue()) {
                return true;
            }
            if (th.equals(th.getCause())) {
                return false;
            }
            th = th.getCause();
        }
        return false;
    }
}
