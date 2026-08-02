package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Llai;", "", "Companion", "jai", "kai", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class lai {
    public static final kai Companion = new kai();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ lai(int i, String str, String str2, String str3, String str4) {
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lai)) {
            return false;
        }
        lai laiVar = (lai) obj;
        return jl40.l(this.a, laiVar.a) && jl40.l(this.b, laiVar.b) && jl40.l(this.c, laiVar.c) && jl40.l(this.d, laiVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("DeliveryFormDto(titleKey=", this.a, ", subtitleKey=", this.b, ", leadImageTag="), this.c, ", badgeImageTag=", this.d, Extension.C_BRAKE);
    }

    public lai(int i) {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
    }

    public lai() {
        this(0);
    }
}
