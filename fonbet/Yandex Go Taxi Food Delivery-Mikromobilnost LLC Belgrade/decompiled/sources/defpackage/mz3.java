package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mz3 {
    public final boolean a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final iky0 e;

    public mz3(boolean z, String str, String str2, ArrayList arrayList, iky0 iky0Var) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = iky0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz3)) {
            return false;
        }
        mz3 mz3Var = (mz3) obj;
        return this.a == mz3Var.a && jl40.l(this.b, mz3Var.b) && jl40.l(this.c, mz3Var.c) && this.d.equals(mz3Var.d) && jl40.l(this.e, mz3Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int b2 = ly3.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        iky0 iky0Var = this.e;
        return b2 + (iky0Var != null ? iky0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("AutoTopupData(enabled=", ", title=", this.b, ", description=", this.a);
        v.append(this.c);
        v.append(", typeSettings=");
        v.append(this.d);
        v.append(", titleEndBadge=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
