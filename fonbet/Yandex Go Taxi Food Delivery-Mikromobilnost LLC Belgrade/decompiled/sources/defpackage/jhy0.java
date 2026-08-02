package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jhy0 implements lhy0 {
    public final ThemedImageUrlEntity a;
    public final String b;
    public final String c;
    public final ygy0 d;

    public jhy0(ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, ygy0 ygy0Var) {
        this.a = themedImageUrlEntity;
        this.b = str;
        this.c = str2;
        this.d = ygy0Var;
    }

    @Override // defpackage.lhy0
    public final ygy0 a() {
        return null;
    }

    @Override // defpackage.lhy0
    public final ygy0 b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhy0)) {
            return false;
        }
        jhy0 jhy0Var = (jhy0) obj;
        return this.a.equals(jhy0Var.a) && jl40.l(this.b, jhy0Var.b) && jl40.l(this.c, jhy0Var.c) && this.d.equals(jhy0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "Success(memberImage=" + this.a + ", title=" + this.b + ", description=" + this.c + ", primaryButton=" + this.d + Extension.C_BRAKE;
    }
}
