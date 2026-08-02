package xsna;

/* compiled from: ChannelMonetizationPayoutType.kt */
/* loaded from: classes16.dex */
public interface g4b {

    /* compiled from: ChannelMonetizationPayoutType.kt */
    public static final class a implements g4b {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("Bankcard(maskedPan="), this.a, ')');
        }
    }

    /* compiled from: ChannelMonetizationPayoutType.kt */
    public static final class b implements g4b {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1174445280;
        }

        public final String toString() {
            return "None";
        }
    }

    /* compiled from: ChannelMonetizationPayoutType.kt */
    public static final class c implements g4b {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2055305483;
        }

        public final String toString() {
            return "VkPay";
        }
    }
}
