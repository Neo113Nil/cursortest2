package xsna;

/* compiled from: ConnectYClientsReviewsState.kt */
/* loaded from: classes18.dex */
public final class k3j implements km50 {
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public k3j() {
        this(false, false, false);
    }

    public static k3j a(k3j k3jVar, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? k3jVar.b : true;
        boolean z3 = k3jVar.d;
        k3jVar.getClass();
        return new k3j(z2, z, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3j)) {
            return false;
        }
        k3j k3jVar = (k3j) obj;
        return this.b == k3jVar.b && this.c == k3jVar.c && this.d == k3jVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectYClientsReviewsState(isError=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", isSuccess=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public k3j(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
