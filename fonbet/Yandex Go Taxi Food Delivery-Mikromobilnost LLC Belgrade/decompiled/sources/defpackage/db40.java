package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldb40;", "", "Companion", "bb40", "cb40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class db40 {
    public static final cb40 Companion = new cb40();
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final ief e;

    public /* synthetic */ db40(int i, boolean z, String str, int i2, int i3, ief iefVar) {
        this.a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = iefVar;
        }
    }

    public static db40 a(db40 db40Var, boolean z, String str, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z = db40Var.a;
        }
        boolean z2 = z;
        if ((i3 & 2) != 0) {
            str = db40Var.b;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i = db40Var.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = db40Var.d;
        }
        int i5 = i2;
        ief iefVar = (i3 & 16) != 0 ? db40Var.e : null;
        db40Var.getClass();
        return new db40(z2, str2, i4, i5, iefVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db40)) {
            return false;
        }
        db40 db40Var = (db40) obj;
        return this.a == db40Var.a && jl40.l(this.b, db40Var.b) && this.c == db40Var.c && this.d == db40Var.d && jl40.l(this.e, db40Var.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int b = oyr.b(this.d, oyr.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        ief iefVar = this.e;
        return b + (iefVar != null ? iefVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("MtTrainCheckoutOrderInfo(backAndForth=", ", tariff=", this.b, ", adultCount=", this.a);
        vfc.u(this.c, this.d, ", childCount=", ", currencyRules=", v);
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public db40() {
        this(0);
    }

    public db40(boolean z, String str, int i, int i2, ief iefVar) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = iefVar;
    }

    public /* synthetic */ db40(int i) {
        this(true, null, 0, 0, null);
    }
}
