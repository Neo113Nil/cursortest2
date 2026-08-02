package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class hmu0 {
    public final List a;
    public final vz6 b;
    public final tay c;
    public final String d;
    public final String e;

    public hmu0(List list, vz6 vz6Var, tay tayVar, String str, String str2) {
        this.a = list;
        this.b = vz6Var;
        this.c = tayVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmu0)) {
            return false;
        }
        hmu0 hmu0Var = (hmu0) obj;
        return jl40.l(this.a, hmu0Var.a) && jl40.l(this.b, hmu0Var.b) && jl40.l(this.c, hmu0Var.c) && jl40.l(this.d, hmu0Var.d) && jl40.l(this.e, hmu0Var.e);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        vz6 vz6Var = this.b;
        int hashCode2 = (hashCode + (vz6Var == null ? 0 : vz6Var.hashCode())) * 31;
        tay tayVar = this.c;
        int hashCode3 = (hashCode2 + (tayVar == null ? 0 : tayVar.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesEntity(storyItemsList=");
        sb.append(this.a);
        sb.append(", primaryButton=");
        sb.append(this.b);
        sb.append(", legalAgreement=");
        sb.append(this.c);
        sb.append(", actionOnLastStoryEnd=");
        sb.append(this.d);
        sb.append(", overriddenCloseAction=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
