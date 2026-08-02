package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e8n implements g8n {
    public final String a;
    public final String b;

    public e8n(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8n)) {
            return false;
        }
        e8n e8nVar = (e8n) obj;
        return jl40.l(this.a, e8nVar.a) && jl40.l(this.b, e8nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Error(title=", this.a, ", buttonText=", this.b, Extension.C_BRAKE);
    }
}
