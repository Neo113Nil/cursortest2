package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e6z0 {
    public final ArrayList a;
    public final boolean b;

    public e6z0(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6z0)) {
            return false;
        }
        e6z0 e6z0Var = (e6z0) obj;
        return this.a.equals(e6z0Var.a) && this.b == e6z0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimeDetailsModel(timeDetails=" + this.a + ", isLoading=" + this.b + Extension.C_BRAKE;
    }
}
