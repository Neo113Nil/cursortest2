package xsna;

import xsna.dt1;
import xsna.wkj;

/* compiled from: PainterModifier.kt */
/* loaded from: classes11.dex */
public final class ng90 {
    public static q630 a(q630 q630Var, lg90 lg90Var, dt1 dt1Var, wkj wkjVar, float f, d6g d6gVar, int i) {
        if ((i & 4) != 0) {
            dt1.a.getClass();
            dt1Var = dt1.a.f;
        }
        dt1 dt1Var2 = dt1Var;
        if ((i & 8) != 0) {
            wkjVar = wkj.a.e;
        }
        wkj wkjVar2 = wkjVar;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            d6gVar = null;
        }
        return q630Var.g(new mg90(lg90Var, dt1Var2, wkjVar2, f2, d6gVar));
    }
}
