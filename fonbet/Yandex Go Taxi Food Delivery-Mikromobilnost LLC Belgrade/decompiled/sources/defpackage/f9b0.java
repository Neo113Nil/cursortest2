package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class f9b0 {
    public final ColorModel a;
    public final c9b0 b;

    public f9b0(ColorModel colorModel, c9b0 c9b0Var) {
        this.a = colorModel;
        this.b = c9b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9b0)) {
            return false;
        }
        f9b0 f9b0Var = (f9b0) obj;
        return this.a.equals(f9b0Var.a) && jl40.l(this.b, f9b0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c9b0 c9b0Var = this.b;
        return hashCode + (c9b0Var == null ? 0 : c9b0Var.hashCode());
    }

    public final String toString() {
        return "SelectedStateSettings(borderColor=" + this.a + ", background=" + this.b + Extension.C_BRAKE;
    }
}
