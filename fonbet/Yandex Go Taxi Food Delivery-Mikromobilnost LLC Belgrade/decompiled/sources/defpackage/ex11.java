package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;

/* loaded from: classes13.dex */
public final class ex11 extends gx11 {
    public final Throwable a;

    public ex11(PaymentKitError paymentKitError) {
        this.a = paymentKitError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ex11) && jl40.l(this.a, ((ex11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Failure(error="), this.a, ')');
    }
}
