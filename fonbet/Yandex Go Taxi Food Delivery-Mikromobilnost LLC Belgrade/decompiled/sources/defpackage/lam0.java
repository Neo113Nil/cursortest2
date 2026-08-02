package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.savings.internal.entities.SavingsDashboardPollStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lam0 {
    public final jam0 a;
    public final List b;
    public final List c;
    public final SavingsDashboardPollStatus d;
    public final List e;
    public final ColorModel f;

    public lam0(jam0 jam0Var, List list, List list2, SavingsDashboardPollStatus savingsDashboardPollStatus, List list3, ColorModel colorModel) {
        this.a = jam0Var;
        this.b = list;
        this.c = list2;
        this.d = savingsDashboardPollStatus;
        this.e = list3;
        this.f = colorModel;
    }

    public static lam0 a(lam0 lam0Var, ArrayList arrayList) {
        jam0 jam0Var = lam0Var.a;
        List list = lam0Var.b;
        List list2 = lam0Var.c;
        SavingsDashboardPollStatus savingsDashboardPollStatus = lam0Var.d;
        ColorModel colorModel = lam0Var.f;
        lam0Var.getClass();
        return new lam0(jam0Var, list, list2, savingsDashboardPollStatus, arrayList, colorModel);
    }

    public final kam0 b(String str) {
        Object obj;
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((kam0) obj).a, str)) {
                break;
            }
        }
        return (kam0) obj;
    }

    public final lam0 c(kam0 kam0Var) {
        List<kam0> list = this.e;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (kam0 kam0Var2 : list) {
            if (jl40.l(kam0Var2.a, kam0Var.a)) {
                kam0Var2 = kam0Var;
            }
            arrayList.add(kam0Var2);
        }
        return a(this, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lam0)) {
            return false;
        }
        lam0 lam0Var = (lam0) obj;
        return jl40.l(this.a, lam0Var.a) && jl40.l(this.b, lam0Var.b) && jl40.l(this.c, lam0Var.c) && this.d == lam0Var.d && jl40.l(this.e, lam0Var.e) && this.f.equals(lam0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.c((this.d.hashCode() + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        return "SavingsDashboardDataEntityV4(header=" + this.a + ", divWidgets=" + this.b + ", educations=" + this.c + ", pollStatus=" + this.d + ", shelves=" + this.e + ", backgroundColor=" + this.f + Extension.C_BRAKE;
    }
}
