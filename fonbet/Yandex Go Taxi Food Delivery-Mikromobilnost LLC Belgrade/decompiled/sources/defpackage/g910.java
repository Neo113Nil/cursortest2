package defpackage;

import com.ybsdk.core.common.data.network.dto.Themes;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class g910 {
    public final String a;
    public final String b;
    public final Themes c;

    public g910(String str, String str2, Themes themes) {
        this.a = str;
        this.b = str2;
        this.c = themes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g910)) {
            return false;
        }
        g910 g910Var = (g910) obj;
        return jl40.l(this.a, g910Var.a) && jl40.l(this.b, g910Var.b) && this.c.equals(g910Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return smw0.l(b64.v("Widget(title=", this.a, ", description=", this.b, ", themes="), this.c, Extension.C_BRAKE);
    }
}
