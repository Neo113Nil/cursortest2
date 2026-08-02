package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ihy0 implements lhy0 {
    public final ThemedImageUrlEntity a;
    public final String b;
    public final String c;

    public ihy0(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = themedImageUrlEntity;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.lhy0
    public final ygy0 a() {
        return null;
    }

    @Override // defpackage.lhy0
    public final ygy0 b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihy0)) {
            return false;
        }
        ihy0 ihy0Var = (ihy0) obj;
        return this.a.equals(ihy0Var.a) && jl40.l(this.b, ihy0Var.b) && jl40.l(this.c, ihy0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InProgress(memberImage=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
