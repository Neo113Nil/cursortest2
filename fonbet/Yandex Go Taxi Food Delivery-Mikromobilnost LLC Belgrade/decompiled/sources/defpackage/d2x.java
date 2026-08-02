package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class d2x {
    public final int a;
    public final m59 b;
    public final List c;
    public final Integer d;
    public final y3c0 e;

    public d2x(int i, m59 m59Var, List list, Integer num, y3c0 y3c0Var) {
        this.a = i;
        this.b = m59Var;
        this.c = list;
        this.d = num;
        this.e = y3c0Var;
    }

    public final g3x a(int i) {
        y3c0 y3c0Var;
        if (i == 0) {
            return this.b;
        }
        int i2 = i - 1;
        List list = this.c;
        if (i2 < list.size()) {
            return (g3x) list.get(i2);
        }
        if (i2 == 0 && (y3c0Var = this.e) != null) {
            return y3c0Var;
        }
        ny61.s();
        return null;
    }

    public final int b() {
        int size;
        List list = this.c;
        if (list.isEmpty()) {
            size = this.e != null ? 1 : 0;
        } else {
            Integer num = this.d;
            size = (num == null || list.size() <= num.intValue()) ? list.size() : num.intValue();
        }
        return 1 + size;
    }
}
