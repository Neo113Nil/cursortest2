package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class b6z0 {
    public final nl a;
    public final bqz0 b;
    public final List c;
    public final giy0 d;

    public b6z0(List list, giy0 giy0Var, nl nlVar, bqz0 bqz0Var) {
        this.c = list;
        this.d = giy0Var;
        this.a = nlVar;
        this.b = bqz0Var;
    }

    public static b6z0 b(e5z0 e5z0Var, List list) {
        return new b6z0(list, e5z0Var.a, e5z0Var.b, e5z0Var.c);
    }

    public final b6z0 a() {
        return new b6z0(new ArrayList(), this.d, this.a, this.b);
    }
}
