package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkk4;", "", "Companion", "ik4", "jk4", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class kk4 {
    public static final jk4 Companion = new jk4();
    public final ok4 a;
    public final gm4 b;

    public /* synthetic */ kk4(int i, ok4 ok4Var, gm4 gm4Var) {
        this.a = (i & 1) == 0 ? new ok4(0) : ok4Var;
        if ((i & 2) == 0) {
            this.b = new gm4(0);
        } else {
            this.b = gm4Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk4)) {
            return false;
        }
        kk4 kk4Var = (kk4) obj;
        return jl40.l(this.a, kk4Var.a) && jl40.l(this.b, kk4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BadgeDto(info=" + this.a + ", showPolicy=" + this.b + Extension.C_BRAKE;
    }

    public kk4() {
        ok4 ok4Var = new ok4(0);
        gm4 gm4Var = new gm4(0);
        this.a = ok4Var;
        this.b = gm4Var;
    }
}
