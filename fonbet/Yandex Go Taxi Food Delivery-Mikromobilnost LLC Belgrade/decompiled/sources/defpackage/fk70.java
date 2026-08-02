package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fk70 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public fk70(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk70)) {
            return false;
        }
        fk70 fk70Var = (fk70) obj;
        return jl40.l(this.a, fk70Var.a) && jl40.l(this.b, fk70Var.b) && this.c.equals(fk70Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, b64.v("OrderCancelClarificationScreenUiModel(title=", this.a, ", description=", this.b, ", buttons="), this.c);
    }
}
