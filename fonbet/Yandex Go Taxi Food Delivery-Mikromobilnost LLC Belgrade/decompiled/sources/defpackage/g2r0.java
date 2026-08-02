package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class g2r0 {
    public final String a;
    public final String b;
    public final ThemedImageUrlEntity c;

    public g2r0(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = str2;
        this.c = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2r0)) {
            return false;
        }
        g2r0 g2r0Var = (g2r0) obj;
        return jl40.l(this.a, g2r0Var.a) && jl40.l(this.b, g2r0Var.b) && this.c.equals(g2r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("ButtonData(title=", this.a, ", action=", this.b, ", startIcon=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
