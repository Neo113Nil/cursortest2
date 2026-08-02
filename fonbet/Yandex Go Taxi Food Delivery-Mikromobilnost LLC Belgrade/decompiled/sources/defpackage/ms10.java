package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ms10 implements jxh {
    public final jw7 a;
    public final Object b;

    public ms10(jw7 jw7Var, Object obj) {
        this.a = jw7Var;
        this.b = obj;
    }

    public final jw7 a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms10)) {
            return false;
        }
        ms10 ms10Var = (ms10) obj;
        return this.a.equals(ms10Var.a) && jl40.l(this.b, ms10Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "MessageCancelPayload(cancelMessage=" + this.a + ", meta=" + this.b + Extension.C_BRAKE;
    }
}
