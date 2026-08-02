package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ehk extends x3 {
    public final String c;
    public final String w;
    public final sls x;
    public final Map y;
    public final String z;

    public ehk(String str, String str2, sls slsVar, Map map, String str3) {
        super(6, slsVar);
        this.c = str;
        this.w = str2;
        this.x = slsVar;
        this.y = map;
        this.z = str3;
    }

    @Override // defpackage.x3
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehk)) {
            return false;
        }
        ehk ehkVar = (ehk) obj;
        return jl40.l(this.c, ehkVar.c) && jl40.l(this.w, ehkVar.w) && this.x.equals(ehkVar.x) && jl40.l(this.y, ehkVar.y) && jl40.l(this.z, ehkVar.z);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.w;
        int a = nnm.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.x);
        Map map = this.y;
        int hashCode2 = (a + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.z;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DivBottomSheetTargetParams(target=", this.c, ", agreementId=", this.w, ", hideCallback=");
        v.append(this.x);
        v.append(", additionalData=");
        v.append(this.y);
        v.append(", skeletonId=");
        return oyr.t(v, this.z, Extension.C_BRAKE);
    }
}
