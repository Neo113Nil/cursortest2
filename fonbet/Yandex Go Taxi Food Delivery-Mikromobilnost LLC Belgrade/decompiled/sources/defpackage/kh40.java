package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkh40;", "", "Companion", "jh40", "ih40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class kh40 {
    public static final jh40 Companion = new jh40();
    public static final kh40 d = new kh40(0);
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ kh40(int i, String str, String str2, String str3) {
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
        if (!(obj instanceof kh40)) {
            return false;
        }
        kh40 kh40Var = (kh40) obj;
        return jl40.l(this.a, kh40Var.a) && jl40.l(this.b, kh40Var.b) && jl40.l(this.c, kh40Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("MtTrainStation(id=", this.a, ", title=", this.b, ", icon="), this.c, Extension.C_BRAKE);
    }

    public kh40(int i) {
        this.a = "";
        this.b = "";
        this.c = null;
    }

    public kh40() {
        this(0);
    }
}
