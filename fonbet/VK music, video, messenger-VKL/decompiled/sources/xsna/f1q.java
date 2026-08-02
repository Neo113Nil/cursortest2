package xsna;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* compiled from: EventsSendResult.kt */
/* loaded from: classes5.dex */
public abstract class f1q {

    /* compiled from: EventsSendResult.kt */
    public static final class a extends f1q {
        public final IOException a;

        public a(IOException iOException) {
            this.a = iOException;
            EmptyList emptyList = EmptyList.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Failure(error=" + this.a + ')';
        }
    }

    /* compiled from: EventsSendResult.kt */
    public static final class b extends f1q {
        public static final b a = new b();

        static {
            EmptyList emptyList = EmptyList.b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -123145914;
        }

        public final String toString() {
            return "None";
        }
    }

    /* compiled from: EventsSendResult.kt */
    public static final class c extends f1q {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "PartialSuccess(sentIds=null, failedCount=0)";
        }
    }

    /* compiled from: EventsSendResult.kt */
    public static final class d extends f1q {
        public final ArrayList a;

        public d(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Success(sentIds="), this.a);
        }
    }
}
