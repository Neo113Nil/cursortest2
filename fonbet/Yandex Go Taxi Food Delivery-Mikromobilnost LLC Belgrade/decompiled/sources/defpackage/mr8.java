package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class mr8 extends ye0 {
    public final String b;
    public final Map c;

    public mr8(String str, Map map) {
        super(str);
        this.b = str;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr8)) {
            return false;
        }
        mr8 mr8Var = (mr8) obj;
        return jl40.l(this.b, mr8Var.b) && jl40.l(this.c, mr8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("WebViewEvent(event=", this.b, ", params=", Extension.C_BRAKE, this.c);
    }
}
