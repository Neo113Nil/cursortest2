package defpackage;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;

/* loaded from: classes14.dex */
public final class bov0 {
    public static final bov0 e = new bov0(false, (khv0) null, (ijv0) (0 == true ? 1 : 0), 15);
    public final boolean a;
    public final khv0 b;
    public final ijv0 c;
    public final boolean d;

    public /* synthetic */ bov0(boolean z, khv0 khv0Var, ijv0 ijv0Var, int i) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? new bhv0(0) : khv0Var, (i & 4) != 0 ? null : ijv0Var, false);
    }

    public final boolean a() {
        khv0 khv0Var = this.b;
        if ((khv0Var instanceof bhv0) && ((bhv0) khv0Var).a.a()) {
            return true;
        }
        if ((khv0Var instanceof ehv0) && ((ehv0) khv0Var).a.a()) {
            return true;
        }
        return (khv0Var instanceof fhv0) && ((fhv0) khv0Var).a.a();
    }

    public final SummaryExpandReason b() {
        khv0 khv0Var = this.b;
        boolean z = khv0Var instanceof bhv0;
        ghv0 ghv0Var = ghv0.a;
        if (z) {
            ihv0 ihv0Var = ((bhv0) khv0Var).a.a;
            if (jl40.l(ihv0Var, ghv0Var)) {
                return null;
            }
            if (ihv0Var instanceof hhv0) {
                return ((hhv0) ((bhv0) khv0Var).a.a).a;
            }
            w511.b();
            return null;
        }
        if (khv0Var instanceof ehv0) {
            ihv0 ihv0Var2 = ((ehv0) khv0Var).a.a;
            if (jl40.l(ihv0Var2, ghv0Var)) {
                return null;
            }
            if (ihv0Var2 instanceof hhv0) {
                return ((hhv0) ((ehv0) khv0Var).a.a).a;
            }
            w511.b();
            return null;
        }
        if (!(khv0Var instanceof fhv0)) {
            if (!jl40.l(khv0Var, chv0.a) && !jl40.l(khv0Var, dhv0.a)) {
                w511.b();
            }
            return null;
        }
        ihv0 ihv0Var3 = ((fhv0) khv0Var).a.a;
        if (jl40.l(ihv0Var3, ghv0Var)) {
            return null;
        }
        if (ihv0Var3 instanceof hhv0) {
            return ((hhv0) ((fhv0) khv0Var).a.a).a;
        }
        w511.b();
        return null;
    }

    public bov0(boolean z, khv0 khv0Var, ijv0 ijv0Var, boolean z2) {
        this.a = z;
        this.b = khv0Var;
        this.c = ijv0Var;
        this.d = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bov0() {
        this(false, (khv0) null, (ijv0) (0 == true ? 1 : 0), 15);
    }
}
