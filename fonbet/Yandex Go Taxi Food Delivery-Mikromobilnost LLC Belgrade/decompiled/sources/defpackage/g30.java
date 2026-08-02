package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class g30 {
    public final Text a;
    public final ArrayList b;

    public g30(Text text, ArrayList arrayList) {
        this.a = text;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g30)) {
            return false;
        }
        g30 g30Var = (g30) obj;
        return jl40.l(this.a, g30Var.a) && this.b.equals(g30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivePromoEntity(title=" + this.a + ", promos=" + this.b + Extension.C_BRAKE;
    }
}
