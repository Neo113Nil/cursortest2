package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ijt {
    public final List a;
    public final List b;

    public ijt(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijt)) {
            return false;
        }
        ijt ijtVar = (ijt) obj;
        return jl40.l(this.a, ijtVar.a) && jl40.l(this.b, ijtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("GlobalSearchAnswer(items=", this.a, ", warnings=", this.b, Extension.C_BRAKE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ijt(int i) {
        this(r1, r1);
        EmptyList emptyList = EmptyList.a;
    }

    public ijt() {
        this(0);
    }
}
