package defpackage;

import com.yandex.go.taxi.summary.routestops.e;

/* loaded from: classes13.dex */
public final class h3l0 {
    public final e a;

    public h3l0(tt2 tt2Var, e eVar) {
        this.a = eVar;
    }

    public static int a(g3l0 g3l0Var) {
        if (g3l0Var instanceof d3l0) {
            return ((d3l0) g3l0Var).a - 1;
        }
        if (g3l0Var instanceof f3l0) {
            return ((f3l0) g3l0Var).a - 1;
        }
        if (jl40.l(g3l0Var, c3l0.a) || (g3l0Var instanceof e3l0)) {
            return -1;
        }
        w511.b();
        return 0;
    }
}
