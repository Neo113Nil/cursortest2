package defpackage;

import android.content.Context;
import android.text.SpannableString;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.savings.internal.entities.CellType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cam0 extends fam0 implements aam {
    public static final int o = kp50.r(2);
    public final Text c;
    public final Text d;
    public final Text e;
    public final Text f;
    public final MoneyEntity g;
    public final Text h;
    public final String i;
    public final bam0 j;
    public final String k;
    public final CellType l;
    public final boolean m;
    public final rr51 n;

    public cam0(Text.Constant constant, Text.Constant constant2, Text.Constant constant3, Text text, MoneyEntity moneyEntity, Text.Constant constant4, String str, bam0 bam0Var, String str2, CellType cellType, boolean z, rr51 rr51Var) {
        super(str2, 2);
        this.c = constant;
        this.d = constant2;
        this.e = constant3;
        this.f = text;
        this.g = moneyEntity;
        this.h = constant4;
        this.i = str;
        this.j = bam0Var;
        this.k = str2;
        this.l = cellType;
        this.m = z;
        this.n = rr51Var;
    }

    @Override // defpackage.aam
    public final boolean a() {
        return this.l == CellType.EXISTING;
    }

    @Override // defpackage.fam0
    public final aam0 c(Context context) {
        boolean z = this.m;
        Text text = this.d;
        if (z) {
            SpannableString b = ugb1.b(d.a(context, text).toString(), rje.j(kyg0.ybsdk_savings_dashboard_lock, context), o);
            Text.Companion.getClass();
            text = new Text.Constant(b);
        }
        Text text2 = text;
        bam0 bam0Var = this.j;
        return new y9m0(this.c, text2, this.e, this.n, this.f, this.g, this.h, bam0Var.a, bam0Var.b, bam0Var.c, bam0Var.d, bam0Var.e, bam0Var.f, this.i, this.l, bam0Var.g, this.m, g5b1.b(bam0Var.h), bam0Var.i);
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cam0)) {
            return false;
        }
        cam0 cam0Var = (cam0) obj;
        if (!jl40.l(this.c, cam0Var.c) || !jl40.l(this.d, cam0Var.d) || !jl40.l(this.e, cam0Var.e) || !jl40.l(this.f, cam0Var.f) || !jl40.l(this.g, cam0Var.g) || !jl40.l(this.h, cam0Var.h)) {
            return false;
        }
        String str = cam0Var.i;
        String str2 = this.i;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l && jl40.l(this.j, cam0Var.j) && jl40.l(this.k, cam0Var.k) && this.l == cam0Var.l && this.m == cam0Var.m && jl40.l(this.n, cam0Var.n);
    }

    public final int hashCode() {
        int c = n.c(this.f, n.c(this.e, n.c(this.d, this.c.hashCode() * 31, 31), 31), 31);
        MoneyEntity moneyEntity = this.g;
        int hashCode = (c + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
        Text text = this.h;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        String str = this.i;
        int e = unr0.e((this.l.hashCode() + unr0.b((this.j.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.k)) * 31, 31, this.m);
        rr51 rr51Var = this.n;
        return e + (rr51Var != null ? rr51Var.hashCode() : 0);
    }

    public final String toString() {
        String str = this.i;
        String a = str == null ? "null" : jr.a(str);
        StringBuilder p = n.p("SavingsCellAccountInfoItem(balanceText=", this.c, ", interestText=", this.d, ", title=");
        ly3.C(p, this.e, ", subtitle=", this.f, ", targetAmountText=");
        p.append(this.g);
        p.append(", textUnderAmount=");
        p.append(this.h);
        p.append(", action=");
        p.append(a);
        p.append(", theme=");
        p.append(this.j);
        p.append(", agreementId=");
        p.append(this.k);
        p.append(", cellType=");
        p.append(this.l);
        p.append(", interestLocked=");
        p.append(this.m);
        p.append(", divSubtitle=");
        p.append(this.n);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
