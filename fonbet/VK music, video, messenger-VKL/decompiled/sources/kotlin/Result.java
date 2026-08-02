package kotlin;

import java.io.Serializable;
import xsna.epx;
import xsna.oq;
import xsna.vby;

/* compiled from: Result.kt */
@vby
/* loaded from: classes11.dex */
public final class Result<T> implements Serializable {
    private final Object value;

    /* compiled from: Result.kt */
    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable th) {
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Failure) && epx.f(this.exception, ((Failure) obj).exception);
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Failure("), this.exception, ')');
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    public static int b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String c(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final /* synthetic */ Object d() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Result) && epx.f(this.value, ((Result) obj).value);
    }

    public final int hashCode() {
        return b(this.value);
    }

    public final String toString() {
        return c(this.value);
    }
}
