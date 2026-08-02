package xsna;

/* compiled from: BroadcastLaunchViewModel.kt */
/* loaded from: classes7.dex */
public abstract class zg8 {

    /* compiled from: BroadcastLaunchViewModel.kt */
    public static final class a extends zg8 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("Awaiting(timeLeftMs="));
        }
    }

    /* compiled from: BroadcastLaunchViewModel.kt */
    public static final class b extends zg8 {
        public final String a;

        public b(String str) {
            this.a = str;
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
            return tq.f(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* compiled from: BroadcastLaunchViewModel.kt */
    public static final class c extends zg8 {
        public static final c a = new c();
    }
}
