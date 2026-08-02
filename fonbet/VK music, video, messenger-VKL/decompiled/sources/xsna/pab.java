package xsna;

/* compiled from: ChannelReactionQuantitySelectorPatch.kt */
/* loaded from: classes16.dex */
public interface pab extends xl50 {

    /* compiled from: ChannelReactionQuantitySelectorPatch.kt */
    public static final class a implements pab {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ReactionCost(value="), this.b, ')');
        }
    }

    /* compiled from: ChannelReactionQuantitySelectorPatch.kt */
    public static final class b implements pab {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ReactionCount(value="), this.b, ')');
        }
    }
}
