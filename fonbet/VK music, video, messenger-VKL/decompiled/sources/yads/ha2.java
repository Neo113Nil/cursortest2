package yads;

import android.content.Context;
import android.os.Looper;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class ha2 {
    public final ea2 a;

    public /* synthetic */ ha2() {
        this(new ea2());
    }

    public final ux1 a(Context context, d4 d4Var, ov2 ov2Var, f61 f61Var, o42 o42Var, String str, va vaVar) {
        da2 o03Var;
        ea2 ea2Var = this.a;
        ea2Var.getClass();
        int ordinal = vaVar.ordinal();
        if (ordinal == 0) {
            i61 i61Var = ea2Var.a;
            va vaVar2 = va.d;
            i61Var.getClass();
            h61 a = i61.a(vaVar2);
            i61 i61Var2 = ea2Var.a;
            va vaVar3 = va.c;
            i61Var2.getClass();
            o03Var = new o03(new i93(f61Var, a), new i93(f61Var, i61.a(vaVar3)));
        } else {
            if (ordinal != 1 && ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ea2Var.a.getClass();
            o03Var = new i93(f61Var, i61.a(vaVar));
        }
        return new ux1(context, o03Var, o42Var, str, vaVar, new za(context, ov2Var, d4Var), gx2.a(), new o83(o03Var, Looper.getMainLooper()), new h93());
    }

    public ha2(ea2 ea2Var) {
        this.a = ea2Var;
    }
}
