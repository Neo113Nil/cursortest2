package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mls {
    public final String a;
    public final ColorModel b;
    public final rr51 c;

    public mls(String str, ColorModel colorModel, rr51 rr51Var) {
        this.a = str;
        this.b = colorModel;
        this.c = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mls)) {
            return false;
        }
        mls mlsVar = (mls) obj;
        return jl40.l(this.a, mlsVar.a) && jl40.l(this.b, mlsVar.b) && jl40.l(this.c, mlsVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ColorModel colorModel = this.b;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        rr51 rr51Var = this.c;
        return hashCode2 + (rr51Var != null ? rr51Var.hashCode() : 0);
    }

    public final String toString() {
        return "FunFactEntity(logId=" + this.a + ", backgroundBlurColor=" + this.b + ", divContent=" + this.c + Extension.C_BRAKE;
    }
}
