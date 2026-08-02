package xsna;

/* compiled from: ManagedGroupsCountStorageModel.kt */
/* loaded from: classes2.dex */
public final class di00 {
    public final int a;
    public final int b;

    public di00(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di00)) {
            return false;
        }
        di00 di00Var = (di00) obj;
        return this.a == di00Var.a && this.b == di00Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagedGroupsCountStorageModel(count=");
        sb.append(this.a);
        sb.append(", phase=");
        return vu5.b(sb, this.b, ')');
    }
}
