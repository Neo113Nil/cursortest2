package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class f9m0 implements s9m0 {
    public final String a;
    public final String b;
    public final String c;
    public final ThemedImageUrlEntity d;

    public f9m0(String str, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9m0)) {
            return false;
        }
        f9m0 f9m0Var = (f9m0) obj;
        return jl40.l(this.a, f9m0Var.a) && jl40.l(this.b, f9m0Var.b) && jl40.l(this.c, f9m0Var.c) && jl40.l(this.d, f9m0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ThemedImageUrlEntity themedImageUrlEntity = this.d;
        return b + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("Close(id=", this.a, ", title=", this.b, ", action=");
        v.append(this.c);
        v.append(", icon=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
