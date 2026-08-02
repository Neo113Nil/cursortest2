package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Laka0;", "", "Companion", "yja0", "zja0", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class aka0 {
    public static final zja0 Companion = new zja0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ aka0(int i, String str, String str2, String str3) {
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
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aka0)) {
            return false;
        }
        aka0 aka0Var = (aka0) obj;
        return jl40.l(this.a, aka0Var.a) && jl40.l(this.b, aka0Var.b) && jl40.l(this.c, aka0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("PaymentSelectorScreenListItemDto(iconTag=", this.a, ", titleKey=", this.b, ", subtitleKey="), this.c, Extension.C_BRAKE);
    }

    public aka0() {
        this.a = "";
        this.b = "";
        this.c = null;
    }
}
