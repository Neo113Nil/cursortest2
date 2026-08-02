package xsna;

/* compiled from: Shadow.kt */
/* loaded from: classes11.dex */
public final class a5j0 {
    public static final q630 a(q630 q630Var, float f, r5j0 r5j0Var, boolean z, long j, long j2) {
        return (pco.a(f, (float) 0) > 0 || z) ? q630Var.g(new z4j0(f, r5j0Var, z, j, j2)) : q630Var;
    }

    public static q630 b(q630 q630Var, float f, r5j0 r5j0Var, boolean z, long j, long j2, int i) {
        if ((i & 2) != 0) {
            r5j0Var = androidx.compose.ui.graphics.e.a;
        }
        r5j0 r5j0Var2 = r5j0Var;
        if ((i & 4) != 0) {
            z = pco.a(f, (float) 0) > 0;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = udu.a;
        }
        return a(q630Var, f, r5j0Var2, z2, j, (i & 16) != 0 ? udu.a : j2);
    }
}
