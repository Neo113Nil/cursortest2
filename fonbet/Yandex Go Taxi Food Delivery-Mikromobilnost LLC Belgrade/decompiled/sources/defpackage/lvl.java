package defpackage;

import just.adapter.sticky.StickyGravity;

/* loaded from: classes9.dex */
public final /* synthetic */ class lvl implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4t0 b;
    public final /* synthetic */ t4t0 c;

    public /* synthetic */ lvl(w4t0 w4t0Var, t4t0 t4t0Var, int i) {
        this.a = i;
        this.b = w4t0Var;
        this.c = t4t0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Integer num;
        Integer num2;
        j4t0 j4t0Var;
        j4t0 j4t0Var2;
        int i = this.a;
        zdu0 zdu0Var = null;
        boolean z = false;
        r4 = false;
        boolean l = false;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        int intValue = 0;
        z = false;
        t4t0 t4t0Var = this.c;
        w4t0 w4t0Var = this.b;
        StickyGravity stickyGravity = (StickyGravity) obj;
        switch (i) {
            case 0:
                int i2 = mvl.a[stickyGravity.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    if (t4t0Var != null) {
                        z = jl40.l(t4t0Var.c, Boolean.TRUE);
                    }
                } else if (w4t0Var != null) {
                    z = jl40.l(w4t0Var.c, Boolean.TRUE);
                }
                return Boolean.valueOf(z);
            case 1:
                int i3 = mvl.a[stickyGravity.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    if (t4t0Var != null && (num2 = t4t0Var.d) != null) {
                        intValue = num2.intValue();
                    }
                } else if (w4t0Var != null && (num = w4t0Var.d) != null) {
                    intValue = num.intValue();
                }
                return Integer.valueOf(intValue);
            case 2:
                int i4 = mvl.a[stickyGravity.ordinal()];
                if (i4 == 1) {
                    zdu0Var = new zdu0((w4t0Var == null || (j4t0Var = w4t0Var.e) == null) ? false : jl40.l(j4t0Var.getA(), Boolean.TRUE), false, 2);
                } else if (i4 == 2) {
                    zdu0Var = new zdu0(false, (t4t0Var == null || (j4t0Var2 = t4t0Var.e) == null) ? false : jl40.l(j4t0Var2.getB(), Boolean.TRUE), 1);
                } else {
                    w511.b();
                }
                return zdu0Var;
            default:
                int i5 = eb80.a[stickyGravity.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        w511.b();
                        return null;
                    }
                    if (t4t0Var != null) {
                        l = jl40.l(t4t0Var.c, Boolean.TRUE);
                    }
                } else if (w4t0Var != null) {
                    l = jl40.l(w4t0Var.c, Boolean.TRUE);
                }
                return Boolean.valueOf(l);
        }
    }
}
