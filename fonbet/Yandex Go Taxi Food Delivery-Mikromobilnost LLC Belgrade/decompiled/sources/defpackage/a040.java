package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"La040;", "", "Companion", "yz30", "zz30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class a040 {
    public static final zz30 Companion = new zz30();
    public int a;
    public int b;

    public a040(int i) {
        this.a = 0;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a040)) {
            return false;
        }
        a040 a040Var = (a040) obj;
        return this.a == a040Var.a && this.b == a040Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "MtShownSummaryPromotionInfo(showCount=", ", interactionCount=", Extension.C_BRAKE);
    }

    public a040() {
        this(0);
    }
}
