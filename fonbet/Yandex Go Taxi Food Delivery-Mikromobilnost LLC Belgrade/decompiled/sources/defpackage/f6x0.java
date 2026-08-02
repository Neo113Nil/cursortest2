package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f6x0 implements pre {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final int d;
    public final String e;

    public f6x0(String str, String str2, ArrayList arrayList, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = i;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6x0)) {
            return false;
        }
        f6x0 f6x0Var = (f6x0) obj;
        return jl40.l(this.a, f6x0Var.a) && jl40.l(this.b, f6x0Var.b) && this.c.equals(f6x0Var.c) && this.d == f6x0Var.d && jl40.l(this.e, f6x0Var.e);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "tabs";
    }

    public final int hashCode() {
        int b = oyr.b(this.d, ly3.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("TabsRemoteCoreWidget(id=", this.a, ", formStateKey=", this.b, ", options=");
        v.append(this.c);
        v.append(", selectedIndex=");
        v.append(this.d);
        v.append(", metricaLabel=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
