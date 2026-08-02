package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import xsna.epx;
import xsna.pyx;
import xsna.r570;

/* compiled from: Exceptions.kt */
/* loaded from: classes11.dex */
public final class JobCancellationException extends CancellationException {
    public final transient pyx b;

    public JobCancellationException(String str, Throwable th, pyx pyxVar) {
        super(str);
        this.b = pyxVar;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        if (!epx.f(jobCancellationException.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = jobCancellationException.b;
        if (obj2 == null) {
            obj2 = r570.b;
        }
        Object obj3 = this.b;
        if (obj3 == null) {
            obj3 = r570.b;
        }
        return epx.f(obj2, obj3) && epx.f(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int hashCode = getMessage().hashCode() * 31;
        Object obj = this.b;
        if (obj == null) {
            obj = r570.b;
        }
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.b;
        if (obj == null) {
            obj = r570.b;
        }
        sb.append(obj);
        return sb.toString();
    }
}
