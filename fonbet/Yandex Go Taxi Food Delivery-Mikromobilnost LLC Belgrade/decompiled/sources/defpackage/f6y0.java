package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class f6y0 {
    public final long a;
    public final zxx0 b;

    public f6y0(long j, zxx0 zxx0Var) {
        this.a = j;
        this.b = zxx0Var;
    }

    public final zxx0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6y0)) {
            return false;
        }
        f6y0 f6y0Var = (f6y0) obj;
        return this.a == f6y0Var.a && this.b.equals(f6y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ScenarioPayload(startTimestamp=" + this.a + ", scenario=" + this.b + Extension.C_BRAKE;
    }
}
