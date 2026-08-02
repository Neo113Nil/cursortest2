package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* loaded from: classes10.dex */
public final class ay11 {
    public final int a;
    public kcz0 b;
    public kcz0 c;
    public int d;
    public Long e;
    public boolean f;

    public ay11(int i) {
        this.a = AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[LOOP:0: B:24:0x005d->B:29:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[EDGE_INSN: B:30:0x0072->B:31:0x0072 BREAK  A[LOOP:0: B:24:0x005d->B:29:0x006d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(hoy0 hoy0Var) {
        kcz0 kcz0Var;
        hoy0 hoy0Var2;
        this.f = false;
        kcz0 kcz0Var2 = this.b;
        if (jl40.l(hoy0Var, kcz0Var2 != null ? (hoy0) kcz0Var2.b : null)) {
            return;
        }
        String str = hoy0Var.a.b;
        kcz0 kcz0Var3 = this.b;
        boolean l = jl40.l(str, (kcz0Var3 == null || (hoy0Var2 = (hoy0) kcz0Var3.b) == null) ? null : hoy0Var2.a.b);
        kcz0 kcz0Var4 = this.b;
        if (l) {
            if (kcz0Var4 != null) {
                kcz0Var4.b = hoy0Var;
                return;
            }
            return;
        }
        this.b = new kcz0(kcz0Var4, hoy0Var);
        this.c = null;
        int length = hoy0Var.a.b.length() + this.d;
        this.d = length;
        if (length > this.a) {
            kcz0 kcz0Var5 = this.b;
            if ((kcz0Var5 != null ? (kcz0) kcz0Var5.a : null) == null) {
                return;
            }
            while (true) {
                if (kcz0Var5 != null) {
                    kcz0 kcz0Var6 = (kcz0) kcz0Var5.a;
                    if (kcz0Var6 != null) {
                        kcz0Var = (kcz0) kcz0Var6.a;
                        if (kcz0Var != null) {
                            break;
                        } else {
                            kcz0Var5 = (kcz0) kcz0Var5.a;
                        }
                    }
                }
                kcz0Var = null;
                if (kcz0Var != null) {
                }
            }
            if (kcz0Var5 != null) {
                kcz0Var5.a = null;
            }
        }
    }

    public ay11() {
        this(0);
    }
}
