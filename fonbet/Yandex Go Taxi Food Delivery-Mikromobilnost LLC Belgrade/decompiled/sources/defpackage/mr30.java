package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lmr30;", "", "Companion", "kr30", "lr30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class mr30 {
    public static final lr30 Companion = new lr30();
    public final zzs a;
    public final String b;

    public /* synthetic */ mr30(int i, zzs zzsVar, String str) {
        this.a = (i & 1) == 0 ? zzs.f : zzsVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr30)) {
            return false;
        }
        mr30 mr30Var = (mr30) obj;
        return jl40.l(this.a, mr30Var.a) && jl40.l(this.b, mr30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtPaymentBleParam(location=" + this.a + ", zoneName=" + this.b + Extension.C_BRAKE;
    }

    public mr30(zzs zzsVar, String str) {
        this.a = zzsVar;
        this.b = str;
    }

    public mr30() {
        this(zzs.f, "");
    }
}
