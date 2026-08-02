package xsna;

/* compiled from: SubscriptionConfirmResult.kt */
/* loaded from: classes6.dex */
public abstract class uxm0 {

    /* compiled from: SubscriptionConfirmResult.kt */
    public static final class a extends uxm0 {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Success(subscriptionId="), this.a, ')');
        }
    }
}
