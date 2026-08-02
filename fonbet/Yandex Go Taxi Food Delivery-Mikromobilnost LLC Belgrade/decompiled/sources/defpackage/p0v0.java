package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.list.data.entities.SubscriptionEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p0v0 {
    public final String a;
    public final String b;
    public final String c;
    public final rbv d;
    public final SubscriptionEntity$Status e;

    public p0v0(String str, String str2, String str3, rbv rbvVar, SubscriptionEntity$Status subscriptionEntity$Status) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rbvVar;
        this.e = subscriptionEntity$Status;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0v0)) {
            return false;
        }
        p0v0 p0v0Var = (p0v0) obj;
        return jl40.l(this.a, p0v0Var.a) && jl40.l(this.b, p0v0Var.b) && jl40.l(this.c, p0v0Var.c) && jl40.l(this.d, p0v0Var.d) && this.e == p0v0Var.e;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        rbv rbvVar = this.d;
        return this.e.hashCode() + ((hashCode + (rbvVar != null ? rbvVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SubscriptionEntity(id=", this.a, ", title=", this.b, ", description=");
        v.append(this.c);
        v.append(", logo=");
        v.append(this.d);
        v.append(", status=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
