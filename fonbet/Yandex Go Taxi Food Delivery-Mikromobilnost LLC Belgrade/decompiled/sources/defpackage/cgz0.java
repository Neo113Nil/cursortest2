package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cgz0 {
    public final ArrayList a;
    public final boolean b;

    public cgz0(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgz0)) {
            return false;
        }
        cgz0 cgz0Var = (cgz0) obj;
        return this.a.equals(cgz0Var.a) && this.b == cgz0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TipsModel(choices=" + this.a + ", haveUniqueIds=" + this.b + Extension.C_BRAKE;
    }
}
