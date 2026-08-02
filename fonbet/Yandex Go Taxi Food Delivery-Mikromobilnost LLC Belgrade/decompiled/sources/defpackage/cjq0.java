package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cjq0 implements wjq0 {
    public final eh01 a;
    public final String b;
    public final String c;
    public final ThemedImageUrlEntity d;
    public final bjq0 e;
    public final PhoneInputSource f;
    public final String g;
    public final boolean h;

    public cjq0(eh01 eh01Var, String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, bjq0 bjq0Var, PhoneInputSource phoneInputSource, String str3) {
        this.a = eh01Var;
        this.b = str;
        this.c = str2;
        this.d = themedImageUrlEntity;
        this.e = bjq0Var;
        this.f = phoneInputSource;
        this.g = str3;
        this.h = bjq0Var != null;
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return this.h;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjq0)) {
            return false;
        }
        cjq0 cjq0Var = (cjq0) obj;
        return jl40.l(this.a, cjq0Var.a) && jl40.l(this.b, cjq0Var.b) && jl40.l(this.c, cjq0Var.c) && this.d.equals(cjq0Var.d) && jl40.l(this.e, cjq0Var.e) && this.f == cjq0Var.f && jl40.l(this.g, cjq0Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int c = xvz.c(this.d, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
        bjq0 bjq0Var = this.e;
        int hashCode = (c + (bjq0Var == null ? 0 : bjq0Var.hashCode())) * 31;
        PhoneInputSource phoneInputSource = this.f;
        int hashCode2 = (hashCode + (phoneInputSource == null ? 0 : phoneInputSource.hashCode())) * 31;
        String str2 = this.g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("B2cTransfer(fromCircleButton=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", transferTarget=");
        sb.append(this.e);
        sb.append(", phoneInputSource=");
        sb.append(this.f);
        sb.append(", planToken=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
