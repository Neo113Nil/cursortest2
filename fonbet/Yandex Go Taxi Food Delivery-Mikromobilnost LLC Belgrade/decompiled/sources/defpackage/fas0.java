package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lfas0;", "", "Companion", "das0", "eas0", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class fas0 {
    public static final eas0 Companion = new eas0();
    public int a;
    public int b;

    public fas0(int i) {
        this.a = 0;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fas0)) {
            return false;
        }
        fas0 fas0Var = (fas0) obj;
        return this.a == fas0Var.a && this.b == fas0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ShownSummaryPromotionInfo(showCount=", ", interactionCount=", Extension.C_BRAKE);
    }

    public fas0() {
        this(0);
    }
}
