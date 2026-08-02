package defpackage;

import yads.hm2;
import yads.p9;

/* loaded from: classes7.dex */
public final class ac71 {
    public static final z871 a = new z871(hm2.y, hm2.x, hm2.z, hm2.A);
    public static final z871 b = new z871(hm2.n, hm2.m, hm2.o, hm2.p);

    public static z871 a(p9 p9Var) {
        int ordinal = p9Var.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return a;
        }
        if (ordinal == 2) {
            return b;
        }
        w511.b();
        return null;
    }
}
