package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import java.util.Date;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class i6m0 {
    public final Text a;
    public final Text b;
    public final Date c;
    public final String d;
    public final s6m0 e;
    public final MoneyEntity f;
    public final String g;
    public final s6m0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public i6m0(Text text, Text text2, Date date, String str, s6m0 s6m0Var, MoneyEntity moneyEntity, String str2, s6m0 s6m0Var2, boolean z, boolean z2, boolean z3) {
        this.a = text;
        this.b = text2;
        this.c = date;
        this.d = str;
        this.e = s6m0Var;
        this.f = moneyEntity;
        this.g = str2;
        this.h = s6m0Var2;
        this.i = z;
        this.j = z2;
        this.k = z3;
    }

    public static i6m0 a(i6m0 i6m0Var, Date date, String str, s6m0 s6m0Var, MoneyEntity moneyEntity, String str2, s6m0 s6m0Var2, boolean z, boolean z2, int i) {
        Text text = i6m0Var.a;
        Text text2 = i6m0Var.b;
        if ((i & 4) != 0) {
            date = i6m0Var.c;
        }
        Date date2 = date;
        if ((i & 8) != 0) {
            str = i6m0Var.d;
        }
        String str3 = str;
        s6m0 s6m0Var3 = (i & 16) != 0 ? i6m0Var.e : s6m0Var;
        MoneyEntity moneyEntity2 = (i & 32) != 0 ? i6m0Var.f : moneyEntity;
        String str4 = (i & 64) != 0 ? i6m0Var.g : str2;
        s6m0 s6m0Var4 = (i & 128) != 0 ? i6m0Var.h : s6m0Var2;
        boolean z3 = (i & 256) != 0 ? i6m0Var.i : z;
        boolean z4 = (i & 512) != 0 ? i6m0Var.j : z2;
        boolean z5 = i6m0Var.k;
        i6m0Var.getClass();
        return new i6m0(text, text2, date2, str3, s6m0Var3, moneyEntity2, str4, s6m0Var4, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6m0)) {
            return false;
        }
        i6m0 i6m0Var = (i6m0) obj;
        return this.a.equals(i6m0Var.a) && this.b.equals(i6m0Var.b) && jl40.l(this.c, i6m0Var.c) && jl40.l(this.d, i6m0Var.d) && jl40.l(this.e, i6m0Var.e) && jl40.l(this.f, i6m0Var.f) && jl40.l(this.g, i6m0Var.g) && jl40.l(this.h, i6m0Var.h) && this.i == i6m0Var.i && this.j == i6m0Var.j && this.k == i6m0Var.k;
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        Date date = this.c;
        int hashCode = (c + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        s6m0 s6m0Var = this.e;
        int hashCode3 = (hashCode2 + (s6m0Var == null ? 0 : s6m0Var.a.hashCode())) * 31;
        MoneyEntity moneyEntity = this.f;
        int hashCode4 = (hashCode3 + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
        String str2 = this.g;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        s6m0 s6m0Var2 = this.h;
        return Boolean.hashCode(this.k) + unr0.e(unr0.e((hashCode5 + (s6m0Var2 != null ? s6m0Var2.a.hashCode() : 0)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder p = n.p("SavingsAccountGoalState(title=", this.a, ", subtitle=", this.b, ", date=");
        p.append(this.c);
        p.append(", dateInput=");
        p.append(this.d);
        p.append(", errorDate=");
        p.append(this.e);
        p.append(", amount=");
        p.append(this.f);
        p.append(", amountInput=");
        p.append(this.g);
        p.append(", errorAmount=");
        p.append(this.h);
        p.append(", changeInProgress=");
        nnm.v(", deletionInProgress=", ", shouldAllowDelete=", p, this.i, this.j);
        return x4e.i(p, this.k, Extension.C_BRAKE);
    }
}
