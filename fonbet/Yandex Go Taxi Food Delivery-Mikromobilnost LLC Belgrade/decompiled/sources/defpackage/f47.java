package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f47 {
    public final String a;
    public final String b;
    public final boolean c;

    public f47(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static f47 a(f47 f47Var, boolean z) {
        String str = f47Var.a;
        String str2 = f47Var.b;
        f47Var.getClass();
        return new f47(str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f47)) {
            return false;
        }
        f47 f47Var = (f47) obj;
        return this.a.equals(f47Var.a) && this.b.equals(f47Var.b) && this.c == f47Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("ButtonUiState(text=", this.a, ", loadingText=", this.b, ", isLoading="), this.c, Extension.C_BRAKE);
    }
}
