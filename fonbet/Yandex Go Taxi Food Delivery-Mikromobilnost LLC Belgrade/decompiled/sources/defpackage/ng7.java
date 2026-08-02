package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class ng7 {
    public static final mg7 Companion = new mg7();
    public final uri0 a;
    public final t6u b;

    public /* synthetic */ ng7(int i, uri0 uri0Var, t6u t6uVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, lg7.a.getDescriptor());
            throw null;
        }
        this.a = uri0Var;
        this.b = t6uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng7)) {
            return false;
        }
        ng7 ng7Var = (ng7) obj;
        return jl40.l(this.a, ng7Var.a) && jl40.l(this.b, ng7Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CallConfigsArgs(regsConnectionRetryConfig=" + this.a + ", hangupConfirmationConfig=" + this.b + Extension.C_BRAKE;
    }

    public ng7(uri0 uri0Var, t6u t6uVar) {
        this.a = uri0Var;
        this.b = t6uVar;
    }
}
