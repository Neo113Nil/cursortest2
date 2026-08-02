package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class o5l0 implements p5l0 {
    public final wp2 a;
    public final q5l0 b;

    public o5l0(AppColor$Palette appColor$Palette, q5l0 q5l0Var) {
        this.a = appColor$Palette;
        this.b = q5l0Var;
    }

    @Override // defpackage.p5l0
    public final wp2 a() {
        return this.a;
    }

    @Override // defpackage.p5l0
    public final q5l0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5l0)) {
            return false;
        }
        o5l0 o5l0Var = (o5l0) obj;
        return jl40.l(this.a, o5l0Var.a) && jl40.l(this.b, o5l0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q5l0 q5l0Var = this.b;
        return hashCode + (q5l0Var == null ? 0 : q5l0Var.hashCode());
    }

    public final String toString() {
        return "Start(color=" + this.a + ", indicator=" + this.b + Extension.C_BRAKE;
    }
}
