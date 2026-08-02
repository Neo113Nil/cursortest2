package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class fc41 {
    public static final gb41 Companion = new gb41();
    public static final i3y[] g;
    public final String a;
    public final int b;
    public final jb41 c;
    public final List d;
    public final vb41 e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new b931(25)), null, a.b(lazyThreadSafetyMode, new b931(26))};
    }

    public /* synthetic */ fc41(int i, String str, int i2, jb41 jb41Var, List list, vb41 vb41Var, List list2) {
        if (61 != (i & 61)) {
            qje.Z(i, 61, cb41.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = 1;
        } else {
            this.b = i2;
        }
        this.c = jb41Var;
        this.d = list;
        this.e = vb41Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc41)) {
            return false;
        }
        fc41 fc41Var = (fc41) obj;
        return jl40.l(this.a, fc41Var.a) && this.b == fc41Var.b && jl40.l(this.c, fc41Var.c) && jl40.l(this.d, fc41Var.d) && jl40.l(this.e, fc41Var.e) && jl40.l(this.f, fc41Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + unr0.c((this.c.a.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "WebCameraConfig(id=", this.a, ", configVersion=", ", configuration=");
        u.append(this.c);
        u.append(", steps=");
        u.append(this.d);
        u.append(", localizations=");
        u.append(this.e);
        u.append(", loading=");
        u.append(this.f);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
