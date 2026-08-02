package xsna;

import java.io.File;

/* compiled from: TranscodeProperties.kt */
/* loaded from: classes3.dex */
public final class djp0 {
    public final File a;
    public final v6e0 b;
    public final v6e0 c;

    public djp0(File file, v6e0 v6e0Var, v6e0 v6e0Var2) {
        this.a = file;
        this.b = v6e0Var;
        this.c = v6e0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djp0)) {
            return false;
        }
        djp0 djp0Var = (djp0) obj;
        return epx.f(this.a, djp0Var.a) && epx.f(this.b, djp0Var.b) && epx.f(this.c, djp0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        v6e0 v6e0Var = this.c;
        return hashCode + (v6e0Var == null ? 0 : v6e0Var.hashCode());
    }

    public final String toString() {
        return "TranscodeProperties(outputFile=" + this.a + ", videoProperties=" + this.b + ", audioProperties=" + this.c + ')';
    }
}
