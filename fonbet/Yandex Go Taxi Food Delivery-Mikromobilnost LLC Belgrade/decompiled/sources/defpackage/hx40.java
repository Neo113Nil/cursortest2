package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhx40;", "", "Companion", "fx40", "gx40", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class hx40 {
    public static final gx40 Companion = new gx40();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ hx40(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx40)) {
            return false;
        }
        hx40 hx40Var = (hx40) obj;
        return jl40.l(this.a, hx40Var.a) && jl40.l(this.b, hx40Var.b) && jl40.l(this.c, hx40Var.c) && jl40.l(this.d, hx40Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("MultipointsAlertDto(titleKey=", this.a, ", messageKey=", this.b, ", primaryButtonTextKey="), this.c, ", secondaryButtonTextKey=", this.d, Extension.C_BRAKE);
    }

    public hx40(int i) {
        this.a = "";
        this.b = null;
        this.c = "";
        this.d = "";
    }

    public hx40() {
        this(0);
    }
}
