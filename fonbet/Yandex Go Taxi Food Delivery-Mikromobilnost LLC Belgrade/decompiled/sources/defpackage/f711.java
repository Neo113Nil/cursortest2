package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class f711 implements h711 {
    public final Set a;
    public final String b;
    public final i911 c;
    public final String d;

    public f711(Set set, String str, i911 i911Var, String str2) {
        this.a = set;
        this.b = str;
        this.c = i911Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f711)) {
            return false;
        }
        f711 f711Var = (f711) obj;
        return jl40.l(this.a, f711Var.a) && this.b.equals(f711Var.b) && this.c.equals(f711Var.c) && this.d.equals(f711Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.c;
    }

    public final String toString() {
        return "UndergroundBoardingPositions(wagons=" + this.a + ", contentDescription=" + ((Object) this.b) + ", transportType=" + this.c + ", id=" + this.d + Extension.C_BRAKE;
    }
}
