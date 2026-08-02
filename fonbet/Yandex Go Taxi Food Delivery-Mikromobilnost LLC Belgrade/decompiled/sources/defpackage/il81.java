package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class il81 {
    public final List a;
    public final l9s b;
    public final cu81 c;

    public il81(List list, l9s l9sVar, cu81 cu81Var) {
        this.a = list;
        this.b = l9sVar;
        this.c = cu81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il81)) {
            return false;
        }
        il81 il81Var = (il81) obj;
        return this.a.equals(il81Var.a) && jl40.l(this.b, il81Var.b) && jl40.l(this.c, il81Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l9s l9sVar = this.b;
        int hashCode2 = (hashCode + (l9sVar == null ? 0 : l9sVar.hashCode())) * 31;
        cu81 cu81Var = this.c;
        return hashCode2 + (cu81Var != null ? cu81Var.hashCode() : 0);
    }

    public final String toString() {
        return "Video(videoAdsInfo=" + this.a + ", videoSettings=" + this.b + ", preview=" + this.c + Extension.C_BRAKE;
    }
}
