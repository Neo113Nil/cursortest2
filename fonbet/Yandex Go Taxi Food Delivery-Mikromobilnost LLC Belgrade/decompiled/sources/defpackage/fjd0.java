package defpackage;

import com.yandex.plus.home.pay.PayError;

/* loaded from: classes2.dex */
public final class fjd0 implements gjd0 {
    public final PayError a;

    public fjd0(PayError payError) {
        this.a = payError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjd0) && this.a == ((fjd0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(payError=" + this.a + ')';
    }
}
