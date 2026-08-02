package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class aw3 {
    public final ThemedImageUrlEntity a;
    public final String b;
    public final ActionButtonEntity c;
    public final List d;
    public final String e;
    public final j4w f;
    public final String g;
    public final String h;
    public final boolean i;
    public final Boolean j;

    public aw3(ThemedImageUrlEntity themedImageUrlEntity, String str, ActionButtonEntity actionButtonEntity, List list, String str2, j4w j4wVar, String str3, String str4, boolean z, Boolean bool) {
        this.a = themedImageUrlEntity;
        this.b = str;
        this.c = actionButtonEntity;
        this.d = list;
        this.e = str2;
        this.f = j4wVar;
        this.g = str3;
        this.h = str4;
        this.i = z;
        this.j = bool;
    }

    public static aw3 a(aw3 aw3Var, String str, boolean z, int i) {
        ThemedImageUrlEntity themedImageUrlEntity = aw3Var.a;
        String str2 = aw3Var.b;
        ActionButtonEntity actionButtonEntity = aw3Var.c;
        List list = aw3Var.d;
        String str3 = aw3Var.e;
        j4w j4wVar = aw3Var.f;
        String str4 = aw3Var.g;
        if ((i & 128) != 0) {
            str = aw3Var.h;
        }
        String str5 = str;
        if ((i & 256) != 0) {
            z = aw3Var.i;
        }
        Boolean bool = aw3Var.j;
        aw3Var.getClass();
        return new aw3(themedImageUrlEntity, str2, actionButtonEntity, list, str3, j4wVar, str4, str5, z, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw3)) {
            return false;
        }
        aw3 aw3Var = (aw3) obj;
        return jl40.l(this.a, aw3Var.a) && jl40.l(this.b, aw3Var.b) && jl40.l(this.c, aw3Var.c) && jl40.l(this.d, aw3Var.d) && jl40.l(this.e, aw3Var.e) && this.f.equals(aw3Var.f) && jl40.l(this.g, aw3Var.g) && jl40.l(this.h, aw3Var.h) && this.i == aw3Var.i && jl40.l(this.j, aw3Var.j);
    }

    public final int hashCode() {
        ThemedImageUrlEntity themedImageUrlEntity = this.a;
        int b = unr0.b((themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode()) * 31, 31, this.b);
        ActionButtonEntity actionButtonEntity = this.c;
        int c = unr0.c((b + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int b2 = unr0.b((this.f.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.g);
        String str2 = this.h;
        int e = unr0.e((b2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        Boolean bool = this.j;
        return e + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoTopupInstructionState(image=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", button=");
        sb.append(this.c);
        sb.append(", items=");
        sb.append(this.d);
        sb.append(", autoTopupId=");
        sb.append(this.e);
        sb.append(", infoEntity=");
        sb.append(this.f);
        sb.append(", twoFactorScreenTitle=");
        g8e.D(sb, this.g, ", operationId=", this.h, ", isProgressVisible=");
        sb.append(this.i);
        sb.append(", autoFundEnabled=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
