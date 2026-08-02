package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lmv0;", "", "Companion", "kv0", "lv0", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class mv0 {
    public static final lv0 Companion = new lv0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ mv0(int i, String str, String str2, String str3) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public final boolean a() {
        return this.a.length() == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv0)) {
            return false;
        }
        mv0 mv0Var = (mv0) obj;
        return jl40.l(this.a, mv0Var.a) && jl40.l(this.b, mv0Var.b) && jl40.l(this.c, mv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("AddressIcon(iconTag=", this.a, ", backgroundColor=", this.b, ", iconColor="), this.c, Extension.C_BRAKE);
    }

    public mv0(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
    }

    public mv0() {
        this(0);
    }
}
