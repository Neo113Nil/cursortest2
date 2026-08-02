package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f6z0 {
    public final ArrayList a;
    public final boolean b;

    public f6z0(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6z0)) {
            return false;
        }
        f6z0 f6z0Var = (f6z0) obj;
        return this.a.equals(f6z0Var.a) && this.b == f6z0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimeDetailsState(details=" + this.a + ", isLoading=" + this.b + Extension.C_BRAKE;
    }
}
