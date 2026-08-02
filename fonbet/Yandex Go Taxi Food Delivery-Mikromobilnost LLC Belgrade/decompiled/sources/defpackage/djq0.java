package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class djq0 implements wjq0 {
    public final eh01 a;
    public final String b;
    public final String c;
    public final ThemedImageUrlEntity d;

    public djq0(eh01 eh01Var, String str, String str2, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = eh01Var;
        this.b = str;
        this.c = str2;
        this.d = themedImageUrlEntity;
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djq0)) {
            return false;
        }
        djq0 djq0Var = (djq0) obj;
        return this.a.equals(djq0Var.a) && jl40.l(this.b, djq0Var.b) && jl40.l(this.c, djq0Var.c) && this.d.equals(djq0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CommonTopup(fromCircleButton=" + this.a + ", title=" + this.b + ", description=" + this.c + ", image=" + this.d + Extension.C_BRAKE;
    }
}
