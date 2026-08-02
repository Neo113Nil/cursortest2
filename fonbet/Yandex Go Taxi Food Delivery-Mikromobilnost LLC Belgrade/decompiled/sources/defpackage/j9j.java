package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j9j {
    public final i9j a;
    public final ArrayList b;

    public j9j(i9j i9jVar, ArrayList arrayList) {
        this.a = i9jVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9j)) {
            return false;
        }
        j9j j9jVar = (j9j) obj;
        return jl40.l(this.a, j9jVar.a) && this.b.equals(j9jVar.b);
    }

    public final int hashCode() {
        i9j i9jVar = this.a;
        return this.b.hashCode() + ((i9jVar == null ? 0 : i9jVar.hashCode()) * 31);
    }

    public final String toString() {
        return "DetailsSectionUiModel(title=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }
}
