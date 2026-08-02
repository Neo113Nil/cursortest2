package defpackage;

import android.os.Bundle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class jsj0 extends s120 {
    public final g720 a;
    public final String b;
    public final String c;

    public jsj0(Bundle bundle) {
        String string = bundle.getString("Messaging.Arguments.Source");
        if (string == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
            throw null;
        }
        int i = g720.c;
        g720 b = glb1.b(string);
        String string2 = bundle.getString("RESOLVE_LINK_TOKEN");
        if (string2 == null) {
            vg10.d("missing required key ".concat("RESOLVE_LINK_TOKEN"));
            throw null;
        }
        this.a = b;
        this.b = string2;
        this.c = "Messaging.Arguments.Key.ResolveInviteLink";
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
        if (!(obj instanceof jsj0)) {
            return false;
        }
        jsj0 jsj0Var = (jsj0) obj;
        return jl40.l(this.a, jsj0Var.a) && jl40.l(this.b, jsj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ResolveInviteLinkArguments(source=" + this.a + ", token=" + this.b + Extension.C_BRAKE;
    }
}
