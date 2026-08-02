package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class nie0 implements uie0 {
    public static final mie0 Companion = new mie0();
    public final double a;

    public /* synthetic */ nie0(int i, double d) {
        if (1 == (i & 1)) {
            this.a = d;
        } else {
            qje.Z(i, 1, lie0.a.getDescriptor());
            throw null;
        }
    }

    public final double a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nie0) && Double.compare(this.a, ((nie0) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return unr0.q(new StringBuilder("DoubleValue(value="), this.a, ')');
    }

    public nie0(double d) {
        this.a = d;
    }
}
