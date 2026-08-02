package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class k3b extends s120 {
    public final g720 a;
    public final String b;
    public final String c;
    public final String d = "Messaging.Arguments.Key.ChatInfo";

    public k3b(g720 g720Var, String str, String str2) {
        this.a = g720Var;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.d;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3b)) {
            return false;
        }
        k3b k3bVar = (k3b) obj;
        return jl40.l(this.a, k3bVar.a) && jl40.l(this.b, k3bVar.b) && jl40.l(this.c, k3bVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatInfoArguments(source=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", sourceChatId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
