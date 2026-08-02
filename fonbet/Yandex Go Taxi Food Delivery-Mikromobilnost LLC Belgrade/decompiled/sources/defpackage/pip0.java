package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pip0 {
    public final String a;
    public final String b;

    public pip0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pip0)) {
            return false;
        }
        pip0 pip0Var = (pip0) obj;
        return jl40.l(this.a, pip0Var.a) && jl40.l(this.b, pip0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ScrollTag(title=", this.a, ", relatedWidgetId=", this.b, Extension.C_BRAKE);
    }
}
