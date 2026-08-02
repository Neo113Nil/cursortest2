package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class m4r {
    public final ycb0 a;
    public final ThemedImageUrlEntity b;
    public final zcb0 c;
    public final String d;

    public m4r(ycb0 ycb0Var, ThemedImageUrlEntity themedImageUrlEntity, zcb0 zcb0Var, String str) {
        this.a = ycb0Var;
        this.b = themedImageUrlEntity;
        this.c = zcb0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4r)) {
            return false;
        }
        m4r m4rVar = (m4r) obj;
        return this.a.equals(m4rVar.a) && this.b.equals(m4rVar.b) && jl40.l(this.c, m4rVar.c) && this.d.equals(m4rVar.d);
    }

    public final int hashCode() {
        int c = xvz.c(this.b, this.a.hashCode() * 31, 31);
        zcb0 zcb0Var = this.c;
        return this.d.hashCode() + ((c + (zcb0Var == null ? 0 : zcb0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Item(title=" + this.a + ", icon=" + this.b + ", subtitle=" + this.c + ", filterId=" + tab0.a(this.d) + Extension.C_BRAKE;
    }
}
