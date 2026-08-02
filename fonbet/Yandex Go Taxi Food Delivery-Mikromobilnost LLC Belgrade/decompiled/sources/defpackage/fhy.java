package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fhy {
    public final wp2 a;
    public final wp2 b;
    public final wp2 c;
    public final wp2 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.go.design.compose.colors.AppColor$Palette, wp2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ fhy(up2 up2Var, up2 up2Var2, int i) {
        this(r0, (i & 2) != 0 ? r0 : up2Var, tp2.a, (i & 8) != 0 ? AppColor$Palette.Line : up2Var2);
        ?? r0 = AppColor$Palette.Error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhy)) {
            return false;
        }
        fhy fhyVar = (fhy) obj;
        return jl40.l(this.a, fhyVar.a) && jl40.l(this.b, fhyVar.b) && jl40.l(this.c, fhyVar.c) && jl40.l(this.d, fhyVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "LineInputDividerColors(error=" + this.a + ", errorUnfocused=" + this.b + ", focused=" + this.c + ", unfocused=" + this.d + Extension.C_BRAKE;
    }

    public fhy(wp2 wp2Var, wp2 wp2Var2, wp2 wp2Var3, wp2 wp2Var4) {
        this.a = wp2Var;
        this.b = wp2Var2;
        this.c = wp2Var3;
        this.d = wp2Var4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fhy() {
        this(r0, r0, 15);
        up2 up2Var = null;
    }
}
