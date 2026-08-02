package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fy41 implements pre {
    public final String a;
    public final String b;
    public final ArrayList c;

    public fy41(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy41)) {
            return false;
        }
        fy41 fy41Var = (fy41) obj;
        return jl40.l(this.a, fy41Var.a) && jl40.l(this.b, fy41Var.b) && this.c.equals(fy41Var.c);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "picker";
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, b64.v("WheelPickerRemoteCoreWidget(id=", this.a, ", metricaLabel=", this.b, ", columns="), this.c);
    }
}
