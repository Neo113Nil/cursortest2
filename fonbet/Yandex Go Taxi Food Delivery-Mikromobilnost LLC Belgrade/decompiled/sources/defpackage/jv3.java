package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jv3 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final ArrayList c;

    public jv3(Text.Constant constant, Text.Constant constant2, ArrayList arrayList) {
        this.a = constant;
        this.b = constant2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv3)) {
            return false;
        }
        jv3 jv3Var = (jv3) obj;
        return this.a.equals(jv3Var.a) && this.b.equals(jv3Var.b) && this.c.equals(jv3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xvz.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, ly3.u("AutoTopupEditViewState(title=", this.a, ", subtitle=", this.b, ", editViewStates="), this.c);
    }
}
