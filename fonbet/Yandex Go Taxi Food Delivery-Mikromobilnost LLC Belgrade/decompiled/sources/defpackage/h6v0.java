package defpackage;

import android.content.Context;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class h6v0 {
    public final Context a;
    public final oep0 b;
    public final gv0 c;
    public final ze0 d;
    public final vd e;
    public final yvf0 f;

    public h6v0(Context context, oep0 oep0Var, gv0 gv0Var, ze0 ze0Var, vd vdVar, yvf0 yvf0Var) {
        this.a = context;
        this.b = oep0Var;
        this.c = gv0Var;
        this.d = ze0Var;
        this.e = vdVar;
        this.f = yvf0Var;
    }

    public static String a(double d) {
        return evu0.n0(evu0.n0(String.format(Locale.US, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)), MoneyInputEditView.DEFAULT_VALUE), '.');
    }
}
