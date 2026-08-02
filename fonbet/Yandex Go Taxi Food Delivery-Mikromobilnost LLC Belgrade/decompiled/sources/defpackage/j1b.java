package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class j1b extends s120 {
    public final g720 a;
    public final String b = "Messaging.Arguments.Key.ChatCreate";

    public j1b(g720 g720Var) {
        this.a = g720Var;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.b;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1b) && jl40.l(this.a, ((j1b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChatCreateArguments(source=" + this.a + Extension.C_BRAKE;
    }
}
