package yads;

import java.util.HashSet;
import xsna.e43;

/* loaded from: classes10.dex */
public final class q13 {
    public static final HashSet b = new HashSet(e43.l(k73.c, k73.b));
    public final m73 a;

    public /* synthetic */ q13() {
        this(new m73(b));
    }

    public final kh3 a(b20 b20Var) {
        int i = b20Var.i;
        r13 r13Var = b20Var.g;
        if (r13Var == null) {
            return null;
        }
        be3 a = this.a.a(r13Var.a);
        if (a == null) {
            return null;
        }
        float f = a.c;
        if (ae3.c == a.b) {
            f = (long) ((f / 100) * i);
        }
        return new kh3((long) Math.min(f, i));
    }

    public q13(m73 m73Var) {
        this.a = m73Var;
    }
}
