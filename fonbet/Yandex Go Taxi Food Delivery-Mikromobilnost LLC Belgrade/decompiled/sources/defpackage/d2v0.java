package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.main.internal.domain.entities.SubtitleTypeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d2v0 {
    public final Text.Constant a;
    public final Boolean b;
    public final ColorModel c;
    public final ColorModel d;
    public final rbv e;
    public final v5i0 f;
    public final SubtitleTypeEntity g;

    public d2v0(Text.Constant constant, Boolean bool, ColorModel colorModel, ColorModel colorModel2, rbv rbvVar, v5i0 v5i0Var, SubtitleTypeEntity subtitleTypeEntity) {
        this.a = constant;
        this.b = bool;
        this.c = colorModel;
        this.d = colorModel2;
        this.e = rbvVar;
        this.f = v5i0Var;
        this.g = subtitleTypeEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2v0)) {
            return false;
        }
        d2v0 d2v0Var = (d2v0) obj;
        return this.a.equals(d2v0Var.a) && jl40.l(this.b, d2v0Var.b) && this.c.equals(d2v0Var.c) && jl40.l(this.d, d2v0Var.d) && jl40.l(this.e, d2v0Var.e) && jl40.l(this.f, d2v0Var.f) && this.g == d2v0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int d = vfc.d(this.c, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        ColorModel colorModel = this.d;
        int hashCode2 = (d + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        rbv rbvVar = this.e;
        int hashCode3 = (hashCode2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        v5i0 v5i0Var = this.f;
        return this.g.hashCode() + ((hashCode3 + (v5i0Var != null ? v5i0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Subtitle(text=");
        sb.append(this.a);
        sb.append(", shouldAnimate=");
        sb.append(this.b);
        sb.append(", color=");
        smw0.z(sb, this.c, ", shimmerAnimationColor=", this.d, ", icon=");
        sb.append(this.e);
        sb.append(", radialGradient=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
