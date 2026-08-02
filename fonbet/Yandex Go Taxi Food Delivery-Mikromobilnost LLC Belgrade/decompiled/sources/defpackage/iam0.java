package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.entities.SavingsDashboardPollStatus;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class iam0 {
    public final rbv a;
    public final Text b;
    public final MoneyEntity c;
    public final String d;
    public final List e;
    public final List f;
    public final SavingsDashboardPollStatus g;
    public final List h;
    public final ham0 i;

    public iam0(rbv rbvVar, Text text, MoneyEntity moneyEntity, String str, List list, List list2, SavingsDashboardPollStatus savingsDashboardPollStatus, List list3, ham0 ham0Var) {
        this.a = rbvVar;
        this.b = text;
        this.c = moneyEntity;
        this.d = str;
        this.e = list;
        this.f = list2;
        this.g = savingsDashboardPollStatus;
        this.h = list3;
        this.i = ham0Var;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iam0)) {
            return false;
        }
        iam0 iam0Var = (iam0) obj;
        if (!jl40.l(this.a, iam0Var.a) || !jl40.l(this.b, iam0Var.b) || !jl40.l(this.c, iam0Var.c)) {
            return false;
        }
        String str = iam0Var.d;
        String str2 = this.d;
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
        return l && jl40.l(this.e, iam0Var.e) && jl40.l(this.f, iam0Var.f) && this.g == iam0Var.g && jl40.l(this.h, iam0Var.h) && jl40.l(this.i, iam0Var.i);
    }

    public final int hashCode() {
        int d = ly3.d(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int c = unr0.c((this.g.hashCode() + unr0.c(unr0.c((d + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f)) * 31, 31, this.h);
        ham0 ham0Var = this.i;
        return c + (ham0Var != null ? ham0Var.hashCode() : 0);
    }

    public final String toString() {
        String str = this.d;
        String a = str == null ? "null" : jr.a(str);
        StringBuilder sb = new StringBuilder("SavingsDashboardDataEntity(savingsLogo=");
        sb.append(this.a);
        sb.append(", savingsTitle=");
        sb.append(this.b);
        sb.append(", savingsAmount=");
        sb.append(this.c);
        sb.append(", supportAction=");
        sb.append(a);
        sb.append(", savingsDescriptionList=");
        nnm.w(sb, this.e, ", accountCells=", this.f, ", pollStatus=");
        sb.append(this.g);
        sb.append(", widgets=");
        sb.append(this.h);
        sb.append(", noAccountsInfo=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
