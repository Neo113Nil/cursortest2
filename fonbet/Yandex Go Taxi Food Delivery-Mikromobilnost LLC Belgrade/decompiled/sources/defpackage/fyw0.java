package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lfyw0;", "", "Companion", "dyw0", "eyw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class fyw0 {
    public static final eyw0 Companion = new eyw0();
    public final String a;
    public final Float b;

    public /* synthetic */ fyw0(int i, String str, Float f) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyw0)) {
            return false;
        }
        fyw0 fyw0Var = (fyw0) obj;
        return jl40.l(this.a, fyw0Var.a) && jl40.l(this.b, fyw0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.b;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "SwipeToDismissZoneHeightDto(service=" + this.a + ", heightInDp=" + this.b + Extension.C_BRAKE;
    }

    public fyw0() {
        this.a = null;
        this.b = null;
    }
}
