package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kjq0 implements wjq0 {
    public final eh01 a;
    public final String b;
    public final String c;
    public final ThemedImageUrlEntity d;

    public kjq0(eh01 eh01Var, String str, String str2, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = eh01Var;
        this.b = str;
        this.c = str2;
        this.d = themedImageUrlEntity;
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjq0)) {
            return false;
        }
        kjq0 kjq0Var = (kjq0) obj;
        return this.a.equals(kjq0Var.a) && jl40.l(this.b, kjq0Var.b) && jl40.l(this.c, kjq0Var.c) && jl40.l(this.d, kjq0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.d;
        return hashCode + (themedImageUrlEntity != null ? themedImageUrlEntity.hashCode() : 0);
    }

    public final String toString() {
        return "MkkCashout(fromCircleButton=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", image=" + this.d + Extension.C_BRAKE;
    }
}
