package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lge70;", "", "Companion", "ee70", "fe70", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ge70 {
    public static final fe70 Companion = new fe70();
    public final String a;
    public final String b;

    public /* synthetic */ ge70(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge70)) {
            return false;
        }
        ge70 ge70Var = (ge70) obj;
        return jl40.l(this.a, ge70Var.a) && jl40.l(this.b, ge70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OptionDisabledLabelsDto(maxWeight=", this.a, ", maxCount=", this.b, Extension.C_BRAKE);
    }

    public ge70(int i) {
        this.a = "";
        this.b = "";
    }

    public ge70() {
        this(0);
    }
}
