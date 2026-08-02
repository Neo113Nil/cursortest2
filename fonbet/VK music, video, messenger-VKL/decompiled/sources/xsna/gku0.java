package xsna;

/* compiled from: VkCheckoutErrorReason.kt */
/* loaded from: classes6.dex */
public abstract class gku0 {
    public final String a;

    /* compiled from: VkCheckoutErrorReason.kt */
    public static final class a extends gku0 {
        public final String b;

        public a(String str) {
            super(str);
            this.b = str;
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
            return ho8.a(new StringBuilder("InvalidConfig(reason="), this.b, ')');
        }
    }

    /* compiled from: VkCheckoutErrorReason.kt */
    public static final class b extends gku0 {
        public static final b b = new b("Transaction or process was interrupted");
    }

    /* compiled from: VkCheckoutErrorReason.kt */
    public static final class c extends gku0 {
        public static final c b = new c("Google Pay is unavailable");
    }

    /* compiled from: VkCheckoutErrorReason.kt */
    public static final class d extends gku0 {
        public static final d b = new d("User closed the dialog");
    }

    public gku0(String str) {
        this.a = str;
    }
}
