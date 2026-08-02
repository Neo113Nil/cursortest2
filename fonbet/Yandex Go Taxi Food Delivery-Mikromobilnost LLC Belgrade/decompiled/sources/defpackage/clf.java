package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class clf {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;

    public clf(String str, String str2, String str3, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clf)) {
            return false;
        }
        clf clfVar = (clf) obj;
        return jl40.l(this.a, clfVar.a) && jl40.l(this.b, clfVar.b) && jl40.l(this.c, clfVar.c) && jl40.l(this.d, clfVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.d;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CustomStatus(emoji=", this.a, ", text=", this.b, ", iconName=");
        v.append(this.c);
        v.append(", locales=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
