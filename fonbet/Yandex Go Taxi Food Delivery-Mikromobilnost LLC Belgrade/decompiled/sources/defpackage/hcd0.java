package defpackage;

import com.yandex.plus.pay.inapp.google.common.internal.operation.PlusPayGoogleBillingResponse$Code;

/* loaded from: classes8.dex */
public final class hcd0 {
    public final PlusPayGoogleBillingResponse$Code a;
    public final String b;

    public hcd0(PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code, String str) {
        this.a = plusPayGoogleBillingResponse$Code;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcd0)) {
            return false;
        }
        hcd0 hcd0Var = (hcd0) obj;
        return this.a == hcd0Var.a && jl40.l(this.b, hcd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayGoogleBillingResponse(code=");
        sb.append(this.a);
        sb.append(", debugMessage=");
        return b64.p(sb, this.b, ')');
    }
}
