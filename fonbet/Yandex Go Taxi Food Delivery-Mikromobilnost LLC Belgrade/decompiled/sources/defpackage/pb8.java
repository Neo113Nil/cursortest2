package defpackage;

import com.yandex.xplat.common.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class pb8 extends of8 {
    public final List a;
    public final up8 b;

    public pb8(List list, up8 up8Var) {
        this.a = list;
        this.b = up8Var;
    }

    @Override // defpackage.of8
    public final up8 b(nf8 nf8Var) {
        String g;
        Integer l;
        String str = ((pk8) nf8Var).a;
        if (str.length() >= 1 && (l = bvu0.l(10, (g = c.g(0, 8, str)))) != null) {
            int length = g.length();
            List<nb8> list = this.a;
            if (length < 8) {
                int length2 = 8 - g.length();
                for (nb8 nb8Var : list) {
                    int intValue = l.intValue();
                    int i = nb8Var.a;
                    int i2 = nb8Var.b;
                    for (int i3 = length2; i3 > 0; i3--) {
                        i /= 10;
                        i2 /= 10;
                    }
                    if (intValue >= i && intValue <= i2) {
                        return null;
                    }
                }
            } else {
                for (nb8 nb8Var2 : list) {
                    if (l.intValue() < nb8Var2.a) {
                        break;
                    }
                    if (l.intValue() >= nb8Var2.a && l.intValue() <= nb8Var2.b) {
                        return null;
                    }
                }
            }
        }
        return this.b;
    }
}
