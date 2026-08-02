package defpackage;

import defpackage.qe40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lne40;", "", "Companion", "me40", "le40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ne40 {
    public static final me40 Companion = new me40();
    public static final ne40 f = new ne40(0);
    public final qe40.b a;
    public final String b;
    public final mf40 c;
    public final mf40 d;
    public final String e;

    public ne40(int i, qe40.b bVar, String str, mf40 mf40Var, mf40 mf40Var2, String str2) {
        this.a = (i & 1) == 0 ? new qe40.b(0) : bVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        int i2 = i & 4;
        mf40 mf40Var3 = mf40.d;
        if (i2 == 0) {
            mf40.Companion.getClass();
            this.c = mf40Var3;
        } else {
            this.c = mf40Var;
        }
        if ((i & 8) == 0) {
            mf40.Companion.getClass();
            this.d = mf40Var3;
        } else {
            this.d = mf40Var2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne40)) {
            return false;
        }
        ne40 ne40Var = (ne40) obj;
        return jl40.l(this.a, ne40Var.a) && jl40.l(this.b, ne40Var.b) && jl40.l(this.c, ne40Var.c) && jl40.l(this.d, ne40Var.d) && jl40.l(this.e, ne40Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtTrainDateSelector(datePicker=");
        sb.append(this.a);
        sb.append(", selectedDate=");
        sb.append(this.b);
        sb.append(", state=");
        sb.append(this.c);
        sb.append(", selectedState=");
        sb.append(this.d);
        sb.append(", icon=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public ne40() {
        this(0);
    }

    public ne40(int i) {
        qe40.b bVar = new qe40.b(0);
        lf40 lf40Var = mf40.Companion;
        lf40Var.getClass();
        lf40Var.getClass();
        this.a = bVar;
        this.b = "";
        mf40 mf40Var = mf40.d;
        this.c = mf40Var;
        this.d = mf40Var;
        this.e = null;
    }
}
