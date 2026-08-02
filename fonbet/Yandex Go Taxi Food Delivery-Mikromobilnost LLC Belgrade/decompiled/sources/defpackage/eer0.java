package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eer0 {
    public final rbv a;
    public final Text b;

    public eer0(ibv ibvVar, Text.Constant constant) {
        this.a = ibvVar;
        this.b = constant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eer0)) {
            return false;
        }
        eer0 eer0Var = (eer0) obj;
        return jl40.l(this.a, eer0Var.a) && jl40.l(this.b, eer0Var.b);
    }

    public final int hashCode() {
        rbv rbvVar = this.a;
        int hashCode = (rbvVar == null ? 0 : rbvVar.hashCode()) * 31;
        Text text = this.b;
        return hashCode + (text != null ? text.hashCode() : 0);
    }

    public final String toString() {
        return "State(previewImage=" + this.a + ", title=" + this.b + Extension.C_BRAKE;
    }
}
