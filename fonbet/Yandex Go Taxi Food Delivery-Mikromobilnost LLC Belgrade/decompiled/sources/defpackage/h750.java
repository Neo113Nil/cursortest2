package defpackage;

import com.yandex.quark.webchat.navigation.NavigationEntry$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class h750 {
    public final String a;
    public final NavigationEntry$Type b;
    public final String c;
    public final boolean d;

    public h750(String str, NavigationEntry$Type navigationEntry$Type, String str2, boolean z) {
        this.a = str;
        this.b = navigationEntry$Type;
        this.c = str2;
        this.d = z;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final NavigationEntry$Type d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h750)) {
            return false;
        }
        h750 h750Var = (h750) obj;
        return this.a.equals(h750Var.a) && this.b == h750Var.b && this.c.equals(h750Var.c) && this.d == h750Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        String p = oyr.p("Id(value=", this.a, Extension.C_BRAKE);
        String p2 = oyr.p("Title(value=", this.c, Extension.C_BRAKE);
        StringBuilder sb = new StringBuilder("NavigationEntry(id=");
        sb.append(p);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        return nnm.i(p2, ", canNavigateBack=", Extension.C_BRAKE, sb, this.d);
    }
}
