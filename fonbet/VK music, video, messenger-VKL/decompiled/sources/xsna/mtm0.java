package xsna;

import xsna.q630;

/* compiled from: StylusHandwriting.kt */
/* loaded from: classes11.dex */
public final class mtm0 {
    public static final vco a;

    static {
        float f = 40;
        float f2 = 10;
        a = new vco(f2, f, f2, f);
    }

    public static final q630 a(gzs gzsVar, boolean z, boolean z2) {
        q630 q630Var = q630.a.a;
        if (!z || !otm0.a) {
            return q630Var;
        }
        if (z2) {
            q630Var = new ptm0(a);
        }
        return q630Var.g(new ltm0(gzsVar));
    }
}
