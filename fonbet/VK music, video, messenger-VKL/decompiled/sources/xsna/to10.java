package xsna;

/* compiled from: MaxUsersAccount.kt */
/* loaded from: classes11.dex */
public final class to10 {
    public final int a;
    public final int b;

    public to10(int i) {
        this.a = i;
        this.b = (i * 3) + 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to10)) {
            return false;
        }
        to10 to10Var = (to10) obj;
        to10Var.getClass();
        return this.a == to10Var.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + (Integer.hashCode(3) * 31);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("MaxUsersAccount(maxMasterUsers=3, maxRelatedUsers="), this.a, ')');
    }
}
