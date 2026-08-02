package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class p39 {
    public final String a;
    public final String b;
    public final String c;
    public final ThemedImageUrlEntity d;

    public p39(String str, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p39)) {
            return false;
        }
        p39 p39Var = (p39) obj;
        return jl40.l(this.a, p39Var.a) && jl40.l(this.b, p39Var.b) && jl40.l(this.c, p39Var.c) && this.d.equals(p39Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("CashbackEntity(label=", this.a, ", amount=", this.b, ", title=");
        v.append(this.c);
        v.append(", image=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
