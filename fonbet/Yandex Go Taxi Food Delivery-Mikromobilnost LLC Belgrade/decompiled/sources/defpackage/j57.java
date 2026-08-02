package defpackage;

import com.ybsdk.feature.pdf.internal.entities.ButtonEntity$Alignment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j57 {
    public final uz6 a;
    public final uz6 b;
    public final ButtonEntity$Alignment c;

    public j57(uz6 uz6Var, uz6 uz6Var2, ButtonEntity$Alignment buttonEntity$Alignment) {
        this.a = uz6Var;
        this.b = uz6Var2;
        this.c = buttonEntity$Alignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j57)) {
            return false;
        }
        j57 j57Var = (j57) obj;
        return jl40.l(this.a, j57Var.a) && jl40.l(this.b, j57Var.b) && this.c == j57Var.c;
    }

    public final int hashCode() {
        uz6 uz6Var = this.a;
        int hashCode = (uz6Var == null ? 0 : uz6Var.hashCode()) * 31;
        uz6 uz6Var2 = this.b;
        int hashCode2 = (hashCode + (uz6Var2 == null ? 0 : uz6Var2.hashCode())) * 31;
        ButtonEntity$Alignment buttonEntity$Alignment = this.c;
        return hashCode2 + (buttonEntity$Alignment != null ? buttonEntity$Alignment.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonsGroupEntity(primaryButton=" + this.a + ", secondaryButton=" + this.b + ", alignment=" + this.c + Extension.C_BRAKE;
    }
}
