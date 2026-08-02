package xsna;

/* compiled from: BookingRecordsScreenViewState.kt */
/* loaded from: classes18.dex */
public final class nw7 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    public nw7(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw7)) {
            return false;
        }
        nw7 nw7Var = (nw7) obj;
        return this.a.equals(nw7Var.a) && this.b.equals(nw7Var.b) && this.c.equals(nw7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingRecordsScreenViewState(error=");
        sb.append(this.a);
        sb.append(", loading=");
        sb.append(this.b);
        sb.append(", main=");
        return j8.b(sb, this.c, ')');
    }
}
