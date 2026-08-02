package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class oyd0 {
    public final vy91 a;
    public final vy91 b;
    public final q6c0 c;
    public final bzd0 d;

    public oyd0(vy91 vy91Var, vy91 vy91Var2, q6c0 q6c0Var, bzd0 bzd0Var) {
        this.a = vy91Var;
        this.b = vy91Var2;
        this.c = q6c0Var;
        this.d = bzd0Var;
    }

    public final q6c0 a() {
        return this.c;
    }

    public final vy91 b() {
        return this.b;
    }

    public final vy91 c() {
        return this.a;
    }

    public final bzd0 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oyd0) {
            oyd0 oyd0Var = (oyd0) obj;
            return this.a.equals(oyd0Var.a) && this.b.equals(oyd0Var.b) && this.c == oyd0Var.c && this.d == oyd0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PollerConfigData(pollerSuccessDelayPolicy=" + this.a + ", pollerErrorDelayPolicy=" + this.b + ", pollerAnalyticsReporter=" + this.c + ", timeout=" + this.d + Extension.C_BRAKE;
    }
}
