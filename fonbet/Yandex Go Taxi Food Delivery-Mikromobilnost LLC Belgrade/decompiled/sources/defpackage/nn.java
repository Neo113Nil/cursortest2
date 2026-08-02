package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nn extends nr {
    public final String a;
    public final String b;
    public final pa9 c;
    public final List d;

    public nn(String str, String str2, pa9 pa9Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = pa9Var;
        this.d = list;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final List e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn)) {
            return false;
        }
        nn nnVar = (nn) obj;
        return jl40.l(this.a, nnVar.a) && jl40.l(this.b, nnVar.b) && this.c.equals(nnVar.c) && this.d.equals(nnVar.d);
    }

    public final pa9 f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ActionChangeDateTime(title=", this.a, ", badgeText=", this.b, ", screen=");
        v.append(this.c);
        v.append(", options=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
