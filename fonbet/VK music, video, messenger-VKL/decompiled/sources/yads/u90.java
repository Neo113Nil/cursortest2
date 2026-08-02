package yads;

/* loaded from: classes10.dex */
public final class u90 extends ba0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90() {
        super(0);
        t90 t90Var = t90.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u90)) {
            return false;
        }
        ((u90) obj).getClass();
        t90 t90Var = t90.b;
        return true;
    }

    public final int hashCode() {
        return t90.b.hashCode() - 120198036;
    }

    public final String toString() {
        return "Button(text=Enable Test mode, actionType=" + t90.b + ")";
    }
}
