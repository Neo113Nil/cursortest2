package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class duz0 {
    public final String a;
    public final String b;
    public final ThemedImageUrlEntity c;

    public duz0(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = str2;
        this.c = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duz0)) {
            return false;
        }
        duz0 duz0Var = (duz0) obj;
        return jl40.l(this.a, duz0Var.a) && jl40.l(this.b, duz0Var.b) && this.c.equals(duz0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TooltipActionEntity(value=", this.a, ", text=", this.b, ", image=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
