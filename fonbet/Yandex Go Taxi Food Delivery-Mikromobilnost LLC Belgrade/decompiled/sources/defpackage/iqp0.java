package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class iqp0 extends crp0 {
    public final Throwable c;
    public final String d;
    public final Object e;

    public iqp0(Object obj, String str, Throwable th) {
        super("ErrorScreen");
        this.c = th;
        this.d = str;
        this.e = obj;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.c;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqp0)) {
            return false;
        }
        iqp0 iqp0Var = (iqp0) obj;
        return jl40.l(this.c, iqp0Var.c) && this.d.equals(iqp0Var.d) && jl40.l(this.e, iqp0Var.e);
    }

    public final int hashCode() {
        Throwable th = this.c;
        int b = unr0.b((th == null ? 0 : th.hashCode()) * 31, 31, this.d);
        Object obj = this.e;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorScreen(exception=");
        sb.append(this.c);
        sb.append(", screenKey=");
        sb.append(this.d);
        sb.append(", payload=");
        return x4e.h(sb, this.e, Extension.C_BRAKE);
    }
}
