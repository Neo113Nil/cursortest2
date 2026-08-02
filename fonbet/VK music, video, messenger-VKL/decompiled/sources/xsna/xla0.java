package xsna;

/* compiled from: PinDotColorState.kt */
/* loaded from: classes15.dex */
public abstract class xla0 {

    /* compiled from: PinDotColorState.kt */
    public static final class a extends xla0 {
        public final long a = f870.d(4288258733L);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && l5g.d(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            int i = l5g.l;
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return pm0.d(')', this.a, new StringBuilder("Empty(color="));
        }
    }

    /* compiled from: PinDotColorState.kt */
    public static final class b extends xla0 {
        public final long a = f870.d(4293281350L);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && l5g.d(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            int i = l5g.l;
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return pm0.d(')', this.a, new StringBuilder("Error(color="));
        }
    }

    /* compiled from: PinDotColorState.kt */
    public static final class c extends xla0 {
        public final long a = f870.d(4280715499L);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && l5g.d(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            int i = l5g.l;
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return pm0.d(')', this.a, new StringBuilder("Filled(color="));
        }
    }

    /* compiled from: PinDotColorState.kt */
    public static final class d extends xla0 {
        public final long a = f870.d(4283151179L);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && l5g.d(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            int i = l5g.l;
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return pm0.d(')', this.a, new StringBuilder("Success(color="));
        }
    }
}
