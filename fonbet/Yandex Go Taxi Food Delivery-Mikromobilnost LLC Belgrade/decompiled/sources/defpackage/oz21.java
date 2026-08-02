package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class oz21 {
    public final lk8 a;
    public final bn60 b;
    public final yzz c;
    public final iso d;
    public final kso e;
    public final pof f;

    public oz21(lk8 lk8Var, int i) {
        lk8Var = (i & 1) != 0 ? new lk8(0) : lk8Var;
        bn60 bn60Var = new bn60();
        yzz yzzVar = new yzz();
        iso isoVar = new iso();
        kso ksoVar = new kso();
        pof pofVar = new pof();
        this.a = lk8Var;
        this.b = bn60Var;
        this.c = yzzVar;
        this.d = isoVar;
        this.e = ksoVar;
        this.f = pofVar;
    }

    public final boolean a(String str) {
        if (b(str)) {
            this.c.getClass();
            String obj = gvu0.z0(cvu0.v(str, " ", "", false)).toString();
            ArrayList arrayList = new ArrayList(obj.length());
            for (int i = 0; i < obj.length(); i++) {
                arrayList.add(Integer.valueOf(Character.getNumericValue(obj.charAt(i))));
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                int intValue = ((Number) next).intValue();
                if (i2 % 2 != 0) {
                    intValue = intValue < 5 ? intValue * 2 : (intValue * 2) - 9;
                }
                arrayList2.add(Integer.valueOf(intValue));
                i2 = i3;
            }
            if (a.z0(arrayList2) % 10 == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(String str) {
        fk8 fk8Var = this.a.a(str).b;
        this.b.getClass();
        return fk8Var.b.contains(Integer.valueOf(cvu0.v(str, " ", "", false).length()));
    }

    public oz21() {
        this(null, 63);
    }
}
