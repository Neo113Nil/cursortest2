package defpackage;

import java.util.Date;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Loez0;", "", "Companion", "mez0", "nez0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class oez0 {
    public static final nez0 Companion = new nez0();
    public final String a;
    public final Date b;

    public /* synthetic */ oez0(int i, String str, Date date) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = date;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oez0)) {
            return false;
        }
        oez0 oez0Var = (oez0) obj;
        return jl40.l(this.a, oez0Var.a) && jl40.l(this.b, oez0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Date date = this.b;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "TimerStateUpdate(titleWithTimer=" + this.a + ", untilTime=" + this.b + Extension.C_BRAKE;
    }

    public oez0() {
        this.a = "";
        this.b = null;
    }
}
