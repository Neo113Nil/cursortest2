package xsna;

/* compiled from: ShowMoreItem.kt */
/* loaded from: classes18.dex */
public final class sij0 implements hfz {
    public final int b;
    public final boolean c;
    public final b2g0 d;

    public sij0(int i, boolean z, e210 e210Var) {
        this.b = i;
        this.c = z;
        this.d = e210Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sij0)) {
            return false;
        }
        sij0 sij0Var = (sij0) obj;
        return this.b == sij0Var.b && this.c == sij0Var.c && epx.f(this.d, sij0Var.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(Integer.hashCode(this.b));
    }

    public final int hashCode() {
        int b = qoy.b(Integer.hashCode(this.b) * 31, 31, this.c);
        b2g0 b2g0Var = this.d;
        return b + (b2g0Var == null ? 0 : b2g0Var.hashCode());
    }

    public final String toString() {
        return "ShowMoreItem(reviewId=" + this.b + ", isEnabled=" + this.c + ", additionalInfo=" + this.d + ')';
    }
}
