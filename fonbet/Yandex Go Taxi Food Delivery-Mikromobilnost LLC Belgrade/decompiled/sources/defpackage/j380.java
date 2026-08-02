package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class j380 {
    public static final j380 d;
    public final s380 a;
    public final s380 b;
    public final s380 c;

    static {
        s380 s380Var = s380.c;
        d = new j380(s380Var, s380Var, s380Var);
    }

    public j380(s380 s380Var, s380 s380Var2, s380 s380Var3) {
        this.a = s380Var;
        this.b = s380Var2;
        this.c = s380Var3;
    }

    public static j380 a(j380 j380Var, s380 s380Var, s380 s380Var2, s380 s380Var3, int i) {
        if ((i & 1) != 0) {
            s380Var = j380Var.a;
        }
        if ((i & 2) != 0) {
            s380Var2 = j380Var.b;
        }
        if ((i & 4) != 0) {
            s380Var3 = j380Var.c;
        }
        j380Var.getClass();
        return new j380(s380Var, s380Var2, s380Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j380)) {
            return false;
        }
        j380 j380Var = (j380) obj;
        return jl40.l(this.a, j380Var.a) && jl40.l(this.b, j380Var.b) && jl40.l(this.c, j380Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OrderPinStateCollection(changeSourceSearch=" + this.a + ", changeSourceDriving=" + this.b + ", pickupPointPin=" + this.c + Extension.C_BRAKE;
    }
}
