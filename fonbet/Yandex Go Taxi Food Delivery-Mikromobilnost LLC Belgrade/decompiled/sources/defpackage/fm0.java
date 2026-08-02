package defpackage;

import com.yandex.plus.pay.repository.api.model.offers.UpsaleStep;

/* loaded from: classes2.dex */
public final class fm0 {
    public final String a;
    public final String b;
    public final String c;
    public final UpsaleStep d;
    public final boolean e;

    public fm0(String str, String str2, String str3, UpsaleStep upsaleStep, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = upsaleStep;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm0)) {
            return false;
        }
        fm0 fm0Var = (fm0) obj;
        return jl40.l(this.a, fm0Var.a) && jl40.l(this.b, fm0Var.b) && jl40.l(this.c, fm0Var.c) && this.d == fm0Var.d && this.e == fm0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Offer(offerName=");
        sb.append(this.a);
        sb.append(", offersBatchId=");
        sb.append(this.b);
        sb.append(", positionId=");
        sb.append(this.c);
        sb.append(", upsaleStep=");
        sb.append(this.d);
        sb.append(", isSelected=");
        return unr0.u(sb, this.e, ')');
    }
}
