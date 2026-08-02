package xsna;

/* compiled from: ChannelReactionQuantitySelectorAction.kt */
/* loaded from: classes16.dex */
public interface hab extends kj50 {

    /* compiled from: ChannelReactionQuantitySelectorAction.kt */
    public static final class a implements hab {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1559544829;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ChannelReactionQuantitySelectorAction.kt */
    public static final class b implements hab {
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
            return vu5.b(new StringBuilder("OnChangeReactionCount(value="), this.b, ')');
        }
    }

    /* compiled from: ChannelReactionQuantitySelectorAction.kt */
    public static final class c implements hab {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1830469776;
        }

        public final String toString() {
            return "OnClickAcceptButton";
        }
    }

    /* compiled from: ChannelReactionQuantitySelectorAction.kt */
    public static final class d implements hab {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1121579138;
        }

        public final String toString() {
            return "OnClickClose";
        }
    }

    /* compiled from: ChannelReactionQuantitySelectorAction.kt */
    public static final class e implements hab {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1197372063;
        }

        public final String toString() {
            return "OnClickTermsOfUse";
        }
    }
}
