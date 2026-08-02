package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class e0u0 extends s120 {
    public final g720 a;
    public final String b;
    public final String c = "Messaging.Arguments.Key.Stars.List";

    public e0u0(g720 g720Var, String str) {
        this.a = g720Var;
        this.b = str;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.c;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0u0)) {
            return false;
        }
        e0u0 e0u0Var = (e0u0) obj;
        return jl40.l(this.a, e0u0Var.a) && jl40.l(this.b, e0u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StarredListArguments(source=" + this.a + ", chatId=" + this.b + Extension.C_BRAKE;
    }
}
