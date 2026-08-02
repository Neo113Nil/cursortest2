package defpackage;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public class k8h extends of8 {
    public final kj51 a;

    public k8h(int i) {
        this.a = new kj51();
    }

    @Override // defpackage.of8
    public final up8 b(nf8 nf8Var) {
        ze8 ze8Var = (ze8) nf8Var;
        kj51 kj51Var = this.a;
        kj51Var.getClass();
        Calendar calendar = Calendar.getInstance();
        long j = kj51Var.a;
        calendar.setTime(new Date(j));
        int i = calendar.get(1) % 100;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        int i2 = calendar2.get(2) + 1;
        Integer l = bvu0.l(10, ze8Var.b);
        int intValue = l != null ? l.intValue() : 0;
        if (intValue >= i && intValue <= i + 50) {
            Integer l2 = bvu0.l(10, ze8Var.a);
            int intValue2 = l2 != null ? l2.intValue() : 0;
            if (intValue2 <= 12 && intValue2 >= 1 && (intValue != i || intValue2 >= i2)) {
                return null;
            }
        }
        return up8.b;
    }

    public k8h() {
        this(0);
    }
}
