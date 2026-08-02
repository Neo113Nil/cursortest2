package defpackage;

import java.util.Collection;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class mk6 {
    public static final mk6 e = new mk6(0);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Collection d;

    public mk6(String str, boolean z, boolean z2, Collection collection) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk6)) {
            return false;
        }
        mk6 mk6Var = (mk6) obj;
        return jl40.l(this.a, mk6Var.a) && this.b == mk6Var.b && this.c == mk6Var.c && jl40.l(this.d, mk6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder l = oo31.l("BriefTariffInfo(tariffClass=", this.a, ", isTariffInMulticlass=", ", hasSpecialRequirements=", this.b);
        l.append(this.c);
        l.append(", multiclassClasses=");
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public mk6() {
        this(0);
    }

    public /* synthetic */ mk6(int i) {
        this("", false, false, EmptyList.a);
    }
}
