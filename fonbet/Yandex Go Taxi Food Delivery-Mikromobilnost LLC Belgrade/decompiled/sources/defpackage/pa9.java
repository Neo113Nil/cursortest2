package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pa9 {
    public final String a;
    public final String b;
    public final qa9 c;
    public final qa9 d;

    public pa9(String str, String str2, qa9 qa9Var, qa9 qa9Var2) {
        this.a = str;
        this.b = str2;
        this.c = qa9Var;
        this.d = qa9Var2;
    }

    public final qa9 a() {
        return this.d;
    }

    public final qa9 b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa9)) {
            return false;
        }
        pa9 pa9Var = (pa9) obj;
        return jl40.l(this.a, pa9Var.a) && jl40.l(this.b, pa9Var.b) && this.c.equals(pa9Var.c) && this.d.equals(pa9Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.a.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChangeDateTimeScreen(title=", this.a, ", text=", this.b, ", changeButton=");
        v.append(this.c);
        v.append(", cancelButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
