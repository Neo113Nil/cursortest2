package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class bv1 {
    public static av1 a(Context context) {
        nu1 nu1Var = new nu1(new te3());
        e2 e2Var = new e2();
        ah ahVar = new ah(context);
        xb1 e = null;
        try {
            nu1Var.a(wu1.b);
            e = null;
        } catch (xb1 e2) {
            e = e2;
        }
        try {
            e2Var.a(context);
            e = null;
        } catch (xb1 e3) {
            e = e3;
        }
        try {
            id2.a(context);
            e = null;
        } catch (xb1 e4) {
            e = e4;
        }
        try {
            ahVar.a();
        } catch (xb1 e5) {
            e = e5;
        }
        List I = xsna.rl3.I(new xb1[]{e, e, e, e});
        return !((ArrayList) I).isEmpty() ? new zu1(I) : yu1.a;
    }
}
