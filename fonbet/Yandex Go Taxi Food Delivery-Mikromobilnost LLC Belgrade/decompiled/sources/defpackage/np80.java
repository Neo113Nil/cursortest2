package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class np80 implements pp80 {
    public final List a;
    public final ArrayList b;

    public np80(ArrayList arrayList, List list) {
        this.a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np80)) {
            return false;
        }
        np80 np80Var = (np80) obj;
        return jl40.l(this.a, np80Var.a) && this.b.equals(np80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentSearchOptions(chips=" + this.a + ", modalContents=" + this.b + Extension.C_BRAKE;
    }
}
