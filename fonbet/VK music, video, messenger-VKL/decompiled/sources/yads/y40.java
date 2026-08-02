package yads;

/* loaded from: classes10.dex */
public final class y40 implements a50 {
    public y40() {
        es1 es1Var = es1.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y40)) {
            return false;
        }
        es1 es1Var = es1.b;
        ((y40) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return es1.b.hashCode();
    }

    public final String toString() {
        return "InvalidIntegration(error=" + es1.b + ")";
    }
}
