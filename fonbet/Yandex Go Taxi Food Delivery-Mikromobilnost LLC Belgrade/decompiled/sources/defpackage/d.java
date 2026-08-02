package defpackage;

import coil.view.Scale;

/* loaded from: classes10.dex */
public abstract class d {
    public static final int a(jh91 jh91Var, Scale scale) {
        if (jh91Var instanceof lkj) {
            return ((lkj) jh91Var).a;
        }
        int i = c.a[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        w511.b();
        return 0;
    }
}
