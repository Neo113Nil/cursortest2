package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgp40;", "", "Companion", "ap40", "dp40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class gp40 {
    public static final dp40 Companion = new dp40();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(9)), null};
    public final List a;
    public final boolean b;

    public /* synthetic */ gp40(int i, boolean z, List list) {
        this.a = (i & 1) == 0 ? null : list;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp40)) {
            return false;
        }
        gp40 gp40Var = (gp40) obj;
        return jl40.l(this.a, gp40Var.a) && this.b == gp40Var.b;
    }

    public final int hashCode() {
        List list = this.a;
        return Boolean.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "MulticlassOptions(selectedClasses=", ", isSelected=", Extension.C_BRAKE, this.b);
    }

    public gp40(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public gp40() {
        this(null, false);
    }
}
