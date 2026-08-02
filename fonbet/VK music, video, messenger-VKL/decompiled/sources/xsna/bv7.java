package xsna;

/* compiled from: BookingRecordsListItem.kt */
/* loaded from: classes18.dex */
public abstract class bv7 {
    public final String a;

    /* compiled from: BookingRecordsListItem.kt */
    public static final class a extends bv7 {
        public final Exception b;

        public a(Exception exc) {
            super("loading_failed");
            this.b = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "LoadingFailed(error=" + this.b + ')';
        }
    }

    /* compiled from: BookingRecordsListItem.kt */
    public static final class b extends bv7 {
        public static final b b = new b("loading");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1034602825;
        }

        public final String toString() {
            return "PaginationLoading";
        }
    }

    /* compiled from: BookingRecordsListItem.kt */
    public static final class c extends bv7 {
        public final av7 b;

        public c(av7 av7Var) {
            super(String.valueOf(av7Var.e.b));
            this.b = av7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Record(record=" + this.b + ')';
        }
    }

    public bv7(String str) {
        this.a = str;
    }
}
