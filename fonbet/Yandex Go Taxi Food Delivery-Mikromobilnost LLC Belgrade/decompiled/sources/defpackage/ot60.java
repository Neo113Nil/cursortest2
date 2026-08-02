package defpackage;

/* loaded from: classes2.dex */
public final class ot60 {
    public final Object a;

    public ot60(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot60) && this.a.equals(((ot60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("OfferTrialPlan(period="), this.a, ')');
    }
}
