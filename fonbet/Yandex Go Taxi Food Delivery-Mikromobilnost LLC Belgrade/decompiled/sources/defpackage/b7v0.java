package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class b7v0 implements d7v0 {
    public final CharSequence a;
    public final String b;
    public final String c;
    public final String d;

    public b7v0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.d7v0
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7v0)) {
            return false;
        }
        b7v0 b7v0Var = (b7v0) obj;
        return jl40.l(this.a, b7v0Var.a) && this.b.equals(b7v0Var.b) && this.c.equals(b7v0Var.c) && this.d.equals(b7v0Var.d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Error(containerHeaderTitle=" + ((Object) this.a) + ", title=" + ((Object) this.b) + ", subtitle=" + ((Object) this.c) + ", button=" + ((Object) this.d) + Extension.C_BRAKE;
    }
}
