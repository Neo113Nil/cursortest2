package xsna;

/* compiled from: OnEngineFailedEvent.kt */
/* loaded from: classes2.dex */
public final class y580 extends sxp {
    public final bso0 b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ y580(bso0 bso0Var, int i) {
        this(bso0Var, null, (i & 8) == 0);
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y580)) {
            return false;
        }
        y580 y580Var = (y580) obj;
        return epx.f(this.b, y580Var.b) && epx.f(this.c, y580Var.c) && this.d == y580Var.d && this.e == y580Var.e;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return Boolean.hashCode(this.e) + qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "OnEngineFailedEvent(" + this.b + ')';
    }

    public y580(bso0 bso0Var, String str, boolean z) {
        this.b = bso0Var;
        this.c = str;
        this.d = true;
        this.e = z;
    }
}
