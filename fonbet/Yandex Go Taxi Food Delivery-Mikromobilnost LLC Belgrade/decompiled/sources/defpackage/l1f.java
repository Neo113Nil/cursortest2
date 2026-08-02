package defpackage;

/* loaded from: classes14.dex */
public final class l1f implements uhx0, e6v {
    public final CharSequence a;

    public l1f(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1f) && jl40.l(this.a, ((l1f) obj).a);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return "TariffCardCoupon";
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1584148410;
    }

    public final String toString() {
        return b64.h(this.a, "CouponBadge(title=", ", id=TariffCardCoupon)");
    }
}
