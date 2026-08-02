package defpackage;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.exception.ValidationException;

/* loaded from: classes13.dex */
public final class l3j0 extends ad5 {
    public final il A;
    public final vor0 B;
    public final k3j0 C;
    public final p3j0 D;
    public final zor0 x;
    public final v y;
    public final q6c0 z;

    public l3j0(j3j0 j3j0Var, a3j0 a3j0Var, zor0 zor0Var, v vVar, q6c0 q6c0Var) {
        super(i3j0.class);
        Object obj;
        this.x = zor0Var;
        this.y = vVar;
        this.z = q6c0Var;
        il ilVar = j3j0Var.a;
        this.A = ilVar;
        this.B = j3j0Var.b;
        k3j0 k3j0Var = j3j0Var.c;
        this.C = k3j0Var;
        Account b = ilVar.b();
        p3j0 p3j0Var = new p3j0();
        p3j0Var.i = false;
        p3j0Var.j = false;
        p3j0Var.g = k3j0Var.e;
        p3j0Var.d = b.i;
        Account.Settings settings = b.l;
        List<Account.ReportOption> list = settings.d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Account.ReportOption reportOption : list) {
            List list2 = settings.d;
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((Account.ReportOption) obj).c, b.h)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Account.ReportOption reportOption2 = (Account.ReportOption) obj;
            reportOption2 = reportOption2 == null ? (Account.ReportOption) a.R(list2) : reportOption2;
            arrayList.add(new x2j0(reportOption.a, reportOption.b, reportOption.c, reportOption2 == null ? false : jl40.l(reportOption.c, reportOption2.c)));
        }
        p3j0Var.f = arrayList;
        p3j0Var.a = k3j0Var.b;
        p3j0Var.b = k3j0Var.d;
        p3j0Var.c = k3j0Var.a;
        this.D = p3j0Var;
    }

    public static final void Kg(l3j0 l3j0Var, Account account) {
        l3j0Var.A.a = account;
        p3j0 p3j0Var = l3j0Var.D;
        p3j0Var.j = false;
        p3j0Var.g = l3j0Var.C.g;
        p3j0Var.h = false;
        p3j0Var.i = false;
        l3j0Var.Ng();
    }

    public final String Lg() {
        Object obj;
        Iterator it = this.D.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((x2j0) obj).d) {
                break;
            }
        }
        x2j0 x2j0Var = (x2j0) obj;
        if (x2j0Var == null) {
            return null;
        }
        return x2j0Var.c;
    }

    public final void Mg(Throwable th) {
        p3j0 p3j0Var = this.D;
        p3j0Var.h = false;
        p3j0Var.g = this.C.e;
        p3j0Var.j = true;
        p3j0Var.i = false;
        boolean z = th instanceof ValidationException;
        vor0 vor0Var = this.B;
        if (z) {
            for (jz21 jz21Var : ((ValidationException) th).getErrors()) {
                String str = jz21Var.a;
                String str2 = jz21Var.b;
                if (str.equals("email")) {
                    p3j0Var.e = str2;
                } else {
                    jst.e.w(new IllegalStateException("Unexpected validation field name: ".concat(jz21Var.a)));
                    vor0Var.a(str2);
                }
            }
            Ng();
        } else {
            vor0Var.a(this.x.a(th));
        }
        Ng();
    }

    public final void Ng() {
        ((i3j0) Dg()).kd(this.D);
    }
}
