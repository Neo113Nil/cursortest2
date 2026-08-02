package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n8x0 implements r9x0 {
    public final String a;
    public final Object b;
    public final Object c;

    public n8x0(String str, Object obj, Object obj2) {
        this.a = str;
        this.b = obj;
        this.c = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8x0)) {
            return false;
        }
        n8x0 n8x0Var = (n8x0) obj;
        return jl40.l(this.a, n8x0Var.a) && jl40.l(this.b, n8x0Var.b) && jl40.l(this.c, n8x0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsyncAction(taskId=");
        sb.append(this.a);
        sb.append(", formStateValue=");
        sb.append(this.b);
        sb.append(", taskParams=");
        return x4e.h(sb, this.c, Extension.C_BRAKE);
    }
}
