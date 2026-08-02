package xsna;

/* compiled from: HistoryLoaderEvent.kt */
/* loaded from: classes13.dex */
public abstract class q8v {

    /* compiled from: HistoryLoaderEvent.kt */
    public static final class a extends q8v {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ExpiredHistoryUpdateStateChanged(isUpdating="), this.a, ')');
        }
    }

    /* compiled from: HistoryLoaderEvent.kt */
    public static final class b extends q8v {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("UpdateError(throwable="), this.a, ')');
        }
    }

    /* compiled from: HistoryLoaderEvent.kt */
    public static final class c extends q8v {
        public final w8v a;

        public c(w8v w8vVar) {
            this.a = w8vVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateSuccess(historyUpdate=" + this.a + ')';
        }
    }
}
