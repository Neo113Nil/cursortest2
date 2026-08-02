package defpackage;

import com.yandex.messaging.auth.AuthTheme;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class hj3 {
    public final vh3 a;
    public final AuthTheme b;
    public final bm3 c;
    public final String d;

    public hj3(vh3 vh3Var, AuthTheme authTheme, bm3 bm3Var, String str) {
        this.a = vh3Var;
        this.b = authTheme;
        this.c = bm3Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj3)) {
            return false;
        }
        hj3 hj3Var = (hj3) obj;
        return this.a.equals(hj3Var.a) && this.b == hj3Var.b && this.c.equals(hj3Var.c) && jl40.l(this.d, hj3Var.d);
    }

    public final int hashCode() {
        int e = unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a);
        String str = this.d;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AuthLoginParams(filter=" + this.a + ", theme=" + this.b + ", visualProperties=" + this.c + ", source=" + this.d + Extension.C_BRAKE;
    }
}
