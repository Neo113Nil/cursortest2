package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lowd0;", "", "Companion", "mwd0", "nwd0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class owd0 {
    public static final nwd0 Companion = new nwd0();
    public final String a;
    public final String b;

    public /* synthetic */ owd0(int i, String str, String str2) {
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
        if (!(obj instanceof owd0)) {
            return false;
        }
        owd0 owd0Var = (owd0) obj;
        return jl40.l(this.a, owd0Var.a) && jl40.l(this.b, owd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Policy(content=", this.a, ", color=", this.b, Extension.C_BRAKE);
    }

    public owd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public owd0() {
        this("", "");
    }
}
