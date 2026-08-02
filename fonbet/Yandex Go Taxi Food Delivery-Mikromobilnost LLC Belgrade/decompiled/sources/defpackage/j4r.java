package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.pfm.internal.domain.entities.FilterEntity$Mode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j4r {
    public final String a;
    public final ycb0 b;
    public final ThemedImageUrlEntity c;
    public final FilterEntity$Mode d;
    public final s4r e;

    public j4r(String str, ycb0 ycb0Var, ThemedImageUrlEntity themedImageUrlEntity, FilterEntity$Mode filterEntity$Mode, s4r s4rVar) {
        this.a = str;
        this.b = ycb0Var;
        this.c = themedImageUrlEntity;
        this.d = filterEntity$Mode;
        this.e = s4rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4r)) {
            return false;
        }
        j4r j4rVar = (j4r) obj;
        return this.a.equals(j4rVar.a) && jl40.l(this.b, j4rVar.b) && jl40.l(this.c, j4rVar.c) && this.d == j4rVar.d && this.e.equals(j4rVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ycb0 ycb0Var = this.b;
        int hashCode2 = (hashCode + (ycb0Var == null ? 0 : ycb0Var.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (themedImageUrlEntity != null ? themedImageUrlEntity.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "FilterEntity(id=" + tab0.a(this.a) + ", title=" + this.b + ", icon=" + this.c + ", mode=" + this.d + ", innerContent=" + this.e + Extension.C_BRAKE;
    }
}
