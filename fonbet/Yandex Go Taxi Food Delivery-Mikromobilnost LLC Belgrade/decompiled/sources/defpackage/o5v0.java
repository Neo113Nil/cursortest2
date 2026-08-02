package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class o5v0 {
    public static final o5v0 c = new o5v0(false, zt.c);
    public final boolean a;
    public final zt b;

    public o5v0(boolean z, zt ztVar) {
        this.a = z;
        this.b = ztVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5v0)) {
            return false;
        }
        o5v0 o5v0Var = (o5v0) obj;
        return this.a == o5v0Var.a && this.b.equals(o5v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SuggestItemContextMenuConfig(isEnabled=" + this.a + ", actionContentDescriptions=" + this.b + Extension.C_BRAKE;
    }
}
