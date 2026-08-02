package xsna;

/* compiled from: VkRunSyncEvent.kt */
/* loaded from: classes6.dex */
public final class hhv0 {
    public final int a;
    public final int b;

    public hhv0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhv0)) {
            return false;
        }
        hhv0 hhv0Var = (hhv0) obj;
        return this.a == hhv0Var.a && this.b == hhv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunSyncEvent(time=");
        sb.append(this.a);
        sb.append(", amountOfDays=");
        return vu5.b(sb, this.b, ')');
    }
}
