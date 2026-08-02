package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class g1m implements i1m {
    public final ArrayList a;
    public final boolean b;

    public g1m(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    @Override // defpackage.i1m
    public final List a() {
        return this.a;
    }

    @Override // defpackage.i1m
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1m)) {
            return false;
        }
        g1m g1mVar = (g1m) obj;
        return this.a.equals(g1mVar.a) && this.b == g1mVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AllSections(labels=" + this.a + ", isForceRequest=" + this.b + Extension.C_BRAKE;
    }
}
